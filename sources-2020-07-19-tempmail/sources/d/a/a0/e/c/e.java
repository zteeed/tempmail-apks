package d.a.a0.e.c;

import d.a.a0.j.c;
import d.a.i;
import d.a.j;
import d.a.l;
import d.a.s;
import d.a.y.b;
import d.a.z.n;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSwitchMapMaybe */
public final class e<T, R> extends l<R> {

    /* renamed from: b  reason: collision with root package name */
    final l<T> f12760b;

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends j<? extends R>> f12761c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f12762d;

    /* compiled from: ObservableSwitchMapMaybe */
    static final class a<T, R> extends AtomicInteger implements s<T>, b {
        static final C0133a<Object> j = new C0133a<>((a) null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f12763b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends j<? extends R>> f12764c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f12765d;

        /* renamed from: e  reason: collision with root package name */
        final c f12766e = new c();

        /* renamed from: f  reason: collision with root package name */
        final AtomicReference<C0133a<R>> f12767f = new AtomicReference<>();
        b g;
        volatile boolean h;
        volatile boolean i;

        /* renamed from: d.a.a0.e.c.e$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableSwitchMapMaybe */
        static final class C0133a<R> extends AtomicReference<b> implements i<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: b  reason: collision with root package name */
            final a<?, R> f12768b;

            /* renamed from: c  reason: collision with root package name */
            volatile R f12769c;

            C0133a(a<?, R> aVar) {
                this.f12768b = aVar;
            }

            /* access modifiers changed from: package-private */
            public void a() {
                d.a.a0.a.c.f(this);
            }

            public void onComplete() {
                this.f12768b.c(this);
            }

            public void onError(Throwable th) {
                this.f12768b.d(this, th);
            }

            public void onSubscribe(b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }

            public void onSuccess(R r) {
                this.f12769c = r;
                this.f12768b.b();
            }
        }

        a(s<? super R> sVar, n<? super T, ? extends j<? extends R>> nVar, boolean z) {
            this.f12763b = sVar;
            this.f12764c = nVar;
            this.f12765d = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            C0133a<Object> andSet = this.f12767f.getAndSet(j);
            if (andSet != null && andSet != j) {
                andSet.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (getAndIncrement() == 0) {
                s<? super R> sVar = this.f12763b;
                c cVar = this.f12766e;
                AtomicReference<C0133a<R>> atomicReference = this.f12767f;
                int i2 = 1;
                while (!this.i) {
                    if (cVar.get() == null || this.f12765d) {
                        boolean z = this.h;
                        C0133a aVar = atomicReference.get();
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
                        } else if (z2 || aVar.f12769c == null) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(aVar, (Object) null);
                            sVar.onNext(aVar.f12769c);
                        }
                    } else {
                        sVar.onError(cVar.b());
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(C0133a<R> aVar) {
            if (this.f12767f.compareAndSet(aVar, (Object) null)) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void d(C0133a<R> aVar, Throwable th) {
            if (!this.f12767f.compareAndSet(aVar, (Object) null) || !this.f12766e.a(th)) {
                d.a.d0.a.s(th);
                return;
            }
            if (!this.f12765d) {
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
            if (this.f12766e.a(th)) {
                if (!this.f12765d) {
                    a();
                }
                this.h = true;
                b();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            C0133a<Object> aVar;
            C0133a aVar2 = this.f12767f.get();
            if (aVar2 != null) {
                aVar2.a();
            }
            try {
                Object apply = this.f12764c.apply(t);
                d.a.a0.b.b.e(apply, "The mapper returned a null MaybeSource");
                j jVar = (j) apply;
                C0133a aVar3 = new C0133a(this);
                do {
                    aVar = this.f12767f.get();
                    if (aVar == j) {
                        return;
                    }
                } while (!this.f12767f.compareAndSet(aVar, aVar3));
                jVar.b(aVar3);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.g.dispose();
                this.f12767f.getAndSet(j);
                onError(th);
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.g, bVar)) {
                this.g = bVar;
                this.f12763b.onSubscribe(this);
            }
        }
    }

    public e(l<T> lVar, n<? super T, ? extends j<? extends R>> nVar, boolean z) {
        this.f12760b = lVar;
        this.f12761c = nVar;
        this.f12762d = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super R> sVar) {
        if (!g.b(this.f12760b, this.f12761c, sVar)) {
            this.f12760b.subscribe(new a(sVar, this.f12761c, this.f12762d));
        }
    }
}
