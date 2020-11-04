package d.a.a0.e.d;

import d.a.a0.c.f;
import d.a.a0.d.m;
import d.a.a0.j.c;
import d.a.a0.j.i;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.n;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableConcatMapEager */
public final class v<T, R> extends a<T, R> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends q<? extends R>> f14140c;

    /* renamed from: d  reason: collision with root package name */
    final i f14141d;

    /* renamed from: e  reason: collision with root package name */
    final int f14142e;

    /* renamed from: f  reason: collision with root package name */
    final int f14143f;

    /* compiled from: ObservableConcatMapEager */
    static final class a<T, R> extends AtomicInteger implements s<T>, b, d.a.a0.d.n<R> {
        private static final long serialVersionUID = 8080567949447303262L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f14144b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends q<? extends R>> f14145c;

        /* renamed from: d  reason: collision with root package name */
        final int f14146d;

        /* renamed from: e  reason: collision with root package name */
        final int f14147e;

        /* renamed from: f  reason: collision with root package name */
        final i f14148f;
        final c g = new c();
        final ArrayDeque<m<R>> h = new ArrayDeque<>();
        f<T> i;
        b j;
        volatile boolean k;
        int l;
        volatile boolean m;
        m<R> n;
        int o;

        a(s<? super R> sVar, n<? super T, ? extends q<? extends R>> nVar, int i2, int i3, i iVar) {
            this.f14144b = sVar;
            this.f14145c = nVar;
            this.f14146d = i2;
            this.f14147e = i3;
            this.f14148f = iVar;
        }

        public void a(m<R> mVar, Throwable th) {
            if (this.g.a(th)) {
                if (this.f14148f == i.IMMEDIATE) {
                    this.j.dispose();
                }
                mVar.c();
                c();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void b(m<R> mVar) {
            mVar.c();
            c();
        }

        public void c() {
            if (getAndIncrement() == 0) {
                f<T> fVar = this.i;
                ArrayDeque<m<R>> arrayDeque = this.h;
                s<? super R> sVar = this.f14144b;
                i iVar = this.f14148f;
                int i2 = 1;
                while (true) {
                    int i3 = this.o;
                    while (true) {
                        if (i3 == this.f14146d) {
                            break;
                        } else if (this.m) {
                            fVar.clear();
                            e();
                            return;
                        } else if (iVar != i.IMMEDIATE || ((Throwable) this.g.get()) == null) {
                            try {
                                T poll = fVar.poll();
                                if (poll == null) {
                                    break;
                                }
                                Object apply = this.f14145c.apply(poll);
                                d.a.a0.b.b.e(apply, "The mapper returned a null ObservableSource");
                                q qVar = (q) apply;
                                m mVar = new m(this, this.f14147e);
                                arrayDeque.offer(mVar);
                                qVar.subscribe(mVar);
                                i3++;
                            } catch (Throwable th) {
                                io.reactivex.exceptions.a.b(th);
                                this.j.dispose();
                                fVar.clear();
                                e();
                                this.g.a(th);
                                sVar.onError(this.g.b());
                                return;
                            }
                        } else {
                            fVar.clear();
                            e();
                            sVar.onError(this.g.b());
                            return;
                        }
                    }
                    this.o = i3;
                    if (this.m) {
                        fVar.clear();
                        e();
                        return;
                    } else if (iVar != i.IMMEDIATE || ((Throwable) this.g.get()) == null) {
                        m<R> mVar2 = this.n;
                        if (mVar2 == null) {
                            if (iVar != i.BOUNDARY || ((Throwable) this.g.get()) == null) {
                                boolean z = this.k;
                                m<R> poll2 = arrayDeque.poll();
                                boolean z2 = poll2 == null;
                                if (!z || !z2) {
                                    if (!z2) {
                                        this.n = poll2;
                                    }
                                    mVar2 = poll2;
                                } else if (((Throwable) this.g.get()) != null) {
                                    fVar.clear();
                                    e();
                                    sVar.onError(this.g.b());
                                    return;
                                } else {
                                    sVar.onComplete();
                                    return;
                                }
                            } else {
                                fVar.clear();
                                e();
                                sVar.onError(this.g.b());
                                return;
                            }
                        }
                        if (mVar2 != null) {
                            f<R> b2 = mVar2.b();
                            while (!this.m) {
                                boolean a2 = mVar2.a();
                                if (iVar != i.IMMEDIATE || ((Throwable) this.g.get()) == null) {
                                    try {
                                        R poll3 = b2.poll();
                                        boolean z3 = poll3 == null;
                                        if (a2 && z3) {
                                            this.n = null;
                                            this.o--;
                                        } else if (!z3) {
                                            sVar.onNext(poll3);
                                        }
                                    } catch (Throwable th2) {
                                        io.reactivex.exceptions.a.b(th2);
                                        this.g.a(th2);
                                        this.n = null;
                                        this.o--;
                                    }
                                } else {
                                    fVar.clear();
                                    e();
                                    sVar.onError(this.g.b());
                                    return;
                                }
                            }
                            fVar.clear();
                            e();
                            return;
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        fVar.clear();
                        e();
                        sVar.onError(this.g.b());
                        return;
                    }
                }
            }
        }

        public void d(m<R> mVar, R r) {
            mVar.b().offer(r);
            c();
        }

        public void dispose() {
            if (!this.m) {
                this.m = true;
                this.j.dispose();
                f();
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            m<R> mVar = this.n;
            if (mVar != null) {
                mVar.dispose();
            }
            while (true) {
                m poll = this.h.poll();
                if (poll != null) {
                    poll.dispose();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void f() {
            if (getAndIncrement() == 0) {
                do {
                    this.i.clear();
                    e();
                } while (decrementAndGet() != 0);
            }
        }

        public void onComplete() {
            this.k = true;
            c();
        }

        public void onError(Throwable th) {
            if (this.g.a(th)) {
                this.k = true;
                c();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            if (this.l == 0) {
                this.i.offer(t);
            }
            c();
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.j, bVar)) {
                this.j = bVar;
                if (bVar instanceof d.a.a0.c.b) {
                    d.a.a0.c.b bVar2 = (d.a.a0.c.b) bVar;
                    int g2 = bVar2.g(3);
                    if (g2 == 1) {
                        this.l = g2;
                        this.i = bVar2;
                        this.k = true;
                        this.f14144b.onSubscribe(this);
                        c();
                        return;
                    } else if (g2 == 2) {
                        this.l = g2;
                        this.i = bVar2;
                        this.f14144b.onSubscribe(this);
                        return;
                    }
                }
                this.i = new d.a.a0.f.c(this.f14147e);
                this.f14144b.onSubscribe(this);
            }
        }
    }

    public v(q<T> qVar, n<? super T, ? extends q<? extends R>> nVar, i iVar, int i, int i2) {
        super(qVar);
        this.f14140c = nVar;
        this.f14141d = iVar;
        this.f14142e = i;
        this.f14143f = i2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super R> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f14140c, this.f14142e, this.f14143f, this.f14141d));
    }
}
