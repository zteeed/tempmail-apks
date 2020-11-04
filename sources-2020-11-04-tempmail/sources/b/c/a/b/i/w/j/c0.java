package b.c.a.b.i.w.j;

import b.c.a.b.i.x.a;
import dagger.a.b;
import javax.inject.Provider;

/* compiled from: SQLiteEventStore_Factory */
public final class c0 implements b<b0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<a> f2316a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<a> f2317b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<d> f2318c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<h0> f2319d;

    public c0(Provider<a> provider, Provider<a> provider2, Provider<d> provider3, Provider<h0> provider4) {
        this.f2316a = provider;
        this.f2317b = provider2;
        this.f2318c = provider3;
        this.f2319d = provider4;
    }

    public static c0 a(Provider<a> provider, Provider<a> provider2, Provider<d> provider3, Provider<h0> provider4) {
        return new c0(provider, provider2, provider3, provider4);
    }

    /* renamed from: b */
    public b0 get() {
        return new b0(this.f2316a.get(), this.f2317b.get(), this.f2318c.get(), this.f2319d.get());
    }
}
