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
    final l<T> f13318b;

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends j<? extends R>> f13319c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f13320d;

    /* compiled from: ObservableSwitchMapMaybe */
    static final class a<T, R> extends AtomicInteger implements s<T>, b {
        static final C0131a<Object> j = new C0131a<>((a) null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f13321b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends j<? extends R>> f13322c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f13323d;

        /* renamed from: e  reason: collision with root package name */
        final c f13324e = new c();

        /* renamed from: f  reason: collision with root package name */
        final AtomicReference<C0131a<R>> f13325f = new AtomicReference<>();
        b g;
        volatile boolean h;
        volatile boolean i;

        /* renamed from: d.a.a0.e.c.e$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableSwitchMapMaybe */
        static final class C0131a<R> extends AtomicReference<b> implements i<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: b  reason: collision with root package name */
            final a<?, R> f13326b;

            /* renamed from: c  reason: collision with root package name */
            volatile R f13327c;

            C0131a(a<?, R> aVar) {
                this.f13326b = aVar;
            }

            /* access modifiers changed from: package-private */
            public void a() {
                d.a.a0.a.c.f(this);
            }

            public void onComplete() {
                this.f13326b.c(this);
            }

            public void onError(Throwable th) {
                this.f13326b.d(this, th);
            }

            public void onSubscribe(b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }

            public void onSuccess(R r) {
                this.f13327c = r;
                this.f13326b.b();
            }
        }

        a(s<? super R> sVar, n<? super T, ? extends j<? extends R>> nVar, boolean z) {
            this.f13321b = sVar;
            this.f13322c = nVar;
            this.f13323d = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            C0131a<Object> andSet = this.f13325f.getAndSet(j);
            if (andSet != null && andSet != j) {
                andSet.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (getAndIncrement() == 0) {
                s<? super R> sVar = this.f13321b;
                c cVar = this.f13324e;
                AtomicReference<C0131a<R>> atomicReference = this.f13325f;
                int i2 = 1;
                while (!this.i) {
                    if (cVar.get() == null || this.f13323d) {
                        boolean z = this.h;
                        C0131a aVar = atomicReference.get();
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
                        } else if (z2 || aVar.f13327c == null) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(aVar, (Object) null);
                            sVar.onNext(aVar.f13327c);
                        }
                    } else {
                        sVar.onError(cVar.b());
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(C0131a<R> aVar) {
            if (this.f13325f.compareAndSet(aVar, (Object) null)) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void d(C0131a<R> aVar, Throwable th) {
            if (!this.f13325f.compareAndSet(aVar, (Object) null) || !this.f13324e.a(th)) {
                d.a.d0.a.s(th);
                return;
            }
            if (!this.f13323d) {
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
            if (this.f13324e.a(th)) {
                if (!this.f13323d) {
                    a();
                }
                this.h = true;
                b();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            C0131a<Object> aVar;
            C0131a aVar2 = this.f13325f.get();
            if (aVar2 != null) {
                aVar2.a();
            }
            try {
                Object apply = this.f13322c.apply(t);
                d.a.a0.b.b.e(apply, "The mapper returned a null MaybeSource");
                j jVar = (j) apply;
                C0131a aVar3 = new C0131a(this);
                do {
                    aVar = this.f13325f.get();
                    if (aVar == j) {
                        return;
                    }
                } while (!this.f13325f.compareAndSet(aVar, aVar3));
                jVar.b(aVar3);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.g.dispose();
                this.f13325f.getAndSet(j);
                onError(th);
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.g, bVar)) {
                this.g = bVar;
                this.f13321b.onSubscribe(this);
            }
        }
    }

    public e(l<T> lVar, n<? super T, ? extends j<? extends R>> nVar, boolean z) {
        this.f13318b = lVar;
        this.f13319c = nVar;
        this.f13320d = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super R> sVar) {
        if (!g.b(this.f13318b, this.f13319c, sVar)) {
            this.f13318b.subscribe(new a(sVar, this.f13319c, this.f13320d));
        }
    }
}
