package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Collections;

public final class zaav implements zabd {

    /* renamed from: a  reason: collision with root package name */
    private final zabe f3031a;

    public zaav(zabe zabe) {
        this.f3031a = zabe;
    }

    public final void B(int i) {
    }

    public final void H(Bundle bundle) {
    }

    public final void V(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T W(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void X() {
        for (Api.Client disconnect : this.f3031a.g.values()) {
            disconnect.disconnect();
        }
        this.f3031a.o.p = Collections.emptySet();
    }

    public final void connect() {
        this.f3031a.e();
    }

    public final boolean disconnect() {
        return true;
    }
}
