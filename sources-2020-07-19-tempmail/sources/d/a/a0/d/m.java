package d.a.a0.d;

import d.a.a0.a.c;
import d.a.a0.c.f;
import d.a.a0.j.q;
import d.a.s;
import d.a.y.b;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: InnerQueuedObserver */
public final class m<T> extends AtomicReference<b> implements s<T>, b {
    private static final long serialVersionUID = -5417183359794346637L;

    /* renamed from: b  reason: collision with root package name */
    final n<T> f12681b;

    /* renamed from: c  reason: collision with root package name */
    final int f12682c;

    /* renamed from: d  reason: collision with root package name */
    f<T> f12683d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f12684e;

    /* renamed from: f  reason: collision with root package name */
    int f12685f;

    public m(n<T> nVar, int i) {
        this.f12681b = nVar;
        this.f12682c = i;
    }

    public boolean a() {
        return this.f12684e;
    }

    public f<T> b() {
        return this.f12683d;
    }

    public void c() {
        this.f12684e = true;
    }

    public void dispose() {
        c.f(this);
    }

    public void onComplete() {
        this.f12681b.b(this);
    }

    public void onError(Throwable th) {
        this.f12681b.a(this, th);
    }

    public void onNext(T t) {
        if (this.f12685f == 0) {
            this.f12681b.d(this, t);
        } else {
            this.f12681b.c();
        }
    }

    public void onSubscribe(b bVar) {
        if (c.n(this, bVar)) {
            if (bVar instanceof d.a.a0.c.b) {
                d.a.a0.c.b bVar2 = (d.a.a0.c.b) bVar;
                int g = bVar2.g(3);
                if (g == 1) {
                    this.f12685f = g;
                    this.f12683d = bVar2;
                    this.f12684e = true;
                    this.f12681b.b(this);
                    return;
                } else if (g == 2) {
                    this.f12685f = g;
                    this.f12683d = bVar2;
                    return;
                }
            }
            this.f12683d = q.b(-this.f12682c);
        }
    }
}
