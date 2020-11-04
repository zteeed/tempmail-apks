package d.a.a0.d;

import d.a.a0.a.c;
import d.a.a0.j.m;
import d.a.s;
import d.a.y.b;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: BlockingObserver */
public final class h<T> extends AtomicReference<b> implements s<T>, b {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f12666c = new Object();
    private static final long serialVersionUID = -4875965440900746268L;

    /* renamed from: b  reason: collision with root package name */
    final Queue<Object> f12667b;

    public h(Queue<Object> queue) {
        this.f12667b = queue;
    }

    public boolean a() {
        return get() == c.DISPOSED;
    }

    public void dispose() {
        if (c.f(this)) {
            this.f12667b.offer(f12666c);
        }
    }

    public void onComplete() {
        this.f12667b.offer(m.h());
    }

    public void onError(Throwable th) {
        this.f12667b.offer(m.m(th));
    }

    public void onNext(T t) {
        Queue<Object> queue = this.f12667b;
        m.r(t);
        queue.offer(t);
    }

    public void onSubscribe(b bVar) {
        c.n(this, bVar);
    }
}
