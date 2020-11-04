package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Collections;

public final class zaav implements zabd {

    /* renamed from: a  reason: collision with root package name */
    private final zabe f2843a;

    public zaav(zabe zabe) {
        this.f2843a = zabe;
    }

    public final void E(Bundle bundle) {
    }

    public final void P(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T Q(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void R() {
        for (Api.Client disconnect : this.f2843a.g.values()) {
            disconnect.disconnect();
        }
        this.f2843a.o.p = Collections.emptySet();
    }

    public final void connect() {
        this.f2843a.e();
    }

    public final boolean disconnect() {
        return true;
    }

    public final void y(int i) {
    }
}
