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
    final l<T> f12721a;

    /* renamed from: b  reason: collision with root package name */
    final n<? super T, ? extends d> f12722b;

    /* renamed from: c  reason: collision with root package name */
    final i f12723c;

    /* renamed from: d  reason: collision with root package name */
    final int f12724d;

    /* renamed from: d.a.a0.e.c.a$a  reason: collision with other inner class name */
    /* compiled from: ObservableConcatMapCompletable */
    static final class C0128a<T> extends AtomicInteger implements s<T>, d.a.y.b {
        private static final long serialVersionUID = 3610901111000061034L;

        /* renamed from: b  reason: collision with root package name */
        final c f12725b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends d> f12726c;

        /* renamed from: d  reason: collision with root package name */
        final i f12727d;

        /* renamed from: e  reason: collision with root package name */
        final d.a.a0.j.c f12728e = new d.a.a0.j.c();

        /* renamed from: f  reason: collision with root package name */
        final C0129a f12729f = new C0129a(this);
        final int g;
        f<T> h;
        d.a.y.b i;
        volatile boolean j;
        volatile boolean k;
        volatile boolean l;

        /* renamed from: d.a.a0.e.c.a$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableConcatMapCompletable */
        static final class C0129a extends AtomicReference<d.a.y.b> implements c {
            private static final long serialVersionUID = 5638352172918776687L;

            /* renamed from: b  reason: collision with root package name */
            final C0128a<?> f12730b;

            C0129a(C0128a<?> aVar) {
                this.f12730b = aVar;
            }

            /* access modifiers changed from: package-private */
            public void a() {
                d.a.a0.a.c.f(this);
            }

            public void onComplete() {
                this.f12730b.b();
            }

            public void onError(Throwable th) {
                this.f12730b.c(th);
            }

            public void onSubscribe(d.a.y.b bVar) {
                d.a.a0.a.c.h(this, bVar);
            }
        }

        C0128a(c cVar, n<? super T, ? extends d> nVar, i iVar, int i2) {
            this.f12725b = cVar;
            this.f12726c = nVar;
            this.f12727d = iVar;
            this.g = i2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            boolean z;
            if (getAndIncrement() == 0) {
                d.a.a0.j.c cVar = this.f12728e;
                i iVar = this.f12727d;
                while (!this.l) {
                    if (!this.j) {
                        if (iVar != i.BOUNDARY || cVar.get() == null) {
                            boolean z2 = this.k;
                            d dVar = null;
                            try {
                                T poll = this.h.poll();
                                if (poll != null) {
                                    Object apply = this.f12726c.apply(poll);
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
                                        this.f12725b.onError(b2);
                                        return;
                                    } else {
                                        this.f12725b.onComplete();
                                        return;
                                    }
                                } else if (!z) {
                                    this.j = true;
                                    dVar.b(this.f12729f);
                                }
                            } catch (Throwable th) {
                                io.reactivex.exceptions.a.b(th);
                                this.l = true;
                                this.h.clear();
                                this.i.dispose();
                                cVar.a(th);
                                this.f12725b.onError(cVar.b());
                                return;
                            }
                        } else {
                            this.l = true;
                            this.h.clear();
                            this.f12725b.onError(cVar.b());
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
            if (!this.f12728e.a(th)) {
                d.a.d0.a.s(th);
            } else if (this.f12727d == i.IMMEDIATE) {
                this.l = true;
                this.i.dispose();
                Throwable b2 = this.f12728e.b();
                if (b2 != j.f13880a) {
                    this.f12725b.onError(b2);
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
            this.f12729f.a();
            if (getAndIncrement() == 0) {
                this.h.clear();
            }
        }

        public void onComplete() {
            this.k = true;
            a();
        }

        public void onError(Throwable th) {
            if (!this.f12728e.a(th)) {
                d.a.d0.a.s(th);
            } else if (this.f12727d == i.IMMEDIATE) {
                this.l = true;
                this.f12729f.a();
                Throwable b2 = this.f12728e.b();
                if (b2 != j.f13880a) {
                    this.f12725b.onError(b2);
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
                        this.f12725b.onSubscribe(this);
                        a();
                        return;
                    } else if (g2 == 2) {
                        this.h = bVar2;
                        this.f12725b.onSubscribe(this);
                        return;
                    }
                }
                this.h = new d.a.a0.f.c(this.g);
                this.f12725b.onSubscribe(this);
            }
        }
    }

    public a(l<T> lVar, n<? super T, ? extends d> nVar, i iVar, int i) {
        this.f12721a = lVar;
        this.f12722b = nVar;
        this.f12723c = iVar;
        this.f12724d = i;
    }

    /* access modifiers changed from: protected */
    public void c(c cVar) {
        if (!g.a(this.f12721a, this.f12722b, cVar)) {
            this.f12721a.subscribe(new C0128a(cVar, this.f12722b, this.f12723c, this.f12724d));
        }
    }
}
