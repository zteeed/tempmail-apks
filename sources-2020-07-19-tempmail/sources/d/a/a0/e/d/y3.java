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
    final q<U> f13712c;

    /* renamed from: d  reason: collision with root package name */
    final n<? super T, ? extends q<V>> f13713d;

    /* renamed from: e  reason: collision with root package name */
    final q<? extends T> f13714e;

    /* compiled from: ObservableTimeout */
    static final class a extends AtomicReference<d.a.y.b> implements s<Object>, d.a.y.b {
        private static final long serialVersionUID = 8708641127342403073L;

        /* renamed from: b  reason: collision with root package name */
        final d f13715b;

        /* renamed from: c  reason: collision with root package name */
        final long f13716c;

        a(long j, d dVar) {
            this.f13716c = j;
            this.f13715b = dVar;
        }

        public void dispose() {
            d.a.a0.a.c.f(this);
        }

        public void onComplete() {
            Object obj = get();
            d.a.a0.a.c cVar = d.a.a0.a.c.DISPOSED;
            if (obj != cVar) {
                lazySet(cVar);
                this.f13715b.a(this.f13716c);
            }
        }

        public void onError(Throwable th) {
            Object obj = get();
            d.a.a0.a.c cVar = d.a.a0.a.c.DISPOSED;
            if (obj != cVar) {
                lazySet(cVar);
                this.f13715b.b(this.f13716c, th);
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(Object obj) {
            d.a.y.b bVar = (d.a.y.b) get();
            if (bVar != d.a.a0.a.c.DISPOSED) {
                bVar.dispose();
                lazySet(d.a.a0.a.c.DISPOSED);
                this.f13715b.a(this.f13716c);
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
        final s<? super T> f13717b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends q<?>> f13718c;

        /* renamed from: d  reason: collision with root package name */
        final g f13719d = new g();

        /* renamed from: e  reason: collision with root package name */
        final AtomicLong f13720e;

        /* renamed from: f  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f13721f;
        q<? extends T> g;

        b(s<? super T> sVar, n<? super T, ? extends q<?>> nVar, q<? extends T> qVar) {
            this.f13717b = sVar;
            this.f13718c = nVar;
            this.g = qVar;
            this.f13720e = new AtomicLong();
            this.f13721f = new AtomicReference<>();
        }

        public void a(long j) {
            if (this.f13720e.compareAndSet(j, Long.MAX_VALUE)) {
                d.a.a0.a.c.f(this.f13721f);
                q<? extends T> qVar = this.g;
                this.g = null;
                qVar.subscribe(new z3.a(this.f13717b, this));
            }
        }

        public void b(long j, Throwable th) {
            if (this.f13720e.compareAndSet(j, Long.MAX_VALUE)) {
                d.a.a0.a.c.f(this);
                this.f13717b.onError(th);
                return;
            }
            d.a.d0.a.s(th);
        }

        /* access modifiers changed from: package-private */
        public void c(q<?> qVar) {
            if (qVar != null) {
                a aVar = new a(0, this);
                if (this.f13719d.b(aVar)) {
                    qVar.subscribe(aVar);
                }
            }
        }

        public void dispose() {
            d.a.a0.a.c.f(this.f13721f);
            d.a.a0.a.c.f(this);
            this.f13719d.dispose();
        }

        public void onComplete() {
            if (this.f13720e.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f13719d.dispose();
                this.f13717b.onComplete();
                this.f13719d.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f13720e.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f13719d.dispose();
                this.f13717b.onError(th);
                this.f13719d.dispose();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            long j = this.f13720e.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f13720e.compareAndSet(j, j2)) {
                    d.a.y.b bVar = (d.a.y.b) this.f13719d.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.f13717b.onNext(t);
                    try {
                        Object apply = this.f13718c.apply(t);
                        d.a.a0.b.b.e(apply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        q qVar = (q) apply;
                        a aVar = new a(j2, this);
                        if (this.f13719d.b(aVar)) {
                            qVar.subscribe(aVar);
                        }
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.b(th);
                        this.f13721f.get().dispose();
                        this.f13720e.getAndSet(Long.MAX_VALUE);
                        this.f13717b.onError(th);
                    }
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this.f13721f, bVar);
        }
    }

    /* compiled from: ObservableTimeout */
    static final class c<T> extends AtomicLong implements s<T>, d.a.y.b, d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13722b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends q<?>> f13723c;

        /* renamed from: d  reason: collision with root package name */
        final g f13724d = new g();

        /* renamed from: e  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f13725e = new AtomicReference<>();

        c(s<? super T> sVar, n<? super T, ? extends q<?>> nVar) {
            this.f13722b = sVar;
            this.f13723c = nVar;
        }

        public void a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                d.a.a0.a.c.f(this.f13725e);
                this.f13722b.onError(new TimeoutException());
            }
        }

        public void b(long j, Throwable th) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                d.a.a0.a.c.f(this.f13725e);
                this.f13722b.onError(th);
                return;
            }
            d.a.d0.a.s(th);
        }

        /* access modifiers changed from: package-private */
        public void c(q<?> qVar) {
            if (qVar != null) {
                a aVar = new a(0, this);
                if (this.f13724d.b(aVar)) {
                    qVar.subscribe(aVar);
                }
            }
        }

        public void dispose() {
            d.a.a0.a.c.f(this.f13725e);
            this.f13724d.dispose();
        }

        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f13724d.dispose();
                this.f13722b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f13724d.dispose();
                this.f13722b.onError(th);
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    d.a.y.b bVar = (d.a.y.b) this.f13724d.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.f13722b.onNext(t);
                    try {
                        Object apply = this.f13723c.apply(t);
                        d.a.a0.b.b.e(apply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        q qVar = (q) apply;
                        a aVar = new a(j2, this);
                        if (this.f13724d.b(aVar)) {
                            qVar.subscribe(aVar);
                        }
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.b(th);
                        this.f13725e.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.f13722b.onError(th);
                    }
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this.f13725e, bVar);
        }
    }

    /* compiled from: ObservableTimeout */
    interface d extends z3.d {
        void b(long j, Throwable th);
    }

    public y3(l<T> lVar, q<U> qVar, n<? super T, ? extends q<V>> nVar, q<? extends T> qVar2) {
        super(lVar);
        this.f13712c = qVar;
        this.f13713d = nVar;
        this.f13714e = qVar2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        if (this.f13714e == null) {
            c cVar = new c(sVar, this.f13713d);
            sVar.onSubscribe(cVar);
            cVar.c(this.f13712c);
            this.f12780b.subscribe(cVar);
            return;
        }
        b bVar = new b(sVar, this.f13713d, this.f13714e);
        sVar.onSubscribe(bVar);
        bVar.c(this.f13712c);
        this.f12780b.subscribe(bVar);
    }
}
