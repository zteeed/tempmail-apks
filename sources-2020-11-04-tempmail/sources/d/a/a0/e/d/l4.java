package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.a0.j.k;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: ObservableWithLatestFromMany */
public final class l4<T, R> extends a<T, R> {

    /* renamed from: c  reason: collision with root package name */
    final q<?>[] f13771c;

    /* renamed from: d  reason: collision with root package name */
    final Iterable<? extends q<?>> f13772d;

    /* renamed from: e  reason: collision with root package name */
    final n<? super Object[], R> f13773e;

    /* compiled from: ObservableWithLatestFromMany */
    final class a implements n<T, R> {
        a() {
        }

        public R apply(T t) throws Exception {
            R apply = l4.this.f13773e.apply(new Object[]{t});
            d.a.a0.b.b.e(apply, "The combiner returned a null value");
            return apply;
        }
    }

    /* compiled from: ObservableWithLatestFromMany */
    static final class b<T, R> extends AtomicInteger implements s<T>, d.a.y.b {
        private static final long serialVersionUID = 1577321883966341961L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f13775b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super Object[], R> f13776c;

        /* renamed from: d  reason: collision with root package name */
        final c[] f13777d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceArray<Object> f13778e;

        /* renamed from: f  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f13779f;
        final d.a.a0.j.c g;
        volatile boolean h;

        b(s<? super R> sVar, n<? super Object[], R> nVar, int i) {
            this.f13775b = sVar;
            this.f13776c = nVar;
            c[] cVarArr = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new c(this, i2);
            }
            this.f13777d = cVarArr;
            this.f13778e = new AtomicReferenceArray<>(i);
            this.f13779f = new AtomicReference<>();
            this.g = new d.a.a0.j.c();
        }

        /* access modifiers changed from: package-private */
        public void a(int i) {
            c[] cVarArr = this.f13777d;
            for (int i2 = 0; i2 < cVarArr.length; i2++) {
                if (i2 != i) {
                    cVarArr[i2].a();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i, boolean z) {
            if (!z) {
                this.h = true;
                a(i);
                k.a(this.f13775b, this, this.g);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(int i, Throwable th) {
            this.h = true;
            d.a.a0.a.c.f(this.f13779f);
            a(i);
            k.c(this.f13775b, th, this, this.g);
        }

        /* access modifiers changed from: package-private */
        public void d(int i, Object obj) {
            this.f13778e.set(i, obj);
        }

        public void dispose() {
            d.a.a0.a.c.f(this.f13779f);
            for (c a2 : this.f13777d) {
                a2.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void e(q<?>[] qVarArr, int i) {
            c[] cVarArr = this.f13777d;
            AtomicReference<d.a.y.b> atomicReference = this.f13779f;
            for (int i2 = 0; i2 < i && !d.a.a0.a.c.g(atomicReference.get()) && !this.h; i2++) {
                qVarArr[i2].subscribe(cVarArr[i2]);
            }
        }

        public void onComplete() {
            if (!this.h) {
                this.h = true;
                a(-1);
                k.a(this.f13775b, this, this.g);
            }
        }

        public void onError(Throwable th) {
            if (this.h) {
                d.a.d0.a.s(th);
                return;
            }
            this.h = true;
            a(-1);
            k.c(this.f13775b, th, this, this.g);
        }

        public void onNext(T t) {
            if (!this.h) {
                AtomicReferenceArray<Object> atomicReferenceArray = this.f13778e;
                int length = atomicReferenceArray.length();
                Object[] objArr = new Object[(length + 1)];
                int i = 0;
                objArr[0] = t;
                while (i < length) {
                    Object obj = atomicReferenceArray.get(i);
                    if (obj != null) {
                        i++;
                        objArr[i] = obj;
                    } else {
                        return;
                    }
                }
                try {
                    R apply = this.f13776c.apply(objArr);
                    d.a.a0.b.b.e(apply, "combiner returned a null value");
                    k.e(this.f13775b, apply, this, this.g);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this.f13779f, bVar);
        }
    }

    /* compiled from: ObservableWithLatestFromMany */
    static final class c extends AtomicReference<d.a.y.b> implements s<Object> {
        private static final long serialVersionUID = 3256684027868224024L;

        /* renamed from: b  reason: collision with root package name */
        final b<?, ?> f13780b;

        /* renamed from: c  reason: collision with root package name */
        final int f13781c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13782d;

        c(b<?, ?> bVar, int i) {
            this.f13780b = bVar;
            this.f13781c = i;
        }

        public void a() {
            d.a.a0.a.c.f(this);
        }

        public void onComplete() {
            this.f13780b.b(this.f13781c, this.f13782d);
        }

        public void onError(Throwable th) {
            this.f13780b.c(this.f13781c, th);
        }

        public void onNext(Object obj) {
            if (!this.f13782d) {
                this.f13782d = true;
            }
            this.f13780b.d(this.f13781c, obj);
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this, bVar);
        }
    }

    public l4(q<T> qVar, q<?>[] qVarArr, n<? super Object[], R> nVar) {
        super(qVar);
        this.f13771c = qVarArr;
        this.f13772d = null;
        this.f13773e = nVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super R> sVar) {
        int i;
        q<?>[] qVarArr = this.f13771c;
        if (qVarArr == null) {
            qVarArr = new q[8];
            try {
                i = 0;
                for (q<?> qVar : this.f13772d) {
                    if (i == qVarArr.length) {
                        qVarArr = (q[]) Arrays.copyOf(qVarArr, (i >> 1) + i);
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
            new v1(this.f13338b, new a()).subscribeActual(sVar);
            return;
        }
        b bVar = new b(sVar, this.f13773e, i);
        sVar.onSubscribe(bVar);
        bVar.e(qVarArr, i);
        this.f13338b.subscribe(bVar);
    }

    public l4(q<T> qVar, Iterable<? extends q<?>> iterable, n<? super Object[], R> nVar) {
        super(qVar);
        this.f13771c = null;
        this.f13772d = iterable;
        this.f13773e = nVar;
    }
}
