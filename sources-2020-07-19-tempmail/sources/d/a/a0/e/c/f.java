package d.a.a0.e.c;

import d.a.a0.j.c;
import d.a.l;
import d.a.s;
import d.a.v;
import d.a.w;
import d.a.y.b;
import d.a.z.n;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSwitchMapSingle */
public final class f<T, R> extends l<R> {

    /* renamed from: b  reason: collision with root package name */
    final l<T> f12770b;

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends w<? extends R>> f12771c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f12772d;

    /* compiled from: ObservableSwitchMapSingle */
    static final class a<T, R> extends AtomicInteger implements s<T>, b {
        static final C0134a<Object> j = new C0134a<>((a) null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f12773b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends w<? extends R>> f12774c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f12775d;

        /* renamed from: e  reason: collision with root package name */
        final c f12776e = new c();

        /* renamed from: f  reason: collision with root package name */
        final AtomicReference<C0134a<R>> f12777f = new AtomicReference<>();
        b g;
        volatile boolean h;
        volatile boolean i;

        /* renamed from: d.a.a0.e.c.f$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableSwitchMapSingle */
        static final class C0134a<R> extends AtomicReference<b> implements v<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: b  reason: collision with root package name */
            final a<?, R> f12778b;

            /* renamed from: c  reason: collision with root package name */
            volatile R f12779c;

            C0134a(a<?, R> aVar) {
                this.f12778b = aVar;
            }

            /* access modifiers changed from: package-private */
            public void a() {
                d.a.a0.a.c.f(this);
            }

            public void onError(Throwable th) {
                this.f12778b.c(this, th);
            }

            public void onSubscribe(b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }

            public void onSuccess(R r) {
                this.f12779c = r;
                this.f12778b.b();
            }
        }

        a(s<? super R> sVar, n<? super T, ? extends w<? extends R>> nVar, boolean z) {
            this.f12773b = sVar;
            this.f12774c = nVar;
            this.f12775d = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            C0134a<Object> andSet = this.f12777f.getAndSet(j);
            if (andSet != null && andSet != j) {
                andSet.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (getAndIncrement() == 0) {
                s<? super R> sVar = this.f12773b;
                c cVar = this.f12776e;
                AtomicReference<C0134a<R>> atomicReference = this.f12777f;
                int i2 = 1;
                while (!this.i) {
                    if (cVar.get() == null || this.f12775d) {
                        boolean z = this.h;
                        C0134a aVar = atomicReference.get();
                        boolean z2 = aVar == null;
                        if (z && z2) {
                            Throwable b2 = cVar.b();
                            if (b2 != null) {
                                sVar.onError(b2);
                                return;
                            } else {
                                sVar.onComplete();
                                return;
                            }
                        } else if (z2 || aVar.f12779c == null) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(aVar, (Object) null);
                            sVar.onNext(aVar.f12779c);
                        }
                    } else {
                        sVar.onError(cVar.b());
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(C0134a<R> aVar, Throwable th) {
            if (!this.f12777f.compareAndSet(aVar, (Object) null) || !this.f12776e.a(th)) {
                d.a.d0.a.s(th);
                return;
            }
            if (!this.f12775d) {
                this.g.dispose();
                a();
            }
            b();
        }

        public void dispose() {
            this.i = true;
            this.g.dispose();
            a();
        }

        public void onComplete() {
            this.h = true;
            b();
        }

        public void onError(Throwable th) {
            if (this.f12776e.a(th)) {
                if (!this.f12775d) {
                    a();
                }
                this.h = true;
                b();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            C0134a<Object> aVar;
            C0134a aVar2 = this.f12777f.get();
            if (aVar2 != null) {
                aVar2.a();
            }
            try {
                Object apply = this.f12774c.apply(t);
                d.a.a0.b.b.e(apply, "The mapper returned a null SingleSource");
                w wVar = (w) apply;
                C0134a aVar3 = new C0134a(this);
                do {
                    aVar = this.f12777f.get();
                    if (aVar == j) {
                        return;
                    }
                } while (!this.f12777f.compareAndSet(aVar, aVar3));
                wVar.b(aVar3);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.g.dispose();
                this.f12777f.getAndSet(j);
                onError(th);
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.g, bVar)) {
                this.g = bVar;
                this.f12773b.onSubscribe(this);
            }
        }
    }

    public f(l<T> lVar, n<? super T, ? extends w<? extends R>> nVar, boolean z) {
        this.f12770b = lVar;
        this.f12771c = nVar;
        this.f12772d = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super R> sVar) {
        if (!g.c(this.f12770b, this.f12771c, sVar)) {
            this.f12770b.subscribe(new a(sVar, this.f12771c, this.f12772d));
        }
    }
}
