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
    private final Provider<a> f2168a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<a> f2169b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<e> f2170c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<m> f2171d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<q> f2172e;

    public t(Provider<a> provider, Provider<a> provider2, Provider<e> provider3, Provider<m> provider4, Provider<q> provider5) {
        this.f2168a = provider;
        this.f2169b = provider2;
        this.f2170c = provider3;
        this.f2171d = provider4;
        this.f2172e = provider5;
    }

    public static t a(Provider<a> provider, Provider<a> provider2, Provider<e> provider3, Provider<m> provider4, Provider<q> provider5) {
        return new t(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: b */
    public r get() {
        return new r(this.f2168a.get(), this.f2169b.get(), this.f2170c.get(), this.f2171d.get(), this.f2172e.get());
    }
}
