package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;

final class d implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ GoogleApiClient.ConnectionCallbacks f3048a;

    d(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f3048a = connectionCallbacks;
    }

    public final void E(Bundle bundle) {
        this.f3048a.E(bundle);
    }

    public final void y(int i) {
        this.f3048a.y(i);
    }
}
