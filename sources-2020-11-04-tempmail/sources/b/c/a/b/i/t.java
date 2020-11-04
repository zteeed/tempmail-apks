package b.c.a.b.i;

import b.c.a.b.i.w.e;
import b.c.a.b.i.x.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import dagger.a.b;
import javax.inject.Provider;

/* compiled from: TransportRuntime_Factory */
public final class t implements b<r> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<a> f2266a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<a> f2267b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<e> f2268c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<m> f2269d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<q> f2270e;

    public t(Provider<a> provider, Provider<a> provider2, Provider<e> provider3, Provider<m> provider4, Provider<q> provider5) {
        this.f2266a = provider;
        this.f2267b = provider2;
        this.f2268c = provider3;
        this.f2269d = provider4;
        this.f2270e = provider5;
    }

    public static t a(Provider<a> provider, Provider<a> provider2, Provider<e> provider3, Provider<m> provider4, Provider<q> provider5) {
        return new t(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: b */
    public r get() {
        return new r(this.f2266a.get(), this.f2267b.get(), this.f2268c.get(), this.f2269d.get(), this.f2270e.get());
    }
}
