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
    final long f14171c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f14172d;

    /* renamed from: e  reason: collision with root package name */
    final t f14173e;

    /* compiled from: ObservableThrottleFirstTimed */
    static final class a<T> extends AtomicReference<b> implements s<T>, b, Runnable {
        private static final long serialVersionUID = 786994795061867455L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14174b;

        /* renamed from: c  reason: collision with root package name */
        final long f14175c;

        /* renamed from: d  reason: collision with root package name */
        final TimeUnit f14176d;

        /* renamed from: e  reason: collision with root package name */
        final t.c f14177e;

        /* renamed from: f  reason: collision with root package name */
        b f14178f;
        volatile boolean g;
        boolean h;

        a(s<? super T> sVar, long j, TimeUnit timeUnit, t.c cVar) {
            this.f14174b = sVar;
            this.f14175c = j;
            this.f14176d = timeUnit;
            this.f14177e = cVar;
        }

        public void dispose() {
            this.f14178f.dispose();
            this.f14177e.dispose();
        }

        public void onComplete() {
            if (!this.h) {
                this.h = true;
                this.f14174b.onComplete();
                this.f14177e.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.h) {
                d.a.d0.a.s(th);
                return;
            }
            this.h = true;
            this.f14174b.onError(th);
            this.f14177e.dispose();
        }

        public void onNext(T t) {
            if (!this.g && !this.h) {
                this.g = true;
                this.f14174b.onNext(t);
                b bVar = (b) get();
                if (bVar != null) {
                    bVar.dispose();
                }
                c.h(this, this.f14177e.c(this, this.f14175c, this.f14176d));
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f14178f, bVar)) {
                this.f14178f = bVar;
                this.f14174b.onSubscribe(this);
            }
        }

        public void run() {
            this.g = false;
        }
    }

    public v3(q<T> qVar, long j, TimeUnit timeUnit, t tVar) {
        super(qVar);
        this.f14171c = j;
        this.f14172d = timeUnit;
        this.f14173e = tVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(new e(sVar), this.f14171c, this.f14172d, this.f14173e.a()));
    }
}
