package d.a.a0.e.d;

import d.a.a0.c.f;
import d.a.a0.j.c;
import d.a.a0.j.i;
import d.a.c0.e;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatMap */
public final class u<T, U> extends a<T, U> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends q<? extends U>> f14109c;

    /* renamed from: d  reason: collision with root package name */
    final int f14110d;

    /* renamed from: e  reason: collision with root package name */
    final i f14111e;

    /* compiled from: ObservableConcatMap */
    static final class a<T, R> extends AtomicInteger implements s<T>, d.a.y.b {
        private static final long serialVersionUID = -6951100001833242599L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f14112b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends q<? extends R>> f14113c;

        /* renamed from: d  reason: collision with root package name */
        final int f14114d;

        /* renamed from: e  reason: collision with root package name */
        final c f14115e = new c();

        /* renamed from: f  reason: collision with root package name */
        final C0143a<R> f14116f;
        final boolean g;
        f<T> h;
        d.a.y.b i;
        volatile boolean j;
        volatile boolean k;
        volatile boolean l;
        int m;

        /* renamed from: d.a.a0.e.d.u$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableConcatMap */
        static final class C0143a<R> extends AtomicReference<d.a.y.b> implements s<R> {
            private static final long serialVersionUID = 2620149119579502636L;

            /* renamed from: b  reason: collision with root package name */
            final s<? super R> f14117b;

            /* renamed from: c  reason: collision with root package name */
            final a<?, R> f14118c;

            C0143a(s<? super R> sVar, a<?, R> aVar) {
                this.f14117b = sVar;
                this.f14118c = aVar;
            }

            /* access modifiers changed from: package-private */
            public void a() {
                d.a.a0.a.c.f(this);
            }

            public void onComplete() {
                a<?, R> aVar = this.f14118c;
                aVar.j = false;
                aVar.a();
            }

            public void onError(Throwable th) {
                a<?, R> aVar = this.f14118c;
                if (aVar.f14115e.a(th)) {
                    if (!aVar.g) {
                        aVar.i.dispose();
                    }
                    aVar.j = false;
                    aVar.a();
                    return;
                }
                d.a.d0.a.s(th);
            }

            public void onNext(R r) {
                this.f14117b.onNext(r);
            }

            public void onSubscribe(d.a.y.b bVar) {
                d.a.a0.a.c.h(this, bVar);
            }
        }

        a(s<? super R> sVar, n<? super T, ? extends q<? extends R>> nVar, int i2, boolean z) {
            this.f14112b = sVar;
            this.f14113c = nVar;
            this.f14114d = i2;
            this.g = z;
            this.f14116f = new C0143a<>(sVar, this);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                s<? super R> sVar = this.f14112b;
                f<T> fVar = this.h;
                c cVar = this.f14115e;
                while (true) {
                    if (!this.j) {
                        if (this.l) {
                            fVar.clear();
                            return;
                        } else if (this.g || ((Throwable) cVar.get()) == null) {
                            boolean z = this.k;
                            try {
                                T poll = fVar.poll();
                                boolean z2 = poll == null;
                                if (z && z2) {
                                    this.l = true;
                                    Throwable b2 = cVar.b();
                                    if (b2 != null) {
                                        sVar.onError(b2);
                                        return;
                                    } else {
                                        sVar.onComplete();
                                        return;
                                    }
                                } else if (!z2) {
                                    try {
                                        Object apply = this.f14113c.apply(poll);
                                        d.a.a0.b.b.e(apply, "The mapper returned a null ObservableSource");
                                        q qVar = (q) apply;
                                        if (qVar instanceof Callable) {
                                            try {
                                                Object call = ((Callable) qVar).call();
                                                if (call != null && !this.l) {
                                                    sVar.onNext(call);
                                                }
                                            } catch (Throwable th) {
                                                io.reactivex.exceptions.a.b(th);
                                                cVar.a(th);
                                            }
                                        } else {
                                            this.j = true;
                                            qVar.subscribe(this.f14116f);
                                        }
                                    } catch (Throwable th2) {
                                        io.reactivex.exceptions.a.b(th2);
                                        this.l = true;
                                        this.i.dispose();
                                        fVar.clear();
                                        cVar.a(th2);
                                        sVar.onError(cVar.b());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                io.reactivex.exceptions.a.b(th3);
                                this.l = true;
                                this.i.dispose();
                                cVar.a(th3);
                                sVar.onError(cVar.b());
                                return;
                            }
                        } else {
                            fVar.clear();
                            this.l = true;
                            sVar.onError(cVar.b());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void dispose() {
            this.l = true;
            this.i.dispose();
            this.f14116f.a();
        }

        public void onComplete() {
            this.k = true;
            a();
        }

        public void onError(Throwable th) {
            if (this.f14115e.a(th)) {
                this.k = true;
                a();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            if (this.m == 0) {
                this.h.offer(t);
            }
            a();
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.i, bVar)) {
                this.i = bVar;
                if (bVar instanceof d.a.a0.c.b) {
                    d.a.a0.c.b bVar2 = (d.a.a0.c.b) bVar;
                    int g2 = bVar2.g(3);
                    if (g2 == 1) {
                        this.m = g2;
                        this.h = bVar2;
                        this.k = true;
                        this.f14112b.onSubscribe(this);
                        a();
                        return;
                    } else if (g2 == 2) {
                        this.m = g2;
                        this.h = bVar2;
                        this.f14112b.onSubscribe(this);
                        return;
                    }
                }
                this.h = new d.a.a0.f.c(this.f14114d);
                this.f14112b.onSubscribe(this);
            }
        }
    }

    /* compiled from: ObservableConcatMap */
    static final class b<T, U> extends AtomicInteger implements s<T>, d.a.y.b {
        private static final long serialVersionUID = 8828587559905699186L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super U> f14119b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends q<? extends U>> f14120c;

        /* renamed from: d  reason: collision with root package name */
        final a<U> f14121d;

        /* renamed from: e  reason: collision with root package name */
        final int f14122e;

        /* renamed from: f  reason: collision with root package name */
        f<T> f14123f;
        d.a.y.b g;
        volatile boolean h;
        volatile boolean i;
        volatile boolean j;
        int k;

        /* compiled from: ObservableConcatMap */
        static final class a<U> extends AtomicReference<d.a.y.b> implements s<U> {
            private static final long serialVersionUID = -7449079488798789337L;

            /* renamed from: b  reason: collision with root package name */
            final s<? super U> f14124b;

            /* renamed from: c  reason: collision with root package name */
            final b<?, ?> f14125c;

            a(s<? super U> sVar, b<?, ?> bVar) {
                this.f14124b = sVar;
                this.f14125c = bVar;
            }

            /* access modifiers changed from: package-private */
            public void a() {
                d.a.a0.a.c.f(this);
            }

            public void onComplete() {
                this.f14125c.b();
            }

            public void onError(Throwable th) {
                this.f14125c.dispose();
                this.f14124b.onError(th);
            }

            public void onNext(U u) {
                this.f14124b.onNext(u);
            }

            public void onSubscribe(d.a.y.b bVar) {
                d.a.a0.a.c.h(this, bVar);
            }
        }

        b(s<? super U> sVar, n<? super T, ? extends q<? extends U>> nVar, int i2) {
            this.f14119b = sVar;
            this.f14120c = nVar;
            this.f14122e = i2;
            this.f14121d = new a<>(sVar, this);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                while (!this.i) {
                    if (!this.h) {
                        boolean z = this.j;
                        try {
                            T poll = this.f14123f.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.i = true;
                                this.f14119b.onComplete();
                                return;
                            } else if (!z2) {
                                try {
                                    Object apply = this.f14120c.apply(poll);
                                    d.a.a0.b.b.e(apply, "The mapper returned a null ObservableSource");
                                    q qVar = (q) apply;
                                    this.h = true;
                                    qVar.subscribe(this.f14121d);
                                } catch (Throwable th) {
                                    io.reactivex.exceptions.a.b(th);
                                    dispose();
                                    this.f14123f.clear();
                                    this.f14119b.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            dispose();
                            this.f14123f.clear();
                            this.f14119b.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f14123f.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.h = false;
            a();
        }

        public void dispose() {
            this.i = true;
            this.f14121d.a();
            this.g.dispose();
            if (getAndIncrement() == 0) {
                this.f14123f.clear();
            }
        }

        public void onComplete() {
            if (!this.j) {
                this.j = true;
                a();
            }
        }

        public void onError(Throwable th) {
            if (this.j) {
                d.a.d0.a.s(th);
                return;
            }
            this.j = true;
            dispose();
            this.f14119b.onError(th);
        }

        public void onNext(T t) {
            if (!this.j) {
                if (this.k == 0) {
                    this.f14123f.offer(t);
                }
                a();
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.g, bVar)) {
                this.g = bVar;
                if (bVar instanceof d.a.a0.c.b) {
                    d.a.a0.c.b bVar2 = (d.a.a0.c.b) bVar;
                    int g2 = bVar2.g(3);
                    if (g2 == 1) {
                        this.k = g2;
                        this.f14123f = bVar2;
                        this.j = true;
                        this.f14119b.onSubscribe(this);
                        a();
                        return;
                    } else if (g2 == 2) {
                        this.k = g2;
                        this.f14123f = bVar2;
                        this.f14119b.onSubscribe(this);
                        return;
                    }
                }
                this.f14123f = new d.a.a0.f.c(this.f14122e);
                this.f14119b.onSubscribe(this);
            }
        }
    }

    public u(q<T> qVar, n<? super T, ? extends q<? extends U>> nVar, int i, i iVar) {
        super(qVar);
        this.f14109c = nVar;
        this.f14111e = iVar;
        this.f14110d = Math.max(8, i);
    }

    public void subscribeActual(s<? super U> sVar) {
        if (!y2.b(this.f13338b, sVar, this.f14109c)) {
            if (this.f14111e == i.IMMEDIATE) {
                this.f13338b.subscribe(new b(new e(sVar), this.f14109c, this.f14110d));
            } else {
                this.f13338b.subscribe(new a(sVar, this.f14109c, this.f14110d, this.f14111e == i.END));
            }
        }
    }
}
