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
    final n<T> f13239b;

    /* renamed from: c  reason: collision with root package name */
    final int f13240c;

    /* renamed from: d  reason: collision with root package name */
    f<T> f13241d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f13242e;

    /* renamed from: f  reason: collision with root package name */
    int f13243f;

    public m(n<T> nVar, int i) {
        this.f13239b = nVar;
        this.f13240c = i;
    }

    public boolean a() {
        return this.f13242e;
    }

    public f<T> b() {
        return this.f13241d;
    }

    public void c() {
        this.f13242e = true;
    }

    public void dispose() {
        c.f(this);
    }

    public void onComplete() {
        this.f13239b.b(this);
    }

    public void onError(Throwable th) {
        this.f13239b.a(this, th);
    }

    public void onNext(T t) {
        if (this.f13243f == 0) {
            this.f13239b.d(this, t);
        } else {
            this.f13239b.c();
        }
    }

    public void onSubscribe(b bVar) {
        if (c.n(this, bVar)) {
            if (bVar instanceof d.a.a0.c.b) {
                d.a.a0.c.b bVar2 = (d.a.a0.c.b) bVar;
                int g = bVar2.g(3);
                if (g == 1) {
                    this.f13243f = g;
                    this.f13241d = bVar2;
                    this.f13242e = true;
                    this.f13239b.b(this);
                    return;
                } else if (g == 2) {
                    this.f13243f = g;
                    this.f13241d = bVar2;
                    return;
                }
            }
            this.f13241d = q.b(-this.f13240c);
        }
    }
}
