package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

final class o implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zaak f2999b;

    private o(zaak zaak) {
        this.f2999b = zaak;
    }

    public final void B(int i) {
    }

    public final void H(Bundle bundle) {
        if (this.f2999b.r.k()) {
            this.f2999b.f3026b.lock();
            try {
                if (this.f2999b.k != null) {
                    this.f2999b.k.d(new m(this.f2999b));
                    this.f2999b.f3026b.unlock();
                }
            } finally {
                this.f2999b.f3026b.unlock();
            }
        } else {
            this.f2999b.k.d(new m(this.f2999b));
        }
    }

    public final void h0(ConnectionResult connectionResult) {
        this.f2999b.f3026b.lock();
        try {
            if (this.f2999b.u(connectionResult)) {
                this.f2999b.j();
                this.f2999b.h();
            } else {
                this.f2999b.v(connectionResult);
            }
        } finally {
            this.f2999b.f3026b.unlock();
        }
    }

    /* synthetic */ o(zaak zaak, g gVar) {
        this(zaak);
    }
}
