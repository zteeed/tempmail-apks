package d.a.a0.e.d;

import d.a.a0.j.j;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableGroupJoin */
public final class j1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends a<TLeft, R> {

    /* renamed from: c  reason: collision with root package name */
    final q<? extends TRight> f13681c;

    /* renamed from: d  reason: collision with root package name */
    final n<? super TLeft, ? extends q<TLeftEnd>> f13682d;

    /* renamed from: e  reason: collision with root package name */
    final n<? super TRight, ? extends q<TRightEnd>> f13683e;

    /* renamed from: f  reason: collision with root package name */
    final d.a.z.c<? super TLeft, ? super l<TRight>, ? extends R> f13684f;

    /* compiled from: ObservableGroupJoin */
    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements d.a.y.b, b {
        static final Integer o = 1;
        static final Integer p = 2;
        static final Integer q = 3;
        static final Integer r = 4;
        private static final long serialVersionUID = -6071216598687999801L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f13685b;

        /* renamed from: c  reason: collision with root package name */
        final d.a.a0.f.c<Object> f13686c = new d.a.a0.f.c<>(l.bufferSize());

        /* renamed from: d  reason: collision with root package name */
        final d.a.y.a f13687d = new d.a.y.a();

        /* renamed from: e  reason: collision with root package name */
        final Map<Integer, d.a.f0.d<TRight>> f13688e = new LinkedHashMap();

        /* renamed from: f  reason: collision with root package name */
        final Map<Integer, TRight> f13689f = new LinkedHashMap();
        final AtomicReference<Throwable> g = new AtomicReference<>();
        final n<? super TLeft, ? extends q<TLeftEnd>> h;
        final n<? super TRight, ? extends q<TRightEnd>> i;
        final d.a.z.c<? super TLeft, ? super l<TRight>, ? extends R> j;
        final AtomicInteger k;
        int l;
        int m;
        volatile boolean n;

        a(s<? super R> sVar, n<? super TLeft, ? extends q<TLeftEnd>> nVar, n<? super TRight, ? extends q<TRightEnd>> nVar2, d.a.z.c<? super TLeft, ? super l<TRight>, ? extends R> cVar) {
            this.f13685b = sVar;
            this.h = nVar;
            this.i = nVar2;
            this.j = cVar;
            this.k = new AtomicInteger(2);
        }

        public void a(boolean z, c cVar) {
            synchronized (this) {
                this.f13686c.m(z ? q : r, cVar);
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

        public void c(d dVar) {
            this.f13687d.c(dVar);
            this.k.decrementAndGet();
            g();
        }

        public void d(boolean z, Object obj) {
            synchronized (this) {
                this.f13686c.m(z ? o : p, obj);
            }
            g();
        }

        public void dispose() {
            if (!this.n) {
                this.n = true;
                f();
                if (getAndIncrement() == 0) {
                    this.f13686c.clear();
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
            this.f13687d.dispose();
        }

        /* access modifiers changed from: package-private */
        public void g() {
            if (getAndIncrement() == 0) {
                d.a.a0.f.c<Object> cVar = this.f13686c;
                s<? super R> sVar = this.f13685b;
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
                        for (d.a.f0.d<TRight> onComplete : this.f13688e.values()) {
                            onComplete.onComplete();
                        }
                        this.f13688e.clear();
                        this.f13689f.clear();
                        this.f13687d.dispose();
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
                            d.a.f0.d e2 = d.a.f0.d.e();
                            int i3 = this.l;
                            this.l = i3 + 1;
                            this.f13688e.put(Integer.valueOf(i3), e2);
                            try {
                                Object apply = this.h.apply(poll);
                                d.a.a0.b.b.e(apply, "The leftEnd returned a null ObservableSource");
                                q qVar = (q) apply;
                                c cVar2 = new c(this, true, i3);
                                this.f13687d.b(cVar2);
                                qVar.subscribe(cVar2);
                                if (this.g.get() != null) {
                                    cVar.clear();
                                    f();
                                    h(sVar);
                                    return;
                                }
                                try {
                                    Object a2 = this.j.a(poll, e2);
                                    d.a.a0.b.b.e(a2, "The resultSelector returned a null value");
                                    sVar.onNext(a2);
                                    for (TRight onNext : this.f13689f.values()) {
                                        e2.onNext(onNext);
                                    }
                                } catch (Throwable th) {
                                    i(th, sVar, cVar);
                                    return;
                                }
                            } catch (Throwable th2) {
                                i(th2, sVar, cVar);
                                return;
                            }
                        } else if (num == p) {
                            int i4 = this.m;
                            this.m = i4 + 1;
                            this.f13689f.put(Integer.valueOf(i4), poll);
                            try {
                                Object apply2 = this.i.apply(poll);
                                d.a.a0.b.b.e(apply2, "The rightEnd returned a null ObservableSource");
                                q qVar2 = (q) apply2;
                                c cVar3 = new c(this, false, i4);
                                this.f13687d.b(cVar3);
                                qVar2.subscribe(cVar3);
                                if (this.g.get() != null) {
                                    cVar.clear();
                                    f();
                                    h(sVar);
                                    return;
                                }
                                for (d.a.f0.d<TRight> onNext2 : this.f13688e.values()) {
                                    onNext2.onNext(poll);
                                }
                            } catch (Throwable th3) {
                                i(th3, sVar, cVar);
                                return;
                            }
                        } else if (num == q) {
                            c cVar4 = (c) poll;
                            d.a.f0.d remove = this.f13688e.remove(Integer.valueOf(cVar4.f13692d));
                            this.f13687d.a(cVar4);
                            if (remove != null) {
                                remove.onComplete();
                            }
                        } else if (num == r) {
                            c cVar5 = (c) poll;
                            this.f13689f.remove(Integer.valueOf(cVar5.f13692d));
                            this.f13687d.a(cVar5);
                        }
                    }
                }
                cVar.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void h(s<?> sVar) {
            Throwable b2 = j.b(this.g);
            for (d.a.f0.d<TRight> onError : this.f13688e.values()) {
                onError.onError(b2);
            }
            this.f13688e.clear();
            this.f13689f.clear();
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

    /* compiled from: ObservableGroupJoin */
    interface b {
        void a(boolean z, c cVar);

        void b(Throwable th);

        void c(d dVar);

        void d(boolean z, Object obj);

        void e(Throwable th);
    }

    /* compiled from: ObservableGroupJoin */
    static final class c extends AtomicReference<d.a.y.b> implements s<Object>, d.a.y.b {
        private static final long serialVersionUID = 1883890389173668373L;

        /* renamed from: b  reason: collision with root package name */
        final b f13690b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f13691c;

        /* renamed from: d  reason: collision with root package name */
        final int f13692d;

        c(b bVar, boolean z, int i) {
            this.f13690b = bVar;
            this.f13691c = z;
            this.f13692d = i;
        }

        public void dispose() {
            d.a.a0.a.c.f(this);
        }

        public void onComplete() {
            this.f13690b.a(this.f13691c, this);
        }

        public void onError(Throwable th) {
            this.f13690b.b(th);
        }

        public void onNext(Object obj) {
            if (d.a.a0.a.c.f(this)) {
                this.f13690b.a(this.f13691c, this);
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this, bVar);
        }
    }

    /* compiled from: ObservableGroupJoin */
    static final class d extends AtomicReference<d.a.y.b> implements s<Object>, d.a.y.b {
        private static final long serialVersionUID = 1883890389173668373L;

        /* renamed from: b  reason: collision with root package name */
        final b f13693b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f13694c;

        d(b bVar, boolean z) {
            this.f13693b = bVar;
            this.f13694c = z;
        }

        public void dispose() {
            d.a.a0.a.c.f(this);
        }

        public void onComplete() {
            this.f13693b.c(this);
        }

        public void onError(Throwable th) {
            this.f13693b.e(th);
        }

        public void onNext(Object obj) {
            this.f13693b.d(this.f13694c, obj);
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this, bVar);
        }
    }

    public j1(q<TLeft> qVar, q<? extends TRight> qVar2, n<? super TLeft, ? extends q<TLeftEnd>> nVar, n<? super TRight, ? extends q<TRightEnd>> nVar2, d.a.z.c<? super TLeft, ? super l<TRight>, ? extends R> cVar) {
        super(qVar);
        this.f13681c = qVar2;
        this.f13682d = nVar;
        this.f13683e = nVar2;
        this.f13684f = cVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super R> sVar) {
        a aVar = new a(sVar, this.f13682d, this.f13683e, this.f13684f);
        sVar.onSubscribe(aVar);
        d dVar = new d(aVar, true);
        aVar.f13687d.b(dVar);
        d dVar2 = new d(aVar, false);
        aVar.f13687d.b(dVar2);
        this.f13338b.subscribe(dVar);
        this.f13681c.subscribe(dVar2);
    }
}
