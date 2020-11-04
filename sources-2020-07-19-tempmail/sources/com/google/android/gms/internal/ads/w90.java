package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class w90 implements zzer {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f5206a;

    w90(s80 s80, Activity activity) {
        this.f5206a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f5206a);
    }
}
