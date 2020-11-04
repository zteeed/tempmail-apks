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
    private final m f2158a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2159b;

    /* renamed from: c  reason: collision with root package name */
    private final b f2160c;

    /* renamed from: d  reason: collision with root package name */
    private final e<T, byte[]> f2161d;

    /* renamed from: e  reason: collision with root package name */
    private final q f2162e;

    p(m mVar, String str, b bVar, e<T, byte[]> eVar, q qVar) {
        this.f2158a = mVar;
        this.f2159b = str;
        this.f2160c = bVar;
        this.f2161d = eVar;
        this.f2162e = qVar;
    }

    static /* synthetic */ void c(Exception exc) {
    }

    public void a(c<T> cVar) {
        b(cVar, o.a());
    }

    public void b(c<T> cVar, h hVar) {
        q qVar = this.f2162e;
        l.a a2 = l.a();
        a2.e(this.f2158a);
        a2.c(cVar);
        a2.f(this.f2159b);
        a2.d(this.f2161d);
        a2.b(this.f2160c);
        qVar.a(a2.a(), hVar);
    }
}
