package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class qe0 implements zzrd {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f4911a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f4912b;

    qe0(ke0 ke0, Activity activity, Bundle bundle) {
        this.f4911a = activity;
        this.f4912b = bundle;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f4911a, this.f4912b);
    }
}
