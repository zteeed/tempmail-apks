package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.c.e;
import d.a.a0.c.f;
import d.a.a0.j.j;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMap */
public final class v0<T, U> extends a<T, U> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends q<? extends U>> f13591c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f13592d;

    /* renamed from: e  reason: collision with root package name */
    final int f13593e;

    /* renamed from: f  reason: collision with root package name */
    final int f13594f;

    /* compiled from: ObservableFlatMap */
    static final class a<T, U> extends AtomicReference<d.a.y.b> implements s<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: b  reason: collision with root package name */
        final long f13595b;

        /* renamed from: c  reason: collision with root package name */
        final b<T, U> f13596c;

        /* renamed from: d  reason: collision with root package name */
        volatile boolean f13597d;

        /* renamed from: e  reason: collision with root package name */
        volatile f<U> f13598e;

        /* renamed from: f  reason: collision with root package name */
        int f13599f;

        a(b<T, U> bVar, long j) {
            this.f13595b = j;
            this.f13596c = bVar;
        }

        public void a() {
            c.f(this);
        }

        public void onComplete() {
            this.f13597d = true;
            this.f13596c.d();
        }

        public void onError(Throwable th) {
            if (this.f13596c.i.a(th)) {
                b<T, U> bVar = this.f13596c;
                if (!bVar.f13602d) {
                    bVar.c();
                }
                this.f13597d = true;
                this.f13596c.d();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(U u) {
            if (this.f13599f == 0) {
                this.f13596c.h(u, this);
            } else {
                this.f13596c.d();
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.n(this, bVar) && (bVar instanceof d.a.a0.c.b)) {
                d.a.a0.c.b bVar2 = (d.a.a0.c.b) bVar;
                int g = bVar2.g(7);
                if (g == 1) {
                    this.f13599f = g;
                    this.f13598e = bVar2;
                    this.f13597d = true;
                    this.f13596c.d();
                } else if (g == 2) {
                    this.f13599f = g;
                    this.f13598e = bVar2;
                }
            }
        }
    }

    /* compiled from: ObservableFlatMap */
    static final class b<T, U> extends AtomicInteger implements d.a.y.b, s<T> {
        static final a<?, ?>[] r = new a[0];
        static final a<?, ?>[] s = new a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super U> f13600b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends q<? extends U>> f13601c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f13602d;

        /* renamed from: e  reason: collision with root package name */
        final int f13603e;

        /* renamed from: f  reason: collision with root package name */
        final int f13604f;
        volatile e<U> g;
        volatile boolean h;
        final d.a.a0.j.c i = new d.a.a0.j.c();
        volatile boolean j;
        final AtomicReference<a<?, ?>[]> k;
        d.a.y.b l;
        long m;
        long n;
        int o;
        Queue<q<? extends U>> p;
        int q;

        b(s<? super U> sVar, n<? super T, ? extends q<? extends U>> nVar, boolean z, int i2, int i3) {
            this.f13600b = sVar;
            this.f13601c = nVar;
            this.f13602d = z;
            this.f13603e = i2;
            this.f13604f = i3;
            if (i2 != Integer.MAX_VALUE) {
                this.p = new ArrayDeque(i2);
            }
            this.k = new AtomicReference<>(r);
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.k.get();
                if (aVarArr == s) {
                    aVar.a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.k.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            if (this.j) {
                return true;
            }
            Throwable th = (Throwable) this.i.get();
            if (this.f13602d || th == null) {
                return false;
            }
            c();
            Throwable b2 = this.i.b();
            if (b2 != j.f13880a) {
                this.f13600b.onError(b2);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            a<?, ?>[] aVarArr;
            this.l.dispose();
            a<?, ?>[] aVarArr2 = (a[]) this.k.get();
            a<?, ?>[] aVarArr3 = s;
            if (aVarArr2 == aVarArr3 || (aVarArr = (a[]) this.k.getAndSet(aVarArr3)) == s) {
                return false;
            }
            for (a<?, ?> a2 : aVarArr) {
                a2.a();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (getAndIncrement() == 0) {
                e();
            }
        }

        public void dispose() {
            Throwable b2;
            if (!this.j) {
                this.j = true;
                if (c() && (b2 = this.i.b()) != null && b2 != j.f13880a) {
                    d.a.d0.a.s(b2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            int i2;
            int i3;
            s<? super U> sVar = this.f13600b;
            int i4 = 1;
            while (!b()) {
                e<U> eVar = this.g;
                if (eVar != null) {
                    while (!b()) {
                        U poll = eVar.poll();
                        if (poll != null) {
                            sVar.onNext(poll);
                        }
                    }
                    return;
                }
                boolean z = this.h;
                e<U> eVar2 = this.g;
                a[] aVarArr = (a[]) this.k.get();
                int length = aVarArr.length;
                int i5 = 0;
                if (this.f13603e != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i2 = this.p.size();
                    }
                } else {
                    i2 = 0;
                }
                if (!z || !((eVar2 == null || eVar2.isEmpty()) && length == 0 && i2 == 0)) {
                    if (length != 0) {
                        long j2 = this.n;
                        int i6 = this.o;
                        if (length <= i6 || aVarArr[i6].f13595b != j2) {
                            if (length <= i6) {
                                i6 = 0;
                            }
                            for (int i7 = 0; i7 < length && aVarArr[i6].f13595b != j2; i7++) {
                                i6++;
                                if (i6 == length) {
                                    i6 = 0;
                                }
                            }
                            this.o = i6;
                            this.n = aVarArr[i6].f13595b;
                        }
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < length) {
                            if (!b()) {
                                a aVar = aVarArr[i6];
                                f<U> fVar = aVar.f13598e;
                                if (fVar != null) {
                                    while (true) {
                                        try {
                                            U poll2 = fVar.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            sVar.onNext(poll2);
                                            if (b()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            io.reactivex.exceptions.a.b(th);
                                            aVar.a();
                                            this.i.a(th);
                                            if (!b()) {
                                                f(aVar);
                                                i9++;
                                                i3 = i6 + 1;
                                                if (i3 != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = aVar.f13597d;
                                f<U> fVar2 = aVar.f13598e;
                                if (z2 && (fVar2 == null || fVar2.isEmpty())) {
                                    f(aVar);
                                    if (!b()) {
                                        i9++;
                                    } else {
                                        return;
                                    }
                                }
                                i3 = i6 + 1;
                                if (i3 != length) {
                                    i8++;
                                }
                                i3 = 0;
                                i8++;
                            } else {
                                return;
                            }
                        }
                        this.o = i6;
                        this.n = aVarArr[i6].f13595b;
                        i5 = i9;
                    }
                    if (i5 == 0) {
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else if (this.f13603e != Integer.MAX_VALUE) {
                        while (true) {
                            int i10 = i5 - 1;
                            if (i5 == 0) {
                                continue;
                                break;
                            }
                            synchronized (this) {
                                q poll3 = this.p.poll();
                                if (poll3 == null) {
                                    this.q--;
                                } else {
                                    g(poll3);
                                }
                            }
                            i5 = i10;
                        }
                        while (true) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Throwable b2 = this.i.b();
                    if (b2 == j.f13880a) {
                        return;
                    }
                    if (b2 == null) {
                        sVar.onComplete();
                        return;
                    } else {
                        sVar.onError(b2);
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void f(a<T, U> aVar) {
            a<T, U>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = (a[]) this.k.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i2 = -1;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        } else if (aVarArr[i3] == aVar) {
                            i2 = i3;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i2 >= 0) {
                        if (length == 1) {
                            aVarArr2 = r;
                        } else {
                            a<?, ?>[] aVarArr3 = new a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr3, 0, i2);
                            System.arraycopy(aVarArr, i2 + 1, aVarArr3, i2, (length - i2) - 1);
                            aVarArr2 = aVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.k.compareAndSet(aVarArr, aVarArr2));
        }

        /* access modifiers changed from: package-private */
        public void g(q<? extends U> qVar) {
            q<? extends U> poll;
            while (qVar instanceof Callable) {
                if (i((Callable) qVar) && this.f13603e != Integer.MAX_VALUE) {
                    boolean z = false;
                    synchronized (this) {
                        poll = this.p.poll();
                        if (poll == null) {
                            this.q--;
                            z = true;
                        }
                    }
                    if (z) {
                        d();
                        return;
                    }
                    qVar = poll;
                } else {
                    return;
                }
            }
            long j2 = this.m;
            this.m = 1 + j2;
            a aVar = new a(this, j2);
            if (a(aVar)) {
                qVar.subscribe(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void h(U u, a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                f fVar = aVar.f13598e;
                if (fVar == null) {
                    fVar = new d.a.a0.f.c(this.f13604f);
                    aVar.f13598e = fVar;
                }
                fVar.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.f13600b.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            e();
        }

        /* access modifiers changed from: package-private */
        public boolean i(Callable<? extends U> callable) {
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    e<U> eVar = this.g;
                    if (eVar == null) {
                        if (this.f13603e == Integer.MAX_VALUE) {
                            eVar = new d.a.a0.f.c<>(this.f13604f);
                        } else {
                            eVar = new d.a.a0.f.b<>(this.f13603e);
                        }
                        this.g = eVar;
                    }
                    if (!eVar.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.f13600b.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                e();
                return true;
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.i.a(th);
                d();
                return true;
            }
        }

        public void onComplete() {
            if (!this.h) {
                this.h = true;
                d();
            }
        }

        public void onError(Throwable th) {
            if (this.h) {
                d.a.d0.a.s(th);
            } else if (this.i.a(th)) {
                this.h = true;
                d();
            } else {
                d.a.d0.a.s(th);
            }
        }

        public void onNext(T t) {
            if (!this.h) {
                try {
                    Object apply = this.f13601c.apply(t);
                    d.a.a0.b.b.e(apply, "The mapper returned a null ObservableSource");
                    q qVar = (q) apply;
                    if (this.f13603e != Integer.MAX_VALUE) {
                        synchronized (this) {
                            if (this.q == this.f13603e) {
                                this.p.offer(qVar);
                                return;
                            }
                            this.q++;
                        }
                    }
                    g(qVar);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.l.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.l, bVar)) {
                this.l = bVar;
                this.f13600b.onSubscribe(this);
            }
        }
    }

    public v0(q<T> qVar, n<? super T, ? extends q<? extends U>> nVar, boolean z, int i, int i2) {
        super(qVar);
        this.f13591c = nVar;
        this.f13592d = z;
        this.f13593e = i;
        this.f13594f = i2;
    }

    public void subscribeActual(s<? super U> sVar) {
        if (!y2.b(this.f12780b, sVar, this.f13591c)) {
            this.f12780b.subscribe(new b(sVar, this.f13591c, this.f13592d, this.f13593e, this.f13594f));
        }
    }
}
