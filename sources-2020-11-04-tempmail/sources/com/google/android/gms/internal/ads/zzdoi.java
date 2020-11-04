package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdoi {

    /* renamed from: a  reason: collision with root package name */
    private final E f8437a;

    /* renamed from: b  reason: collision with root package name */
    private final List<zzdvf<?>> f8438b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzdog f8439c;

    private zzdoi(zzdog zzdog, E e2, List<zzdvf<?>> list) {
        this.f8439c = zzdog;
        this.f8437a = e2;
        this.f8438b = list;
    }

    public final <O> zzdom<O> a(Callable<O> callable) {
        zzduy<V> o = zzdux.o(this.f8438b);
        zzdvf<C> a2 = o.a(tx.f5201b, zzbbf.f6325f);
        zzdog zzdog = this.f8439c;
        return new zzdom(zzdog, this.f8437a, (String) null, a2, this.f8438b, o.a(callable, zzdog.f8434a), (sx) null);
    }
}
