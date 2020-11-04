package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.c.f;
import d.a.a0.d.b;
import d.a.a0.g.n;
import d.a.q;
import d.a.s;
import d.a.t;

/* compiled from: ObservableObserveOn */
public final class c2<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final t f13414c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f13415d;

    /* renamed from: e  reason: collision with root package name */
    final int f13416e;

    /* compiled from: ObservableObserveOn */
    static final class a<T> extends b<T> implements s<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13417b;

        /* renamed from: c  reason: collision with root package name */
        final t.c f13418c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f13419d;

        /* renamed from: e  reason: collision with root package name */
        final int f13420e;

        /* renamed from: f  reason: collision with root package name */
        f<T> f13421f;
        d.a.y.b g;
        Throwable h;
        volatile boolean i;
        volatile boolean j;
        int k;
        boolean l;

        a(s<? super T> sVar, t.c cVar, boolean z, int i2) {
            this.f13417b = sVar;
            this.f13418c = cVar;
            this.f13419d = z;
            this.f13420e = i2;
        }

        /* access modifiers changed from: package-private */
        public boolean a(boolean z, boolean z2, s<? super T> sVar) {
            if (this.j) {
                this.f13421f.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.h;
                if (this.f13419d) {
                    if (!z2) {
                        return false;
                    }
                    this.j = true;
                    if (th != null) {
                        sVar.onError(th);
                    } else {
                        sVar.onComplete();
                    }
                    this.f13418c.dispose();
                    return true;
                } else if (th != null) {
                    this.j = true;
                    this.f13421f.clear();
                    sVar.onError(th);
                    this.f13418c.dispose();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.j = true;
                    sVar.onComplete();
                    this.f13418c.dispose();
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int i2 = 1;
            while (!this.j) {
                boolean z = this.i;
                Throwable th = this.h;
                if (this.f13419d || !z || th == null) {
                    this.f13417b.onNext(null);
                    if (z) {
                        this.j = true;
                        Throwable th2 = this.h;
                        if (th2 != null) {
                            this.f13417b.onError(th2);
                        } else {
                            this.f13417b.onComplete();
                        }
                        this.f13418c.dispose();
                        return;
                    }
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    this.j = true;
                    this.f13417b.onError(this.h);
                    this.f13418c.dispose();
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            f<T> fVar = this.f13421f;
            s<? super T> sVar = this.f13417b;
            int i2 = 1;
            while (!a(this.i, fVar.isEmpty(), sVar)) {
                while (true) {
                    boolean z = this.i;
                    try {
                        T poll = fVar.poll();
                        boolean z2 = poll == null;
                        if (!a(z, z2, sVar)) {
                            if (z2) {
                                i2 = addAndGet(-i2);
                                if (i2 == 0) {
                                    return;
                                }
                            } else {
                                sVar.onNext(poll);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.b(th);
                        this.j = true;
                        this.g.dispose();
                        fVar.clear();
                        sVar.onError(th);
                        this.f13418c.dispose();
                        return;
                    }
                }
            }
        }

        public void clear() {
            this.f13421f.clear();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (getAndIncrement() == 0) {
                this.f13418c.b(this);
            }
        }

        public void dispose() {
            if (!this.j) {
                this.j = true;
                this.g.dispose();
                this.f13418c.dispose();
                if (!this.l && getAndIncrement() == 0) {
                    this.f13421f.clear();
                }
            }
        }

        public int g(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.l = true;
            return 2;
        }

        public boolean isEmpty() {
            return this.f13421f.isEmpty();
        }

        public void onComplete() {
            if (!this.i) {
                this.i = true;
                d();
            }
        }

        public void onError(Throwable th) {
            if (this.i) {
                d.a.d0.a.s(th);
                return;
            }
            this.h = th;
            this.i = true;
            d();
        }

        public void onNext(T t) {
            if (!this.i) {
                if (this.k != 2) {
                    this.f13421f.offer(t);
                }
                d();
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.g, bVar)) {
                this.g = bVar;
                if (bVar instanceof d.a.a0.c.b) {
                    d.a.a0.c.b bVar2 = (d.a.a0.c.b) bVar;
                    int g2 = bVar2.g(7);
                    if (g2 == 1) {
                        this.k = g2;
                        this.f13421f = bVar2;
                        this.i = true;
                        this.f13417b.onSubscribe(this);
                        d();
                        return;
                    } else if (g2 == 2) {
                        this.k = g2;
                        this.f13421f = bVar2;
                        this.f13417b.onSubscribe(this);
                        return;
                    }
                }
                this.f13421f = new d.a.a0.f.c(this.f13420e);
                this.f13417b.onSubscribe(this);
            }
        }

        public T poll() throws Exception {
            return this.f13421f.poll();
        }

        public void run() {
            if (this.l) {
                b();
            } else {
                c();
            }
        }
    }

    public c2(q<T> qVar, t tVar, boolean z, int i) {
        super(qVar);
        this.f13414c = tVar;
        this.f13415d = z;
        this.f13416e = i;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        t tVar = this.f13414c;
        if (tVar instanceof n) {
            this.f13338b.subscribe(sVar);
            return;
        }
        this.f13338b.subscribe(new a(sVar, tVar.a(), this.f13415d, this.f13416e));
    }
}
