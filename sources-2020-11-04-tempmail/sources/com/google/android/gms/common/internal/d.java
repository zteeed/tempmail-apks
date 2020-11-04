package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;

final class d implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ GoogleApiClient.ConnectionCallbacks f3231a;

    d(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f3231a = connectionCallbacks;
    }

    public final void B(int i) {
        this.f3231a.B(i);
    }

    public final void H(Bundle bundle) {
        this.f3231a.H(bundle);
    }
}
