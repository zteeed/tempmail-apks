package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzq;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
abstract class f {

    /* renamed from: d  reason: collision with root package name */
    private static volatile Handler f9985d;

    /* renamed from: a  reason: collision with root package name */
    private final r4 f9986a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f9987b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile long f9988c;

    f(r4 r4Var) {
        Preconditions.k(r4Var);
        this.f9986a = r4Var;
        this.f9987b = new g(this, r4Var);
    }

    private final Handler f() {
        Handler handler;
        if (f9985d != null) {
            return f9985d;
        }
        synchronized (f.class) {
            if (f9985d == null) {
                f9985d = new zzq(this.f9986a.f().getMainLooper());
            }
            handler = f9985d;
        }
        return handler;
    }

    public abstract void b();

    public final void c(long j) {
        e();
        if (j >= 0) {
            this.f9988c = this.f9986a.n().a();
            if (!f().postDelayed(this.f9987b, j)) {
                this.f9986a.h().G().b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean d() {
        return this.f9988c != 0;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        this.f9988c = 0;
        f().removeCallbacks(this.f9987b);
    }
}
