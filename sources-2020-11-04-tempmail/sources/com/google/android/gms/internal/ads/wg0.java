package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class wg0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ug0 f5419b;

    wg0(ug0 ug0) {
        this.f5419b = ug0;
    }

    public final void run() {
        if (this.f5419b.f5251b.f9451b != null) {
            try {
                this.f5419b.f5251b.f9451b.onAdFailedToLoad(1);
            } catch (RemoteException e2) {
                zzbba.d("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
