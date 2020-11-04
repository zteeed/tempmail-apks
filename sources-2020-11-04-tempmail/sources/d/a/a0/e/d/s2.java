package d.a.a0.e.d;

import d.a.q;
import d.a.s;
import d.a.t;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableReplay */
public final class s2<T> extends d.a.b0.a<T> implements Object<T> {

    /* renamed from: f  reason: collision with root package name */
    static final b f14039f = new o();

    /* renamed from: b  reason: collision with root package name */
    final q<T> f14040b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<j<T>> f14041c;

    /* renamed from: d  reason: collision with root package name */
    final b<T> f14042d;

    /* renamed from: e  reason: collision with root package name */
    final q<T> f14043e;

    /* compiled from: ObservableReplay */
    static abstract class a<T> extends AtomicReference<f> implements h<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* renamed from: b  reason: collision with root package name */
        f f14044b;

        /* renamed from: c  reason: collision with root package name */
        int f14045c;

        a() {
            f fVar = new f((Object) null);
            this.f14044b = fVar;
            set(fVar);
        }

        /* access modifiers changed from: package-private */
        public final void a(f fVar) {
            this.f14044b.set(fVar);
            this.f14044b = fVar;
            this.f14045c++;
        }

        /* access modifiers changed from: package-private */
        public Object b(Object obj) {
            return obj;
        }

        public final void c(d<T> dVar) {
            if (dVar.getAndIncrement() == 0) {
                int i = 1;
                do {
                    f fVar = (f) dVar.a();
                    if (fVar == null) {
                        fVar = d();
                        dVar.f14049d = fVar;
                    }
                    while (!dVar.b()) {
                        f fVar2 = (f) fVar.get();
                        if (fVar2 == null) {
                            dVar.f14049d = fVar;
                            i = dVar.addAndGet(-i);
                        } else if (d.a.a0.j.m.f(e(fVar2.f14053b), dVar.f14048c)) {
                            dVar.f14049d = null;
                            return;
                        } else {
                            fVar = fVar2;
                        }
                    }
                    dVar.f14049d = null;
                    return;
                } while (i != 0);
            }
        }

        /* access modifiers changed from: package-private */
        public f d() {
            return (f) get();
        }

        /* access modifiers changed from: package-private */
        public Object e(Object obj) {
            return obj;
        }

        /* access modifiers changed from: package-private */
        public final void f() {
            this.f14045c--;
            g((f) ((f) get()).get());
        }

        /* access modifiers changed from: package-private */
        public final void g(f fVar) {
            set(fVar);
        }

