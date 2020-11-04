package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class wo extends zzaov {

    /* renamed from: b  reason: collision with root package name */
    private zzcqv<zzaox, zzcsd> f5249b;

    private wo(zzcuf zzcuf, zzcqv<zzaox, zzcsd> zzcqv) {
        this.f5249b = zzcqv;
    }

    public final void d0() throws RemoteException {
        ((zzcsd) this.f5249b.f7384c).onAdLoaded();
    }

    public final void q(String str) throws RemoteException {
        ((zzcsd) this.f5249b.f7384c).o2(0, str);
    }
}
