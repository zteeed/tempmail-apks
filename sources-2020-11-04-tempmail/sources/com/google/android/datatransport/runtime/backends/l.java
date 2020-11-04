package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import dagger.a.b;
import javax.inject.Provider;

/* compiled from: MetadataBackendRegistry_Factory */
public final class l implements b<k> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f2750a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<i> f2751b;

    public l(Provider<Context> provider, Provider<i> provider2) {
        this.f2750a = provider;
        this.f2751b = provider2;
    }

    public static l a(Provider<Context> provider, Provider<i> provider2) {
        return new l(provider, provider2);
    }

    /* renamed from: b */
    public k get() {
        return new k(this.f2750a.get(), this.f2751b.get());
    }
}
