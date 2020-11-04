package b.c.a.b.i;

import android.content.Context;
import b.c.a.b.i.s;
import b.c.a.b.i.w.c;
import b.c.a.b.i.w.i;
import b.c.a.b.i.w.j.b0;
import b.c.a.b.i.w.j.c0;
import b.c.a.b.i.w.j.f;
import b.c.a.b.i.w.j.h;
import b.c.a.b.i.w.j.i0;
import com.google.android.datatransport.runtime.backends.j;
import com.google.android.datatransport.runtime.backends.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* compiled from: DaggerTransportRuntimeComponent */
final class d extends s {

    /* renamed from: b  reason: collision with root package name */
    private Provider<Executor> f2241b;

    /* renamed from: c  reason: collision with root package name */
    private Provider<Context> f2242c;

    /* renamed from: d  reason: collision with root package name */
    private Provider f2243d;

    /* renamed from: e  reason: collision with root package name */
    private Provider f2244e;

    /* renamed from: f  reason: collision with root package name */
    private Provider f2245f;
    private Provider<b0> g;
    private Provider<g> h;
    private Provider<s> i;
    private Provider<c> j;
    private Provider<m> k;
    private Provider<q> l;
    private Provider<r> m;

    /* compiled from: DaggerTransportRuntimeComponent */
    private static final class b implements s.a {

        /* renamed from: a  reason: collision with root package name */
        private Context f2246a;

        private b() {
        }

        public b a(Context context) {
            dagger.a.d.b(context);
            this.f2246a = context;
            return this;
        }

        public s h() {
            dagger.a.d.a(this.f2246a, Context.class);
            return new d(this.f2246a);
        }

        public /* bridge */ /* synthetic */ s.a i(Context context) {
            a(context);
            return this;
        }
    }

    public static s.a d() {
        return new b();
    }

    private void e(Context context) {
        this.f2241b = dagger.a.a.a(j.a());
        dagger.a.b a2 = dagger.a.c.a(context);
        this.f2242c = a2;
        j a3 = j.a(a2, b.c.a.b.i.x.c.a(), b.c.a.b.i.x.d.a());
        this.f2243d = a3;
        this.f2244e = dagger.a.a.a(l.a(this.f2242c, a3));
        this.f2245f = i0.a(this.f2242c, f.a(), b.c.a.b.i.w.j.g.a());
        this.g = dagger.a.a.a(c0.a(b.c.a.b.i.x.c.a(), b.c.a.b.i.x.d.a(), h.a(), this.f2245f));
        b.c.a.b.i.w.g b2 = b.c.a.b.i.w.g.b(b.c.a.b.i.x.c.a());
        this.h = b2;
        i a4 = i.a(this.f2242c, this.g, b2, b.c.a.b.i.x.d.a());
        this.i = a4;
        Provider<Executor> provider = this.f2241b;
        Provider provider2 = this.f2244e;
        Provider<b0> provider3 = this.g;
        this.j = b.c.a.b.i.w.d.a(provider, provider2, a4, provider3, provider3);
        Provider<Context> provider4 = this.f2242c;
        Provider provider5 = this.f2244e;
        Provider<b0> provider6 = this.g;
        this.k = n.a(provider4, provider5, provider6, this.i, this.f2241b, provider6, b.c.a.b.i.x.c.a());
        Provider<Executor> provider7 = this.f2241b;
        Provider<b0> provider8 = this.g;
        this.l = r.a(provider7, provider8, this.i, provider8);
        this.m = dagger.a.a.a(t.a(b.c.a.b.i.x.c.a(), b.c.a.b.i.x.d.a(), this.j, this.k, this.l));
    }

    /* access modifiers changed from: package-private */
    public b.c.a.b.i.w.j.c a() {
        return this.g.get();
    }

    /* access modifiers changed from: package-private */
    public r b() {
        return this.m.get();
    }

    private d(Context context) {
        e(context);
    }
}
