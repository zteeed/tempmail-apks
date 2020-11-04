package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;

final class x implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ConnectionResult f2828b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ GoogleApiManager.zaa f2829c;

    x(GoogleApiManager.zaa zaa, ConnectionResult connectionResult) {
        this.f2829c = zaa;
        this.f2828b = connectionResult;
    }

    public final void run() {
        this.f2829c.b0(this.f2828b);
    }
}
