package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class z90 implements zzer {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f5442a;

    z90(s80 s80, Activity activity) {
        this.f5442a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f5442a);
    }
}
