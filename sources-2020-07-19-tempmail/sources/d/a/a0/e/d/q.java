package d.a.a0.e.d;

import d.a.l;
import d.a.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableCache */
public final class q<T> extends a<T, T> implements s<T> {
    static final a[] l = new a[0];
    static final a[] m = new a[0];

    /* renamed from: c  reason: collision with root package name */
    final AtomicBoolean f13401c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    final int f13402d;

    /* renamed from: e  reason: collision with root package name */
    final AtomicReference<a<T>[]> f13403e;

    /* renamed from: f  reason: collision with root package name */
    volatile long f13404f;
    final b<T> g;
    b<T> h;
    int i;
    Throwable j;
    volatile boolean k;

    /* compiled from: ObservableCache */
    static final class a<T> extends AtomicInteger implements d.a.y.b {
        private static final long serialVersionUID = 6770240836423125754L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13405b;

        /* renamed from: c  reason: collision with root package name */
        final q<T> f13406c;

        /* renamed from: d  reason: collision with root package name */
        b<T> f13407d;

        /* renamed from: e  reason: collision with root package name */
        int f13408e;

        /* renamed from: f  reason: collision with root package name */
        long f13409f;
        volatile boolean g;

        a(s<? super T> sVar, q<T> qVar) {
            this.f13405b = sVar;
            this.f13406c = qVar;
            this.f13407d = qVar.g;
        }

        public void dispose() {
            if (!this.g) {
                this.g = true;
                this.f13406c.e(this);
            }
        }
    }

    /* compiled from: ObservableCache */
    static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        final T[] f13410a;

        /* renamed from: b  reason: collision with root package name */
        volatile b<T> f13411b;

        b(int i) {
            this.f13410a = new Object[i];
        }
    }

    public q(l<T> lVar, int i2) {
        super(lVar);
        this.f13402d = i2;
        b<T> bVar = new b<>(i2);
        this.g = bVar;
        this.h = bVar;
        this.f13403e = new AtomicReference<>(l);
    }

    /* access modifiers changed from: package-private */
    public void d(a<T> aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f13403e.get();
            if (aVarArr != m) {
                int length = aVarArr.length;
                aVarArr2 = new a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } else {
                return;
            }
        } while (!this.f13403e.compareAndSet(aVarArr, aVarArr2));
    }

    /* access modifiers changed from: package-private */
    public void e(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f13403e.get();
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
                        aVarArr2 = l;
                    } else {
                        a[] aVarArr3 = new a[(length - 1)];
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
        } while (!this.f13403e.compareAndSet(aVarArr, aVarArr2));
    }

    /* access modifiers changed from: package-private */
    public void f(a<T> aVar) {
        if (aVar.getAndIncrement() == 0) {
            long j2 = aVar.f13409f;
            int i2 = aVar.f13408e;
            b<T> bVar = aVar.f13407d;
            s<? super T> sVar = aVar.f13405b;
            int i3 = this.f13402d;
            int i4 = 1;
            while (!aVar.g) {
                boolean z = this.k;
                boolean z2 = this.f13404f == j2;
                if (z && z2) {
                    aVar.f13407d = null;
                    Throwable th = this.j;
                    if (th != null) {
                        sVar.onError(th);
                        return;
                    } else {
                        sVar.onComplete();
                        return;
                    }
                } else if (!z2) {
                    if (i2 == i3) {
                        bVar = bVar.f13411b;
                        i2 = 0;
                    }
                    sVar.onNext(bVar.f13410a[i2]);
                    i2++;
                    j2++;
                } else {
                    aVar.f13409f = j2;
                    aVar.f13408e = i2;
                    aVar.f13407d = bVar;
                    i4 = aVar.addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                }
            }
            aVar.f13407d = null;
        }
    }

    public void onComplete() {
        this.k = true;
        for (a f2 : (a[]) this.f13403e.getAndSet(m)) {
            f(f2);
        }
    }

    public void onError(Throwable th) {
        this.j = th;
        this.k = true;
        for (a f2 : (a[]) this.f13403e.getAndSet(m)) {
            f(f2);
        }
    }

    public void onNext(T t) {
        int i2 = this.i;
        if (i2 == this.f13402d) {
            b<T> bVar = new b<>(i2);
            bVar.f13410a[0] = t;
            this.i = 1;
            this.h.f13411b = bVar;
            this.h = bVar;
        } else {
            this.h.f13410a[i2] = t;
            this.i = i2 + 1;
        }
        this.f13404f++;
        for (a f2 : (a[]) this.f13403e.get()) {
            f(f2);
        }
    }

    public void onSubscribe(d.a.y.b bVar) {
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        a aVar = new a(sVar, this);
        sVar.onSubscribe(aVar);
        d(aVar);
        if (this.f13401c.get() || !this.f13401c.compareAndSet(false, true)) {
            f(aVar);
        } else {
            this.f12780b.subscribe(this);
        }
    }
}
