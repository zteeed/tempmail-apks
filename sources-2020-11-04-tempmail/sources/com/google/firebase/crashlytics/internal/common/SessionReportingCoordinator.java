package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.log.LogFileManager;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

class SessionReportingCoordinator implements CrashlyticsLifecycleEvents {
    private static final int EVENT_THREAD_IMPORTANCE = 4;
    private static final String EVENT_TYPE_CRASH = "crash";
    private static final String EVENT_TYPE_LOGGED = "error";
    private static final int MAX_CHAINED_EXCEPTION_DEPTH = 8;
    private String currentSessionId;
    private final CrashlyticsReportDataCapture dataCapture;
    private final LogFileManager logFileManager;
    private final UserMetadata reportMetadata;
    private final CrashlyticsReportPersistence reportPersistence;
    private final DataTransportCrashlyticsReportSender reportsSender;

    SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager2, UserMetadata userMetadata) {
        this.dataCapture = crashlyticsReportDataCapture;
        this.reportPersistence = crashlyticsReportPersistence;
        this.reportsSender = dataTransportCrashlyticsReportSender;
        this.logFileManager = logFileManager2;
        this.reportMetadata = userMetadata;
    }

    public static SessionReportingCoordinator create(Context context, IdManager idManager, FileStore fileStore, AppData appData, LogFileManager logFileManager2, UserMetadata userMetadata, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsDataProvider settingsDataProvider) {
        return new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context, idManager, appData, stackTraceTrimmingStrategy), new CrashlyticsReportPersistence(new File(fileStore.getFilesDirPath()), settingsDataProvider), DataTransportCrashlyticsReportSender.create(context), logFileManager2, userMetadata);
    }

    private static List<CrashlyticsReport.CustomAttribute> getSortedCustomAttributes(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(CrashlyticsReport.CustomAttribute.builder().setKey((String) next.getKey()).setValue((String) next.getValue()).build());
        }
        Collections.sort(arrayList, SessionReportingCoordinator$$Lambda$2.lambdaFactory$());
        return arrayList;
    }

    /* access modifiers changed from: private */
    public boolean onReportSendComplete(Task<CrashlyticsReportWithSessionId> task) {
        if (task.r()) {
            CrashlyticsReportWithSessionId n = task.n();
            Logger logger = Logger.getLogger();
            logger.d("Crashlytics report successfully enqueued to DataTransport: " + n.getSessionId());
            this.reportPersistence.deleteFinalizedReport(n.getSessionId());
            return true;
        }
        Logger.getLogger().d("Crashlytics report could not be enqueued to DataTransport", task.m());
        return false;
    }

    private void persistEvent(Throwable th, Thread thread, String str, long j, boolean z) {
        String str2 = this.currentSessionId;
        if (str2 == null) {
            Logger.getLogger().d("Cannot persist event, no currently open session");
            return;
        }
        boolean equals = str.equals(EVENT_TYPE_CRASH);
        CrashlyticsReport.Session.Event captureEventData = this.dataCapture.captureEventData(th, thread, str, j, 4, 8, z);
        CrashlyticsReport.Session.Event.Builder builder = captureEventData.toBuilder();
        String logString = this.logFileManager.getLogString();
        if (logString != null) {
            builder.setLog(CrashlyticsReport.Session.Event.Log.builder().setContent(logString).build());
        } else {
            Logger.getLogger().d("No log data to include with this event.");
        }
        List<CrashlyticsReport.CustomAttribute> sortedCustomAttributes = getSortedCustomAttributes(this.reportMetadata.getCustomKeys());
        if (!sortedCustomAttributes.isEmpty()) {
            builder.setApp(captureEventData.getApp().toBuilder().setCustomAttributes(ImmutableList.from(sortedCustomAttributes)).build());
        }
        this.reportPersistence.persistEvent(builder.build(), str2, equals);
    }

    public void finalizeSessionWithNativeEvent(String str, List<NativeSessionFile> list) {
        ArrayList arrayList = new ArrayList();
        for (NativeSessionFile asFilePayload : list) {
            CrashlyticsReport.FilesPayload.File asFilePayload2 = asFilePayload.asFilePayload();
            if (asFilePayload2 != null) {
                arrayList.add(asFilePayload2);
            }
        }
        this.reportPersistence.finalizeSessionWithNativeEvent(str, CrashlyticsReport.FilesPayload.builder().setFiles(ImmutableList.from(arrayList)).build());
    }

    public void finalizeSessions(long j) {
        this.reportPersistence.finalizeReports(this.currentSessionId, j);
    }

    public void onBeginSession(String str, long j) {
        this.currentSessionId = str;
        this.reportPersistence.persistReport(this.dataCapture.captureReportData(str, j));
    }

    public void onCustomKey(String str, String str2) {
        this.reportMetadata.setCustomKey(str, str2);
    }

    public void onEndSession() {
        this.currentSessionId = null;
    }

    public void onLog(long j, String str) {
        this.logFileManager.writeToLog(j, str);
    }

    public void onUserId(String str) {
        this.reportMetadata.setUserId(str);
    }

    public void persistFatalEvent(Throwable th, Thread thread, long j) {
        persistEvent(th, thread, EVENT_TYPE_CRASH, j, true);
    }

    public void persistNonFatalEvent(Throwable th, Thread thread, long j) {
        persistEvent(th, thread, EVENT_TYPE_LOGGED, j, false);
    }

    public void persistUserId() {
        String str = this.currentSessionId;
        if (str == null) {
            Logger.getLogger().d("Could not persist user ID; no current session");
            return;
        }
        String userId = this.reportMetadata.getUserId();
        if (userId == null) {
            Logger.getLogger().d("Could not persist user ID; no user ID available");
        } else {
            this.reportPersistence.persistUserIdForSession(userId, str);
        }
    }

    public void removeAllReports() {
        this.reportPersistence.deleteAllReports();
    }

    /* access modifiers changed from: package-private */
    public Task<Void> sendReports(Executor executor, DataTransportState dataTransportState) {
        if (dataTransportState == DataTransportState.NONE) {
            Logger.getLogger().d("Send via DataTransport disabled. Removing DataTransport reports.");
            this.reportPersistence.deleteAllReports();
            return Tasks.e(null);
        }
        List<CrashlyticsReportWithSessionId> loadFinalizedReports = this.reportPersistence.loadFinalizedReports();
        ArrayList arrayList = new ArrayList();
        for (CrashlyticsReportWithSessionId next : loadFinalizedReports) {
            if (next.getReport().getType() != CrashlyticsReport.Type.NATIVE || dataTransportState == DataTransportState.ALL) {
                arrayList.add(this.reportsSender.sendReport(next).j(executor, SessionReportingCoordinator$$Lambda$1.lambdaFactory$(this)));
            } else {
                Logger.getLogger().d("Send native reports via DataTransport disabled. Removing DataTransport reports.");
                this.reportPersistence.deleteFinalizedReport(next.getSessionId());
            }
        }
        return Tasks.f(arrayList);
    }
}
