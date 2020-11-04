package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final /* synthetic */ class zg0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzauq f5651b;

    zg0(zzauq zzauq) {
        this.f5651b = zzauq;
    }

    public final void run() {
        zzauq zzauq = this.f5651b;
        if (zzauq != null) {
            try {
                zzauq.U4(1);
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        }
    }
}
