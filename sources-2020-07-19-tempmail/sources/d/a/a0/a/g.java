package d.a.a0.a;

import d.a.y.b;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequentialDisposable */
public final class g extends AtomicReference<b> implements b {
    private static final long serialVersionUID = -754898800686245608L;

    public g() {
    }

    public boolean a() {
        return c.g((b) get());
    }

    public boolean b(b bVar) {
        return c.h(this, bVar);
    }

    public boolean c(b bVar) {
        return c.m(this, bVar);
    }

    public void dispose() {
        c.f(this);
    }

    public g(b bVar) {
        lazySet(bVar);
    }
}
