package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f2794a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectionResult f2795b;

    j0(ConnectionResult connectionResult, int i) {
        Preconditions.k(connectionResult);
        this.f2795b = connectionResult;
        this.f2794a = i;
    }

    /* access modifiers changed from: package-private */
    public final ConnectionResult a() {
        return this.f2795b;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.f2794a;
    }
}
