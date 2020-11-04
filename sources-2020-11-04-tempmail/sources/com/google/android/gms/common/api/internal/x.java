package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;

final class x implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ConnectionResult f3016b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ GoogleApiManager.zaa f3017c;

    x(GoogleApiManager.zaa zaa, ConnectionResult connectionResult) {
        this.f3017c = zaa;
        this.f3016b = connectionResult;
    }

    public final void run() {
        this.f3017c.h0(this.f3016b);
    }
}
