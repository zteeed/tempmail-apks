package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdok {

    /* renamed from: a  reason: collision with root package name */
    private final E f8440a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzdog f8441b;

    private zzdok(zzdog zzdog, E e2) {
        this.f8441b = zzdog;
        this.f8440a = e2;
    }

    private final <O> zzdom<O> b(Callable<O> callable, zzdvi zzdvi) {
        return new zzdom(this.f8441b, this.f8440a, (String) null, zzdog.f8433d, Collections.emptyList(), zzdvi.f(callable), (sx) null);
    }

    public final zzdom<?> a(zzdoe zzdoe, zzdvi zzdvi) {
        return b(new ux(zzdoe), zzdvi);
    }

    public final <O> zzdom<O> c(Callable<O> callable) {
        return b(callable, this.f8441b.f8434a);
    }

    public final <O> zzdom<O> d(zzdvf<O> zzdvf) {
        return new zzdom(this.f8441b, this.f8440a, (String) null, zzdog.f8433d, Collections.emptyList(), zzdvf, (sx) null);
    }
}
