package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class xt implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzdvf f5329b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvf f5330c;

    xt(zzdvf zzdvf, zzdvf zzdvf2) {
        this.f5329b = zzdvf;
        this.f5330c = zzdvf2;
    }

    public final Object call() {
        return new zzdfq((String) this.f5329b.get(), (String) this.f5330c.get());
    }
}
