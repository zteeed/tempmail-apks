package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservablePublishAlt */
public final class g2<T> extends d.a.b0.a<T> implements Object<T> {

    /* renamed from: b  reason: collision with root package name */
    final q<T> f13014b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<b<T>> f13015c = new AtomicReference<>();

    /* compiled from: ObservablePublishAlt */
    static final class a<T> extends AtomicReference<b<T>> implements d.a.y.b {
        private static final long serialVersionUID = 7463222674719692880L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13016b;

        a(s<? super T> sVar, b<T> bVar) {
            this.f13016b = sVar;
            lazySet(bVar);
        }

        public boolean a() {
            return get() == null;
        }

        public void dispose() {
            b bVar = (b) getAndSet((Object) null);
            if (bVar != null) {
                bVar.c(this);
            }
        }
    }

    /* compiled from: ObservablePublishAlt */
    static final class b<T> extends AtomicReference<a<T>[]> implements s<T>, d.a.y.b {

        /* renamed from: f  reason: collision with root package name */
        static final a[] f13017f = new a[0];
        static final a[] g = new a[0];
        private static final long serialVersionUID = -3251430252873581268L;

        /* renamed from: b  reason: collision with root package name */
        final AtomicBoolean f13018b = new AtomicBoolean();

        /* renamed from: c  reason: collision with root package name */
        final AtomicReference<b<T>> f13019c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f13020d;

        /* renamed from: e  reason: collision with root package name */
        Throwable f13021e;

        b(AtomicReference<b<T>> atomicReference) {
            this.f13019c = atomicReference;
            this.f13020d = new AtomicReference<>();
            lazySet(f13017f);
        }

        public boolean a(a<T> aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) get();
                if (aVarArr == g) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        public boolean b() {
            return get() == g;
        }

        public void c(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2] == aVar) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        aVarArr2 = f13017f;
                        if (length != 1) {
                            aVarArr2 = new a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        public void dispose() {
            getAndSet(g);
            this.f13019c.compareAndSet(this, (Object) null);
            c.f(this.f13020d);
        }

        public void onComplete() {
            this.f13020d.lazySet(c.DISPOSED);
            for (a aVar : (a[]) getAndSet(g)) {
                aVar.f13016b.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f13021e = th;
            this.f13020d.lazySet(c.DISPOSED);
            for (a aVar : (a[]) getAndSet(g)) {
                aVar.f13016b.onError(th);
            }
        }

        public void onNext(T t) {
            for (a aVar : (a[]) get()) {
                aVar.f13016b.onNext(t);
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            c.n(this.f13020d, bVar);
        }
    }

    public g2(q<T> qVar) {
        this.f13014b = qVar;
    }

    public void b(d.a.y.b bVar) {
        this.f13015c.compareAndSet((b) bVar, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(d.a.z.f<? super d.a.y.b> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<d.a.a0.e.d.g2$b<T>> r0 = r4.f13015c
            java.lang.Object r0 = r0.get()
            d.a.a0.e.d.g2$b r0 = (d.a.a0.e.d.g2.b) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0021
        L_0x0010:
            d.a.a0.e.d.g2$b r1 = new d.a.a0.e.d.g2$b
            java.util.concurrent.atomic.AtomicReference<d.a.a0.e.d.g2$b<T>> r2 = r4.f13015c
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<d.a.a0.e.d.g2$b<T>> r2 = r4.f13015c
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x0000
        L_0x0020:
            r0 = r1
        L_0x0021:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f13018b
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0034
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f13018b
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            r5.a(r0)     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003f
            d.a.q<T> r5 = r4.f13014b
            r5.subscribe(r0)
        L_0x003f:
            return
        L_0x0040:
            r5 = move-exception
            io.reactivex.exceptions.a.b(r5)
            java.lang.RuntimeException r5 = d.a.a0.j.j.d(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.g2.d(d.a.z.f):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void subscribeActual(d.a.s<? super T> r4) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<d.a.a0.e.d.g2$b<T>> r0 = r3.f13015c
            java.lang.Object r0 = r0.get()
            d.a.a0.e.d.g2$b r0 = (d.a.a0.e.d.g2.b) r0
            if (r0 != 0) goto L_0x001b
            d.a.a0.e.d.g2$b r1 = new d.a.a0.e.d.g2$b
            java.util.concurrent.atomic.AtomicReference<d.a.a0.e.d.g2$b<T>> r2 = r3.f13015c
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<d.a.a0.e.d.g2$b<T>> r2 = r3.f13015c
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L_0x001a
            goto L_0x0000
        L_0x001a:
            r0 = r1
        L_0x001b:
            d.a.a0.e.d.g2$a r1 = new d.a.a0.e.d.g2$a
            r1.<init>(r4, r0)
            r4.onSubscribe(r1)
            boolean r2 = r0.a(r1)
            if (r2 == 0) goto L_0x0033
            boolean r4 = r1.a()
            if (r4 == 0) goto L_0x0032
            r0.c(r1)
        L_0x0032:
            return
        L_0x0033:
            java.lang.Throwable r0 = r0.f13021e
            if (r0 == 0) goto L_0x003b
            r4.onError(r0)
            goto L_0x003e
        L_0x003b:
            r4.onComplete()
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.g2.subscribeActual(d.a.s):void");
    }
}
