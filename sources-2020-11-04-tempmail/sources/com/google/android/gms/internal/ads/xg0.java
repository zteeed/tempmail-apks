package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class xg0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzzi f5493b;

    xg0(zzzi zzzi) {
        this.f5493b = zzzi;
    }

    public final void run() {
        if (this.f5493b.f9452b != null) {
            try {
                this.f5493b.f9452b.onAdFailedToLoad(1);
            } catch (RemoteException e2) {
                zzbba.d("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
