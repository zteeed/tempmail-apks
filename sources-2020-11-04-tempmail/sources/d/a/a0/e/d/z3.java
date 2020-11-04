package d.a.a0.e.d;

import d.a.a0.a.g;
import d.a.a0.j.j;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableTimeoutTimed */
public final class z3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f14308c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f14309d;

    /* renamed from: e  reason: collision with root package name */
    final t f14310e;

    /* renamed from: f  reason: collision with root package name */
    final q<? extends T> f14311f;

    /* compiled from: ObservableTimeoutTimed */
    static final class a<T> implements s<T> {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14312b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f14313c;

        a(s<? super T> sVar, AtomicReference<d.a.y.b> atomicReference) {
            this.f14312b = sVar;
            this.f14313c = atomicReference;
        }

        public void onComplete() {
            this.f14312b.onComplete();
        }

        public void onError(Throwable th) {
            this.f14312b.onError(th);
        }

        public void onNext(T t) {
            this.f14312b.onNext(t);
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.h(this.f14313c, bVar);
        }
    }

    /* compiled from: ObservableTimeoutTimed */
    static final class b<T> extends AtomicReference<d.a.y.b> implements s<T>, d.a.y.b, d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14314b;

        /* renamed from: c  reason: collision with root package name */
        final long f14315c;

        /* renamed from: d  reason: collision with root package name */
        final TimeUnit f14316d;

        /* renamed from: e  reason: collision with root package name */
        final t.c f14317e;

        /* renamed from: f  reason: collision with root package name */
        final g f14318f = new g();
        final AtomicLong g = new AtomicLong();
        final AtomicReference<d.a.y.b> h = new AtomicReference<>();
        q<? extends T> i;

        b(s<? super T> sVar, long j, TimeUnit timeUnit, t.c cVar, q<? extends T> qVar) {
            this.f14314b = sVar;
            this.f14315c = j;
            this.f14316d = timeUnit;
            this.f14317e = cVar;
            this.i = qVar;
        }

        public void a(long j) {
            if (this.g.compareAndSet(j, Long.MAX_VALUE)) {
                d.a.a0.a.c.f(this.h);
                q<? extends T> qVar = this.i;
                this.i = null;
                qVar.subscribe(new a(this.f14314b, this));
                this.f14317e.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(long j) {
            this.f14318f.b(this.f14317e.c(new e(j, this), this.f14315c, this.f14316d));
        }

        public void dispose() {
            d.a.a0.a.c.f(this.h);
            d.a.a0.a.c.f(this);
            this.f14317e.dispose();
        }

        public void onComplete() {
            if (this.g.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f14318f.dispose();
                this.f14314b.onComplete();
                this.f14317e.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.g.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f14318f.dispose();
                this.f14314b.onError(th);
                this.f14317e.dispose();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            long j = this.g.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.g.compareAndSet(j, j2)) {
                    ((d.a.y.b) this.f14318f.get()).dispose();
                    this.f14314b.onNext(t);
                    c(j2);
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this.h, bVar);
        }
    }

    /* compiled from: ObservableTimeoutTimed */
    static final class c<T> extends AtomicLong implements s<T>, d.a.y.b, d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14319b;

        /* renamed from: c  reason: collision with root package name */
        final long f14320c;

        /* renamed from: d  reason: collision with root package name */
        final TimeUnit f14321d;

        /* renamed from: e  reason: collision with root package name */
        final t.c f14322e;

        /* renamed from: f  reason: collision with root package name */
        final g f14323f = new g();
        final AtomicReference<d.a.y.b> g = new AtomicReference<>();

        c(s<? super T> sVar, long j, TimeUnit timeUnit, t.c cVar) {
            this.f14319b = sVar;
            this.f14320c = j;
            this.f14321d = timeUnit;
            this.f14322e = cVar;
        }

        public void a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                d.a.a0.a.c.f(this.g);
                this.f14319b.onError(new TimeoutException(j.c(this.f14320c, this.f14321d)));
                this.f14322e.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(long j) {
            this.f14323f.b(this.f14322e.c(new e(j, this), this.f14320c, this.f14321d));
        }

        public void dispose() {
            d.a.a0.a.c.f(this.g);
            this.f14322e.dispose();
        }

        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f14323f.dispose();
                this.f14319b.onComplete();
                this.f14322e.dispose();
            }
        }

        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f14323f.dispose();
                this.f14319b.onError(th);
                this.f14322e.dispose();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((d.a.y.b) this.f14323f.get()).dispose();
                    this.f14319b.onNext(t);
                    c(j2);
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this.g, bVar);
        }
    }

    /* compiled from: ObservableTimeoutTimed */
    interface d {
        void a(long j);
    }

    /* compiled from: ObservableTimeoutTimed */
    static final class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final d f14324b;

        /* renamed from: c  reason: collision with root package name */
        final long f14325c;

        e(long j, d dVar) {
            this.f14325c = j;
            this.f14324b = dVar;
        }

        public void run() {
            this.f14324b.a(this.f14325c);
        }
    }

    public z3(l<T> lVar, long j, TimeUnit timeUnit, t tVar, q<? extends T> qVar) {
        super(lVar);
        this.f14308c = j;
        this.f14309d = timeUnit;
        this.f14310e = tVar;
        this.f14311f = qVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        if (this.f14311f == null) {
            c cVar = new c(sVar, this.f14308c, this.f14309d, this.f14310e.a());
            sVar.onSubscribe(cVar);
            cVar.c(0);
            this.f13338b.subscribe(cVar);
            return;
        }
        b bVar = new b(sVar, this.f14308c, this.f14309d, this.f14310e.a(), this.f14311f);
        sVar.onSubscribe(bVar);
        bVar.c(0);
        this.f13338b.subscribe(bVar);
    }
}
