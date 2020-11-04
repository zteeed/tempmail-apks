package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import b.c.a.b.i.x.a;
import dagger.a.b;
import javax.inject.Provider;

/* compiled from: CreationContextFactory_Factory */
public final class j implements b<i> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f2742a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<a> f2743b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<a> f2744c;

    public j(Provider<Context> provider, Provider<a> provider2, Provider<a> provider3) {
        this.f2742a = provider;
        this.f2743b = provider2;
        this.f2744c = provider3;
    }

    public static j a(Provider<Context> provider, Provider<a> provider2, Provider<a> provider3) {
        return new j(provider, provider2, provider3);
    }

    /* renamed from: b */
    public i get() {
        return new i(this.f2742a.get(), this.f2743b.get(), this.f2744c.get());
    }
}
