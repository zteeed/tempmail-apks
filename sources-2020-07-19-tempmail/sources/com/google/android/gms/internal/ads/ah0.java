package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class ah0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzzq f3381b;

    ah0(zzzq zzzq) {
        this.f3381b = zzzq;
    }

    public final void run() {
        if (this.f3381b.f9271b != null) {
            try {
                this.f3381b.f9271b.onRewardedVideoAdFailedToLoad(1);
            } catch (RemoteException e2) {
                zzbba.d("Could not notify onRewardedVideoAdFailedToLoad event.", e2);
            }
        }
    }
}
