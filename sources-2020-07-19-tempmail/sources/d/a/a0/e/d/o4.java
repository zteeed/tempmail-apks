package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.s;
import d.a.y.b;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObserverResourceWrapper */
public final class o4<T> extends AtomicReference<b> implements s<T>, b {
    private static final long serialVersionUID = -8612022020200669122L;

    /* renamed from: b  reason: collision with root package name */
    final s<? super T> f13365b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<b> f13366c = new AtomicReference<>();

    public o4(s<? super T> sVar) {
        this.f13365b = sVar;
    }

    public void a(b bVar) {
        c.m(this, bVar);
    }

    public void dispose() {
        c.f(this.f13366c);
        c.f(this);
    }

    public void onComplete() {
        dispose();
        this.f13365b.onComplete();
    }

    public void onError(Throwable th) {
        dispose();
        this.f13365b.onError(th);
    }

    public void onNext(T t) {
        this.f13365b.onNext(t);
    }

    public void onSubscribe(b bVar) {
        if (c.n(this.f13366c, bVar)) {
            this.f13365b.onSubscribe(this);
        }
    }
}
