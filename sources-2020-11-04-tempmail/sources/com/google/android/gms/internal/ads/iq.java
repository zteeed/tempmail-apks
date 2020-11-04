package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class iq implements zzbsq {

    /* renamed from: b  reason: collision with root package name */
    private final zzcxb f4255b;

    /* renamed from: c  reason: collision with root package name */
    private final zzaiw f4256c;

    iq(zzcxb zzcxb, zzaiw zzaiw) {
        this.f4255b = zzcxb;
        this.f4256c = zzaiw;
    }

    public final void onAdFailedToLoad(int i) {
        zzcxb zzcxb = this.f4255b;
        zzaiw zzaiw = this.f4256c;
        zzcxb.onAdFailedToLoad(i);
        if (zzaiw != null) {
            try {
                zzaiw.r6(i);
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        }
    }
}
