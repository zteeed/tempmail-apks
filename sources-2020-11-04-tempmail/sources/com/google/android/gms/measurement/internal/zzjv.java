package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzq;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzjv extends x3 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f10682c;

    /* renamed from: d  reason: collision with root package name */
    protected final k7 f10683d = new k7(this);

    /* renamed from: e  reason: collision with root package name */
    protected final i7 f10684e = new i7(this);

    /* renamed from: f  reason: collision with root package name */
    private final c7 f10685f = new c7(this);

    zzjv(zzfy zzfy) {
        super(zzfy);
    }

    /* access modifiers changed from: private */
    public final void G() {
        c();
        if (this.f10682c == null) {
            this.f10682c = new zzq(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: private */
    public final void I(long j) {
        c();
        G();
        h().O().b("Activity resumed, time", Long.valueOf(j));
        if (l().t(zzaq.D0)) {
            if (l().L().booleanValue() || k().w.b()) {
                this.f10684e.b(j);
            }
            this.f10685f.a();
        } else {
            this.f10685f.a();
            if (l().L().booleanValue()) {
                this.f10684e.b(j);
            }
        }
        k7 k7Var = this.f10683d;
        k7Var.f10283a.c();
        if (k7Var.f10283a.f10357a.p()) {
            if (!k7Var.f10283a.l().t(zzaq.D0)) {
                k7Var.f10283a.k().w.a(false);
            }
            k7Var.b(k7Var.f10283a.n().a(), false);
        }
    }

    /* access modifiers changed from: private */
    public final void K(long j) {
        c();
        G();
        h().O().b("Activity paused, time", Long.valueOf(j));
        this.f10685f.b(j);
        if (l().L().booleanValue()) {
            this.f10684e.f(j);
        }
        k7 k7Var = this.f10683d;
        if (!k7Var.f10283a.l().t(zzaq.D0)) {
            k7Var.f10283a.k().w.a(true);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean B() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long C(long j) {
        return this.f10684e.g(j);
    }

    public final boolean F(boolean z, boolean z2, long j) {
        return this.f10684e.d(z, z2, j);
    }
}
