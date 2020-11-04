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
    final long f13750c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f13751d;

    /* renamed from: e  reason: collision with root package name */
    final t f13752e;

    /* renamed from: f  reason: collision with root package name */
    final q<? extends T> f13753f;

    /* compiled from: ObservableTimeoutTimed */
    static final class a<T> implements s<T> {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13754b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f13755c;

        a(s<? super T> sVar, AtomicReference<d.a.y.b> atomicReference) {
            this.f13754b = sVar;
            this.f13755c = atomicReference;
        }

        public void onComplete() {
            this.f13754b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13754b.onError(th);
        }

        public void onNext(T t) {
            this.f13754b.onNext(t);
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.h(this.f13755c, bVar);
        }
    }

    /* compiled from: ObservableTimeoutTimed */
    static final class b<T> extends AtomicReference<d.a.y.b> implements s<T>, d.a.y.b, d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13756b;

        /* renamed from: c  reason: collision with root package name */
        final long f13757c;

        /* renamed from: d  reason: collision with root package name */
        final TimeUnit f13758d;

        /* renamed from: e  reason: collision with root package name */
        final t.c f13759e;

        /* renamed from: f  reason: collision with root package name */
        final g f13760f = new g();
        final AtomicLong g = new AtomicLong();
        final AtomicReference<d.a.y.b> h = new AtomicReference<>();
        q<? extends T> i;

        b(s<? super T> sVar, long j, TimeUnit timeUnit, t.c cVar, q<? extends T> qVar) {
            this.f13756b = sVar;
            this.f13757c = j;
            this.f13758d = timeUnit;
            this.f13759e = cVar;
            this.i = qVar;
        }

        public void a(long j) {
            if (this.g.compareAndSet(j, Long.MAX_VALUE)) {
                d.a.a0.a.c.f(this.h);
                q<? extends T> qVar = this.i;
                this.i = null;
                qVar.subscribe(new a(this.f13756b, this));
                this.f13759e.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(long j) {
            this.f13760f.b(this.f13759e.c(new e(j, this), this.f13757c, this.f13758d));
        }

        public void dispose() {
            d.a.a0.a.c.f(this.h);
            d.a.a0.a.c.f(this);
            this.f13759e.dispose();
        }

        public void onComplete() {
            if (this.g.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f13760f.dispose();
                this.f13756b.onComplete();
                this.f13759e.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.g.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f13760f.dispose();
                this.f13756b.onError(th);
                this.f13759e.dispose();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            long j = this.g.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.g.compareAndSet(j, j2)) {
                    ((d.a.y.b) this.f13760f.get()).dispose();
                    this.f13756b.onNext(t);
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
        final s<? super T> f13761b;

        /* renamed from: c  reason: collision with root package name */
        final long f13762c;

        /* renamed from: d  reason: collision with root package name */
        final TimeUnit f13763d;

        /* renamed from: e  reason: collision with root package name */
        final t.c f13764e;

        /* renamed from: f  reason: collision with root package name */
        final g f13765f = new g();
        final AtomicReference<d.a.y.b> g = new AtomicReference<>();

        c(s<? super T> sVar, long j, TimeUnit timeUnit, t.c cVar) {
            this.f13761b = sVar;
            this.f13762c = j;
            this.f13763d = timeUnit;
            this.f13764e = cVar;
        }

        public void a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                d.a.a0.a.c.f(this.g);
                this.f13761b.onError(new TimeoutException(j.c(this.f13762c, this.f13763d)));
                this.f13764e.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(long j) {
            this.f13765f.b(this.f13764e.c(new e(j, this), this.f13762c, this.f13763d));
        }

        public void dispose() {
            d.a.a0.a.c.f(this.g);
            this.f13764e.dispose();
        }

        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f13765f.dispose();
                this.f13761b.onComplete();
                this.f13764e.dispose();
            }
        }

        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f13765f.dispose();
                this.f13761b.onError(th);
                this.f13764e.dispose();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((d.a.y.b) this.f13765f.get()).dispose();
                    this.f13761b.onNext(t);
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
        final d f13766b;

        /* renamed from: c  reason: collision with root package name */
        final long f13767c;

        e(long j, d dVar) {
            this.f13767c = j;
            this.f13766b = dVar;
        }

        public void run() {
            this.f13766b.a(this.f13767c);
        }
    }

    public z3(l<T> lVar, long j, TimeUnit timeUnit, t tVar, q<? extends T> qVar) {
        super(lVar);
        this.f13750c = j;
        this.f13751d = timeUnit;
        this.f13752e = tVar;
        this.f13753f = qVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        if (this.f13753f == null) {
            c cVar = new c(sVar, this.f13750c, this.f13751d, this.f13752e.a());
            sVar.onSubscribe(cVar);
            cVar.c(0);
            this.f12780b.subscribe(cVar);
            return;
        }
        b bVar = new b(sVar, this.f13750c, this.f13751d, this.f13752e.a(), this.f13753f);
        sVar.onSubscribe(bVar);
        bVar.c(0);
        this.f12780b.subscribe(bVar);
    }
}
