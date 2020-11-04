package b.c.a.b.i.w;

import b.c.a.b.i.x.a;
import dagger.a.b;
import dagger.a.d;
import javax.inject.Provider;

/* compiled from: SchedulingConfigModule_ConfigFactory */
public final class g implements b<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<a> f2191a;

    public g(Provider<a> provider) {
        this.f2191a = provider;
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.g a(a aVar) {
        com.google.android.datatransport.runtime.scheduling.jobscheduling.g a2 = f.a(aVar);
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public static g b(Provider<a> provider) {
        return new g(provider);
    }

    /* renamed from: c */
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.g get() {
        return a(this.f2191a.get());
    }
}
