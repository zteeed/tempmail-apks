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
    final t f13340b;

    /* renamed from: c  reason: collision with root package name */
    final long f13341c;

    /* renamed from: d  reason: collision with root package name */
    final long f13342d;

    /* renamed from: e  reason: collision with root package name */
    final TimeUnit f13343e;

    /* compiled from: ObservableInterval */
    static final class a extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = 346773832286157679L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super Long> f13344b;

        /* renamed from: c  reason: collision with root package name */
        long f13345c;

        a(s<? super Long> sVar) {
            this.f13344b = sVar;
        }

        public void a(b bVar) {
            c.n(this, bVar);
        }

        public void dispose() {
            c.f(this);
        }

        public void run() {
            if (get() != c.DISPOSED) {
                s<? super Long> sVar = this.f13344b;
                long j = this.f13345c;
                this.f13345c = 1 + j;
                sVar.onNext(Long.valueOf(j));
            }
        }
    }

    public o1(long j, long j2, TimeUnit timeUnit, t tVar) {
        this.f13341c = j;
        this.f13342d = j2;
        this.f13343e = timeUnit;
        this.f13340b = tVar;
    }

    public void subscribeActual(s<? super Long> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        t tVar = this.f13340b;
        if (tVar instanceof n) {
            t.c a2 = tVar.a();
            aVar.a(a2);
            a2.d(aVar, this.f13341c, this.f13342d, this.f13343e);
            return;
        }
        aVar.a(tVar.e(aVar, this.f13341c, this.f13342d, this.f13343e));
    }
}
