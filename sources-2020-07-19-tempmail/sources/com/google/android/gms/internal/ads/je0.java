package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class je0 implements zzrd {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f4137a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f4138b;

    je0(ke0 ke0, Activity activity, Bundle bundle) {
        this.f4137a = activity;
        this.f4138b = bundle;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f4137a, this.f4138b);
    }
}
