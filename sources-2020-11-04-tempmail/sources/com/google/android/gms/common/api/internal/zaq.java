package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

public final class zaq implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: b  reason: collision with root package name */
    public final Api<?> f3093b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3094c;

    /* renamed from: d  reason: collision with root package name */
    private zar f3095d;

    private final void b() {
        Preconditions.l(this.f3095d, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    public final void B(int i) {
        b();
        this.f3095d.B(i);
    }

    public final void H(Bundle bundle) {
        b();
        this.f3095d.H(bundle);
    }

    public final void a(zar zar) {
        this.f3095d = zar;
    }

    public final void h0(ConnectionResult connectionResult) {
        b();
        this.f3095d.V(connectionResult, this.f3093b, this.f3094c);
    }
}
