package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.c.f;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSwitchMap */
public final class n3<T, R> extends a<T, R> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends q<? extends R>> f13314c;

    /* renamed from: d  reason: collision with root package name */
    final int f13315d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f13316e;

    /* compiled from: ObservableSwitchMap */
    static final class a<T, R> extends AtomicReference<d.a.y.b> implements s<R> {
        private static final long serialVersionUID = 3837284832786408377L;

        /* renamed from: b  reason: collision with root package name */
        final b<T, R> f13317b;

        /* renamed from: c  reason: collision with root package name */
        final long f13318c;

        /* renamed from: d  reason: collision with root package name */
        final int f13319d;

        /* renamed from: e  reason: collision with root package name */
        volatile f<R> f13320e;

        /* renamed from: f  reason: collision with root package name */
        volatile boolean f13321f;

        a(b<T, R> bVar, long j, int i) {
            this.f13317b = bVar;
            this.f13318c = j;
            this.f13319d = i;
        }

        public void a() {
            c.f(this);
        }

        public void onComplete() {
            if (this.f13318c == this.f13317b.k) {
                this.f13321f = true;
                this.f13317b.b();
            }
        }

        public void onError(Throwable th) {
            this.f13317b.c(this, th);
        }

        public void onNext(R r) {
            if (this.f13318c == this.f13317b.k) {
                if (r != null) {
                    this.f13320e.offer(r);
                }
                this.f13317b.b();
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.n(this, bVar)) {
                if (bVar instanceof d.a.a0.c.b) {
                    d.a.a0.c.b bVar2 = (d.a.a0.c.b) bVar;
                    int g = bVar2.g(7);
                    if (g == 1) {
                        this.f13320e = bVar2;
                        this.f13321f = true;
                        this.f13317b.b();
                        return;
                    } else if (g == 2) {
                        this.f13320e = bVar2;
                        return;
                    }
                }
                this.f13320e = new d.a.a0.f.c(this.f13319d);
            }
        }
    }

    /* compiled from: ObservableSwitchMap */
    static final class b<T, R> extends AtomicInteger implements s<T>, d.a.y.b {
        static final a<Object, Object> l;
        private static final long serialVersionUID = -3491074160481096299L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f13322b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends q<? extends R>> f13323c;

        /* renamed from: d  reason: collision with root package name */
        final int f13324d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f13325e;

        /* renamed from: f  reason: collision with root package name */
        final d.a.a0.j.c f13326f;
        volatile boolean g;
        volatile boolean h;
        d.a.y.b i;
        final AtomicReference<a<T, R>> j = new AtomicReference<>();
        volatile long k;

        static {
            a<Object, Object> aVar = new a<>((b) null, -1, 1);
            l = aVar;
            aVar.a();
        }

        b(s<? super R> sVar, n<? super T, ? extends q<? extends R>> nVar, int i2, boolean z) {
            this.f13322b = sVar;
            this.f13323c = nVar;
            this.f13324d = i2;
            this.f13325e = z;
            this.f13326f = new d.a.a0.j.c();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            a<Object, Object> andSet;
            a<Object, Object> aVar = this.j.get();
            a<Object, Object> aVar2 = l;
            if (aVar != aVar2 && (andSet = this.j.getAndSet(aVar2)) != l && andSet != null) {
                andSet.a();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x000f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                d.a.s<? super R> r0 = r13.f13322b
                java.util.concurrent.atomic.AtomicReference<d.a.a0.e.d.n3$a<T, R>> r1 = r13.j
                boolean r2 = r13.f13325e
                r3 = 1
                r4 = 1
            L_0x000f:
                boolean r5 = r13.h
                if (r5 == 0) goto L_0x0014
                return
            L_0x0014:
                boolean r5 = r13.g
                r6 = 0
                if (r5 == 0) goto L_0x0052
                java.lang.Object r5 = r1.get()
                if (r5 != 0) goto L_0x0021
                r5 = 1
                goto L_0x0022
            L_0x0021:
                r5 = 0
            L_0x0022:
                if (r2 == 0) goto L_0x0038
                if (r5 == 0) goto L_0x0052
                d.a.a0.j.c r1 = r13.f13326f
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L_0x0034
                r0.onError(r1)
                goto L_0x0037
            L_0x0034:
                r0.onComplete()
            L_0x0037:
                return
            L_0x0038:
                d.a.a0.j.c r7 = r13.f13326f
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L_0x004c
                d.a.a0.j.c r1 = r13.f13326f
                java.lang.Throwable r1 = r1.b()
                r0.onError(r1)
                return
            L_0x004c:
                if (r5 == 0) goto L_0x0052
                r0.onComplete()
                return
            L_0x0052:
                java.lang.Object r5 = r1.get()
                d.a.a0.e.d.n3$a r5 = (d.a.a0.e.d.n3.a) r5
                if (r5 == 0) goto L_0x00e9
                d.a.a0.c.f<R> r7 = r5.f13320e
                if (r7 == 0) goto L_0x00e9
                boolean r8 = r5.f13321f
                r9 = 0
                if (r8 == 0) goto L_0x0089
                boolean r8 = r7.isEmpty()
                if (r2 == 0) goto L_0x006f
                if (r8 == 0) goto L_0x0089
                r1.compareAndSet(r5, r9)
                goto L_0x000f
            L_0x006f:
                d.a.a0.j.c r10 = r13.f13326f
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x0083
                d.a.a0.j.c r1 = r13.f13326f
                java.lang.Throwable r1 = r1.b()
                r0.onError(r1)
                return
            L_0x0083:
                if (r8 == 0) goto L_0x0089
                r1.compareAndSet(r5, r9)
                goto L_0x000f
            L_0x0089:
                r8 = 0
            L_0x008a:
                boolean r10 = r13.h
                if (r10 == 0) goto L_0x008f
                return
            L_0x008f:
                java.lang.Object r10 = r1.get()
                if (r5 == r10) goto L_0x0097
            L_0x0095:
                r8 = 1
                goto L_0x00e1
            L_0x0097:
                if (r2 != 0) goto L_0x00ad
                d.a.a0.j.c r10 = r13.f13326f
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x00ad
                d.a.a0.j.c r1 = r13.f13326f
                java.lang.Throwable r1 = r1.b()
                r0.onError(r1)
                return
            L_0x00ad:
                boolean r10 = r5.f13321f
                java.lang.Object r11 = r7.poll()     // Catch:{ all -> 0x00b4 }
                goto L_0x00d2
            L_0x00b4:
                r8 = move-exception
                io.reactivex.exceptions.a.b(r8)
                d.a.a0.j.c r11 = r13.f13326f
                r11.a(r8)
                r1.compareAndSet(r5, r9)
                if (r2 != 0) goto L_0x00cd
                r13.a()
                d.a.y.b r8 = r13.i
                r8.dispose()
                r13.g = r3
                goto L_0x00d0
            L_0x00cd:
                r5.a()
            L_0x00d0:
                r11 = r9
                r8 = 1
            L_0x00d2:
                if (r11 != 0) goto L_0x00d6
                r12 = 1
                goto L_0x00d7
            L_0x00d6:
                r12 = 0
            L_0x00d7:
                if (r10 == 0) goto L_0x00df
                if (r12 == 0) goto L_0x00df
                r1.compareAndSet(r5, r9)
                goto L_0x0095
            L_0x00df:
                if (r12 == 0) goto L_0x00e5
            L_0x00e1:
                if (r8 == 0) goto L_0x00e9
                goto L_0x000f
            L_0x00e5:
                r0.onNext(r11)
                goto L_0x008a
            L_0x00e9:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto L_0x000f
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.n3.b.b():void");
        }

        /* access modifiers changed from: package-private */
        public void c(a<T, R> aVar, Throwable th) {
            if (aVar.f13318c != this.k || !this.f13326f.a(th)) {
                d.a.d0.a.s(th);
                return;
            }
            if (!this.f13325e) {
                this.i.dispose();
                this.g = true;
            }
            aVar.f13321f = true;
            b();
        }

        public void dispose() {
            if (!this.h) {
                this.h = true;
                this.i.dispose();
                a();
            }
        }

        public void onComplete() {
            if (!this.g) {
                this.g = true;
                b();
            }
        }

        public void onError(Throwable th) {
            if (this.g || !this.f13326f.a(th)) {
                d.a.d0.a.s(th);
                return;
            }
            if (!this.f13325e) {
                a();
            }
            this.g = true;
            b();
        }

        public void onNext(T t) {
            a<Object, Object> aVar;
            long j2 = this.k + 1;
            this.k = j2;
            a aVar2 = this.j.get();
            if (aVar2 != null) {
                aVar2.a();
            }
            try {
                Object apply = this.f13323c.apply(t);
                d.a.a0.b.b.e(apply, "The ObservableSource returned is null");
                q qVar = (q) apply;
                a aVar3 = new a(this, j2, this.f13324d);
                do {
                    aVar = this.j.get();
                    if (aVar == l) {
                        return;
                    }
                } while (!this.j.compareAndSet(aVar, aVar3));
                qVar.subscribe(aVar3);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.i.dispose();
                onError(th);
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.i, bVar)) {
                this.i = bVar;
                this.f13322b.onSubscribe(this);
            }
        }
    }

    public n3(q<T> qVar, n<? super T, ? extends q<? extends R>> nVar, int i, boolean z) {
        super(qVar);
        this.f13314c = nVar;
        this.f13315d = i;
        this.f13316e = z;
    }

    public void subscribeActual(s<? super R> sVar) {
        if (!y2.b(this.f12780b, sVar, this.f13314c)) {
            this.f12780b.subscribe(new b(sVar, this.f13314c, this.f13315d, this.f13316e));
        }
    }
}
