package b.c.a.b.i;

import android.content.Context;
import b.c.a.b.b;
import b.c.a.b.g;
import b.c.a.b.i.h;
import b.c.a.b.i.m;
import b.c.a.b.i.s;
import b.c.a.b.i.w.e;
import b.c.a.b.i.x.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* compiled from: TransportRuntime */
public class r implements q {

    /* renamed from: e  reason: collision with root package name */
    private static volatile s f2163e;

    /* renamed from: a  reason: collision with root package name */
    private final a f2164a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2165b;

    /* renamed from: c  reason: collision with root package name */
    private final e f2166c;

    /* renamed from: d  reason: collision with root package name */
    private final m f2167d;

    @Inject
    r(a aVar, a aVar2, e eVar, m mVar, q qVar) {
        this.f2164a = aVar;
        this.f2165b = aVar2;
        this.f2166c = eVar;
        this.f2167d = mVar;
        qVar.a();
    }

    private h b(l lVar) {
        h.a a2 = h.a();
        a2.i(this.f2164a.a());
        a2.k(this.f2165b.a());
        a2.j(lVar.g());
        a2.h(new g(lVar.b(), lVar.d()));
        a2.g(lVar.c().a());
        return a2.d();
    }

    public static r c() {
        s sVar = f2163e;
        if (sVar != null) {
            return sVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<b> d(e eVar) {
        if (eVar instanceof f) {
            return Collections.unmodifiableSet(((f) eVar).a());
        }
        return Collections.singleton(b.b("proto"));
    }

    public static void f(Context context) {
        if (f2163e == null) {
            synchronized (r.class) {
                if (f2163e == null) {
                    s.a d2 = d.d();
                    d2.i(context);
                    f2163e = d2.h();
                }
            }
        }
    }

    public void a(l lVar, b.c.a.b.h hVar) {
        this.f2166c.a(lVar.f().e(lVar.c().c()), b(lVar), hVar);
    }

    public m e() {
        return this.f2167d;
    }

    public g g(e eVar) {
        Set<b> d2 = d(eVar);
        m.a a2 = m.a();
        a2.b(eVar.getName());
        a2.c(eVar.getExtras());
        return new n(d2, a2.a(), this);
    }
}
