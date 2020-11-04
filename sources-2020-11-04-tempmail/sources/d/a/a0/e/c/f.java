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
    final l<T> f13328b;

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends w<? extends R>> f13329c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f13330d;

    /* compiled from: ObservableSwitchMapSingle */
    static final class a<T, R> extends AtomicInteger implements s<T>, b {
        static final C0132a<Object> j = new C0132a<>((a) null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f13331b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends w<? extends R>> f13332c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f13333d;

        /* renamed from: e  reason: collision with root package name */
        final c f13334e = new c();

        /* renamed from: f  reason: collision with root package name */
        final AtomicReference<C0132a<R>> f13335f = new AtomicReference<>();
        b g;
        volatile boolean h;
        volatile boolean i;

        /* renamed from: d.a.a0.e.c.f$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableSwitchMapSingle */
        static final class C0132a<R> extends AtomicReference<b> implements v<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: b  reason: collision with root package name */
            final a<?, R> f13336b;

            /* renamed from: c  reason: collision with root package name */
            volatile R f13337c;

            C0132a(a<?, R> aVar) {
                this.f13336b = aVar;
            }

            /* access modifiers changed from: package-private */
            public void a() {
                d.a.a0.a.c.f(this);
            }

            public void onError(Throwable th) {
                this.f13336b.c(this, th);
            }

            public void onSubscribe(b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }

            public void onSuccess(R r) {
                this.f13337c = r;
                this.f13336b.b();
            }
        }

        a(s<? super R> sVar, n<? super T, ? extends w<? extends R>> nVar, boolean z) {
            this.f13331b = sVar;
            this.f13332c = nVar;
            this.f13333d = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            C0132a<Object> andSet = this.f13335f.getAndSet(j);
            if (andSet != null && andSet != j) {
                andSet.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (getAndIncrement() == 0) {
                s<? super R> sVar = this.f13331b;
                c cVar = this.f13334e;
                AtomicReference<C0132a<R>> atomicReference = this.f13335f;
                int i2 = 1;
                while (!this.i) {
                    if (cVar.get() == null || this.f13333d) {
                        boolean z = this.h;
                        C0132a aVar = atomicReference.get();
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
                        } else if (z2 || aVar.f13337c == null) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(aVar, (Object) null);
                            sVar.onNext(aVar.f13337c);
                        }
                    } else {
                        sVar.onError(cVar.b());
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(C0132a<R> aVar, Throwable th) {
            if (!this.f13335f.compareAndSet(aVar, (Object) null) || !this.f13334e.a(th)) {
                d.a.d0.a.s(th);
                return;
            }
            if (!this.f13333d) {
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
            if (this.f13334e.a(th)) {
                if (!this.f13333d) {
                    a();
                }
                this.h = true;
                b();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            C0132a<Object> aVar;
            C0132a aVar2 = this.f13335f.get();
            if (aVar2 != null) {
                aVar2.a();
            }
            try {
                Object apply = this.f13332c.apply(t);
                d.a.a0.b.b.e(apply, "The mapper returned a null SingleSource");
                w wVar = (w) apply;
                C0132a aVar3 = new C0132a(this);
                do {
                    aVar = this.f13335f.get();
                    if (aVar == j) {
                        return;
                    }
                } while (!this.f13335f.compareAndSet(aVar, aVar3));
                wVar.b(aVar3);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.g.dispose();
                this.f13335f.getAndSet(j);
                onError(th);
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.g, bVar)) {
                this.g = bVar;
                this.f13331b.onSubscribe(this);
            }
        }
    }

    public f(l<T> lVar, n<? super T, ? extends w<? extends R>> nVar, boolean z) {
        this.f13328b = lVar;
        this.f13329c = nVar;
        this.f13330d = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super R> sVar) {
        if (!g.c(this.f13328b, this.f13329c, sVar)) {
            this.f13328b.subscribe(new a(sVar, this.f13329c, this.f13330d));
        }
    }
}
