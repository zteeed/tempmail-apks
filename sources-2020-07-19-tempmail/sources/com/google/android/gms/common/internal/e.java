package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;

final class e implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ GoogleApiClient.OnConnectionFailedListener f3049a;

    e(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f3049a = onConnectionFailedListener;
    }

    public final void b0(ConnectionResult connectionResult) {
        this.f3049a.b0(connectionResult);
    }
}
