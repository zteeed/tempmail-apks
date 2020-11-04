package b.c.a.b.i.w.j;

import android.content.Context;
import dagger.a.b;
import javax.inject.Provider;

/* compiled from: SchemaManager_Factory */
public final class i0 implements b<h0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f2235a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<String> f2236b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<Integer> f2237c;

    public i0(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f2235a = provider;
        this.f2236b = provider2;
        this.f2237c = provider3;
    }

    public static i0 a(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new i0(provider, provider2, provider3);
    }

    /* renamed from: b */
    public h0 get() {
        return new h0(this.f2235a.get(), this.f2236b.get(), this.f2237c.get().intValue());
    }
}
