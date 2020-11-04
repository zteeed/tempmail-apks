package d.a.a0.e.c;

import d.a.a0.c.f;
import d.a.a0.j.i;
import d.a.a0.j.j;
import d.a.b;
import d.a.c;
import d.a.d;
import d.a.l;
import d.a.s;
import d.a.z.n;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatMapCompletable */
public final class a<T> extends b {

    /* renamed from: a  reason: collision with root package name */
    final l<T> f13279a;

    /* renamed from: b  reason: collision with root package name */
    final n<? super T, ? extends d> f13280b;

    /* renamed from: c  reason: collision with root package name */
    final i f13281c;

    /* renamed from: d  reason: collision with root package name */
    final int f13282d;

    /* renamed from: d.a.a0.e.c.a$a  reason: collision with other inner class name */
    /* compiled from: ObservableConcatMapCompletable */
    static final class C0126a<T> extends AtomicInteger implements s<T>, d.a.y.b {
        private static final long serialVersionUID = 3610901111000061034L;

        /* renamed from: b  reason: collision with root package name */
        final c f13283b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends d> f13284c;

        /* renamed from: d  reason: collision with root package name */
        final i f13285d;

        /* renamed from: e  reason: collision with root package name */
        final d.a.a0.j.c f13286e = new d.a.a0.j.c();

        /* renamed from: f  reason: collision with root package name */
        final C0127a f13287f = new C0127a(this);
        final int g;
        f<T> h;
        d.a.y.b i;
        volatile boolean j;
        volatile boolean k;
        volatile boolean l;

        /* renamed from: d.a.a0.e.c.a$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableConcatMapCompletable */
        static final class C0127a extends AtomicReference<d.a.y.b> implements c {
            private static final long serialVersionUID = 5638352172918776687L;

            /* renamed from: b  reason: collision with root package name */
            final C0126a<?> f13288b;

            C0127a(C0126a<?> aVar) {
                this.f13288b = aVar;
            }

            /* access modifiers changed from: package-private */
            public void a() {
                d.a.a0.a.c.f(this);
            }

            public void onComplete() {
                this.f13288b.b();
            }

            public void onError(Throwable th) {
                this.f13288b.c(th);
            }

            public void onSubscribe(d.a.y.b bVar) {
                d.a.a0.a.c.h(this, bVar);
            }
        }

        C0126a(c cVar, n<? super T, ? extends d> nVar, i iVar, int i2) {
            this.f13283b = cVar;
            this.f13284c = nVar;
            this.f13285d = iVar;
            this.g = i2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            boolean z;
            if (getAndIncrement() == 0) {
                d.a.a0.j.c cVar = this.f13286e;
                i iVar = this.f13285d;
                while (!this.l) {
                    if (!this.j) {
                        if (iVar != i.BOUNDARY || cVar.get() == null) {
                            boolean z2 = this.k;
                            d dVar = null;
                            try {
                                T poll = this.h.poll();
                                if (poll != null) {
                                    Object apply = this.f13284c.apply(poll);
                                    d.a.a0.b.b.e(apply, "The mapper returned a null CompletableSource");
                                    dVar = (d) apply;
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z2 && z) {
                                    this.l = true;
                                    Throwable b2 = cVar.b();
                                    if (b2 != null) {
                                        this.f13283b.onError(b2);
                                        return;
                                    } else {
                                        this.f13283b.onComplete();
                                        return;
                                    }
                                } else if (!z) {
                                    this.j = true;
                                    dVar.b(this.f13287f);
                                }
                            } catch (Throwable th) {
                                io.reactivex.exceptions.a.b(th);
                                this.l = true;
                                this.h.clear();
                                this.i.dispose();
                                cVar.a(th);
                                this.f13283b.onError(cVar.b());
                                return;
                            }
                        } else {
                            this.l = true;
                            this.h.clear();
                            this.f13283b.onError(cVar.b());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.h.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.j = false;
            a();
        }

        /* access modifiers changed from: package-private */
        public void c(Throwable th) {
            if (!this.f13286e.a(th)) {
                d.a.d0.a.s(th);
            } else if (this.f13285d == i.IMMEDIATE) {
                this.l = true;
                this.i.dispose();
                Throwable b2 = this.f13286e.b();
                if (b2 != j.f14476a) {
                    this.f13283b.onError(b2);
                }
                if (getAndIncrement() == 0) {
                    this.h.clear();
                }
            } else {
                this.j = false;
                a();
            }
        }

        public void dispose() {
            this.l = true;
            this.i.dispose();
            this.f13287f.a();
            if (getAndIncrement() == 0) {
                this.h.clear();
            }
        }

        public void onComplete() {
            this.k = true;
            a();
        }

        public void onError(Throwable th) {
            if (!this.f13286e.a(th)) {
                d.a.d0.a.s(th);
            } else if (this.f13285d == i.IMMEDIATE) {
                this.l = true;
                this.f13287f.a();
                Throwable b2 = this.f13286e.b();
                if (b2 != j.f14476a) {
                    this.f13283b.onError(b2);
                }
                if (getAndIncrement() == 0) {
                    this.h.clear();
                }
            } else {
                this.k = true;
                a();
            }
        }

        public void onNext(T t) {
            if (t != null) {
                this.h.offer(t);
            }
            a();
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.i, bVar)) {
                this.i = bVar;
                if (bVar instanceof d.a.a0.c.b) {
                    d.a.a0.c.b bVar2 = (d.a.a0.c.b) bVar;
                    int g2 = bVar2.g(3);
                    if (g2 == 1) {
                        this.h = bVar2;
                        this.k = true;
                        this.f13283b.onSubscribe(this);
                        a();
                        return;
                    } else if (g2 == 2) {
                        this.h = bVar2;
                        this.f13283b.onSubscribe(this);
                        return;
                    }
                }
                this.h = new d.a.a0.f.c(this.g);
                this.f13283b.onSubscribe(this);
            }
        }
    }

    public a(l<T> lVar, n<? super T, ? extends d> nVar, i iVar, int i) {
        this.f13279a = lVar;
        this.f13280b = nVar;
        this.f13281c = iVar;
        this.f13282d = i;
    }

    /* access modifiers changed from: protected */
    public void c(c cVar) {
        if (!g.a(this.f13279a, this.f13280b, cVar)) {
            this.f13279a.subscribe(new C0126a(cVar, this.f13280b, this.f13281c, this.f13282d));
        }
    }
}
