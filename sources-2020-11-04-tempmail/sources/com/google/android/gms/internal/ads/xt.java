package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class xt implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzdvf f5512b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvf f5513c;

    xt(zzdvf zzdvf, zzdvf zzdvf2) {
        this.f5512b = zzdvf;
        this.f5513c = zzdvf2;
    }

    public final Object call() {
        return new zzdfq((String) this.f5512b.get(), (String) this.f5513c.get());
    }
}
