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
    private static volatile s f2261e;

    /* renamed from: a  reason: collision with root package name */
    private final a f2262a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2263b;

    /* renamed from: c  reason: collision with root package name */
    private final e f2264c;

    /* renamed from: d  reason: collision with root package name */
    private final m f2265d;

    @Inject
    r(a aVar, a aVar2, e eVar, m mVar, q qVar) {
        this.f2262a = aVar;
        this.f2263b = aVar2;
        this.f2264c = eVar;
        this.f2265d = mVar;
        qVar.a();
    }

    private h b(l lVar) {
        h.a a2 = h.a();
        a2.i(this.f2262a.a());
        a2.k(this.f2263b.a());
        a2.j(lVar.g());
        a2.h(new g(lVar.b(), lVar.d()));
        a2.g(lVar.c().a());
        return a2.d();
    }

    public static r c() {
        s sVar = f2261e;
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
        if (f2261e == null) {
            synchronized (r.class) {
                if (f2261e == null) {
                    s.a d2 = d.d();
                    d2.i(context);
                    f2261e = d2.h();
                }
            }
        }
    }

    public void a(l lVar, b.c.a.b.h hVar) {
        this.f2264c.a(lVar.f().e(lVar.c().c()), b(lVar), hVar);
    }

    public m e() {
        return this.f2265d;
    }

    public g g(e eVar) {
        Set<b> d2 = d(eVar);
        m.a a2 = m.a();
        a2.b(eVar.getName());
        a2.c(eVar.getExtras());
        return new n(d2, a2.a(), this);
    }
}
