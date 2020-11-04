package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f  reason: collision with root package name */
    private static final BackgroundDetector f2904f = new BackgroundDetector();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f2905b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f2906c = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<BackgroundStateChangeListener> f2907d = new ArrayList<>();
    @GuardedBy("sInstance")

    /* renamed from: e  reason: collision with root package name */
    private boolean f2908e = false;

    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void a(boolean z);
    }

    @KeepForSdk
    private BackgroundDetector() {
    }

    @KeepForSdk
    public static BackgroundDetector b() {
        return f2904f;
    }

    @KeepForSdk
    public static void c(Application application) {
        synchronized (f2904f) {
            if (!f2904f.f2908e) {
                application.registerActivityLifecycleCallbacks(f2904f);
                application.registerComponentCallbacks(f2904f);
                f2904f.f2908e = true;
            }
        }
    }

    private final void e(boolean z) {
        synchronized (f2904f) {
            ArrayList<BackgroundStateChangeListener> arrayList = this.f2907d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                BackgroundStateChangeListener backgroundStateChangeListener = arrayList.get(i);
                i++;
                backgroundStateChangeListener.a(z);
            }
        }
    }

    @KeepForSdk
    public final void a(BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (f2904f) {
            this.f2907d.add(backgroundStateChangeListener);
        }
    }

    @KeepForSdk
    public final boolean d() {
        return this.f2905b.get();
    }

    @TargetApi(16)
    @KeepForSdk
    public final boolean f(boolean z) {
        if (!this.f2906c.get()) {
            if (!PlatformVersion.c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f2906c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f2905b.set(true);
            }
        }
        return d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f2905b.compareAndSet(true, false);
        this.f2906c.set(true);
        if (compareAndSet) {
            e(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f2905b.compareAndSet(true, false);
        this.f2906c.set(true);
        if (compareAndSet) {
            e(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f2905b.compareAndSet(false, true)) {
            this.f2906c.set(true);
            e(true);
        }
    }
}
