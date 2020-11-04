package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class qo extends zzaoq {

    /* renamed from: b  reason: collision with root package name */
    private zzcqv<zzaox, zzcsd> f4745b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzcte f4746c;

    private qo(zzcte zzcte, zzcqv<zzaox, zzcsd> zzcqv) {
        this.f4746c = zzcte;
        this.f4745b = zzcqv;
    }

    public final void n4(zzang zzang) throws RemoteException {
        zzang unused = this.f4746c.f7486c = zzang;
        ((zzcsd) this.f4745b.f7384c).onAdLoaded();
    }

    public final void q(String str) throws RemoteException {
        ((zzcsd) this.f4745b.f7384c).o2(0, str);
    }
}
