package com.google.firebase.crashlytics;

import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.iid.b.a;
import com.google.firebase.j.g;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar implements h {
    /* access modifiers changed from: private */
    public FirebaseCrashlytics buildCrashlytics(e eVar) {
        return FirebaseCrashlytics.init((c) eVar.a(c.class), eVar.b(a.class).get(), (CrashlyticsNativeComponent) eVar.a(CrashlyticsNativeComponent.class), (com.google.firebase.analytics.a.a) eVar.a(com.google.firebase.analytics.a.a.class));
    }

    public List<d<?>> getComponents() {
        d.b<FirebaseCrashlytics> a2 = d.a(FirebaseCrashlytics.class);
        a2.b(n.f(c.class));
        a2.b(n.g(a.class));
        a2.b(n.e(com.google.firebase.analytics.a.a.class));
        a2.b(n.e(CrashlyticsNativeComponent.class));
        a2.f(CrashlyticsRegistrar$$Lambda$1.lambdaFactory$(this));
        a2.e();
        return Arrays.asList(new d[]{a2.d(), g.a("fire-cls", BuildConfig.VERSION_NAME)});
    }
}
