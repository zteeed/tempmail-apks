package com.google.android.gms.common.api.internal;

import a.e.b;
import com.google.android.gms.common.ConnectionResult;

public class zaae extends zal {
    private final b<zai<?>> g;
    private GoogleApiManager h;

    private final void r() {
        if (!this.g.isEmpty()) {
            this.h.h(this);
        }
    }

    public void h() {
        super.h();
        r();
    }

    public void j() {
        super.j();
        r();
    }

    public void k() {
        super.k();
        this.h.l(this);
    }

    /* access modifiers changed from: protected */
    public final void m(ConnectionResult connectionResult, int i) {
        this.h.d(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    public final void o() {
        this.h.z();
    }

    /* access modifiers changed from: package-private */
    public final b<zai<?>> q() {
        return this.g;
    }
}
