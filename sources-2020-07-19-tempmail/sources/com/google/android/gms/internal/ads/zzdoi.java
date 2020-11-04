package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdoi {

    /* renamed from: a  reason: collision with root package name */
    private final E f8254a;

    /* renamed from: b  reason: collision with root package name */
    private final List<zzdvf<?>> f8255b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzdog f8256c;

    private zzdoi(zzdog zzdog, E e2, List<zzdvf<?>> list) {
        this.f8256c = zzdog;
        this.f8254a = e2;
        this.f8255b = list;
    }

    public final <O> zzdom<O> a(Callable<O> callable) {
        zzduy<V> o = zzdux.o(this.f8255b);
        zzdvf<C> a2 = o.a(tx.f5018b, zzbbf.f6142f);
        zzdog zzdog = this.f8256c;
        return new zzdom(zzdog, this.f8254a, (String) null, a2, this.f8255b, o.a(callable, zzdog.f8251a), (sx) null);
    }
}
