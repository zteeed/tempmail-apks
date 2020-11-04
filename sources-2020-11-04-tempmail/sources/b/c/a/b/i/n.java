package b.c.a.b.i;

import b.c.a.b.b;
import b.c.a.b.e;
import b.c.a.b.f;
import b.c.a.b.g;
import java.util.Set;

/* compiled from: TransportFactoryImpl */
final class n implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f2252a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2253b;

    /* renamed from: c  reason: collision with root package name */
    private final q f2254c;

    n(Set<b> set, m mVar, q qVar) {
        this.f2252a = set;
        this.f2253b = mVar;
        this.f2254c = qVar;
    }

    public <T> f<T> a(String str, Class<T> cls, b bVar, e<T, byte[]> eVar) {
        if (this.f2252a.contains(bVar)) {
            return new p(this.f2253b, str, bVar, eVar, this.f2254c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f2252a}));
    }
}
