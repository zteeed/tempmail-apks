package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.a.d;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableCombineLatest */
public final class t<T, R> extends l<R> {

    /* renamed from: b  reason: collision with root package name */
    final q<? extends T>[] f14079b;

    /* renamed from: c  reason: collision with root package name */
    final Iterable<? extends q<? extends T>> f14080c;

    /* renamed from: d  reason: collision with root package name */
    final n<? super Object[], ? extends R> f14081d;

    /* renamed from: e  reason: collision with root package name */
    final int f14082e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f14083f;

    /* compiled from: ObservableCombineLatest */
    static final class a<T, R> extends AtomicReference<d.a.y.b> implements s<T> {
        private static final long serialVersionUID = -4823716997131257941L;

        /* renamed from: b  reason: collision with root package name */
        final b<T, R> f14084b;

        /* renamed from: c  reason: collision with root package name */
        final int f14085c;

        a(b<T, R> bVar, int i) {
            this.f14084b = bVar;
            this.f14085c = i;
        }

        public void a() {
            c.f(this);
        }

        public void onComplete() {
            this.f14084b.d(this.f14085c);
        }

        public void onError(Throwable th) {
            this.f14084b.e(this.f14085c, th);
        }

        public void onNext(T t) {
            this.f14084b.f(this.f14085c, t);
        }

        public void onSubscribe(d.a.y.b bVar) {
            c.n(this, bVar);
        }
    }

    /* compiled from: ObservableCombineLatest */
    static final class b<T, R> extends AtomicInteger implements d.a.y.b {
        private static final long serialVersionUID = 8567835998786448817L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f14086b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super Object[], ? extends R> f14087c;

        /* renamed from: d  reason: collision with root package name */
        final a<T, R>[] f14088d;

        /* renamed from: e  reason: collision with root package name */
        Object[] f14089e;

        /* renamed from: f  reason: collision with root package name */
        final d.a.a0.f.c<Object[]> f14090f;
        final boolean g;
        volatile boolean h;
        volatile boolean i;
        final d.a.a0.j.c j = new d.a.a0.j.c();
        int k;
        int l;

