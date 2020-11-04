package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class v90 implements zzer {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f5308a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f5309b;

    v90(s80 s80, Activity activity, Bundle bundle) {
        this.f5308a = activity;
        this.f5309b = bundle;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f5308a, this.f5309b);
    }
}
