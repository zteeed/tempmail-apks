package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class y90 implements zzer {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f5366a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f5367b;

    y90(s80 s80, Activity activity, Bundle bundle) {
        this.f5366a = activity;
        this.f5367b = bundle;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f5366a, this.f5367b);
    }
}
