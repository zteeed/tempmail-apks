package d.a.a0.e.d;

import d.a.a0.e.d.j1;
import d.a.a0.j.j;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.c;
import d.a.z.n;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableJoin */
public final class q1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends a<TLeft, R> {

    /* renamed from: c  reason: collision with root package name */
    final q<? extends TRight> f13419c;

    /* renamed from: d  reason: collision with root package name */
    final n<? super TLeft, ? extends q<TLeftEnd>> f13420d;

    /* renamed from: e  reason: collision with root package name */
    final n<? super TRight, ? extends q<TRightEnd>> f13421e;

    /* renamed from: f  reason: collision with root package name */
    final c<? super TLeft, ? super TRight, ? extends R> f13422f;

    /* compiled from: ObservableJoin */
    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements b, j1.b {
        static final Integer o = 1;
        static final Integer p = 2;
        static final Integer q = 3;
        static final Integer r = 4;
        private static final long serialVersionUID = -6071216598687999801L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f13423b;

        /* renamed from: c  reason: collision with root package name */
        final d.a.a0.f.c<Object> f13424c = new d.a.a0.f.c<>(l.bufferSize());

        /* renamed from: d  reason: collision with root package name */
        final d.a.y.a f13425d = new d.a.y.a();

        /* renamed from: e  reason: collision with root package name */
        final Map<Integer, TLeft> f13426e = new LinkedHashMap();

        /* renamed from: f  reason: collision with root package name */
        final Map<Integer, TRight> f13427f = new LinkedHashMap();
        final AtomicReference<Throwable> g = new AtomicReference<>();
        final n<? super TLeft, ? extends q<TLeftEnd>> h;
        final n<? super TRight, ? extends q<TRightEnd>> i;
        final c<? super TLeft, ? super TRight, ? extends R> j;
        final AtomicInteger k;
        int l;
        int m;
        volatile boolean n;

        a(s<? super R> sVar, n<? super TLeft, ? extends q<TLeftEnd>> nVar, n<? super TRight, ? extends q<TRightEnd>> nVar2, c<? super TLeft, ? super TRight, ? extends R> cVar) {
            this.f13423b = sVar;
            this.h = nVar;
            this.i = nVar2;
            this.j = cVar;
            this.k = new AtomicInteger(2);
        }

        public void a(boolean z, j1.c cVar) {
            synchronized (this) {
                this.f13424c.m(z ? q : r, cVar);
            }
            g();
        }

        public void b(Throwable th) {
            if (j.a(this.g, th)) {
                g();
            } else {
                d.a.d0.a.s(th);
            }
        }

        public void c(j1.d dVar) {
            this.f13425d.c(dVar);
            this.k.decrementAndGet();
            g();
        }

        public void d(boolean z, Object obj) {
            synchronized (this) {
                this.f13424c.m(z ? o : p, obj);
            }
            g();
        }

        public void dispose() {
            if (!this.n) {
                this.n = true;
                f();
                if (getAndIncrement() == 0) {
                    this.f13424c.clear();
                }
            }
        }

        public void e(Throwable th) {
            if (j.a(this.g, th)) {
                this.k.decrementAndGet();
                g();
                return;
            }
            d.a.d0.a.s(th);
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.f13425d.dispose();
        }

        /* access modifiers changed from: package-private */
        public void g() {
            if (getAndIncrement() == 0) {
                d.a.a0.f.c<Object> cVar = this.f13424c;
                s<? super R> sVar = this.f13423b;
                int i2 = 1;
                while (!this.n) {
                    if (this.g.get() != null) {
                        cVar.clear();
                        f();
                        h(sVar);
                        return;
                    }
                    boolean z = this.k.get() == 0;
                    Integer num = (Integer) cVar.poll();
                    boolean z2 = num == null;
                    if (z && z2) {
                        this.f13426e.clear();
                        this.f13427f.clear();
                        this.f13425d.dispose();
                        sVar.onComplete();
                        return;
                    } else if (z2) {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        Object poll = cVar.poll();
                        if (num == o) {
                            int i3 = this.l;
                            this.l = i3 + 1;
                            this.f13426e.put(Integer.valueOf(i3), poll);
                            try {
                                Object apply = this.h.apply(poll);
                                d.a.a0.b.b.e(apply, "The leftEnd returned a null ObservableSource");
                                q qVar = (q) apply;
                                j1.c cVar2 = new j1.c(this, true, i3);
                                this.f13425d.b(cVar2);
                                qVar.subscribe(cVar2);
                                if (this.g.get() != null) {
                                    cVar.clear();
                                    f();
                                    h(sVar);
                                    return;
                                }
                                for (TRight a2 : this.f13427f.values()) {
                                    try {
                                        Object a3 = this.j.a(poll, a2);
                                        d.a.a0.b.b.e(a3, "The resultSelector returned a null value");
                                        sVar.onNext(a3);
                                    } catch (Throwable th) {
                                        i(th, sVar, cVar);
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                i(th2, sVar, cVar);
                                return;
                            }
                        } else if (num == p) {
                            int i4 = this.m;
                            this.m = i4 + 1;
                            this.f13427f.put(Integer.valueOf(i4), poll);
                            try {
                                Object apply2 = this.i.apply(poll);
                                d.a.a0.b.b.e(apply2, "The rightEnd returned a null ObservableSource");
                                q qVar2 = (q) apply2;
                                j1.c cVar3 = new j1.c(this, false, i4);
                                this.f13425d.b(cVar3);
                                qVar2.subscribe(cVar3);
                                if (this.g.get() != null) {
                                    cVar.clear();
                                    f();
                                    h(sVar);
                                    return;
                                }
                                for (TLeft a4 : this.f13426e.values()) {
                                    try {
                                        Object a5 = this.j.a(a4, poll);
                                        d.a.a0.b.b.e(a5, "The resultSelector returned a null value");
                                        sVar.onNext(a5);
                                    } catch (Throwable th3) {
                                        i(th3, sVar, cVar);
                                        return;
                                    }
                                }
                            } catch (Throwable th4) {
                                i(th4, sVar, cVar);
                                return;
                            }
                        } else if (num == q) {
                            j1.c cVar4 = (j1.c) poll;
                            this.f13426e.remove(Integer.valueOf(cVar4.f13134d));
                            this.f13425d.a(cVar4);
                        } else {
                            j1.c cVar5 = (j1.c) poll;
                            this.f13427f.remove(Integer.valueOf(cVar5.f13134d));
                            this.f13425d.a(cVar5);
                        }
                    }
                }
                cVar.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void h(s<?> sVar) {
            Throwable b2 = j.b(this.g);
            this.f13426e.clear();
            this.f13427f.clear();
            sVar.onError(b2);
        }

        /* access modifiers changed from: package-private */
        public void i(Throwable th, s<?> sVar, d.a.a0.f.c<?> cVar) {
            io.reactivex.exceptions.a.b(th);
            j.a(this.g, th);
            cVar.clear();
            f();
            h(sVar);
        }
    }

    public q1(q<TLeft> qVar, q<? extends TRight> qVar2, n<? super TLeft, ? extends q<TLeftEnd>> nVar, n<? super TRight, ? extends q<TRightEnd>> nVar2, c<? super TLeft, ? super TRight, ? extends R> cVar) {
        super(qVar);
        this.f13419c = qVar2;
        this.f13420d = nVar;
        this.f13421e = nVar2;
        this.f13422f = cVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super R> sVar) {
        a aVar = new a(sVar, this.f13420d, this.f13421e, this.f13422f);
        sVar.onSubscribe(aVar);
        j1.d dVar = new j1.d(aVar, true);
        aVar.f13425d.b(dVar);
        j1.d dVar2 = new j1.d(aVar, false);
        aVar.f13425d.b(dVar2);
        this.f12780b.subscribe(dVar);
        this.f13419c.subscribe(dVar2);
    }
}
