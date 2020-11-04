package d.a.a0.e.c;

import d.a.a0.c.e;
import d.a.a0.j.i;
import d.a.l;
import d.a.s;
import d.a.v;
import d.a.w;
import d.a.y.b;
import d.a.z.n;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatMapSingle */
public final class c<T, R> extends l<R> {

    /* renamed from: b  reason: collision with root package name */
    final l<T> f12741b;

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends w<? extends R>> f12742c;

    /* renamed from: d  reason: collision with root package name */
    final i f12743d;

    /* renamed from: e  reason: collision with root package name */
    final int f12744e;

    /* compiled from: ObservableConcatMapSingle */
    static final class a<T, R> extends AtomicInteger implements s<T>, b {
        private static final long serialVersionUID = -9140123220065488293L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f12745b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends w<? extends R>> f12746c;

        /* renamed from: d  reason: collision with root package name */
        final d.a.a0.j.c f12747d = new d.a.a0.j.c();

        /* renamed from: e  reason: collision with root package name */
        final C0131a<R> f12748e = new C0131a<>(this);

        /* renamed from: f  reason: collision with root package name */
        final e<T> f12749f;
        final i g;
        b h;
        volatile boolean i;
        volatile boolean j;
        R k;
        volatile int l;

        /* renamed from: d.a.a0.e.c.c$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableConcatMapSingle */
        static final class C0131a<R> extends AtomicReference<b> implements v<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* renamed from: b  reason: collision with root package name */
            final a<?, R> f12750b;

            C0131a(a<?, R> aVar) {
                this.f12750b = aVar;
            }

            /* access modifiers changed from: package-private */
            public void a() {
                d.a.a0.a.c.f(this);
            }

            public void onError(Throwable th) {
                this.f12750b.b(th);
            }

            public void onSubscribe(b bVar) {
                d.a.a0.a.c.h(this, bVar);
            }

            public void onSuccess(R r) {
                this.f12750b.c(r);
            }
        }

        a(s<? super R> sVar, n<? super T, ? extends w<? extends R>> nVar, int i2, i iVar) {
            this.f12745b = sVar;
            this.f12746c = nVar;
            this.g = iVar;
            this.f12749f = new d.a.a0.f.c(i2);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                s<? super R> sVar = this.f12745b;
                i iVar = this.g;
                e<T> eVar = this.f12749f;
                d.a.a0.j.c cVar = this.f12747d;
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
                                        Object apply = this.f12746c.apply(poll);
                                        d.a.a0.b.b.e(apply, "The mapper returned a null SingleSource");
                                        w wVar = (w) apply;
                                        this.l = 1;
                                        wVar.b(this.f12748e);
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
        public void b(Throwable th) {
            if (this.f12747d.a(th)) {
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
        public void c(R r) {
            this.k = r;
            this.l = 2;
            a();
        }

        public void dispose() {
            this.j = true;
            this.h.dispose();
            this.f12748e.a();
            if (getAndIncrement() == 0) {
                this.f12749f.clear();
                this.k = null;
            }
        }

        public void onComplete() {
            this.i = true;
            a();
        }

        public void onError(Throwable th) {
            if (this.f12747d.a(th)) {
                if (this.g == i.IMMEDIATE) {
                    this.f12748e.a();
                }
                this.i = true;
                a();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            this.f12749f.offer(t);
            a();
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.h, bVar)) {
                this.h = bVar;
                this.f12745b.onSubscribe(this);
            }
        }
    }

    public c(l<T> lVar, n<? super T, ? extends w<? extends R>> nVar, i iVar, int i) {
        this.f12741b = lVar;
        this.f12742c = nVar;
        this.f12743d = iVar;
        this.f12744e = i;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super R> sVar) {
        if (!g.c(this.f12741b, this.f12742c, sVar)) {
            this.f12741b.subscribe(new a(sVar, this.f12742c, this.f12744e, this.f12743d));
        }
    }
}
