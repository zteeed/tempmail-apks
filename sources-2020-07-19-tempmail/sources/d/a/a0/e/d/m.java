package d.a.a0.e.d;

import d.a.a0.j.c;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableBufferBoundary */
public final class m<T, U extends Collection<? super T>, Open, Close> extends a<T, U> {

    /* renamed from: c  reason: collision with root package name */
    final Callable<U> f13225c;

    /* renamed from: d  reason: collision with root package name */
    final q<? extends Open> f13226d;

    /* renamed from: e  reason: collision with root package name */
    final n<? super Open, ? extends q<? extends Close>> f13227e;

    /* compiled from: ObservableBufferBoundary */
    static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements s<T>, d.a.y.b {
        private static final long serialVersionUID = -8466418554264089604L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super C> f13228b;

        /* renamed from: c  reason: collision with root package name */
        final Callable<C> f13229c;

        /* renamed from: d  reason: collision with root package name */
        final q<? extends Open> f13230d;

        /* renamed from: e  reason: collision with root package name */
        final n<? super Open, ? extends q<? extends Close>> f13231e;

        /* renamed from: f  reason: collision with root package name */
        final d.a.y.a f13232f = new d.a.y.a();
        final AtomicReference<d.a.y.b> g = new AtomicReference<>();
        final c h = new c();
        volatile boolean i;
        final d.a.a0.f.c<C> j = new d.a.a0.f.c<>(l.bufferSize());
        volatile boolean k;
        long l;
        Map<Long, C> m = new LinkedHashMap();

        /* renamed from: d.a.a0.e.d.m$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableBufferBoundary */
        static final class C0142a<Open> extends AtomicReference<d.a.y.b> implements s<Open>, d.a.y.b {
            private static final long serialVersionUID = -8498650778633225126L;

            /* renamed from: b  reason: collision with root package name */
            final a<?, ?, Open, ?> f13233b;

            C0142a(a<?, ?, Open, ?> aVar) {
                this.f13233b = aVar;
            }

            public void dispose() {
                d.a.a0.a.c.f(this);
            }

            public void onComplete() {
                lazySet(d.a.a0.a.c.DISPOSED);
                this.f13233b.e(this);
            }

            public void onError(Throwable th) {
                lazySet(d.a.a0.a.c.DISPOSED);
                this.f13233b.a(this, th);
            }

            public void onNext(Open open) {
                this.f13233b.d(open);
            }

            public void onSubscribe(d.a.y.b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }
        }

        a(s<? super C> sVar, q<? extends Open> qVar, n<? super Open, ? extends q<? extends Close>> nVar, Callable<C> callable) {
            this.f13228b = sVar;
            this.f13229c = callable;
            this.f13230d = qVar;
            this.f13231e = nVar;
        }

        /* access modifiers changed from: package-private */
        public void a(d.a.y.b bVar, Throwable th) {
            d.a.a0.a.c.f(this.g);
            this.f13232f.c(bVar);
            onError(th);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
            if (r4 == false) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
            r3.i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
            c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(d.a.a0.e.d.m.b<T, C> r4, long r5) {
            /*
                r3 = this;
                d.a.y.a r0 = r3.f13232f
                r0.c(r4)
                d.a.y.a r4 = r3.f13232f
                int r4 = r4.g()
                r0 = 1
                if (r4 != 0) goto L_0x0015
                java.util.concurrent.atomic.AtomicReference<d.a.y.b> r4 = r3.g
                d.a.a0.a.c.f(r4)
                r4 = 1
                goto L_0x0016
            L_0x0015:
                r4 = 0
            L_0x0016:
                monitor-enter(r3)
                java.util.Map<java.lang.Long, C> r1 = r3.m     // Catch:{ all -> 0x0035 }
                if (r1 != 0) goto L_0x001d
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                return
            L_0x001d:
                d.a.a0.f.c<C> r1 = r3.j     // Catch:{ all -> 0x0035 }
                java.util.Map<java.lang.Long, C> r2 = r3.m     // Catch:{ all -> 0x0035 }
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0035 }
                java.lang.Object r5 = r2.remove(r5)     // Catch:{ all -> 0x0035 }
                r1.offer(r5)     // Catch:{ all -> 0x0035 }
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                if (r4 == 0) goto L_0x0031
                r3.i = r0
            L_0x0031:
                r3.c()
                return
            L_0x0035:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.m.a.b(d.a.a0.e.d.m$b, long):void");
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (getAndIncrement() == 0) {
                s<? super C> sVar = this.f13228b;
                d.a.a0.f.c<C> cVar = this.j;
                int i2 = 1;
                while (!this.k) {
                    boolean z = this.i;
                    if (!z || this.h.get() == null) {
                        Collection collection = (Collection) cVar.poll();
                        boolean z2 = collection == null;
                        if (z && z2) {
                            sVar.onComplete();
                            return;
                        } else if (z2) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            sVar.onNext(collection);
                        }
                    } else {
                        cVar.clear();
                        sVar.onError(this.h.b());
                        return;
                    }
                }
                cVar.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void d(Open open) {
            try {
                C call = this.f13229c.call();
                d.a.a0.b.b.e(call, "The bufferSupplier returned a null Collection");
                Collection collection = (Collection) call;
                Object apply = this.f13231e.apply(open);
                d.a.a0.b.b.e(apply, "The bufferClose returned a null ObservableSource");
                q qVar = (q) apply;
                long j2 = this.l;
                this.l = 1 + j2;
                synchronized (this) {
                    Map<Long, C> map = this.m;
                    if (map != null) {
                        map.put(Long.valueOf(j2), collection);
                        b bVar = new b(this, j2);
                        this.f13232f.b(bVar);
                        qVar.subscribe(bVar);
                    }
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                d.a.a0.a.c.f(this.g);
                onError(th);
            }
        }

        public void dispose() {
            if (d.a.a0.a.c.f(this.g)) {
                this.k = true;
                this.f13232f.dispose();
                synchronized (this) {
                    this.m = null;
                }
                if (getAndIncrement() != 0) {
                    this.j.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e(C0142a<Open> aVar) {
            this.f13232f.c(aVar);
            if (this.f13232f.g() == 0) {
                d.a.a0.a.c.f(this.g);
                this.i = true;
                c();
            }
        }

        public void onComplete() {
            this.f13232f.dispose();
            synchronized (this) {
                Map<Long, C> map = this.m;
                if (map != null) {
                    for (C offer : map.values()) {
                        this.j.offer(offer);
                    }
                    this.m = null;
                    this.i = true;
                    c();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.h.a(th)) {
                this.f13232f.dispose();
                synchronized (this) {
                    this.m = null;
                }
                this.i = true;
                c();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            synchronized (this) {
                Map<Long, C> map = this.m;
                if (map != null) {
                    for (C add : map.values()) {
                        add.add(t);
                    }
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.n(this.g, bVar)) {
                C0142a aVar = new C0142a(this);
                this.f13232f.b(aVar);
                this.f13230d.subscribe(aVar);
            }
        }
    }

    /* compiled from: ObservableBufferBoundary */
    static final class b<T, C extends Collection<? super T>> extends AtomicReference<d.a.y.b> implements s<Object>, d.a.y.b {
        private static final long serialVersionUID = -8498650778633225126L;

        /* renamed from: b  reason: collision with root package name */
        final a<T, C, ?, ?> f13234b;

        /* renamed from: c  reason: collision with root package name */
        final long f13235c;

        b(a<T, C, ?, ?> aVar, long j) {
            this.f13234b = aVar;
            this.f13235c = j;
        }

        public void dispose() {
            d.a.a0.a.c.f(this);
        }

        public void onComplete() {
            Object obj = get();
            d.a.a0.a.c cVar = d.a.a0.a.c.DISPOSED;
            if (obj != cVar) {
                lazySet(cVar);
                this.f13234b.b(this, this.f13235c);
            }
        }

        public void onError(Throwable th) {
            Object obj = get();
            d.a.a0.a.c cVar = d.a.a0.a.c.DISPOSED;
            if (obj != cVar) {
                lazySet(cVar);
                this.f13234b.a(this, th);
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(Object obj) {
            d.a.y.b bVar = (d.a.y.b) get();
            d.a.a0.a.c cVar = d.a.a0.a.c.DISPOSED;
            if (bVar != cVar) {
                lazySet(cVar);
                bVar.dispose();
                this.f13234b.b(this, this.f13235c);
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this, bVar);
        }
    }

    public m(q<T> qVar, q<? extends Open> qVar2, n<? super Open, ? extends q<? extends Close>> nVar, Callable<U> callable) {
        super(qVar);
        this.f13226d = qVar2;
        this.f13227e = nVar;
        this.f13225c = callable;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super U> sVar) {
        a aVar = new a(sVar, this.f13226d, this.f13227e, this.f13225c);
        sVar.onSubscribe(aVar);
        this.f12780b.subscribe(aVar);
    }
}
