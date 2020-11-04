package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f2982a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectionResult f2983b;

    j0(ConnectionResult connectionResult, int i) {
        Preconditions.k(connectionResult);
        this.f2983b = connectionResult;
        this.f2982a = i;
    }

    /* access modifiers changed from: package-private */
    public final ConnectionResult a() {
        return this.f2983b;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.f2982a;
    }
}
