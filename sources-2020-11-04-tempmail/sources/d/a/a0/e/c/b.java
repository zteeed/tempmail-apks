package d.a.a0.e.c;

import d.a.a0.c.e;
import d.a.a0.j.c;
import d.a.a0.j.i;
import d.a.j;
import d.a.l;
import d.a.s;
import d.a.z.n;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatMapMaybe */
public final class b<T, R> extends l<R> {

    /* renamed from: b  reason: collision with root package name */
    final l<T> f13289b;

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends j<? extends R>> f13290c;

    /* renamed from: d  reason: collision with root package name */
    final i f13291d;

    /* renamed from: e  reason: collision with root package name */
    final int f13292e;

    /* compiled from: ObservableConcatMapMaybe */
    static final class a<T, R> extends AtomicInteger implements s<T>, d.a.y.b {
        private static final long serialVersionUID = -9140123220065488293L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f13293b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends j<? extends R>> f13294c;

        /* renamed from: d  reason: collision with root package name */
        final c f13295d = new c();

        /* renamed from: e  reason: collision with root package name */
        final C0128a<R> f13296e = new C0128a<>(this);

        /* renamed from: f  reason: collision with root package name */
        final e<T> f13297f;
        final i g;
        d.a.y.b h;
        volatile boolean i;
        volatile boolean j;
        R k;
        volatile int l;

        /* renamed from: d.a.a0.e.c.b$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableConcatMapMaybe */
        static final class C0128a<R> extends AtomicReference<d.a.y.b> implements d.a.i<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* renamed from: b  reason: collision with root package name */
            final a<?, R> f13298b;

            C0128a(a<?, R> aVar) {
                this.f13298b = aVar;
            }

            /* access modifiers changed from: package-private */
            public void a() {
                d.a.a0.a.c.f(this);
            }

            public void onComplete() {
                this.f13298b.b();
            }

            public void onError(Throwable th) {
                this.f13298b.c(th);
            }

            public void onSubscribe(d.a.y.b bVar) {
                d.a.a0.a.c.h(this, bVar);
            }

            public void onSuccess(R r) {
                this.f13298b.d(r);
            }
        }

        a(s<? super R> sVar, n<? super T, ? extends j<? extends R>> nVar, int i2, i iVar) {
            this.f13293b = sVar;
            this.f13294c = nVar;
            this.g = iVar;
            this.f13297f = new d.a.a0.f.c(i2);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                s<? super R> sVar = this.f13293b;
                i iVar = this.g;
                e<T> eVar = this.f13297f;
                c cVar = this.f13295d;
                int i2 = 1;
                while (true) {
                    if (this.j) {
                        eVar.clear();
                        this.k = null;
                    } else {
                        int i3 = this.l;
                        if (cVar.get() == null || !(iVar == i.IMMEDIATE || (iVar == i.BOUNDARY && i3 == 0))) {
                            boolean z = false;
                            if (i3 == 0) {
                                boolean z2 = this.i;
                                T poll = eVar.poll();
                                if (poll == null) {
                                    z = true;
                                }
                                if (z2 && z) {
                                    Throwable b2 = cVar.b();
                                    if (b2 == null) {
                                        sVar.onComplete();
                                        return;
                                    } else {
                                        sVar.onError(b2);
                                        return;
                                    }
                                } else if (!z) {
                                    try {
                                        Object apply = this.f13294c.apply(poll);
                                        d.a.a0.b.b.e(apply, "The mapper returned a null MaybeSource");
                                        j jVar = (j) apply;
                                        this.l = 1;
                                        jVar.b(this.f13296e);
                                    } catch (Throwable th) {
                                        io.reactivex.exceptions.a.b(th);
                                        this.h.dispose();
                                        eVar.clear();
                                        cVar.a(th);
                                        sVar.onError(cVar.b());
                                        return;
                                    }
                                }
                            } else if (i3 == 2) {
                                R r = this.k;
                                this.k = null;
                                sVar.onNext(r);
                                this.l = 0;
                            }
                        }
                    }
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
                eVar.clear();
                this.k = null;
                sVar.onError(cVar.b());
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.l = 0;
            a();
        }

        /* access modifiers changed from: package-private */
        public void c(Throwable th) {
            if (this.f13295d.a(th)) {
                if (this.g != i.END) {
                    this.h.dispose();
                }
                this.l = 0;
                a();
                return;
            }
            d.a.d0.a.s(th);
        }

        /* access modifiers changed from: package-private */
        public void d(R r) {
            this.k = r;
            this.l = 2;
            a();
        }

        public void dispose() {
            this.j = true;
            this.h.dispose();
            this.f13296e.a();
            if (getAndIncrement() == 0) {
                this.f13297f.clear();
                this.k = null;
            }
        }

        public void onComplete() {
            this.i = true;
            a();
        }

        public void onError(Throwable th) {
            if (this.f13295d.a(th)) {
                if (this.g == i.IMMEDIATE) {
                    this.f13296e.a();
                }
                this.i = true;
                a();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            this.f13297f.offer(t);
            a();
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.h, bVar)) {
                this.h = bVar;
                this.f13293b.onSubscribe(this);
            }
        }
    }

    public b(l<T> lVar, n<? super T, ? extends j<? extends R>> nVar, i iVar, int i) {
        this.f13289b = lVar;
        this.f13290c = nVar;
        this.f13291d = iVar;
        this.f13292e = i;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super R> sVar) {
        if (!g.b(this.f13289b, this.f13290c, sVar)) {
            this.f13289b.subscribe(new a(sVar, this.f13290c, this.f13292e, this.f13291d));
        }
    }
}
