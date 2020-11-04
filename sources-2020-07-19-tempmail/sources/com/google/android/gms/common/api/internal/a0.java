package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Collections;

final class a0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ConnectionResult f2767b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ GoogleApiManager.b f2768c;

    a0(GoogleApiManager.b bVar, ConnectionResult connectionResult) {
        this.f2768c = bVar;
        this.f2767b = connectionResult;
    }

    public final void run() {
        if (this.f2767b.G()) {
            boolean unused = this.f2768c.f2741e = true;
            if (this.f2768c.f2737a.requiresSignIn()) {
                this.f2768c.g();
                return;
            }
            try {
                this.f2768c.f2737a.getRemoteService((IAccountAccessor) null, Collections.emptySet());
            } catch (SecurityException e2) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                ((GoogleApiManager.zaa) GoogleApiManager.this.j.get(this.f2768c.f2738b)).b0(new ConnectionResult(10));
            }
        } else {
            ((GoogleApiManager.zaa) GoogleApiManager.this.j.get(this.f2768c.f2738b)).b0(this.f2767b);
        }
    }
}
