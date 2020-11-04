package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.g.n;
import d.a.l;
import d.a.s;
import d.a.t;
import d.a.y.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableIntervalRange */
public final class p1 extends l<Long> {

    /* renamed from: b  reason: collision with root package name */
    final t f13941b;

    /* renamed from: c  reason: collision with root package name */
    final long f13942c;

    /* renamed from: d  reason: collision with root package name */
    final long f13943d;

    /* renamed from: e  reason: collision with root package name */
    final long f13944e;

    /* renamed from: f  reason: collision with root package name */
    final long f13945f;
    final TimeUnit g;

    /* compiled from: ObservableIntervalRange */
    static final class a extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super Long> f13946b;

        /* renamed from: c  reason: collision with root package name */
        final long f13947c;

        /* renamed from: d  reason: collision with root package name */
        long f13948d;

        a(s<? super Long> sVar, long j, long j2) {
            this.f13946b = sVar;
            this.f13948d = j;
            this.f13947c = j2;
        }

        public boolean a() {
            return get() == c.DISPOSED;
        }

        public void b(b bVar) {
            c.n(this, bVar);
        }

        public void dispose() {
            c.f(this);
        }

        public void run() {
            if (!a()) {
                long j = this.f13948d;
                this.f13946b.onNext(Long.valueOf(j));
                if (j == this.f13947c) {
                    c.f(this);
                    this.f13946b.onComplete();
                    return;
                }
                this.f13948d = j + 1;
            }
        }
    }

    public p1(long j, long j2, long j3, long j4, TimeUnit timeUnit, t tVar) {
        this.f13944e = j3;
        this.f13945f = j4;
        this.g = timeUnit;
        this.f13941b = tVar;
        this.f13942c = j;
        this.f13943d = j2;
    }

    public void subscribeActual(s<? super Long> sVar) {
        a aVar = new a(sVar, this.f13942c, this.f13943d);
        sVar.onSubscribe(aVar);
        t tVar = this.f13941b;
        if (tVar instanceof n) {
            t.c a2 = tVar.a();
            aVar.b(a2);
            a2.d(aVar, this.f13944e, this.f13945f, this.g);
            return;
        }
        aVar.b(tVar.e(aVar, this.f13944e, this.f13945f, this.g));
    }
}