        /* access modifiers changed from: package-private */
        public final void h() {
            f fVar = (f) get();
            if (fVar.f14053b != null) {
                f fVar2 = new f((Object) null);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        public final void i() {
            a(new f(b(d.a.a0.j.m.h())));
            m();
        }

        public final void j(T t) {
            d.a.a0.j.m.r(t);
            a(new f(b(t)));
            k();
        }

        /* access modifiers changed from: package-private */
        public abstract void k();

        public final void l(Throwable th) {
            a(new f(b(d.a.a0.j.m.m(th))));
            m();
        }

        /* access modifiers changed from: package-private */
        public void m() {
            h();
        }
    }

    /* compiled from: ObservableReplay */
    interface b<T> {
        h<T> call();
    }

    /* compiled from: ObservableReplay */
    static final class c<R> implements d.a.z.f<d.a.y.b> {

        /* renamed from: b  reason: collision with root package name */
        private final o4<R> f14046b;

        c(o4<R> o4Var) {
            this.f14046b = o4Var;
        }

        /* renamed from: b */
        public void a(d.a.y.b bVar) {
            this.f14046b.a(bVar);
        }
    }

    /* compiled from: ObservableReplay */
    static final class d<T> extends AtomicInteger implements d.a.y.b {
        private static final long serialVersionUID = 2728361546769921047L;

        /* renamed from: b  reason: collision with root package name */
        final j<T> f14047b;

        /* renamed from: c  reason: collision with root package name */
        final s<? super T> f14048c;

        /* renamed from: d  reason: collision with root package name */
        Object f14049d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f14050e;

        d(j<T> jVar, s<? super T> sVar) {
            this.f14047b = jVar;
            this.f14048c = sVar;
        }

        /* access modifiers changed from: package-private */
        public <U> U a() {
            return this.f14049d;
        }

        public boolean b() {
            return this.f14050e;
        }

        public void dispose() {
            if (!this.f14050e) {
                this.f14050e = true;
                this.f14047b.c(this);
                this.f14049d = null;
            }
        }
    }

    /* compiled from: ObservableReplay */
    static final class e<R, U> extends d.a.l<R> {

        /* renamed from: b  reason: collision with root package name */
        private final Callable<? extends d.a.b0.a<U>> f14051b;

        /* renamed from: c  reason: collision with root package name */
        private final d.a.z.n<? super d.a.l<U>, ? extends q<R>> f14052c;

        e(Callable<? extends d.a.b0.a<U>> callable, d.a.z.n<? super d.a.l<U>, ? extends q<R>> nVar) {
            this.f14051b = callable;
            this.f14052c = nVar;
        }

        /* access modifiers changed from: protected */
        public void subscribeActual(s<? super R> sVar) {
            try {
                Object call = this.f14051b.call();
                d.a.a0.b.b.e(call, "The connectableFactory returned a null ConnectableObservable");
                d.a.b0.a aVar = (d.a.b0.a) call;
                Object apply = this.f14052c.apply(aVar);
                d.a.a0.b.b.e(apply, "The selector returned a null ObservableSource");
                q qVar = (q) apply;
                o4 o4Var = new o4(sVar);
                qVar.subscribe(o4Var);
                aVar.d(new c(o4Var));
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                d.a.a0.a.d.m(th, sVar);
            }
        }
    }

    /* compiled from: ObservableReplay */
    static final class f extends AtomicReference<f> {
        private static final long serialVersionUID = 245354315435971818L;

        /* renamed from: b  reason: collision with root package name */
        final Object f14053b;

        f(Object obj) {
            this.f14053b = obj;
        }
    }

    /* compiled from: ObservableReplay */
    static final class g<T> extends d.a.b0.a<T> {

        /* renamed from: b  reason: collision with root package name */
        private final d.a.b0.a<T> f14054b;

        /* renamed from: c  reason: collision with root package name */
        private final d.a.l<T> f14055c;

        g(d.a.b0.a<T> aVar, d.a.l<T> lVar) {
            this.f14054b = aVar;
            this.f14055c = lVar;
        }

        public void d(d.a.z.f<? super d.a.y.b> fVar) {
            this.f14054b.d(fVar);
        }

        /* access modifiers changed from: protected */
        public void subscribeActual(s<? super T> sVar) {
            this.f14055c.subscribe(sVar);
        }
    }

    /* compiled from: ObservableReplay */
    interface h<T> {
        void c(d<T> dVar);

        void i();

        void j(T t);

        void l(Throwable th);
    }

    /* compiled from: ObservableReplay */
    static final class i<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f14056a;

        i(int i) {
            this.f14056a = i;
        }

        public h<T> call() {
            return new n(this.f14056a);
        }
    }

    /* compiled from: ObservableReplay */
    static final class j<T> extends AtomicReference<d.a.y.b> implements s<T>, d.a.y.b {

        /* renamed from: f  reason: collision with root package name */
        static final d[] f14057f = new d[0];
        static final d[] g = new d[0];
        private static final long serialVersionUID = -533785617179540163L;

        /* renamed from: b  reason: collision with root package name */
        final h<T> f14058b;

        /* renamed from: c  reason: collision with root package name */
        boolean f14059c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReference<d[]> f14060d = new AtomicReference<>(f14057f);

        /* renamed from: e  reason: collision with root package name */
        final AtomicBoolean f14061e = new AtomicBoolean();

