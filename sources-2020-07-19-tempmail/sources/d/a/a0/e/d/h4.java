package d.a.a0.e.d;

import d.a.a0.c.e;
import d.a.a0.d.p;
import d.a.a0.j.m;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableWindowBoundarySelector */
public final class h4<T, B, V> extends a<T, l<T>> {

    /* renamed from: c  reason: collision with root package name */
    final q<B> f13061c;

    /* renamed from: d  reason: collision with root package name */
    final n<? super B, ? extends q<V>> f13062d;

    /* renamed from: e  reason: collision with root package name */
    final int f13063e;

    /* compiled from: ObservableWindowBoundarySelector */
    static final class a<T, V> extends d.a.c0.c<V> {

        /* renamed from: c  reason: collision with root package name */
        final c<T, ?, V> f13064c;

        /* renamed from: d  reason: collision with root package name */
        final d.a.f0.d<T> f13065d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13066e;

        a(c<T, ?, V> cVar, d.a.f0.d<T> dVar) {
            this.f13064c = cVar;
            this.f13065d = dVar;
        }

        public void onComplete() {
            if (!this.f13066e) {
                this.f13066e = true;
                this.f13064c.j(this);
            }
        }

        public void onError(Throwable th) {
            if (this.f13066e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13066e = true;
            this.f13064c.m(th);
        }

        public void onNext(V v) {
            dispose();
            onComplete();
        }
    }

    /* compiled from: ObservableWindowBoundarySelector */
    static final class b<T, B> extends d.a.c0.c<B> {

        /* renamed from: c  reason: collision with root package name */
        final c<T, B, ?> f13067c;

        b(c<T, B, ?> cVar) {
            this.f13067c = cVar;
        }

        public void onComplete() {
            this.f13067c.onComplete();
        }

        public void onError(Throwable th) {
            this.f13067c.m(th);
        }

        public void onNext(B b2) {
            this.f13067c.n(b2);
        }
    }

    /* compiled from: ObservableWindowBoundarySelector */
    static final class c<T, B, V> extends p<T, Object, l<T>> implements d.a.y.b {
        final q<B> h;
        final n<? super B, ? extends q<V>> i;
        final int j;
        final d.a.y.a k;
        d.a.y.b l;
        final AtomicReference<d.a.y.b> m = new AtomicReference<>();
        final List<d.a.f0.d<T>> n;
        final AtomicLong o = new AtomicLong();
        final AtomicBoolean p = new AtomicBoolean();

        c(s<? super l<T>> sVar, q<B> qVar, n<? super B, ? extends q<V>> nVar, int i2) {
            super(sVar, new d.a.a0.f.a());
            this.h = qVar;
            this.i = nVar;
            this.j = i2;
            this.k = new d.a.y.a();
            this.n = new ArrayList();
            this.o.lazySet(1);
        }

        public void c(s<? super l<T>> sVar, Object obj) {
        }

        public void dispose() {
            if (this.p.compareAndSet(false, true)) {
                d.a.a0.a.c.f(this.m);
                if (this.o.decrementAndGet() == 0) {
                    this.l.dispose();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void j(a<T, V> aVar) {
            this.k.c(aVar);
            this.f12691d.offer(new d(aVar.f13065d, null));
            if (f()) {
                l();
            }
        }

        /* access modifiers changed from: package-private */
        public void k() {
            this.k.dispose();
            d.a.a0.a.c.f(this.m);
        }

        /* access modifiers changed from: package-private */
        public void l() {
            d.a.a0.f.a aVar = (d.a.a0.f.a) this.f12691d;
            s<? super V> sVar = this.f12690c;
            List<d.a.f0.d<T>> list = this.n;
            int i2 = 1;
            while (true) {
                boolean z = this.f12693f;
                Object poll = aVar.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    k();
                    Throwable th = this.g;
                    if (th != null) {
                        for (d.a.f0.d<T> onError : list) {
                            onError.onError(th);
                        }
                    } else {
                        for (d.a.f0.d<T> onComplete : list) {
                            onComplete.onComplete();
                        }
                    }
                    list.clear();
                    return;
                } else if (z2) {
                    i2 = e(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else if (poll instanceof d) {
                    d dVar = (d) poll;
                    d.a.f0.d<T> dVar2 = dVar.f13068a;
                    if (dVar2 != null) {
                        if (list.remove(dVar2)) {
                            dVar.f13068a.onComplete();
                            if (this.o.decrementAndGet() == 0) {
                                k();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.p.get()) {
                        d.a.f0.d f2 = d.a.f0.d.f(this.j);
                        list.add(f2);
                        sVar.onNext(f2);
                        try {
                            Object apply = this.i.apply(dVar.f13069b);
                            d.a.a0.b.b.e(apply, "The ObservableSource supplied is null");
                            q qVar = (q) apply;
                            a aVar2 = new a(this, f2);
                            if (this.k.b(aVar2)) {
                                this.o.getAndIncrement();
                                qVar.subscribe(aVar2);
                            }
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            this.p.set(true);
                            sVar.onError(th2);
                        }
                    }
                } else {
                    for (d.a.f0.d<T> onNext : list) {
                        m.o(poll);
                        onNext.onNext(poll);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void m(Throwable th) {
            this.l.dispose();
            this.k.dispose();
            onError(th);
        }

        /* access modifiers changed from: package-private */
        public void n(B b2) {
            this.f12691d.offer(new d((d.a.f0.d) null, b2));
            if (f()) {
                l();
            }
        }

        public void onComplete() {
            if (!this.f12693f) {
                this.f12693f = true;
                if (f()) {
                    l();
                }
                if (this.o.decrementAndGet() == 0) {
                    this.k.dispose();
                }
                this.f12690c.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f12693f) {
                d.a.d0.a.s(th);
                return;
            }
            this.g = th;
            this.f12693f = true;
            if (f()) {
                l();
            }
            if (this.o.decrementAndGet() == 0) {
                this.k.dispose();
            }
            this.f12690c.onError(th);
        }

        public void onNext(T t) {
            if (g()) {
                for (d.a.f0.d<T> onNext : this.n) {
                    onNext.onNext(t);
                }
                if (e(-1) == 0) {
                    return;
                }
            } else {
                e<U> eVar = this.f12691d;
                m.r(t);
                eVar.offer(t);
                if (!f()) {
                    return;
                }
            }
            l();
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.l, bVar)) {
                this.l = bVar;
                this.f12690c.onSubscribe(this);
                if (!this.p.get()) {
                    b bVar2 = new b(this);
                    if (this.m.compareAndSet((Object) null, bVar2)) {
                        this.h.subscribe(bVar2);
                    }
                }
            }
        }
    }

    /* compiled from: ObservableWindowBoundarySelector */
    static final class d<T, B> {

        /* renamed from: a  reason: collision with root package name */
        final d.a.f0.d<T> f13068a;

        /* renamed from: b  reason: collision with root package name */
        final B f13069b;

        d(d.a.f0.d<T> dVar, B b2) {
            this.f13068a = dVar;
            this.f13069b = b2;
        }
    }

    public h4(q<T> qVar, q<B> qVar2, n<? super B, ? extends q<V>> nVar, int i) {
        super(qVar);
        this.f13061c = qVar2;
        this.f13062d = nVar;
        this.f13063e = i;
    }

    public void subscribeActual(s<? super l<T>> sVar) {
        this.f12780b.subscribe(new c(new d.a.c0.e(sVar), this.f13061c, this.f13062d, this.f13063e));
    }
}
