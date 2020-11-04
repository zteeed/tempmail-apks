package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class iq implements zzbsq {

    /* renamed from: b  reason: collision with root package name */
    private final zzcxb f4072b;

    /* renamed from: c  reason: collision with root package name */
    private final zzaiw f4073c;

    iq(zzcxb zzcxb, zzaiw zzaiw) {
        this.f4072b = zzcxb;
        this.f4073c = zzaiw;
    }

    public final void onAdFailedToLoad(int i) {
        zzcxb zzcxb = this.f4072b;
        zzaiw zzaiw = this.f4073c;
        zzcxb.onAdFailedToLoad(i);
        if (zzaiw != null) {
            try {
                zzaiw.S5(i);
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        }
    }
}
