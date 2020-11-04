package d.a.a0.e.d;

import d.a.a0.j.c;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.v;
import d.a.w;
import d.a.y.b;
import d.a.z.n;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapSingle */
public final class z0<T, R> extends a<T, R> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends w<? extends R>> f13729c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f13730d;

    /* compiled from: ObservableFlatMapSingle */
    static final class a<T, R> extends AtomicInteger implements s<T>, b {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f13731b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f13732c;

        /* renamed from: d  reason: collision with root package name */
        final d.a.y.a f13733d = new d.a.y.a();

        /* renamed from: e  reason: collision with root package name */
        final AtomicInteger f13734e = new AtomicInteger(1);

        /* renamed from: f  reason: collision with root package name */
        final c f13735f = new c();
        final n<? super T, ? extends w<? extends R>> g;
        final AtomicReference<d.a.a0.f.c<R>> h = new AtomicReference<>();
        b i;
        volatile boolean j;

        /* renamed from: d.a.a0.e.d.z0$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableFlatMapSingle */
        final class C0151a extends AtomicReference<b> implements v<R>, b {
            private static final long serialVersionUID = -502562646270949838L;

            C0151a() {
            }

            public void dispose() {
                d.a.a0.a.c.f(this);
            }

            public void onError(Throwable th) {
                a.this.e(this, th);
            }

            public void onSubscribe(b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }

            public void onSuccess(R r) {
                a.this.f(this, r);
            }
        }

        a(s<? super R> sVar, n<? super T, ? extends w<? extends R>> nVar, boolean z) {
            this.f13731b = sVar;
            this.g = nVar;
            this.f13732c = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            d.a.a0.f.c cVar = this.h.get();
            if (cVar != null) {
                cVar.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            s<? super R> sVar = this.f13731b;
            AtomicInteger atomicInteger = this.f13734e;
            AtomicReference<d.a.a0.f.c<R>> atomicReference = this.h;
            int i2 = 1;
            while (!this.j) {
                if (this.f13732c || ((Throwable) this.f13735f.get()) == null) {
                    boolean z = false;
                    boolean z2 = atomicInteger.get() == 0;
                    d.a.a0.f.c cVar = atomicReference.get();
                    Object poll = cVar != null ? cVar.poll() : null;
                    if (poll == null) {
                        z = true;
                    }
                    if (z2 && z) {
                        Throwable b2 = this.f13735f.b();
                        if (b2 != null) {
                            sVar.onError(b2);
                            return;
                        } else {
                            sVar.onComplete();
                            return;
                        }
                    } else if (z) {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        sVar.onNext(poll);
                    }
                } else {
                    Throwable b3 = this.f13735f.b();
                    a();
                    sVar.onError(b3);
                    return;
                }
            }
            a();
        }

        /* access modifiers changed from: package-private */
        public d.a.a0.f.c<R> d() {
            d.a.a0.f.c<R> cVar;
            do {
                d.a.a0.f.c<R> cVar2 = this.h.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new d.a.a0.f.c<>(l.bufferSize());
            } while (!this.h.compareAndSet((Object) null, cVar));
            return cVar;
        }

        public void dispose() {
            this.j = true;
            this.i.dispose();
            this.f13733d.dispose();
        }

        /* access modifiers changed from: package-private */
        public void e(a<T, R>.a aVar, Throwable th) {
            this.f13733d.c(aVar);
            if (this.f13735f.a(th)) {
                if (!this.f13732c) {
                    this.i.dispose();
                    this.f13733d.dispose();
                }
                this.f13734e.decrementAndGet();
                b();
                return;
            }
            d.a.d0.a.s(th);
        }

        /* access modifiers changed from: package-private */
        public void f(a<T, R>.a aVar, R r) {
            this.f13733d.c(aVar);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    this.f13731b.onNext(r);
                    if (this.f13734e.decrementAndGet() == 0) {
                        z = true;
                    }
                    d.a.a0.f.c cVar = this.h.get();
                    if (!z || (cVar != null && !cVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        c();
                    }
                    Throwable b2 = this.f13735f.b();
                    if (b2 != null) {
                        this.f13731b.onError(b2);
                        return;
                    } else {
                        this.f13731b.onComplete();
                        return;
                    }
                }
            }
            d.a.a0.f.c d2 = d();
            synchronized (d2) {
                d2.offer(r);
            }
            this.f13734e.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            c();
        }

        public void onComplete() {
            this.f13734e.decrementAndGet();
            b();
        }

        public void onError(Throwable th) {
            this.f13734e.decrementAndGet();
            if (this.f13735f.a(th)) {
                if (!this.f13732c) {
                    this.f13733d.dispose();
                }
                b();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            try {
                Object apply = this.g.apply(t);
                d.a.a0.b.b.e(apply, "The mapper returned a null SingleSource");
                w wVar = (w) apply;
                this.f13734e.getAndIncrement();
                C0151a aVar = new C0151a();
                if (!this.j && this.f13733d.b(aVar)) {
                    wVar.b(aVar);
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.i.dispose();
                onError(th);
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.i, bVar)) {
                this.i = bVar;
                this.f13731b.onSubscribe(this);
            }
        }
    }

    public z0(q<T> qVar, n<? super T, ? extends w<? extends R>> nVar, boolean z) {
        super(qVar);
        this.f13729c = nVar;
        this.f13730d = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super R> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13729c, this.f13730d));
    }
}
