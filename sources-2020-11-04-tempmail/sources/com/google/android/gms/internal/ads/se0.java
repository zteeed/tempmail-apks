package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class se0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    private Activity f5087b;

    /* renamed from: c  reason: collision with root package name */
    private Context f5088c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Object f5089d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f5090e = true;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f5091f = false;
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    public final List<zzrj> g = new ArrayList();
    @GuardedBy("lock")
    private final List<zzru> h = new ArrayList();
    private Runnable i;
    private boolean j = false;
    private long k;

    se0() {
    }

    private final void c(Activity activity) {
        synchronized (this.f5089d) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f5087b = activity;
            }
        }
    }

    public final Activity a() {
        return this.f5087b;
    }

    public final Context b() {
        return this.f5088c;
    }

    public final void e(Application application, Context context) {
        if (!this.j) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                c((Activity) context);
            }
            this.f5088c = application;
            this.k = ((Long) zzwg.e().c(zzaav.q0)).longValue();
            this.j = true;
        }
    }

    public final void f(zzrj zzrj) {
        synchronized (this.f5089d) {
            this.g.add(zzrj);
        }
    }

    public final void h(zzrj zzrj) {
        synchronized (this.f5089d) {
            this.g.remove(zzrj);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f5089d) {
            if (this.f5087b != null) {
                if (this.f5087b.equals(activity)) {
                    this.f5087b = null;
                }
                Iterator<zzru> it = this.h.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().a(activity)) {
                            it.remove();
                        }
                    } catch (Exception e2) {
                        zzq.zzla().e(e2, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        zzbba.c("", e2);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        c(activity);
        synchronized (this.f5089d) {
            for (zzru onActivityPaused : this.h) {
                try {
                    onActivityPaused.onActivityPaused(activity);
                } catch (Exception e2) {
                    zzq.zzla().e(e2, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzbba.c("", e2);
                }
            }
        }
        this.f5091f = true;
        Runnable runnable = this.i;
        if (runnable != null) {
            zzaye.h.removeCallbacks(runnable);
        }
        zzdrr zzdrr = zzaye.h;
        re0 re0 = new re0(this);
        this.i = re0;
        zzdrr.postDelayed(re0, this.k);
    }

    public final void onActivityResumed(Activity activity) {
        c(activity);
        this.f5091f = false;
        boolean z = !this.f5090e;
        this.f5090e = true;
        Runnable runnable = this.i;
        if (runnable != null) {
            zzaye.h.removeCallbacks(runnable);
        }
        synchronized (this.f5089d) {
            for (zzru onActivityResumed : this.h) {
                try {
                    onActivityResumed.onActivityResumed(activity);
                } catch (Exception e2) {
                    zzq.zzla().e(e2, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzbba.c("", e2);
                }
            }
            if (z) {
                for (zzrj a2 : this.g) {
                    try {
                        a2.a(true);
                    } catch (Exception e3) {
                        zzbba.c("", e3);
                    }
                }
            } else {
                zzbba.f("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        c(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
