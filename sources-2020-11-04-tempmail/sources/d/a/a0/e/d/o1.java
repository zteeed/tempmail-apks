package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.g.n;
import d.a.l;
import d.a.s;
import d.a.t;
import d.a.y.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableInterval */
public final class o1 extends l<Long> {

    /* renamed from: b  reason: collision with root package name */
    final t f13898b;

    /* renamed from: c  reason: collision with root package name */
    final long f13899c;

    /* renamed from: d  reason: collision with root package name */
    final long f13900d;

    /* renamed from: e  reason: collision with root package name */
    final TimeUnit f13901e;

    /* compiled from: ObservableInterval */
    static final class a extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = 346773832286157679L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super Long> f13902b;

        /* renamed from: c  reason: collision with root package name */
        long f13903c;

        a(s<? super Long> sVar) {
            this.f13902b = sVar;
        }

        public void a(b bVar) {
            c.n(this, bVar);
        }

        public void dispose() {
            c.f(this);
        }

        public void run() {
            if (get() != c.DISPOSED) {
                s<? super Long> sVar = this.f13902b;
                long j = this.f13903c;
                this.f13903c = 1 + j;
                sVar.onNext(Long.valueOf(j));
            }
        }
    }

    public o1(long j, long j2, TimeUnit timeUnit, t tVar) {
        this.f13899c = j;
        this.f13900d = j2;
        this.f13901e = timeUnit;
        this.f13898b = tVar;
    }

    public void subscribeActual(s<? super Long> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        t tVar = this.f13898b;
        if (tVar instanceof n) {
            t.c a2 = tVar.a();
            aVar.a(a2);
            a2.d(aVar, this.f13899c, this.f13900d, this.f13901e);
            return;
        }
        aVar.a(tVar.e(aVar, this.f13899c, this.f13900d, this.f13901e));
    }
}
