package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import dagger.a.b;
import javax.inject.Provider;

/* compiled from: MetadataBackendRegistry_Factory */
public final class l implements b<k> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f2562a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<i> f2563b;

    public l(Provider<Context> provider, Provider<i> provider2) {
        this.f2562a = provider;
        this.f2563b = provider2;
    }

    public static l a(Provider<Context> provider, Provider<i> provider2) {
        return new l(provider, provider2);
    }

    /* renamed from: b */
    public k get() {
        return new k(this.f2562a.get(), this.f2563b.get());
    }
}
