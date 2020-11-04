package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

final class k0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final j0 f2985b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zal f2986c;

    k0(zal zal, j0 j0Var) {
        this.f2986c = zal;
        this.f2985b = j0Var;
    }

    public final void run() {
        if (this.f2986c.f3089c) {
            ConnectionResult a2 = this.f2985b.a();
            if (a2.B()) {
                zal zal = this.f2986c;
                zal.f2942b.startActivityForResult(GoogleApiActivity.b(zal.b(), a2.A(), this.f2985b.b(), false), 1);
            } else if (this.f2986c.f3092f.m(a2.u())) {
                zal zal2 = this.f2986c;
                zal2.f3092f.z(zal2.b(), this.f2986c.f2942b, a2.u(), 2, this.f2986c);
            } else if (a2.u() == 18) {
                Dialog t = GoogleApiAvailability.t(this.f2986c.b(), this.f2986c);
                zal zal3 = this.f2986c;
                zal3.f3092f.v(zal3.b().getApplicationContext(), new l0(this, t));
            } else {
                this.f2986c.m(a2, this.f2985b.b());
            }
        }
    }
}
