package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class jo extends zzaop {

    /* renamed from: b  reason: collision with root package name */
    private zzcqv<zzaox, zzcsd> f4337b;

    private jo(zzcsr zzcsr, zzcqv<zzaox, zzcsd> zzcqv) {
        this.f4337b = zzcqv;
    }

    public final void j0() throws RemoteException {
        ((zzcsd) this.f4337b.f7567c).onAdLoaded();
    }

    public final void s(String str) throws RemoteException {
        ((zzcsd) this.f4337b.f7567c).z2(0, str);
    }
}
