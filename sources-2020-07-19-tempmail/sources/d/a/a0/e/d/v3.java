package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.c0.e;
import d.a.q;
import d.a.s;
import d.a.t;
import d.a.y.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableThrottleFirstTimed */
public final class v3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f13613c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f13614d;

    /* renamed from: e  reason: collision with root package name */
    final t f13615e;

    /* compiled from: ObservableThrottleFirstTimed */
    static final class a<T> extends AtomicReference<b> implements s<T>, b, Runnable {
        private static final long serialVersionUID = 786994795061867455L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13616b;

        /* renamed from: c  reason: collision with root package name */
        final long f13617c;

        /* renamed from: d  reason: collision with root package name */
        final TimeUnit f13618d;

        /* renamed from: e  reason: collision with root package name */
        final t.c f13619e;

        /* renamed from: f  reason: collision with root package name */
        b f13620f;
        volatile boolean g;
        boolean h;

        a(s<? super T> sVar, long j, TimeUnit timeUnit, t.c cVar) {
            this.f13616b = sVar;
            this.f13617c = j;
            this.f13618d = timeUnit;
            this.f13619e = cVar;
        }

        public void dispose() {
            this.f13620f.dispose();
            this.f13619e.dispose();
        }

        public void onComplete() {
            if (!this.h) {
                this.h = true;
                this.f13616b.onComplete();
                this.f13619e.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.h) {
                d.a.d0.a.s(th);
                return;
            }
            this.h = true;
            this.f13616b.onError(th);
            this.f13619e.dispose();
        }

        public void onNext(T t) {
            if (!this.g && !this.h) {
                this.g = true;
                this.f13616b.onNext(t);
                b bVar = (b) get();
                if (bVar != null) {
                    bVar.dispose();
                }
                c.h(this, this.f13619e.c(this, this.f13617c, this.f13618d));
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13620f, bVar)) {
                this.f13620f = bVar;
                this.f13616b.onSubscribe(this);
            }
        }

        public void run() {
            this.g = false;
        }
    }

    public v3(q<T> qVar, long j, TimeUnit timeUnit, t tVar) {
        super(qVar);
        this.f13613c = j;
        this.f13614d = timeUnit;
        this.f13615e = tVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(new e(sVar), this.f13613c, this.f13614d, this.f13615e.a()));
    }
}
