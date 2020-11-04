package d.a.a0.e.c;

import d.a.a0.j.j;
import d.a.b;
import d.a.c;
import d.a.l;
import d.a.s;
import d.a.z.n;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSwitchMapCompletable */
public final class d<T> extends b {

    /* renamed from: a  reason: collision with root package name */
    final l<T> f13309a;

    /* renamed from: b  reason: collision with root package name */
    final n<? super T, ? extends d.a.d> f13310b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f13311c;

    /* compiled from: ObservableSwitchMapCompletable */
    static final class a<T> implements s<T>, d.a.y.b {
        static final C0130a i = new C0130a((a<?>) null);

        /* renamed from: b  reason: collision with root package name */
        final c f13312b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends d.a.d> f13313c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f13314d;

        /* renamed from: e  reason: collision with root package name */
        final d.a.a0.j.c f13315e = new d.a.a0.j.c();

        /* renamed from: f  reason: collision with root package name */
        final AtomicReference<C0130a> f13316f = new AtomicReference<>();
        volatile boolean g;
        d.a.y.b h;

        /* renamed from: d.a.a0.e.c.d$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableSwitchMapCompletable */
        static final class C0130a extends AtomicReference<d.a.y.b> implements c {
            private static final long serialVersionUID = -8003404460084760287L;

            /* renamed from: b  reason: collision with root package name */
            final a<?> f13317b;

            C0130a(a<?> aVar) {
                this.f13317b = aVar;
            }

            /* access modifiers changed from: package-private */
            public void a() {
                d.a.a0.a.c.f(this);
            }

            public void onComplete() {
                this.f13317b.b(this);
            }

            public void onError(Throwable th) {
                this.f13317b.c(this, th);
            }

            public void onSubscribe(d.a.y.b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }
        }

        a(c cVar, n<? super T, ? extends d.a.d> nVar, boolean z) {
            this.f13312b = cVar;
            this.f13313c = nVar;
            this.f13314d = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            C0130a andSet = this.f13316f.getAndSet(i);
            if (andSet != null && andSet != i) {
                andSet.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void b(C0130a aVar) {
            if (this.f13316f.compareAndSet(aVar, (Object) null) && this.g) {
                Throwable b2 = this.f13315e.b();
                if (b2 == null) {
                    this.f13312b.onComplete();
                } else {
                    this.f13312b.onError(b2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(C0130a aVar, Throwable th) {
            if (!this.f13316f.compareAndSet(aVar, (Object) null) || !this.f13315e.a(th)) {
                d.a.d0.a.s(th);
            } else if (!this.f13314d) {
                dispose();
                Throwable b2 = this.f13315e.b();
                if (b2 != j.f14476a) {
                    this.f13312b.onError(b2);
                }
            } else if (this.g) {
                this.f13312b.onError(this.f13315e.b());
            }
        }

        public void dispose() {
            this.h.dispose();
            a();
        }

        public void onComplete() {
            this.g = true;
            if (this.f13316f.get() == null) {
                Throwable b2 = this.f13315e.b();
                if (b2 == null) {
                    this.f13312b.onComplete();
                } else {
                    this.f13312b.onError(b2);
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f13315e.a(th)) {
                d.a.d0.a.s(th);
            } else if (this.f13314d) {
                onComplete();
            } else {
                a();
                Throwable b2 = this.f13315e.b();
                if (b2 != j.f14476a) {
                    this.f13312b.onError(b2);
                }
            }
        }

        public void onNext(T t) {
            C0130a aVar;
            try {
                Object apply = this.f13313c.apply(t);
                d.a.a0.b.b.e(apply, "The mapper returned a null CompletableSource");
                d.a.d dVar = (d.a.d) apply;
                C0130a aVar2 = new C0130a(this);
                do {
                    aVar = this.f13316f.get();
                    if (aVar == i) {
                        return;
                    }
                } while (!this.f13316f.compareAndSet(aVar, aVar2));
                if (aVar != null) {
                    aVar.a();
                }
                dVar.b(aVar2);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.h.dispose();
                onError(th);
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.h, bVar)) {
                this.h = bVar;
                this.f13312b.onSubscribe(this);
            }
        }
    }

    public d(l<T> lVar, n<? super T, ? extends d.a.d> nVar, boolean z) {
        this.f13309a = lVar;
        this.f13310b = nVar;
        this.f13311c = z;
    }

    /* access modifiers changed from: protected */
    public void c(c cVar) {
        if (!g.a(this.f13309a, this.f13310b, cVar)) {
            this.f13309a.subscribe(new a(cVar, this.f13310b, this.f13311c));
        }
    }
}
