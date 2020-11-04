package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

public final class zaq implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: b  reason: collision with root package name */
    public final Api<?> f2905b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2906c;

    /* renamed from: d  reason: collision with root package name */
    private zar f2907d;

    private final void b() {
        Preconditions.l(this.f2907d, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    public final void E(Bundle bundle) {
        b();
        this.f2907d.E(bundle);
    }

    public final void a(zar zar) {
        this.f2907d = zar;
    }

    public final void b0(ConnectionResult connectionResult) {
        b();
        this.f2907d.P(connectionResult, this.f2905b, this.f2906c);
    }

    public final void y(int i) {
        b();
        this.f2907d.y(i);
    }
}
