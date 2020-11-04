package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class ah0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzzq f3564b;

    ah0(zzzq zzzq) {
        this.f3564b = zzzq;
    }

    public final void run() {
        if (this.f3564b.f9454b != null) {
            try {
                this.f3564b.f9454b.onRewardedVideoAdFailedToLoad(1);
            } catch (RemoteException e2) {
                zzbba.d("Could not notify onRewardedVideoAdFailedToLoad event.", e2);
            }
        }
    }
}
