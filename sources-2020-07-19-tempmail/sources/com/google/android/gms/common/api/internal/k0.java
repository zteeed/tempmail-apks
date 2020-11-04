package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

final class k0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final j0 f2797b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zal f2798c;

    k0(zal zal, j0 j0Var) {
        this.f2798c = zal;
        this.f2797b = j0Var;
    }

    public final void run() {
        if (this.f2798c.f2901c) {
            ConnectionResult a2 = this.f2797b.a();
            if (a2.B()) {
                zal zal = this.f2798c;
                zal.f2754b.startActivityForResult(GoogleApiActivity.b(zal.b(), a2.A(), this.f2797b.b(), false), 1);
            } else if (this.f2798c.f2904f.m(a2.u())) {
                zal zal2 = this.f2798c;
                zal2.f2904f.z(zal2.b(), this.f2798c.f2754b, a2.u(), 2, this.f2798c);
            } else if (a2.u() == 18) {
                Dialog t = GoogleApiAvailability.t(this.f2798c.b(), this.f2798c);
                zal zal3 = this.f2798c;
                zal3.f2904f.v(zal3.b().getApplicationContext(), new l0(this, t));
            } else {
                this.f2798c.m(a2, this.f2797b.b());
            }
        }
    }
}
