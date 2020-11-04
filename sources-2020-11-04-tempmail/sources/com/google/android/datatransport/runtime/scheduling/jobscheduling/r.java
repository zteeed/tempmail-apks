package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import b.c.a.b.i.w.j.c;
import com.google.android.datatransport.runtime.synchronization.a;
import dagger.a.b;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* compiled from: WorkInitializer_Factory */
public final class r implements b<q> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Executor> f2810a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<c> f2811b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<s> f2812c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<a> f2813d;

    public r(Provider<Executor> provider, Provider<c> provider2, Provider<s> provider3, Provider<a> provider4) {
        this.f2810a = provider;
        this.f2811b = provider2;
        this.f2812c = provider3;
        this.f2813d = provider4;
    }

    public static r a(Provider<Executor> provider, Provider<c> provider2, Provider<s> provider3, Provider<a> provider4) {
        return new r(provider, provider2, provider3, provider4);
    }

    /* renamed from: b */
    public q get() {
        return new q(this.f2810a.get(), this.f2811b.get(), this.f2812c.get(), this.f2813d.get());
    }
}
