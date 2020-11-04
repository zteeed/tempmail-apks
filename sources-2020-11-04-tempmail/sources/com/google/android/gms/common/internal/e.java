package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;

final class e implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ GoogleApiClient.OnConnectionFailedListener f3232a;

    e(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f3232a = onConnectionFailedListener;
    }

    public final void h0(ConnectionResult connectionResult) {
        this.f3232a.h0(connectionResult);
    }
}
