package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ke0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    private final Application f4396b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f4397c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4398d = false;

    public ke0(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f4397c = new WeakReference<>(activityLifecycleCallbacks);
        this.f4396b = application;
    }

    private final void a(zzrd zzrd) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f4397c.get();
            if (activityLifecycleCallbacks != null) {
                zzrd.a(activityLifecycleCallbacks);
            } else if (!this.f4398d) {
                this.f4396b.unregisterActivityLifecycleCallbacks(this);
                this.f4398d = true;
            }
        } catch (Exception e2) {
            zzbba.c("Error while dispatching lifecycle callback.", e2);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new je0(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new pe0(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new oe0(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new le0(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new qe0(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new me0(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new ne0(this, activity));
    }
}
