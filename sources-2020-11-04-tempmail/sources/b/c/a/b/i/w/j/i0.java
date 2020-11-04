package b.c.a.b.i.w.j;

import android.content.Context;
import dagger.a.b;
import javax.inject.Provider;

/* compiled from: SchemaManager_Factory */
public final class i0 implements b<h0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f2333a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<String> f2334b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<Integer> f2335c;

    public i0(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f2333a = provider;
        this.f2334b = provider2;
        this.f2335c = provider3;
    }

    public static i0 a(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new i0(provider, provider2, provider3);
    }

    /* renamed from: b */
    public h0 get() {
        return new h0(this.f2333a.get(), this.f2334b.get(), this.f2335c.get().intValue());
    }
}
