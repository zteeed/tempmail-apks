package d.a.a0.e.d;

import d.a.c0.c;
import d.a.f0.d;
import d.a.l;
import d.a.q;
import d.a.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableWindowBoundary */
public final class g4<T, B> extends a<T, l<T>> {

    /* renamed from: c  reason: collision with root package name */
    final q<B> f13584c;

    /* renamed from: d  reason: collision with root package name */
    final int f13585d;

    /* compiled from: ObservableWindowBoundary */
    static final class a<T, B> extends c<B> {

        /* renamed from: c  reason: collision with root package name */
        final b<T, B> f13586c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13587d;

        a(b<T, B> bVar) {
            this.f13586c = bVar;
        }

        public void onComplete() {
            if (!this.f13587d) {
                this.f13587d = true;
                this.f13586c.b();
            }
        }

        public void onError(Throwable th) {
            if (this.f13587d) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13587d = true;
            this.f13586c.c(th);
        }

        public void onNext(B b2) {
            if (!this.f13587d) {
                this.f13586c.d();
            }
        }
    }

    /* compiled from: ObservableWindowBoundary */
    static final class b<T, B> extends AtomicInteger implements s<T>, d.a.y.b, Runnable {
        static final Object l = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super l<T>> f13588b;

        /* renamed from: c  reason: collision with root package name */
        final int f13589c;

        /* renamed from: d  reason: collision with root package name */
        final a<T, B> f13590d = new a<>(this);

        /* renamed from: e  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f13591e = new AtomicReference<>();

        /* renamed from: f  reason: collision with root package name */
        final AtomicInteger f13592f = new AtomicInteger(1);
        final d.a.a0.f.a<Object> g = new d.a.a0.f.a<>();
        final d.a.a0.j.c h = new d.a.a0.j.c();
        final AtomicBoolean i = new AtomicBoolean();
        volatile boolean j;
        d<T> k;

        b(s<? super l<T>> sVar, int i2) {
            this.f13588b = sVar;
            this.f13589c = i2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                s<? super l<T>> sVar = this.f13588b;
                d.a.a0.f.a<Object> aVar = this.g;
                d.a.a0.j.c cVar = this.h;
                int i2 = 1;
                while (this.f13592f.get() != 0) {
                    d<T> dVar = this.k;
                    boolean z = this.j;
                    if (!z || cVar.get() == null) {
                        Object poll = aVar.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable b2 = cVar.b();
                            if (b2 == null) {
                                if (dVar != null) {
                                    this.k = null;
                                    dVar.onComplete();
                                }
                                sVar.onComplete();
                                return;
                            }
                            if (dVar != null) {
                                this.k = null;
                                dVar.onError(b2);
                            }
                            sVar.onError(b2);
                            return;
                        } else if (z2) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else if (poll != l) {
                            dVar.onNext(poll);
                        } else {
                            if (dVar != null) {
                                this.k = null;
                                dVar.onComplete();
                            }
                            if (!this.i.get()) {
                                d<T> g2 = d.g(this.f13589c, this);
                                this.k = g2;
                                this.f13592f.getAndIncrement();
                                sVar.onNext(g2);
                            }
                        }
                    } else {
                        aVar.clear();
                        Throwable b3 = cVar.b();
                        if (dVar != null) {
                            this.k = null;
                            dVar.onError(b3);
                        }
                        sVar.onError(b3);
                        return;
                    }
                }
                aVar.clear();
                this.k = null;
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            d.a.a0.a.c.f(this.f13591e);
            this.j = true;
            a();
        }

        /* access modifiers changed from: package-private */
        public void c(Throwable th) {
            d.a.a0.a.c.f(this.f13591e);
            if (this.h.a(th)) {
                this.j = true;
                a();
                return;
            }
            d.a.d0.a.s(th);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.g.offer(l);
            a();
        }

        public void dispose() {
            if (this.i.compareAndSet(false, true)) {
                this.f13590d.dispose();
                if (this.f13592f.decrementAndGet() == 0) {
                    d.a.a0.a.c.f(this.f13591e);
                }
            }
        }

        public void onComplete() {
            this.f13590d.dispose();
            this.j = true;
            a();
        }

        public void onError(Throwable th) {
            this.f13590d.dispose();
            if (this.h.a(th)) {
                this.j = true;
                a();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            this.g.offer(t);
            a();
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.n(this.f13591e, bVar)) {
                d();
            }
        }

        public void run() {
            if (this.f13592f.decrementAndGet() == 0) {
                d.a.a0.a.c.f(this.f13591e);
            }
        }
    }

    public g4(q<T> qVar, q<B> qVar2, int i) {
        super(qVar);
        this.f13584c = qVar2;
        this.f13585d = i;
    }

    public void subscribeActual(s<? super l<T>> sVar) {
        b bVar = new b(sVar, this.f13585d);
        sVar.onSubscribe(bVar);
        this.f13584c.subscribe(bVar.f13590d);
        this.f13338b.subscribe(bVar);
    }
}
