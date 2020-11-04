package d.a.c0;

import d.a.a0.j.h;
import d.a.s;
import d.a.y.b;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DisposableObserver */
public abstract class c<T> implements s<T>, b {

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<b> f13900b = new AtomicReference<>();

    /* access modifiers changed from: protected */
    public void b() {
    }

    public final void dispose() {
        d.a.a0.a.c.f(this.f13900b);
    }

    public final void onSubscribe(b bVar) {
        if (h.c(this.f13900b, bVar, getClass())) {
            b();
        }
    }
}
