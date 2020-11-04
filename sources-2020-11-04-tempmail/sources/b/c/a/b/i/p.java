package b.c.a.b.i;

import b.c.a.b.b;
import b.c.a.b.c;
import b.c.a.b.e;
import b.c.a.b.f;
import b.c.a.b.h;
import b.c.a.b.i.l;

/* compiled from: TransportImpl */
final class p<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final m f2256a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2257b;

    /* renamed from: c  reason: collision with root package name */
    private final b f2258c;

    /* renamed from: d  reason: collision with root package name */
    private final e<T, byte[]> f2259d;

    /* renamed from: e  reason: collision with root package name */
    private final q f2260e;

    p(m mVar, String str, b bVar, e<T, byte[]> eVar, q qVar) {
        this.f2256a = mVar;
        this.f2257b = str;
        this.f2258c = bVar;
        this.f2259d = eVar;
        this.f2260e = qVar;
    }

    static /* synthetic */ void c(Exception exc) {
    }

    public void a(c<T> cVar) {
        b(cVar, o.a());
    }

    public void b(c<T> cVar, h hVar) {
        q qVar = this.f2260e;
        l.a a2 = l.a();
        a2.e(this.f2256a);
        a2.c(cVar);
        a2.f(this.f2257b);
        a2.d(this.f2259d);
        a2.b(this.f2258c);
        qVar.a(a2.a(), hVar);
    }
}
