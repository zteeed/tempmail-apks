package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import b.c.a.b.i.w.j.c;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.synchronization.a;
import dagger.a.b;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* compiled from: Uploader_Factory */
public final class n implements b<m> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f2610a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<e> f2611b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<c> f2612c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<s> f2613d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<Executor> f2614e;

    /* renamed from: f  reason: collision with root package name */
    private final Provider<a> f2615f;
    private final Provider<b.c.a.b.i.x.a> g;

    public n(Provider<Context> provider, Provider<e> provider2, Provider<c> provider3, Provider<s> provider4, Provider<Executor> provider5, Provider<a> provider6, Provider<b.c.a.b.i.x.a> provider7) {
        this.f2610a = provider;
        this.f2611b = provider2;
        this.f2612c = provider3;
        this.f2613d = provider4;
        this.f2614e = provider5;
        this.f2615f = provider6;
        this.g = provider7;
    }

    public static n a(Provider<Context> provider, Provider<e> provider2, Provider<c> provider3, Provider<s> provider4, Provider<Executor> provider5, Provider<a> provider6, Provider<b.c.a.b.i.x.a> provider7) {
        return new n(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    /* renamed from: b */
    public m get() {
        return new m(this.f2610a.get(), this.f2611b.get(), this.f2612c.get(), this.f2613d.get(), this.f2614e.get(), this.f2615f.get(), this.g.get());
    }
}
