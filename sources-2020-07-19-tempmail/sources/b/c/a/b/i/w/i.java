package b.c.a.b.i.w;

import android.content.Context;
import b.c.a.b.i.w.j.c;
import b.c.a.b.i.x.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import dagger.a.b;
import dagger.a.d;
import javax.inject.Provider;

/* compiled from: SchedulingModule_WorkSchedulerFactory */
public final class i implements b<s> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f2192a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<c> f2193b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<g> f2194c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<a> f2195d;

    public i(Provider<Context> provider, Provider<c> provider2, Provider<g> provider3, Provider<a> provider4) {
        this.f2192a = provider;
        this.f2193b = provider2;
        this.f2194c = provider3;
        this.f2195d = provider4;
    }

    public static i a(Provider<Context> provider, Provider<c> provider2, Provider<g> provider3, Provider<a> provider4) {
        return new i(provider, provider2, provider3, provider4);
    }

    public static s c(Context context, c cVar, g gVar, a aVar) {
        s a2 = h.a(context, cVar, gVar, aVar);
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: b */
    public s get() {
        return c(this.f2192a.get(), this.f2193b.get(), this.f2194c.get(), this.f2195d.get());
    }
}
