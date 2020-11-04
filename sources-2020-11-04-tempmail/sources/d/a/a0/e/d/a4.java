package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.a.d;
import d.a.l;
import d.a.s;
import d.a.t;
import d.a.y.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableTimer */
public final class a4 extends l<Long> {

    /* renamed from: b  reason: collision with root package name */
    final t f13361b;

    /* renamed from: c  reason: collision with root package name */
    final long f13362c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f13363d;

    /* compiled from: ObservableTimer */
    static final class a extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super Long> f13364b;

        a(s<? super Long> sVar) {
            this.f13364b = sVar;
        }

        public boolean a() {
            return get() == c.DISPOSED;
        }

        public void b(b bVar) {
            c.o(this, bVar);
        }

        public void dispose() {
            c.f(this);
        }

        public void run() {
            if (!a()) {
                this.f13364b.onNext(0L);
                lazySet(d.INSTANCE);
                this.f13364b.onComplete();
            }
        }
    }

    public a4(long j, TimeUnit timeUnit, t tVar) {
        this.f13362c = j;
        this.f13363d = timeUnit;
        this.f13361b = tVar;
    }

    public void subscribeActual(s<? super Long> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        aVar.b(this.f13361b.d(aVar, this.f13362c, this.f13363d));
    }
}
