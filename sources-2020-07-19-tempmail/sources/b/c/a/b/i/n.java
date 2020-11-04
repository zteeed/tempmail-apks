package b.c.a.b.i;

import b.c.a.b.b;
import b.c.a.b.e;
import b.c.a.b.f;
import b.c.a.b.g;
import java.util.Set;

/* compiled from: TransportFactoryImpl */
final class n implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f2154a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2155b;

    /* renamed from: c  reason: collision with root package name */
    private final q f2156c;

    n(Set<b> set, m mVar, q qVar) {
        this.f2154a = set;
        this.f2155b = mVar;
        this.f2156c = qVar;
    }

    public <T> f<T> a(String str, Class<T> cls, b bVar, e<T, byte[]> eVar) {
        if (this.f2154a.contains(bVar)) {
            return new p(this.f2155b, str, bVar, eVar, this.f2156c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f2154a}));
    }
}
