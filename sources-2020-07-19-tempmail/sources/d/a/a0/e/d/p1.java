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
    final t f13383b;

    /* renamed from: c  reason: collision with root package name */
    final long f13384c;

    /* renamed from: d  reason: collision with root package name */
    final long f13385d;

    /* renamed from: e  reason: collision with root package name */
    final long f13386e;

    /* renamed from: f  reason: collision with root package name */
    final long f13387f;
    final TimeUnit g;

    /* compiled from: ObservableIntervalRange */
    static final class a extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super Long> f13388b;

        /* renamed from: c  reason: collision with root package name */
        final long f13389c;

        /* renamed from: d  reason: collision with root package name */
        long f13390d;

        a(s<? super Long> sVar, long j, long j2) {
            this.f13388b = sVar;
            this.f13390d = j;
            this.f13389c = j2;
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
                long j = this.f13390d;
                this.f13388b.onNext(Long.valueOf(j));
                if (j == this.f13389c) {
                    c.f(this);
                    this.f13388b.onComplete();
                    return;
                }
                this.f13390d = j + 1;
            }
        }
    }

    public p1(long j, long j2, long j3, long j4, TimeUnit timeUnit, t tVar) {
        this.f13386e = j3;
        this.f13387f = j4;
        this.g = timeUnit;
        this.f13383b = tVar;
        this.f13384c = j;
        this.f13385d = j2;
    }

    public void subscribeActual(s<? super Long> sVar) {
        a aVar = new a(sVar, this.f13384c, this.f13385d);
        sVar.onSubscribe(aVar);
        t tVar = this.f13383b;
        if (tVar instanceof n) {
            t.c a2 = tVar.a();
            aVar.b(a2);
            a2.d(aVar, this.f13386e, this.f13387f, this.g);
            return;
        }
        aVar.b(tVar.e(aVar, this.f13386e, this.f13387f, this.g));
    }
}
