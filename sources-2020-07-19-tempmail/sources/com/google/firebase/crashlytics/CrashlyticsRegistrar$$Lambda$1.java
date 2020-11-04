package com.google.firebase.crashlytics;

import com.google.firebase.components.e;
import com.google.firebase.components.g;

/* compiled from: CrashlyticsRegistrar */
final /* synthetic */ class CrashlyticsRegistrar$$Lambda$1 implements g {
    private final CrashlyticsRegistrar arg$1;

    private CrashlyticsRegistrar$$Lambda$1(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.arg$1 = crashlyticsRegistrar;
    }

    public static g lambdaFactory$(CrashlyticsRegistrar crashlyticsRegistrar) {
        return new CrashlyticsRegistrar$$Lambda$1(crashlyticsRegistrar);
    }

    public Object create(e eVar) {
        return this.arg$1.buildCrashlytics(eVar);
    }
}
