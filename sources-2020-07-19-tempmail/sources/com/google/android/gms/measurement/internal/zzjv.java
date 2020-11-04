package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzq;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzjv extends x3 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f10496c;

    /* renamed from: d  reason: collision with root package name */
    protected final k7 f10497d = new k7(this);

    /* renamed from: e  reason: collision with root package name */
    protected final i7 f10498e = new i7(this);

    /* renamed from: f  reason: collision with root package name */
    private final c7 f10499f = new c7(this);

    zzjv(zzfy zzfy) {
        super(zzfy);
    }

    /* access modifiers changed from: private */
    public final void G() {
        c();
        if (this.f10496c == null) {
            this.f10496c = new zzq(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: private */
    public final void I(long j) {
        c();
        G();
        h().O().b("Activity resumed, time", Long.valueOf(j));
        if (l().t(zzaq.D0)) {
            if (l().L().booleanValue() || k().w.b()) {
                this.f10498e.b(j);
            }
            this.f10499f.a();
        } else {
            this.f10499f.a();
            if (l().L().booleanValue()) {
                this.f10498e.b(j);
            }
        }
        k7 k7Var = this.f10497d;
        k7Var.f10097a.c();
        if (k7Var.f10097a.f10171a.p()) {
            if (!k7Var.f10097a.l().t(zzaq.D0)) {
                k7Var.f10097a.k().w.a(false);
            }
            k7Var.b(k7Var.f10097a.n().a(), false);
        }
    }

    /* access modifiers changed from: private */
    public final void K(long j) {
        c();
        G();
        h().O().b("Activity paused, time", Long.valueOf(j));
        this.f10499f.b(j);
        if (l().L().booleanValue()) {
            this.f10498e.f(j);
        }
        k7 k7Var = this.f10497d;
        if (!k7Var.f10097a.l().t(zzaq.D0)) {
            k7Var.f10097a.k().w.a(true);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean B() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long C(long j) {
        return this.f10498e.g(j);
    }

    public final boolean F(boolean z, boolean z2, long j) {
        return this.f10498e.d(z, z2, j);
    }
}
