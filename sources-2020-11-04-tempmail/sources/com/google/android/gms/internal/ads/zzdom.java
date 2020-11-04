package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdom<O> {

    /* renamed from: a  reason: collision with root package name */
    private final E f8442a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8443b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvf<?> f8444c;

    /* renamed from: d  reason: collision with root package name */
    private final List<zzdvf<?>> f8445d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdvf<O> f8446e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ zzdog f8447f;

    private zzdom(zzdog zzdog, E e2, String str, zzdvf<?> zzdvf, List<zzdvf<?>> list, zzdvf<O> zzdvf2) {
        this.f8447f = zzdog;
        this.f8442a = e2;
        this.f8443b = str;
        this.f8444c = zzdvf;
        this.f8445d = list;
        this.f8446e = zzdvf2;
    }

    private final <O2> zzdom<O2> c(zzduh<O, O2> zzduh, Executor executor) {
        return new zzdom(this.f8447f, this.f8442a, this.f8443b, this.f8444c, this.f8445d, zzdux.j(this.f8446e, zzduh, executor));
    }

    public final zzdom<O> a(long j, TimeUnit timeUnit) {
        zzdog zzdog = this.f8447f;
        return new zzdom(zzdog, this.f8442a, this.f8443b, this.f8444c, this.f8445d, zzdux.d(this.f8446e, j, timeUnit, zzdog.f8435b));
    }

    public final <O2> zzdom<O2> b(zzduh<O, O2> zzduh) {
        return c(zzduh, this.f8447f.f8434a);
    }

    public final <T extends Throwable> zzdom<O> d(Class<T> cls, zzdob<T, O> zzdob) {
        return e(cls, new wx(zzdob));
    }

    public final <T extends Throwable> zzdom<O> e(Class<T> cls, zzduh<T, O> zzduh) {
        zzdog zzdog = this.f8447f;
        return new zzdom(zzdog, this.f8442a, this.f8443b, this.f8444c, this.f8445d, zzdux.k(this.f8446e, cls, zzduh, zzdog.f8434a));
    }

    public final zzdod<E, O> f() {
        E e2 = this.f8442a;
        String str = this.f8443b;
        if (str == null) {
            str = this.f8447f.h(e2);
        }
        zzdod<E, O> zzdod = new zzdod<>(e2, str, this.f8446e);
        this.f8447f.f8436c.u(zzdod);
        this.f8444c.f(new zx(this, zzdod), zzbbf.f6325f);
        zzdux.f(zzdod, new yx(this, zzdod), zzbbf.f6325f);
        return zzdod;
    }

    public final <O2> zzdom<O2> g(zzdob<O, O2> zzdob) {
        return b(new vx(zzdob));
    }

    public final <O2> zzdom<O2> h(zzdvf<O2> zzdvf) {
        return c(new xx(zzdvf), zzbbf.f6325f);
    }

    public final zzdom<O> i(String str) {
        return new zzdom(this.f8447f, this.f8442a, str, this.f8444c, this.f8445d, this.f8446e);
    }

    public final zzdom<O> j(E e2) {
        return this.f8447f.b(e2, f());
    }

    /* synthetic */ zzdom(zzdog zzdog, Object obj, String str, zzdvf zzdvf, List list, zzdvf zzdvf2, sx sxVar) {
        this(zzdog, obj, (String) null, zzdvf, list, zzdvf2);
    }
}
