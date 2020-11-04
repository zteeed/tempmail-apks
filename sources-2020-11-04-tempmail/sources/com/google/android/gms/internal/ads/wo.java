package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class wo extends zzaov {

    /* renamed from: b  reason: collision with root package name */
    private zzcqv<zzaox, zzcsd> f5432b;

    private wo(zzcuf zzcuf, zzcqv<zzaox, zzcsd> zzcqv) {
        this.f5432b = zzcqv;
    }

    public final void j0() throws RemoteException {
        ((zzcsd) this.f5432b.f7567c).onAdLoaded();
    }

    public final void s(String str) throws RemoteException {
        ((zzcsd) this.f5432b.f7567c).z2(0, str);
    }
}
