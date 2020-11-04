package d.a.y;

import d.a.a0.b.b;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ReferenceDisposable */
abstract class d<T> extends AtomicReference<T> implements b {
    private static final long serialVersionUID = 6537757548749041217L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    d(T t) {
        super(t);
        b.e(t, "value is null");
    }

    public final boolean a() {
        return get() == null;
    }

    /* access modifiers changed from: protected */
    public abstract void b(T t);

    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            b(andSet);
        }
    }
}
