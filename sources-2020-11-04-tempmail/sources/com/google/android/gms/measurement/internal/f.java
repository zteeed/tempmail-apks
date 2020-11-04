package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzq;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
abstract class f {

    /* renamed from: d  reason: collision with root package name */
    private static volatile Handler f10171d;

    /* renamed from: a  reason: collision with root package name */
    private final r4 f10172a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f10173b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile long f10174c;

    f(r4 r4Var) {
        Preconditions.k(r4Var);
        this.f10172a = r4Var;
        this.f10173b = new g(this, r4Var);
    }

    private final Handler f() {
        Handler handler;
        if (f10171d != null) {
            return f10171d;
        }
        synchronized (f.class) {
            if (f10171d == null) {
                f10171d = new zzq(this.f10172a.f().getMainLooper());
            }
            handler = f10171d;
        }
        return handler;
    }

    public abstract void b();

    public final void c(long j) {
        e();
        if (j >= 0) {
            this.f10174c = this.f10172a.n().a();
            if (!f().postDelayed(this.f10173b, j)) {
                this.f10172a.h().G().b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean d() {
        return this.f10174c != 0;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        this.f10174c = 0;
        f().removeCallbacks(this.f10173b);
    }
}
