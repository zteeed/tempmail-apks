package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class qm implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzdvf f4924b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvf f4925c;

    qm(zzdvf zzdvf, zzdvf zzdvf2) {
        this.f4924b = zzdvf;
        this.f4925c = zzdvf2;
    }

    public final Object call() {
        zzdvf zzdvf = this.f4924b;
        zzdvf zzdvf2 = this.f4925c;
        return new zzcpm((zzcpt) zzdvf.get(), ((zzcpn) zzdvf2.get()).f7508b, ((zzcpn) zzdvf2.get()).f7507a);
    }
}
