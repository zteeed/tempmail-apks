package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class le0 implements zzrd {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f4485a;

    le0(ke0 ke0, Activity activity) {
        this.f4485a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f4485a);
    }
}
