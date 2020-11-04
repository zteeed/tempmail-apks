package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class qm implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzdvf f4741b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvf f4742c;

    qm(zzdvf zzdvf, zzdvf zzdvf2) {
        this.f4741b = zzdvf;
        this.f4742c = zzdvf2;
    }

    public final Object call() {
        zzdvf zzdvf = this.f4741b;
        zzdvf zzdvf2 = this.f4742c;
        return new zzcpm((zzcpt) zzdvf.get(), ((zzcpn) zzdvf2.get()).f7325b, ((zzcpn) zzdvf2.get()).f7324a);
    }
}
