package b.c.a.b.i.w;

import b.c.a.b.i.w.j.c;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import com.google.android.datatransport.runtime.synchronization.a;
import dagger.a.b;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* compiled from: DefaultScheduler_Factory */
public final class d implements b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Executor> f2186a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<e> f2187b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<s> f2188c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<c> f2189d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<a> f2190e;

    public d(Provider<Executor> provider, Provider<e> provider2, Provider<s> provider3, Provider<c> provider4, Provider<a> provider5) {
        this.f2186a = provider;
        this.f2187b = provider2;
        this.f2188c = provider3;
        this.f2189d = provider4;
        this.f2190e = provider5;
    }

    public static d a(Provider<Executor> provider, Provider<e> provider2, Provider<s> provider3, Provider<c> provider4, Provider<a> provider5) {
        return new d(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: b */
    public c get() {
        return new c(this.f2186a.get(), this.f2187b.get(), this.f2188c.get(), this.f2189d.get(), this.f2190e.get());
    }
}
