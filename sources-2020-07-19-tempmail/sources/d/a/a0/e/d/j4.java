package d.a.a0.e.d;

import d.a.a0.a.g;
import d.a.a0.c.e;
import d.a.a0.d.p;
import d.a.a0.j.m;
import d.a.f0.d;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.t;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: ObservableWindowTimed */
public final class j4<T> extends a<T, l<T>> {

    /* renamed from: c  reason: collision with root package name */
    final long f13153c;

    /* renamed from: d  reason: collision with root package name */
    final long f13154d;

    /* renamed from: e  reason: collision with root package name */
    final TimeUnit f13155e;

    /* renamed from: f  reason: collision with root package name */
    final t f13156f;
    final long g;
    final int h;
    final boolean i;

    /* compiled from: ObservableWindowTimed */
    static final class a<T> extends p<T, Object, l<T>> implements d.a.y.b {
        final long h;
        final TimeUnit i;
        final t j;
        final int k;
        final boolean l;
        final long m;
        final t.c n;
        long o;
        long p;
        d.a.y.b q;
        d<T> r;
        volatile boolean s;
        final g t = new g();

        /* renamed from: d.a.a0.e.d.j4$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableWindowTimed */
        static final class C0141a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final long f13157b;

            /* renamed from: c  reason: collision with root package name */
            final a<?> f13158c;

            C0141a(long j, a<?> aVar) {
                this.f13157b = j;
                this.f13158c = aVar;
            }

            public void run() {
                a<?> aVar = this.f13158c;
                if (!aVar.f12692e) {
                    aVar.f12691d.offer(this);
                } else {
                    aVar.s = true;
                }
                if (aVar.f()) {
                    aVar.m();
                }
            }
        }

        a(s<? super l<T>> sVar, long j2, TimeUnit timeUnit, t tVar, int i2, long j3, boolean z) {
            super(sVar, new d.a.a0.f.a());
            this.h = j2;
            this.i = timeUnit;
            this.j = tVar;
            this.k = i2;
            this.m = j3;
            this.l = z;
            if (z) {
                this.n = tVar.a();
            } else {
                this.n = null;
            }
        }

        public void dispose() {
            this.f12692e = true;
        }

