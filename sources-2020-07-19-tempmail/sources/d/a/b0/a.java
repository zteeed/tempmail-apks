package d.a.b0;

import d.a.a0.e.d.g2;
import d.a.a0.e.d.h2;
import d.a.a0.e.d.o2;
import d.a.l;
import d.a.y.b;
import d.a.z.f;

/* compiled from: ConnectableObservable */
public abstract class a<T> extends l<T> {
    private a<T> e() {
        return this instanceof h2 ? d.a.d0.a.p(new g2(((h2) this).c())) : this;
    }

    public abstract void d(f<? super b> fVar);

    public l<T> f() {
        return d.a.d0.a.n(new o2(e()));
    }
}
