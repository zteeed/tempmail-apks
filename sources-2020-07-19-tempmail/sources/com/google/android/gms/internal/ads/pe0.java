package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class pe0 implements zzrd {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f4637a;

    pe0(ke0 ke0, Activity activity) {
        this.f4637a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f4637a);
    }
}