        /* access modifiers changed from: package-private */
        public void l() {
            d.a.a0.a.c.f(this.t);
            t.c cVar = this.n;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        public void m() {
            d.a.a0.f.a aVar = (d.a.a0.f.a) this.f12691d;
            s<? super V> sVar = this.f12690c;
            d<T> dVar = this.r;
            int i2 = 1;
            while (!this.s) {
                boolean z = this.f12693f;
                Object poll = aVar.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof C0141a;
                if (z && (z2 || z3)) {
                    this.r = null;
                    aVar.clear();
                    Throwable th = this.g;
                    if (th != null) {
                        dVar.onError(th);
                    } else {
                        dVar.onComplete();
                    }
                    l();
                    return;
                } else if (z2) {
                    i2 = e(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else if (z3) {
                    C0141a aVar2 = (C0141a) poll;
                    if (!this.l || this.p == aVar2.f13157b) {
                        dVar.onComplete();
                        this.o = 0;
                        dVar = d.f(this.k);
                        this.r = dVar;
                        sVar.onNext(dVar);
                    }
                } else {
                    m.o(poll);
                    dVar.onNext(poll);
                    long j2 = this.o + 1;
                    if (j2 >= this.m) {
                        this.p++;
                        this.o = 0;
                        dVar.onComplete();
                        dVar = d.f(this.k);
                        this.r = dVar;
                        this.f12690c.onNext(dVar);
                        if (this.l) {
                            d.a.y.b bVar = (d.a.y.b) this.t.get();
                            bVar.dispose();
                            t.c cVar = this.n;
                            C0141a aVar3 = new C0141a(this.p, this);
                            long j3 = this.h;
                            d.a.y.b d2 = cVar.d(aVar3, j3, j3, this.i);
                            if (!this.t.compareAndSet(bVar, d2)) {
                                d2.dispose();
                            }
                        }
                    } else {
                        this.o = j2;
                    }
                }
            }
            this.q.dispose();
            aVar.clear();
            l();
        }

        public void onComplete() {
            this.f12693f = true;
            if (f()) {
                m();
            }
            this.f12690c.onComplete();
        }

        public void onError(Throwable th) {
            this.g = th;
            this.f12693f = true;
            if (f()) {
                m();
            }
            this.f12690c.onError(th);
        }

        public void onNext(T t2) {
            if (!this.s) {
                if (g()) {
                    d<T> dVar = this.r;
                    dVar.onNext(t2);
                    long j2 = this.o + 1;
                    if (j2 >= this.m) {
                        this.p++;
                        this.o = 0;
                        dVar.onComplete();
                        d<T> f2 = d.f(this.k);
                        this.r = f2;
                        this.f12690c.onNext(f2);
                        if (this.l) {
                            ((d.a.y.b) this.t.get()).dispose();
                            t.c cVar = this.n;
                            C0141a aVar = new C0141a(this.p, this);
                            long j3 = this.h;
                            d.a.a0.a.c.h(this.t, cVar.d(aVar, j3, j3, this.i));
                        }
                    } else {
                        this.o = j2;
                    }
                    if (e(-1) == 0) {
                        return;
                    }
                } else {
                    e<U> eVar = this.f12691d;
                    m.r(t2);
                    eVar.offer(t2);
                    if (!f()) {
                        return;
                    }
                }
                m();
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.y.b bVar2;
            if (d.a.a0.a.c.p(this.q, bVar)) {
                this.q = bVar;
                s<? super V> sVar = this.f12690c;
                sVar.onSubscribe(this);
                if (!this.f12692e) {
                    d<T> f2 = d.f(this.k);
                    this.r = f2;
                    sVar.onNext(f2);
                    C0141a aVar = new C0141a(this.p, this);
                    if (this.l) {
                        t.c cVar = this.n;
                        long j2 = this.h;
                        bVar2 = cVar.d(aVar, j2, j2, this.i);
                    } else {
                        t tVar = this.j;
                        long j3 = this.h;
                        bVar2 = tVar.e(aVar, j3, j3, this.i);
                    }
                    this.t.b(bVar2);
                }
            }
        }
    }

    /* compiled from: ObservableWindowTimed */
    static final class b<T> extends p<T, Object, l<T>> implements s<T>, d.a.y.b, Runnable {
        static final Object p = new Object();
        final long h;
        final TimeUnit i;
        final t j;
        final int k;
        d.a.y.b l;
        d<T> m;
        final g n = new g();
        volatile boolean o;

        b(s<? super l<T>> sVar, long j2, TimeUnit timeUnit, t tVar, int i2) {
            super(sVar, new d.a.a0.f.a());
            this.h = j2;
            this.i = timeUnit;
            this.j = tVar;
            this.k = i2;
        }

        public void dispose() {
            this.f12692e = true;
        }

        /* access modifiers changed from: package-private */
        public void j() {
            d.a.a0.f.a aVar = (d.a.a0.f.a) this.f12691d;
            s<? super V> sVar = this.f12690c;
            d<T> dVar = this.m;
            int i2 = 1;
            while (true) {
                boolean z = this.o;
                boolean z2 = this.f12693f;
                Object poll = aVar.poll();
                if (!z2 || !(poll == null || poll == p)) {
                    if (poll == null) {
                        i2 = e(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else if (poll == p) {
                        dVar.onComplete();
                        if (!z) {
                            dVar = d.f(this.k);
                            this.m = dVar;
                            sVar.onNext(dVar);
                        } else {
                            this.l.dispose();
                        }
                    } else {
                        m.o(poll);
                        dVar.onNext(poll);
                    }
                }
            }
            this.m = null;
            aVar.clear();
            Throwable th = this.g;
            if (th != null) {
                dVar.onError(th);
            } else {
                dVar.onComplete();
            }
            this.n.dispose();
        }

        public void onComplete() {
            this.f12693f = true;
            if (f()) {
                j();
            }
            this.f12690c.onComplete();
        }

        public void onError(Throwable th) {
            this.g = th;
            this.f12693f = true;
            if (f()) {
                j();
            }
            this.f12690c.onError(th);
        }

        public void onNext(T t) {
            if (!this.o) {
                if (g()) {
                    this.m.onNext(t);
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
                j();
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.l, bVar)) {
                this.l = bVar;
                this.m = d.f(this.k);
                s<? super V> sVar = this.f12690c;
                sVar.onSubscribe(this);
                sVar.onNext(this.m);
                if (!this.f12692e) {
                    t tVar = this.j;
                    long j2 = this.h;
                    this.n.b(tVar.e(this, j2, j2, this.i));
                }
            }
        }

        public void run() {
            if (this.f12692e) {
                this.o = true;
            }
            this.f12691d.offer(p);
            if (f()) {
                j();
            }
        }
    }

    /* compiled from: ObservableWindowTimed */
    static final class c<T> extends p<T, Object, l<T>> implements d.a.y.b, Runnable {
        final long h;
        final long i;
        final TimeUnit j;
        final t.c k;
        final int l;
        final List<d<T>> m = new LinkedList();
        d.a.y.b n;
        volatile boolean o;

        /* compiled from: ObservableWindowTimed */
        final class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private final d<T> f13159b;

            a(d<T> dVar) {
                this.f13159b = dVar;
            }

            public void run() {
                c.this.j(this.f13159b);
            }
        }

        /* compiled from: ObservableWindowTimed */
        static final class b<T> {

            /* renamed from: a  reason: collision with root package name */
            final d<T> f13161a;

            /* renamed from: b  reason: collision with root package name */
            final boolean f13162b;

            b(d<T> dVar, boolean z) {
                this.f13161a = dVar;
                this.f13162b = z;
            }
        }

        c(s<? super l<T>> sVar, long j2, long j3, TimeUnit timeUnit, t.c cVar, int i2) {
            super(sVar, new d.a.a0.f.a());
            this.h = j2;
            this.i = j3;
            this.j = timeUnit;
            this.k = cVar;
            this.l = i2;
        }

        public void dispose() {
            this.f12692e = true;
        }

        /* access modifiers changed from: package-private */
        public void j(d<T> dVar) {
            this.f12691d.offer(new b(dVar, false));
            if (f()) {
                k();
            }
        }

        /* access modifiers changed from: package-private */
        public void k() {
            d.a.a0.f.a aVar = (d.a.a0.f.a) this.f12691d;
            s<? super V> sVar = this.f12690c;
            List<d<T>> list = this.m;
            int i2 = 1;
            while (!this.o) {
                boolean z = this.f12693f;
                Object poll = aVar.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof b;
                if (z && (z2 || z3)) {
                    aVar.clear();
                    Throwable th = this.g;
                    if (th != null) {
                        for (d<T> onError : list) {
                            onError.onError(th);
                        }
                    } else {
                        for (d<T> onComplete : list) {
                            onComplete.onComplete();
                        }
                    }
                    list.clear();
                    this.k.dispose();
                    return;
                } else if (z2) {
                    i2 = e(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else if (z3) {
                    b bVar = (b) poll;
                    if (!bVar.f13162b) {
                        list.remove(bVar.f13161a);
                        bVar.f13161a.onComplete();
                        if (list.isEmpty() && this.f12692e) {
                            this.o = true;
                        }
                    } else if (!this.f12692e) {
                        d f2 = d.f(this.l);
                        list.add(f2);
                        sVar.onNext(f2);
                        this.k.c(new a(f2), this.h, this.j);
                    }
                } else {
                    for (d<T> onNext : list) {
                        onNext.onNext(poll);
                    }
                }
            }
            this.n.dispose();
            aVar.clear();
            list.clear();
            this.k.dispose();
        }

        public void onComplete() {
            this.f12693f = true;
            if (f()) {
                k();
            }
            this.f12690c.onComplete();
        }

        public void onError(Throwable th) {
            this.g = th;
            this.f12693f = true;
            if (f()) {
                k();
            }
            this.f12690c.onError(th);
        }

        public void onNext(T t) {
            if (g()) {
                for (d<T> onNext : this.m) {
                    onNext.onNext(t);
                }
                if (e(-1) == 0) {
                    return;
                }
            } else {
                this.f12691d.offer(t);
                if (!f()) {
                    return;
                }
            }
            k();
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.n, bVar)) {
                this.n = bVar;
                this.f12690c.onSubscribe(this);
                if (!this.f12692e) {
                    d f2 = d.f(this.l);
                    this.m.add(f2);
                    this.f12690c.onNext(f2);
                    this.k.c(new a(f2), this.h, this.j);
                    t.c cVar = this.k;
                    long j2 = this.i;
                    cVar.d(this, j2, j2, this.j);
                }
            }
        }

        public void run() {
            b bVar = new b(d.f(this.l), true);
            if (!this.f12692e) {
                this.f12691d.offer(bVar);
            }
            if (f()) {
                k();
            }
        }
    }

    public j4(q<T> qVar, long j, long j2, TimeUnit timeUnit, t tVar, long j3, int i2, boolean z) {
        super(qVar);
        this.f13153c = j;
        this.f13154d = j2;
        this.f13155e = timeUnit;
        this.f13156f = tVar;
        this.g = j3;
        this.h = i2;
        this.i = z;
    }

    public void subscribeActual(s<? super l<T>> sVar) {
        d.a.c0.e eVar = new d.a.c0.e(sVar);
        long j = this.f13153c;
        long j2 = this.f13154d;
        if (j == j2) {
            long j3 = this.g;
            if (j3 == Long.MAX_VALUE) {
                this.f12780b.subscribe(new b(eVar, this.f13153c, this.f13155e, this.f13156f, this.h));
            } else {
                this.f12780b.subscribe(new a(eVar, j, this.f13155e, this.f13156f, this.h, j3, this.i));
            }
        } else {
            this.f12780b.subscribe(new c(eVar, j, j2, this.f13155e, this.f13156f.a(), this.h));
        }
    }
}
