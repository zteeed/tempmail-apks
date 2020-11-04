package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdom<O> {

    /* renamed from: a  reason: collision with root package name */
    private final E f8259a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8260b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvf<?> f8261c;

    /* renamed from: d  reason: collision with root package name */
    private final List<zzdvf<?>> f8262d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdvf<O> f8263e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ zzdog f8264f;

    private zzdom(zzdog zzdog, E e2, String str, zzdvf<?> zzdvf, List<zzdvf<?>> list, zzdvf<O> zzdvf2) {
        this.f8264f = zzdog;
        this.f8259a = e2;
        this.f8260b = str;
        this.f8261c = zzdvf;
        this.f8262d = list;
        this.f8263e = zzdvf2;
    }

    private final <O2> zzdom<O2> c(zzduh<O, O2> zzduh, Executor executor) {
        return new zzdom(this.f8264f, this.f8259a, this.f8260b, this.f8261c, this.f8262d, zzdux.j(this.f8263e, zzduh, executor));
    }

    public final zzdom<O> a(long j, TimeUnit timeUnit) {
        zzdog zzdog = this.f8264f;
        return new zzdom(zzdog, this.f8259a, this.f8260b, this.f8261c, this.f8262d, zzdux.d(this.f8263e, j, timeUnit, zzdog.f8252b));
    }

    public final <O2> zzdom<O2> b(zzduh<O, O2> zzduh) {
        return c(zzduh, this.f8264f.f8251a);
    }

    public final <T extends Throwable> zzdom<O> d(Class<T> cls, zzdob<T, O> zzdob) {
        return e(cls, new wx(zzdob));
    }

    public final <T extends Throwable> zzdom<O> e(Class<T> cls, zzduh<T, O> zzduh) {
        zzdog zzdog = this.f8264f;
        return new zzdom(zzdog, this.f8259a, this.f8260b, this.f8261c, this.f8262d, zzdux.k(this.f8263e, cls, zzduh, zzdog.f8251a));
    }

    public final zzdod<E, O> f() {
        E e2 = this.f8259a;
        String str = this.f8260b;
        if (str == null) {
            str = this.f8264f.h(e2);
        }
        zzdod<E, O> zzdod = new zzdod<>(e2, str, this.f8263e);
        this.f8264f.f8253c.u(zzdod);
        this.f8261c.f(new zx(this, zzdod), zzbbf.f6142f);
        zzdux.f(zzdod, new yx(this, zzdod), zzbbf.f6142f);
        return zzdod;
    }

    public final <O2> zzdom<O2> g(zzdob<O, O2> zzdob) {
        return b(new vx(zzdob));
    }

    public final <O2> zzdom<O2> h(zzdvf<O2> zzdvf) {
        return c(new xx(zzdvf), zzbbf.f6142f);
    }

    public final zzdom<O> i(String str) {
        return new zzdom(this.f8264f, this.f8259a, str, this.f8261c, this.f8262d, this.f8263e);
    }

    public final zzdom<O> j(E e2) {
        return this.f8264f.b(e2, f());
    }

    /* synthetic */ zzdom(zzdog zzdog, Object obj, String str, zzdvf zzdvf, List list, zzdvf zzdvf2, sx sxVar) {
        this(zzdog, obj, (String) null, zzdvf, list, zzdvf2);
    }
}
