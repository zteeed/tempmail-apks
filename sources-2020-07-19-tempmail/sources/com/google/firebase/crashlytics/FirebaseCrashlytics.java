package com.google.firebase.crashlytics;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.c;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.MissingNativeComponent;
import com.google.firebase.crashlytics.internal.Onboarding;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.ExecutorUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.iid.b.a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class FirebaseCrashlytics {
    private final CrashlyticsCore core;

    private FirebaseCrashlytics(CrashlyticsCore crashlyticsCore) {
        this.core = crashlyticsCore;
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) c.h().f(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    static FirebaseCrashlytics init(c cVar, a aVar, CrashlyticsNativeComponent crashlyticsNativeComponent, com.google.firebase.analytics.a.a aVar2) {
        c cVar2 = cVar;
        Context g = cVar.g();
        IdManager idManager = new IdManager(g, g.getPackageName(), aVar);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(cVar);
        MissingNativeComponent missingNativeComponent = crashlyticsNativeComponent == null ? new MissingNativeComponent() : crashlyticsNativeComponent;
        final Onboarding onboarding = new Onboarding(cVar, g, idManager, dataCollectionArbiter);
        CrashlyticsCore crashlyticsCore = new CrashlyticsCore(cVar, idManager, missingNativeComponent, dataCollectionArbiter, aVar2);
        if (!onboarding.onPreExecute()) {
            Logger.getLogger().e("Unable to start Crashlytics.");
            return null;
        }
        ExecutorService buildSingleThreadExecutorService = ExecutorUtils.buildSingleThreadExecutorService("com.google.firebase.crashlytics.startup");
        final SettingsController retrieveSettingsData = onboarding.retrieveSettingsData(g, cVar, buildSingleThreadExecutorService);
        final boolean onPreExecute = crashlyticsCore.onPreExecute(retrieveSettingsData);
        final ExecutorService executorService = buildSingleThreadExecutorService;
        final CrashlyticsCore crashlyticsCore2 = crashlyticsCore;
        Tasks.c(buildSingleThreadExecutorService, new Callable<Void>() {
            public Void call() throws Exception {
                Onboarding.this.doOnboarding(executorService, retrieveSettingsData);
                if (!onPreExecute) {
                    return null;
                }
                crashlyticsCore2.doBackgroundInitializationAsync(retrieveSettingsData);
                return null;
            }
        });
        return new FirebaseCrashlytics(crashlyticsCore);
    }

    public Task<Boolean> checkForUnsentReports() {
        return this.core.checkForUnsentReports();
    }

    public void deleteUnsentReports() {
        this.core.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.core.didCrashOnPreviousExecution();
    }

    public void log(String str) {
        this.core.log(str);
    }

    public void recordException(Throwable th) {
        if (th == null) {
            Logger.getLogger().w("Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.core.logException(th);
        }
    }

    public void sendUnsentReports() {
        this.core.sendUnsentReports();
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.core.setCrashlyticsCollectionEnabled(z);
    }

    public void setCustomKey(String str, boolean z) {
        this.core.setCustomKey(str, Boolean.toString(z));
    }

    public void setUserId(String str) {
        this.core.setUserId(str);
    }

    public void setCustomKey(String str, double d2) {
        this.core.setCustomKey(str, Double.toString(d2));
    }

    public void setCustomKey(String str, float f2) {
        this.core.setCustomKey(str, Float.toString(f2));
    }

    public void setCustomKey(String str, int i) {
        this.core.setCustomKey(str, Integer.toString(i));
    }

    public void setCustomKey(String str, long j) {
        this.core.setCustomKey(str, Long.toString(j));
    }

    public void setCustomKey(String str, String str2) {
        this.core.setCustomKey(str, str2);
    }
}
