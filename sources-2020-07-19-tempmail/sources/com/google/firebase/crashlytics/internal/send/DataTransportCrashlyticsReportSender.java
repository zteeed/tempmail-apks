package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import b.c.a.b.b;
import b.c.a.b.c;
import b.c.a.b.e;
import b.c.a.b.f;
import b.c.a.b.i.r;
import com.google.android.datatransport.cct.a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

public class DataTransportCrashlyticsReportSender {
    private static final String CRASHLYTICS_API_KEY = mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final String CRASHLYTICS_ENDPOINT = mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String CRASHLYTICS_TRANSPORT_NAME = "FIREBASE_CRASHLYTICS_REPORT";
    private static final e<CrashlyticsReport, byte[]> DEFAULT_TRANSFORM = DataTransportCrashlyticsReportSender$$Lambda$2.lambdaFactory$();
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private final f<CrashlyticsReport> transport;
    private final e<CrashlyticsReport, byte[]> transportTransform;

    DataTransportCrashlyticsReportSender(f<CrashlyticsReport> fVar, e<CrashlyticsReport, byte[]> eVar) {
        this.transport = fVar;
        this.transportTransform = eVar;
    }

    public static DataTransportCrashlyticsReportSender create(Context context) {
        r.f(context);
        return new DataTransportCrashlyticsReportSender(r.c().g(new a(CRASHLYTICS_ENDPOINT, CRASHLYTICS_API_KEY)).a(CRASHLYTICS_TRANSPORT_NAME, CrashlyticsReport.class, b.b("json"), DEFAULT_TRANSFORM), DEFAULT_TRANSFORM);
    }

    static /* synthetic */ void lambda$sendReport$1(TaskCompletionSource taskCompletionSource, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        if (exc != null) {
            taskCompletionSource.d(exc);
        } else {
            taskCompletionSource.e(crashlyticsReportWithSessionId);
        }
    }

    private static String mergeStrings(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public Task<CrashlyticsReportWithSessionId> sendReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        CrashlyticsReport report = crashlyticsReportWithSessionId.getReport();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.transport.b(c.e(report), DataTransportCrashlyticsReportSender$$Lambda$1.lambdaFactory$(taskCompletionSource, crashlyticsReportWithSessionId));
        return taskCompletionSource.a();
    }
}
