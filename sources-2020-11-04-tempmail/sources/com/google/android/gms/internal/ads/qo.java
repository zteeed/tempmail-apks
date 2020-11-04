package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class qo extends zzaoq {

    /* renamed from: b  reason: collision with root package name */
    private zzcqv<zzaox, zzcsd> f4928b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzcte f4929c;

    private qo(zzcte zzcte, zzcqv<zzaox, zzcsd> zzcqv) {
        this.f4929c = zzcte;
        this.f4928b = zzcqv;
    }

    public final void H4(zzang zzang) throws RemoteException {
        zzang unused = this.f4929c.f7669c = zzang;
        ((zzcsd) this.f4928b.f7567c).onAdLoaded();
    }

    public final void s(String str) throws RemoteException {
        ((zzcsd) this.f4928b.f7567c).z2(0, str);
    }
}
