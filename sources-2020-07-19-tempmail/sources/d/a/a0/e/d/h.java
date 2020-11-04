package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.a.d;
import d.a.l;
import d.a.q;
import d.a.s;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableAmb */
public final class h<T> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final q<? extends T>[] f13035b;

    /* renamed from: c  reason: collision with root package name */
    final Iterable<? extends q<? extends T>> f13036c;

    /* compiled from: ObservableAmb */
    static final class a<T> implements d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13037b;

        /* renamed from: c  reason: collision with root package name */
        final b<T>[] f13038c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicInteger f13039d = new AtomicInteger();

        a(s<? super T> sVar, int i) {
            this.f13037b = sVar;
            this.f13038c = new b[i];
        }

        public void a(q<? extends T>[] qVarArr) {
            b<T>[] bVarArr = this.f13038c;
            int length = bVarArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                bVarArr[i] = new b<>(this, i2, this.f13037b);
                i = i2;
            }
            this.f13039d.lazySet(0);
            this.f13037b.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.f13039d.get() == 0; i3++) {
                qVarArr[i3].subscribe(bVarArr[i3]);
            }
        }

        public boolean b(int i) {
            int i2 = this.f13039d.get();
            int i3 = 0;
            if (i2 == 0) {
                if (!this.f13039d.compareAndSet(0, i)) {
                    return false;
                }
                b<T>[] bVarArr = this.f13038c;
                int length = bVarArr.length;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    if (i4 != i) {
                        bVarArr[i3].a();
                    }
                    i3 = i4;
                }
                return true;
            } else if (i2 == i) {
                return true;
            } else {
                return false;
            }
        }

        public void dispose() {
            if (this.f13039d.get() != -1) {
                this.f13039d.lazySet(-1);
                for (b<T> a2 : this.f13038c) {
                    a2.a();
                }
            }
        }
    }

    /* compiled from: ObservableAmb */
    static final class b<T> extends AtomicReference<d.a.y.b> implements s<T> {
        private static final long serialVersionUID = -1185974347409665484L;

        /* renamed from: b  reason: collision with root package name */
        final a<T> f13040b;

        /* renamed from: c  reason: collision with root package name */
        final int f13041c;

        /* renamed from: d  reason: collision with root package name */
        final s<? super T> f13042d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13043e;

        b(a<T> aVar, int i, s<? super T> sVar) {
            this.f13040b = aVar;
            this.f13041c = i;
            this.f13042d = sVar;
        }

        public void a() {
            c.f(this);
        }

        public void onComplete() {
            if (this.f13043e) {
                this.f13042d.onComplete();
            } else if (this.f13040b.b(this.f13041c)) {
                this.f13043e = true;
                this.f13042d.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13043e) {
                this.f13042d.onError(th);
            } else if (this.f13040b.b(this.f13041c)) {
                this.f13043e = true;
                this.f13042d.onError(th);
            } else {
                d.a.d0.a.s(th);
            }
        }

        public void onNext(T t) {
            if (this.f13043e) {
                this.f13042d.onNext(t);
            } else if (this.f13040b.b(this.f13041c)) {
                this.f13043e = true;
                this.f13042d.onNext(t);
            } else {
                ((d.a.y.b) get()).dispose();
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            c.n(this, bVar);
        }
    }

    public h(q<? extends T>[] qVarArr, Iterable<? extends q<? extends T>> iterable) {
        this.f13035b = qVarArr;
        this.f13036c = iterable;
    }

    public void subscribeActual(s<? super T> sVar) {
        int i;
        q<? extends T>[] qVarArr = this.f13035b;
        if (qVarArr == null) {
            qVarArr = new q[8];
            try {
                i = 0;
                for (q<? extends T> qVar : this.f13036c) {
                    if (qVar == null) {
                        d.m(new NullPointerException("One of the sources is null"), sVar);
                        return;
                    }
                    if (i == qVarArr.length) {
                        q<? extends T>[] qVarArr2 = new q[((i >> 2) + i)];
                        System.arraycopy(qVarArr, 0, qVarArr2, 0, i);
                        qVarArr = qVarArr2;
                    }
                    int i2 = i + 1;
                    qVarArr[i] = qVar;
                    i = i2;
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                d.m(th, sVar);
                return;
            }
        } else {
            i = qVarArr.length;
        }
        if (i == 0) {
            d.h(sVar);
        } else if (i == 1) {
            qVarArr[0].subscribe(sVar);
        } else {
            new a(sVar, i).a(qVarArr);
        }
    }
}