        j(h<T> hVar) {
            this.f14058b = hVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(d<T> dVar) {
            d[] dVarArr;
            d[] dVarArr2;
            do {
                dVarArr = this.f14060d.get();
                if (dVarArr == g) {
                    return false;
                }
                int length = dVarArr.length;
                dVarArr2 = new d[(length + 1)];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                dVarArr2[length] = dVar;
            } while (!this.f14060d.compareAndSet(dVarArr, dVarArr2));
            return true;
        }

        public boolean b() {
            return this.f14060d.get() == g;
        }

        /* access modifiers changed from: package-private */
        public void c(d<T> dVar) {
            d[] dVarArr;
            d[] dVarArr2;
            do {
                dVarArr = this.f14060d.get();
                int length = dVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (dVarArr[i2].equals(dVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            dVarArr2 = f14057f;
                        } else {
                            d[] dVarArr3 = new d[(length - 1)];
                            System.arraycopy(dVarArr, 0, dVarArr3, 0, i);
                            System.arraycopy(dVarArr, i + 1, dVarArr3, i, (length - i) - 1);
                            dVarArr2 = dVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f14060d.compareAndSet(dVarArr, dVarArr2));
        }

        /* access modifiers changed from: package-private */
        public void d() {
            for (d c2 : this.f14060d.get()) {
                this.f14058b.c(c2);
            }
        }

        public void dispose() {
            this.f14060d.set(g);
            d.a.a0.a.c.f(this);
        }

        /* access modifiers changed from: package-private */
        public void e() {
            for (d c2 : this.f14060d.getAndSet(g)) {
                this.f14058b.c(c2);
            }
        }

        public void onComplete() {
            if (!this.f14059c) {
                this.f14059c = true;
                this.f14058b.i();
                e();
            }
        }

        public void onError(Throwable th) {
            if (!this.f14059c) {
                this.f14059c = true;
                this.f14058b.l(th);
                e();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            if (!this.f14059c) {
                this.f14058b.j(t);
                d();
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.n(this, bVar)) {
                d();
            }
        }
    }

    /* compiled from: ObservableReplay */
    static final class k<T> implements q<T> {

        /* renamed from: b  reason: collision with root package name */
        private final AtomicReference<j<T>> f14062b;

        /* renamed from: c  reason: collision with root package name */
        private final b<T> f14063c;

        k(AtomicReference<j<T>> atomicReference, b<T> bVar) {
            this.f14062b = atomicReference;
            this.f14063c = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void subscribe(d.a.s<? super T> r4) {
            /*
                r3 = this;
            L_0x0000:
                java.util.concurrent.atomic.AtomicReference<d.a.a0.e.d.s2$j<T>> r0 = r3.f14062b
                java.lang.Object r0 = r0.get()
                d.a.a0.e.d.s2$j r0 = (d.a.a0.e.d.s2.j) r0
                if (r0 != 0) goto L_0x0020
                d.a.a0.e.d.s2$b<T> r0 = r3.f14063c
                d.a.a0.e.d.s2$h r0 = r0.call()
                d.a.a0.e.d.s2$j r1 = new d.a.a0.e.d.s2$j
                r1.<init>(r0)
                java.util.concurrent.atomic.AtomicReference<d.a.a0.e.d.s2$j<T>> r0 = r3.f14062b
                r2 = 0
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 != 0) goto L_0x001f
                goto L_0x0000
            L_0x001f:
                r0 = r1
            L_0x0020:
                d.a.a0.e.d.s2$d r1 = new d.a.a0.e.d.s2$d
                r1.<init>(r0, r4)
                r4.onSubscribe(r1)
                r0.a(r1)
                boolean r4 = r1.b()
                if (r4 == 0) goto L_0x0035
                r0.c(r1)
                return
            L_0x0035:
                d.a.a0.e.d.s2$h<T> r4 = r0.f14058b
                r4.c(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.s2.k.subscribe(d.a.s):void");
        }
    }

    /* compiled from: ObservableReplay */
    static final class l<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f14064a;

        /* renamed from: b  reason: collision with root package name */
        private final long f14065b;

        /* renamed from: c  reason: collision with root package name */
        private final TimeUnit f14066c;

        /* renamed from: d  reason: collision with root package name */
        private final t f14067d;

        l(int i, long j, TimeUnit timeUnit, t tVar) {
            this.f14064a = i;
            this.f14065b = j;
            this.f14066c = timeUnit;
            this.f14067d = tVar;
        }

        public h<T> call() {
            return new m(this.f14064a, this.f14065b, this.f14066c, this.f14067d);
        }
    }

    /* compiled from: ObservableReplay */
    static final class m<T> extends a<T> {
        private static final long serialVersionUID = 3457957419649567404L;

        /* renamed from: d  reason: collision with root package name */
        final t f14068d;

        /* renamed from: e  reason: collision with root package name */
        final long f14069e;

        /* renamed from: f  reason: collision with root package name */
        final TimeUnit f14070f;
        final int g;

        m(int i, long j, TimeUnit timeUnit, t tVar) {
            this.f14068d = tVar;
            this.g = i;
            this.f14069e = j;
            this.f14070f = timeUnit;
        }

        /* access modifiers changed from: package-private */
        public Object b(Object obj) {
            return new d.a.e0.b(obj, this.f14068d.b(this.f14070f), this.f14070f);
        }

        /* access modifiers changed from: package-private */
        public f d() {
            f fVar;
            long b2 = this.f14068d.b(this.f14070f) - this.f14069e;
            f fVar2 = (f) get();
            Object obj = fVar2.get();
            while (true) {
                f fVar3 = (f) obj;
                fVar = fVar2;
                fVar2 = fVar3;
                if (fVar2 != null) {
                    d.a.e0.b bVar = (d.a.e0.b) fVar2.f14053b;
                    if (d.a.a0.j.m.p(bVar.b()) || d.a.a0.j.m.q(bVar.b()) || bVar.a() > b2) {
                        break;
                    }
                    obj = fVar2.get();
                } else {
                    break;
                }
            }
            return fVar;
        }

        /* access modifiers changed from: package-private */
        public Object e(Object obj) {
            return ((d.a.e0.b) obj).b();
        }

        /* access modifiers changed from: package-private */
        public void k() {
            f fVar;
            long b2 = this.f14068d.b(this.f14070f) - this.f14069e;
            f fVar2 = (f) get();
            f fVar3 = (f) fVar2.get();
            int i = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                int i2 = this.f14045c;
                if (i2 <= this.g || i2 <= 1) {
                    if (((d.a.e0.b) fVar2.f14053b).a() > b2) {
                        break;
                    }
                    i++;
                    this.f14045c--;
                    fVar3 = (f) fVar2.get();
                } else {
                    i++;
                    this.f14045c = i2 - 1;
                    fVar3 = (f) fVar2.get();
                }
            }
            if (i != 0) {
                g(fVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m() {
            /*
                r10 = this;
                d.a.t r0 = r10.f14068d
                java.util.concurrent.TimeUnit r1 = r10.f14070f
                long r0 = r0.b(r1)
                long r2 = r10.f14069e
                long r0 = r0 - r2
                java.lang.Object r2 = r10.get()
                d.a.a0.e.d.s2$f r2 = (d.a.a0.e.d.s2.f) r2
                java.lang.Object r3 = r2.get()
                d.a.a0.e.d.s2$f r3 = (d.a.a0.e.d.s2.f) r3
                r4 = 0
            L_0x0018:
                r9 = r3
                r3 = r2
                r2 = r9
                if (r2 == 0) goto L_0x003c
                int r5 = r10.f14045c
                r6 = 1
                if (r5 <= r6) goto L_0x003c
                java.lang.Object r5 = r2.f14053b
                d.a.e0.b r5 = (d.a.e0.b) r5
                long r7 = r5.a()
                int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r5 > 0) goto L_0x003c
                int r4 = r4 + 1
                int r3 = r10.f14045c
                int r3 = r3 - r6
                r10.f14045c = r3
                java.lang.Object r3 = r2.get()
                d.a.a0.e.d.s2$f r3 = (d.a.a0.e.d.s2.f) r3
                goto L_0x0018
            L_0x003c:
                if (r4 == 0) goto L_0x0041
                r10.g(r3)
            L_0x0041:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.s2.m.m():void");
        }
    }

    /* compiled from: ObservableReplay */
    static final class n<T> extends a<T> {
        private static final long serialVersionUID = -5898283885385201806L;

        /* renamed from: d  reason: collision with root package name */
        final int f14071d;

        n(int i) {
            this.f14071d = i;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            if (this.f14045c > this.f14071d) {
                f();
            }
        }
    }

    /* compiled from: ObservableReplay */
    static final class o implements b<Object> {
        o() {
        }

        public h<Object> call() {
            return new p(16);
        }
    }

    /* compiled from: ObservableReplay */
    static final class p<T> extends ArrayList<Object> implements h<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* renamed from: b  reason: collision with root package name */
        volatile int f14072b;

        p(int i) {
            super(i);
        }

        public void c(d<T> dVar) {
            if (dVar.getAndIncrement() == 0) {
                s<? super T> sVar = dVar.f14048c;
                int i = 1;
                while (!dVar.b()) {
                    int i2 = this.f14072b;
                    Integer num = (Integer) dVar.a();
                    int intValue = num != null ? num.intValue() : 0;
                    while (intValue < i2) {
                        if (!d.a.a0.j.m.f(get(intValue), sVar) && !dVar.b()) {
                            intValue++;
                        } else {
                            return;
                        }
                    }
                    dVar.f14049d = Integer.valueOf(intValue);
                    i = dVar.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        public void i() {
            add(d.a.a0.j.m.h());
            this.f14072b++;
        }

        public void j(T t) {
            d.a.a0.j.m.r(t);
            add(t);
            this.f14072b++;
        }

        public void l(Throwable th) {
            add(d.a.a0.j.m.m(th));
            this.f14072b++;
        }
    }

    private s2(q<T> qVar, q<T> qVar2, AtomicReference<j<T>> atomicReference, b<T> bVar) {
        this.f14043e = qVar;
        this.f14040b = qVar2;
        this.f14041c = atomicReference;
        this.f14042d = bVar;
    }

    public static <T> d.a.b0.a<T> g(q<T> qVar, int i2) {
        if (i2 == Integer.MAX_VALUE) {
            return k(qVar);
        }
        return j(qVar, new i(i2));
    }

    public static <T> d.a.b0.a<T> h(q<T> qVar, long j2, TimeUnit timeUnit, t tVar) {
        return i(qVar, j2, timeUnit, tVar, Integer.MAX_VALUE);
    }

    public static <T> d.a.b0.a<T> i(q<T> qVar, long j2, TimeUnit timeUnit, t tVar, int i2) {
        return j(qVar, new l(i2, j2, timeUnit, tVar));
    }

    static <T> d.a.b0.a<T> j(q<T> qVar, b<T> bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return d.a.d0.a.p(new s2(new k(atomicReference, bVar), qVar, atomicReference, bVar));
    }

    public static <T> d.a.b0.a<T> k(q<? extends T> qVar) {
        return j(qVar, f14039f);
    }

    public static <U, R> d.a.l<R> l(Callable<? extends d.a.b0.a<U>> callable, d.a.z.n<? super d.a.l<U>, ? extends q<R>> nVar) {
        return d.a.d0.a.n(new e(callable, nVar));
    }

    public static <T> d.a.b0.a<T> m(d.a.b0.a<T> aVar, t tVar) {
        return d.a.d0.a.p(new g(aVar, aVar.observeOn(tVar)));
    }

    public void b(d.a.y.b bVar) {
        this.f14041c.compareAndSet((j) bVar, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(d.a.z.f<? super d.a.y.b> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<d.a.a0.e.d.s2$j<T>> r0 = r4.f14041c
            java.lang.Object r0 = r0.get()
            d.a.a0.e.d.s2$j r0 = (d.a.a0.e.d.s2.j) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0025
        L_0x0010:
            d.a.a0.e.d.s2$b<T> r1 = r4.f14042d
            d.a.a0.e.d.s2$h r1 = r1.call()
            d.a.a0.e.d.s2$j r2 = new d.a.a0.e.d.s2$j
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<d.a.a0.e.d.s2$j<T>> r1 = r4.f14041c
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 != 0) goto L_0x0024
            goto L_0x0000
        L_0x0024:
            r0 = r2
        L_0x0025:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f14061e
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0039
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f14061e
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0039
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            r5.a(r0)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0044
            d.a.q<T> r5 = r4.f14040b
            r5.subscribe(r0)
        L_0x0044:
            return
        L_0x0045:
            r5 = move-exception
            if (r1 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f14061e
            r0.compareAndSet(r2, r3)
        L_0x004d:
            io.reactivex.exceptions.a.b(r5)
            java.lang.RuntimeException r5 = d.a.a0.j.j.d(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.s2.d(d.a.z.f):void");
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f14043e.subscribe(sVar);
    }
}
