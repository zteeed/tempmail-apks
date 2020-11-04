package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import b.c.a.b.i.x.a;
import dagger.a.b;
import javax.inject.Provider;

/* compiled from: CreationContextFactory_Factory */
public final class j implements b<i> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f2554a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<a> f2555b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<a> f2556c;

    public j(Provider<Context> provider, Provider<a> provider2, Provider<a> provider3) {
        this.f2554a = provider;
        this.f2555b = provider2;
        this.f2556c = provider3;
    }

    public static j a(Provider<Context> provider, Provider<a> provider2, Provider<a> provider3) {
        return new j(provider, provider2, provider3);
    }

    /* renamed from: b */
    public i get() {
        return new i(this.f2554a.get(), this.f2555b.get(), this.f2556c.get());
    }
}
