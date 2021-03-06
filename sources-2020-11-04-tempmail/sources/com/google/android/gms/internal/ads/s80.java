package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class s80 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    private final Application f5058b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f5059c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5060d = false;

    public s80(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f5059c = new WeakReference<>(activityLifecycleCallbacks);
        this.f5058b = application;
    }

    private final void a(zzer zzer) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f5059c.get();
            if (activityLifecycleCallbacks != null) {
                zzer.a(activityLifecycleCallbacks);
            } else if (!this.f5060d) {
                this.f5058b.unregisterActivityLifecycleCallbacks(this);
                this.f5060d = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new v90(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new aa0(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new w90(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new x90(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new y90(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new s90(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new z90(this, activity));
    }
}
