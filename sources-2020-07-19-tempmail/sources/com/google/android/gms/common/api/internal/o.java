package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

final class o implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zaak f2811b;

    private o(zaak zaak) {
        this.f2811b = zaak;
    }

    public final void E(Bundle bundle) {
        if (this.f2811b.r.k()) {
            this.f2811b.f2838b.lock();
            try {
                if (this.f2811b.k != null) {
                    this.f2811b.k.d(new m(this.f2811b));
                    this.f2811b.f2838b.unlock();
                }
            } finally {
                this.f2811b.f2838b.unlock();
            }
        } else {
            this.f2811b.k.d(new m(this.f2811b));
        }
    }

    public final void b0(ConnectionResult connectionResult) {
        this.f2811b.f2838b.lock();
        try {
            if (this.f2811b.u(connectionResult)) {
                this.f2811b.j();
                this.f2811b.h();
            } else {
                this.f2811b.v(connectionResult);
            }
        } finally {
            this.f2811b.f2838b.unlock();
        }
    }

    public final void y(int i) {
    }

    /* synthetic */ o(zaak zaak, g gVar) {
        this(zaak);
    }
}
