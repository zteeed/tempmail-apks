package d.a.a0.e.d;

import d.a.a0.a.g;
import d.a.a0.e.d.z3;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableTimeout */
public final class y3<T, U, V> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final q<U> f14270c;

    /* renamed from: d  reason: collision with root package name */
    final n<? super T, ? extends q<V>> f14271d;

    /* renamed from: e  reason: collision with root package name */
    final q<? extends T> f14272e;

    /* compiled from: ObservableTimeout */
    static final class a extends AtomicReference<d.a.y.b> implements s<Object>, d.a.y.b {
        private static final long serialVersionUID = 8708641127342403073L;

        /* renamed from: b  reason: collision with root package name */
        final d f14273b;

        /* renamed from: c  reason: collision with root package name */
        final long f14274c;

        a(long j, d dVar) {
            this.f14274c = j;
            this.f14273b = dVar;
        }

        public void dispose() {
            d.a.a0.a.c.f(this);
        }

        public void onComplete() {
            Object obj = get();
            d.a.a0.a.c cVar = d.a.a0.a.c.DISPOSED;
            if (obj != cVar) {
                lazySet(cVar);
                this.f14273b.a(this.f14274c);
            }
        }

        public void onError(Throwable th) {
            Object obj = get();
            d.a.a0.a.c cVar = d.a.a0.a.c.DISPOSED;
            if (obj != cVar) {
                lazySet(cVar);
                this.f14273b.b(this.f14274c, th);
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(Object obj) {
            d.a.y.b bVar = (d.a.y.b) get();
            if (bVar != d.a.a0.a.c.DISPOSED) {
                bVar.dispose();
                lazySet(d.a.a0.a.c.DISPOSED);
                this.f14273b.a(this.f14274c);
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this, bVar);
        }
    }

    /* compiled from: ObservableTimeout */
    static final class b<T> extends AtomicReference<d.a.y.b> implements s<T>, d.a.y.b, d {
        private static final long serialVersionUID = -7508389464265974549L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14275b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends q<?>> f14276c;

        /* renamed from: d  reason: collision with root package name */
        final g f14277d = new g();

        /* renamed from: e  reason: collision with root package name */
        final AtomicLong f14278e;

        /* renamed from: f  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f14279f;
        q<? extends T> g;

        b(s<? super T> sVar, n<? super T, ? extends q<?>> nVar, q<? extends T> qVar) {
            this.f14275b = sVar;
            this.f14276c = nVar;
            this.g = qVar;
            this.f14278e = new AtomicLong();
            this.f14279f = new AtomicReference<>();
        }

        public void a(long j) {
            if (this.f14278e.compareAndSet(j, Long.MAX_VALUE)) {
                d.a.a0.a.c.f(this.f14279f);
                q<? extends T> qVar = this.g;
                this.g = null;
                qVar.subscribe(new z3.a(this.f14275b, this));
            }
        }

        public void b(long j, Throwable th) {
            if (this.f14278e.compareAndSet(j, Long.MAX_VALUE)) {
                d.a.a0.a.c.f(this);
                this.f14275b.onError(th);
                return;
            }
            d.a.d0.a.s(th);
        }

        /* access modifiers changed from: package-private */
        public void c(q<?> qVar) {
            if (qVar != null) {
                a aVar = new a(0, this);
                if (this.f14277d.b(aVar)) {
                    qVar.subscribe(aVar);
                }
            }
        }

        public void dispose() {
            d.a.a0.a.c.f(this.f14279f);
            d.a.a0.a.c.f(this);
            this.f14277d.dispose();
        }

        public void onComplete() {
            if (this.f14278e.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f14277d.dispose();
                this.f14275b.onComplete();
                this.f14277d.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f14278e.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f14277d.dispose();
                this.f14275b.onError(th);
                this.f14277d.dispose();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            long j = this.f14278e.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f14278e.compareAndSet(j, j2)) {
                    d.a.y.b bVar = (d.a.y.b) this.f14277d.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.f14275b.onNext(t);
                    try {
                        Object apply = this.f14276c.apply(t);
                        d.a.a0.b.b.e(apply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        q qVar = (q) apply;
                        a aVar = new a(j2, this);
                        if (this.f14277d.b(aVar)) {
                            qVar.subscribe(aVar);
                        }
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.b(th);
                        this.f14279f.get().dispose();
                        this.f14278e.getAndSet(Long.MAX_VALUE);
                        this.f14275b.onError(th);
                    }
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this.f14279f, bVar);
        }
    }

    /* compiled from: ObservableTimeout */
    static final class c<T> extends AtomicLong implements s<T>, d.a.y.b, d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14280b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends q<?>> f14281c;

        /* renamed from: d  reason: collision with root package name */
        final g f14282d = new g();

        /* renamed from: e  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f14283e = new AtomicReference<>();

        c(s<? super T> sVar, n<? super T, ? extends q<?>> nVar) {
            this.f14280b = sVar;
            this.f14281c = nVar;
        }

        public void a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                d.a.a0.a.c.f(this.f14283e);
                this.f14280b.onError(new TimeoutException());
            }
        }

        public void b(long j, Throwable th) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                d.a.a0.a.c.f(this.f14283e);
                this.f14280b.onError(th);
                return;
            }
            d.a.d0.a.s(th);
        }

        /* access modifiers changed from: package-private */
        public void c(q<?> qVar) {
            if (qVar != null) {
                a aVar = new a(0, this);
                if (this.f14282d.b(aVar)) {
                    qVar.subscribe(aVar);
                }
            }
        }

        public void dispose() {
            d.a.a0.a.c.f(this.f14283e);
            this.f14282d.dispose();
        }

        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f14282d.dispose();
                this.f14280b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f14282d.dispose();
                this.f14280b.onError(th);
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    d.a.y.b bVar = (d.a.y.b) this.f14282d.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.f14280b.onNext(t);
                    try {
                        Object apply = this.f14281c.apply(t);
                        d.a.a0.b.b.e(apply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        q qVar = (q) apply;
                        a aVar = new a(j2, this);
                        if (this.f14282d.b(aVar)) {
                            qVar.subscribe(aVar);
                        }
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.b(th);
                        this.f14283e.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.f14280b.onError(th);
                    }
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this.f14283e, bVar);
        }
    }

    /* compiled from: ObservableTimeout */
    interface d extends z3.d {
        void b(long j, Throwable th);
    }

    public y3(l<T> lVar, q<U> qVar, n<? super T, ? extends q<V>> nVar, q<? extends T> qVar2) {
        super(lVar);
        this.f14270c = qVar;
        this.f14271d = nVar;
        this.f14272e = qVar2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        if (this.f14272e == null) {
            c cVar = new c(sVar, this.f14271d);
            sVar.onSubscribe(cVar);
            cVar.c(this.f14270c);
            this.f13338b.subscribe(cVar);
            return;
        }
        b bVar = new b(sVar, this.f14271d, this.f14272e);
        sVar.onSubscribe(bVar);
        bVar.c(this.f14270c);
        this.f13338b.subscribe(bVar);
    }
}