        b(s<? super R> sVar, n<? super Object[], ? extends R> nVar, int i2, int i3, boolean z) {
            this.f14086b = sVar;
            this.f14087c = nVar;
            this.g = z;
            this.f14089e = new Object[i2];
            a<T, R>[] aVarArr = new a[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                aVarArr[i4] = new a<>(this, i4);
            }
            this.f14088d = aVarArr;
            this.f14090f = new d.a.a0.f.c<>(i3);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            for (a<T, R> a2 : this.f14088d) {
                a2.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void b(d.a.a0.f.c<?> cVar) {
            synchronized (this) {
                this.f14089e = null;
            }
            cVar.clear();
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (getAndIncrement() == 0) {
                d.a.a0.f.c<Object[]> cVar = this.f14090f;
                s<? super R> sVar = this.f14086b;
                boolean z = this.g;
                int i2 = 1;
                while (!this.h) {
                    if (z || this.j.get() == null) {
                        boolean z2 = this.i;
                        Object[] poll = cVar.poll();
                        boolean z3 = poll == null;
                        if (z2 && z3) {
                            b(cVar);
                            Throwable b2 = this.j.b();
                            if (b2 == null) {
                                sVar.onComplete();
                                return;
                            } else {
                                sVar.onError(b2);
                                return;
                            }
                        } else if (z3) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            try {
                                Object apply = this.f14087c.apply(poll);
                                d.a.a0.b.b.e(apply, "The combiner returned a null value");
                                sVar.onNext(apply);
                            } catch (Throwable th) {
                                io.reactivex.exceptions.a.b(th);
                                this.j.a(th);
                                a();
                                b(cVar);
                                sVar.onError(this.j.b());
                                return;
                            }
                        }
                    } else {
                        a();
                        b(cVar);
                        sVar.onError(this.j.b());
                        return;
                    }
                }
                b(cVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r2 == r0.length) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
            if (r4 == false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
            a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
            c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f14089e     // Catch:{ all -> 0x0025 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                return
            L_0x0007:
                r4 = r0[r4]     // Catch:{ all -> 0x0025 }
                r1 = 1
                if (r4 != 0) goto L_0x000e
                r4 = 1
                goto L_0x000f
            L_0x000e:
                r4 = 0
            L_0x000f:
                if (r4 != 0) goto L_0x0019
                int r2 = r3.l     // Catch:{ all -> 0x0025 }
                int r2 = r2 + r1
                r3.l = r2     // Catch:{ all -> 0x0025 }
                int r0 = r0.length     // Catch:{ all -> 0x0025 }
                if (r2 != r0) goto L_0x001b
            L_0x0019:
                r3.i = r1     // Catch:{ all -> 0x0025 }
            L_0x001b:
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x0021
                r3.a()
            L_0x0021:
                r3.c()
                return
            L_0x0025:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.t.b.d(int):void");
        }

        public void dispose() {
            if (!this.h) {
                this.h = true;
                a();
                if (getAndIncrement() == 0) {
                    b(this.f14090f);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            if (r1 == r4.length) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
            r0 = r3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void e(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                d.a.a0.j.c r0 = r2.j
                boolean r0 = r0.a(r4)
                if (r0 == 0) goto L_0x0036
                boolean r4 = r2.g
                r0 = 1
                if (r4 == 0) goto L_0x002d
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.f14089e     // Catch:{ all -> 0x002a }
                if (r4 != 0) goto L_0x0014
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                return
            L_0x0014:
                r3 = r4[r3]     // Catch:{ all -> 0x002a }
                if (r3 != 0) goto L_0x001a
                r3 = 1
                goto L_0x001b
            L_0x001a:
                r3 = 0
            L_0x001b:
                if (r3 != 0) goto L_0x0025
                int r1 = r2.l     // Catch:{ all -> 0x002a }
                int r1 = r1 + r0
                r2.l = r1     // Catch:{ all -> 0x002a }
                int r4 = r4.length     // Catch:{ all -> 0x002a }
                if (r1 != r4) goto L_0x0027
            L_0x0025:
                r2.i = r0     // Catch:{ all -> 0x002a }
            L_0x0027:
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                r0 = r3
                goto L_0x002d
            L_0x002a:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                throw r3
            L_0x002d:
                if (r0 == 0) goto L_0x0032
                r2.a()
            L_0x0032:
                r2.c()
                goto L_0x0039
            L_0x0036:
                d.a.d0.a.s(r4)
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.t.b.e(int, java.lang.Throwable):void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            if (r4 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void f(int r4, T r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f14089e     // Catch:{ all -> 0x0029 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                return
            L_0x0007:
                r1 = r0[r4]     // Catch:{ all -> 0x0029 }
                int r2 = r3.k     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0011
                int r2 = r2 + 1
                r3.k = r2     // Catch:{ all -> 0x0029 }
            L_0x0011:
                r0[r4] = r5     // Catch:{ all -> 0x0029 }
                int r4 = r0.length     // Catch:{ all -> 0x0029 }
                if (r2 != r4) goto L_0x0021
                d.a.a0.f.c<java.lang.Object[]> r4 = r3.f14090f     // Catch:{ all -> 0x0029 }
                java.lang.Object r5 = r0.clone()     // Catch:{ all -> 0x0029 }
                r4.offer(r5)     // Catch:{ all -> 0x0029 }
                r4 = 1
                goto L_0x0022
            L_0x0021:
                r4 = 0
            L_0x0022:
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0028
                r3.c()
            L_0x0028:
                return
            L_0x0029:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.t.b.f(int, java.lang.Object):void");
        }

        public void g(q<? extends T>[] qVarArr) {
            a<T, R>[] aVarArr = this.f14088d;
            int length = aVarArr.length;
            this.f14086b.onSubscribe(this);
            for (int i2 = 0; i2 < length && !this.i && !this.h; i2++) {
                qVarArr[i2].subscribe(aVarArr[i2]);
            }
        }
    }

    public t(q<? extends T>[] qVarArr, Iterable<? extends q<? extends T>> iterable, n<? super Object[], ? extends R> nVar, int i, boolean z) {
        this.f14079b = qVarArr;
        this.f14080c = iterable;
        this.f14081d = nVar;
        this.f14082e = i;
        this.f14083f = z;
    }

    public void subscribeActual(s<? super R> sVar) {
        int i;
        q<? extends T>[] qVarArr = this.f14079b;
        if (qVarArr == null) {
            qVarArr = new q[8];
            i = 0;
            for (q<? extends T> qVar : this.f14080c) {
                if (i == qVarArr.length) {
                    q<? extends T>[] qVarArr2 = new q[((i >> 2) + i)];
                    System.arraycopy(qVarArr, 0, qVarArr2, 0, i);
                    qVarArr = qVarArr2;
                }
                qVarArr[i] = qVar;
                i++;
            }
        } else {
            i = qVarArr.length;
        }
        int i2 = i;
        if (i2 == 0) {
            d.h(sVar);
            return;
        }
        new b(sVar, this.f14081d, i2, this.f14082e, this.f14083f).g(qVarArr);
    }
}
