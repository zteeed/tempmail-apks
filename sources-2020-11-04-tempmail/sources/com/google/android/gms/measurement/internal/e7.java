package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final /* synthetic */ class e7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final f7 f10170b;

    e7(f7 f7Var) {
        this.f10170b = f7Var;
    }

    public final void run() {
        f7 f7Var = this.f10170b;
        c7 c7Var = f7Var.f10192d;
        long j = f7Var.f10190b;
        long j2 = f7Var.f10191c;
        c7Var.f10136b.c();
        c7Var.f10136b.h().N().a("Application going to the background");
        boolean z = true;
        if (c7Var.f10136b.l().t(zzaq.D0)) {
            c7Var.f10136b.k().w.a(true);
        }
        Bundle bundle = new Bundle();
        if (!c7Var.f10136b.l().L().booleanValue()) {
            c7Var.f10136b.f10684e.f(j2);
            if (c7Var.f10136b.l().t(zzaq.s0)) {
                bundle.putLong("_et", c7Var.f10136b.C(j2));
                zzii.P(c7Var.f10136b.t().E(true), bundle, true);
            } else {
                z = false;
            }
            c7Var.f10136b.F(false, z, j2);
        }
        c7Var.f10136b.q().O("auto", "_ab", j, bundle);
    }
}
