package d.a.a0.e.d;

import d.a.q;
import d.a.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservablePublish */
public final class f2<T> extends d.a.b0.a<T> implements Object<T> {

    /* renamed from: b  reason: collision with root package name */
    final q<T> f12970b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<b<T>> f12971c;

    /* renamed from: d  reason: collision with root package name */
    final q<T> f12972d;

    /* compiled from: ObservablePublish */
    static final class a<T> extends AtomicReference<Object> implements d.a.y.b {
        private static final long serialVersionUID = -1100270633763673112L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f12973b;

        a(s<? super T> sVar) {
            this.f12973b = sVar;
        }

        /* access modifiers changed from: package-private */
        public void a(b<T> bVar) {
            if (!compareAndSet((Object) null, bVar)) {
                bVar.c(this);
            }
        }

        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((b) andSet).c(this);
            }
        }
    }

    /* compiled from: ObservablePublish */
    static final class b<T> implements s<T>, d.a.y.b {

        /* renamed from: f  reason: collision with root package name */
        static final a[] f12974f = new a[0];
        static final a[] g = new a[0];

        /* renamed from: b  reason: collision with root package name */
        final AtomicReference<b<T>> f12975b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReference<a<T>[]> f12976c = new AtomicReference<>(f12974f);

        /* renamed from: d  reason: collision with root package name */
        final AtomicBoolean f12977d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f12978e = new AtomicReference<>();

        b(AtomicReference<b<T>> atomicReference) {
            this.f12975b = atomicReference;
            this.f12977d = new AtomicBoolean();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<T> aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f12976c.get();
                if (aVarArr == g) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f12976c.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        public boolean b() {
            return this.f12976c.get() == g;
        }

        /* access modifiers changed from: package-private */
        public void c(a<T> aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f12976c.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2].equals(aVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f12974f;
                        } else {
                            a[] aVarArr3 = new a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                            aVarArr2 = aVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f12976c.compareAndSet(aVarArr, aVarArr2));
        }

        public void dispose() {
            if (((a[]) this.f12976c.getAndSet(g)) != g) {
                this.f12975b.compareAndSet(this, (Object) null);
                d.a.a0.a.c.f(this.f12978e);
            }
        }

        public void onComplete() {
            this.f12975b.compareAndSet(this, (Object) null);
            for (a aVar : (a[]) this.f12976c.getAndSet(g)) {
                aVar.f12973b.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f12975b.compareAndSet(this, (Object) null);
            a[] aVarArr = (a[]) this.f12976c.getAndSet(g);
            if (aVarArr.length != 0) {
                for (a aVar : aVarArr) {
                    aVar.f12973b.onError(th);
                }
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            for (a aVar : (a[]) this.f12976c.get()) {
                aVar.f12973b.onNext(t);
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this.f12978e, bVar);
        }
    }

    /* compiled from: ObservablePublish */
    static final class c<T> implements q<T> {

        /* renamed from: b  reason: collision with root package name */
        private final AtomicReference<b<T>> f12979b;

        c(AtomicReference<b<T>> atomicReference) {
            this.f12979b = atomicReference;
        }

        public void subscribe(s<? super T> sVar) {
            a aVar = new a(sVar);
            sVar.onSubscribe(aVar);
            while (true) {
                b bVar = this.f12979b.get();
                if (bVar == null || bVar.b()) {
                    b bVar2 = new b(this.f12979b);
                    if (!this.f12979b.compareAndSet(bVar, bVar2)) {
                        continue;
                    } else {
                        bVar = bVar2;
                    }
                }
                if (bVar.a(aVar)) {
                    aVar.a(bVar);
                    return;
                }
            }
        }
    }

    private f2(q<T> qVar, q<T> qVar2, AtomicReference<b<T>> atomicReference) {
        this.f12972d = qVar;
        this.f12970b = qVar2;
        this.f12971c = atomicReference;
    }

    public static <T> d.a.b0.a<T> g(q<T> qVar) {
        AtomicReference atomicReference = new AtomicReference();
        return d.a.d0.a.p(new f2(new c(atomicReference), qVar, atomicReference));
    }

    public q<T> c() {
        return this.f12970b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(d.a.z.f<? super d.a.y.b> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<d.a.a0.e.d.f2$b<T>> r0 = r4.f12971c
            java.lang.Object r0 = r0.get()
            d.a.a0.e.d.f2$b r0 = (d.a.a0.e.d.f2.b) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0021
        L_0x0010:
            d.a.a0.e.d.f2$b r1 = new d.a.a0.e.d.f2$b
            java.util.concurrent.atomic.AtomicReference<d.a.a0.e.d.f2$b<T>> r2 = r4.f12971c
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<d.a.a0.e.d.f2$b<T>> r2 = r4.f12971c
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x0000
        L_0x0020:
            r0 = r1
        L_0x0021:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f12977d
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0034
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f12977d
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            r5.a(r0)     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003f
            d.a.q<T> r5 = r4.f12970b
            r5.subscribe(r0)
        L_0x003f:
            return
        L_0x0040:
            r5 = move-exception
            io.reactivex.exceptions.a.b(r5)
            java.lang.RuntimeException r5 = d.a.a0.j.j.d(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.f2.d(d.a.z.f):void");
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f12972d.subscribe(sVar);
    }
}
