package b.c.a.b.i.w.j;

import b.c.a.b.i.x.a;
import dagger.a.b;
import javax.inject.Provider;

/* compiled from: SQLiteEventStore_Factory */
public final class c0 implements b<b0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<a> f2218a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<a> f2219b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<d> f2220c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<h0> f2221d;

    public c0(Provider<a> provider, Provider<a> provider2, Provider<d> provider3, Provider<h0> provider4) {
        this.f2218a = provider;
        this.f2219b = provider2;
        this.f2220c = provider3;
        this.f2221d = provider4;
    }

    public static c0 a(Provider<a> provider, Provider<a> provider2, Provider<d> provider3, Provider<h0> provider4) {
        return new c0(provider, provider2, provider3, provider4);
    }

    /* renamed from: b */
    public b0 get() {
        return new b0(this.f2218a.get(), this.f2219b.get(), this.f2220c.get(), this.f2221d.get());
    }
}
