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
    final long f13711c;

    /* renamed from: d  reason: collision with root package name */
    final long f13712d;

    /* renamed from: e  reason: collision with root package name */
    final TimeUnit f13713e;

    /* renamed from: f  reason: collision with root package name */
    final t f13714f;
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
        static final class C0139a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final long f13715b;

            /* renamed from: c  reason: collision with root package name */
            final a<?> f13716c;

            C0139a(long j, a<?> aVar) {
                this.f13715b = j;
                this.f13716c = aVar;
            }

            public void run() {
                a<?> aVar = this.f13716c;
                if (!aVar.f13250e) {
                    aVar.f13249d.offer(this);
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
            this.f13250e = true;
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
            d.a.a0.f.a aVar = (d.a.a0.f.a) this.f13249d;
            s<? super V> sVar = this.f13248c;
            d<T> dVar = this.r;
            int i2 = 1;
            while (!this.s) {
                boolean z = this.f13251f;
                Object poll = aVar.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof C0139a;
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
                    C0139a aVar2 = (C0139a) poll;
                    if (!this.l || this.p == aVar2.f13715b) {
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
                        this.f13248c.onNext(dVar);
                        if (this.l) {
                            d.a.y.b bVar = (d.a.y.b) this.t.get();
                            bVar.dispose();
                            t.c cVar = this.n;
                            C0139a aVar3 = new C0139a(this.p, this);
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
            this.f13251f = true;
            if (f()) {
                m();
            }
            this.f13248c.onComplete();
        }

        public void onError(Throwable th) {
            this.g = th;
            this.f13251f = true;
            if (f()) {
                m();
            }
            this.f13248c.onError(th);
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
                        this.f13248c.onNext(f2);
                        if (this.l) {
                            ((d.a.y.b) this.t.get()).dispose();
                            t.c cVar = this.n;
                            C0139a aVar = new C0139a(this.p, this);
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
                    e<U> eVar = this.f13249d;
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
                s<? super V> sVar = this.f13248c;
                sVar.onSubscribe(this);
                if (!this.f13250e) {
                    d<T> f2 = d.f(this.k);
                    this.r = f2;
                    sVar.onNext(f2);
                    C0139a aVar = new C0139a(this.p, this);
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
            this.f13250e = true;
        }

        /* access modifiers changed from: package-private */
        public void j() {
            d.a.a0.f.a aVar = (d.a.a0.f.a) this.f13249d;
            s<? super V> sVar = this.f13248c;
            d<T> dVar = this.m;
            int i2 = 1;
            while (true) {
                boolean z = this.o;
                boolean z2 = this.f13251f;
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
            this.f13251f = true;
            if (f()) {
                j();
            }
            this.f13248c.onComplete();
        }

        public void onError(Throwable th) {
            this.g = th;
            this.f13251f = true;
            if (f()) {
                j();
            }
            this.f13248c.onError(th);
        }

        public void onNext(T t) {
            if (!this.o) {
                if (g()) {
                    this.m.onNext(t);
                    if (e(-1) == 0) {
                        return;
                    }
                } else {
                    e<U> eVar = this.f13249d;
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
                s<? super V> sVar = this.f13248c;
                sVar.onSubscribe(this);
                sVar.onNext(this.m);
                if (!this.f13250e) {
                    t tVar = this.j;
                    long j2 = this.h;
                    this.n.b(tVar.e(this, j2, j2, this.i));
                }
            }
        }

        public void run() {
            if (this.f13250e) {
                this.o = true;
            }
            this.f13249d.offer(p);
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
            private final d<T> f13717b;

            a(d<T> dVar) {
                this.f13717b = dVar;
            }

            public void run() {
                c.this.j(this.f13717b);
            }
        }

        /* compiled from: ObservableWindowTimed */
        static final class b<T> {

            /* renamed from: a  reason: collision with root package name */
            final d<T> f13719a;

            /* renamed from: b  reason: collision with root package name */
            final boolean f13720b;

            b(d<T> dVar, boolean z) {
                this.f13719a = dVar;
                this.f13720b = z;
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
            this.f13250e = true;
        }

        /* access modifiers changed from: package-private */
        public void j(d<T> dVar) {
            this.f13249d.offer(new b(dVar, false));
            if (f()) {
                k();
            }
        }

        /* access modifiers changed from: package-private */
        public void k() {
            d.a.a0.f.a aVar = (d.a.a0.f.a) this.f13249d;
            s<? super V> sVar = this.f13248c;
            List<d<T>> list = this.m;
            int i2 = 1;
            while (!this.o) {
                boolean z = this.f13251f;
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
                    if (!bVar.f13720b) {
                        list.remove(bVar.f13719a);
                        bVar.f13719a.onComplete();
                        if (list.isEmpty() && this.f13250e) {
                            this.o = true;
                        }
                    } else if (!this.f13250e) {
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
            this.f13251f = true;
            if (f()) {
                k();
            }
            this.f13248c.onComplete();
        }

        public void onError(Throwable th) {
            this.g = th;
            this.f13251f = true;
            if (f()) {
                k();
            }
            this.f13248c.onError(th);
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
                this.f13249d.offer(t);
                if (!f()) {
                    return;
                }
            }
            k();
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.n, bVar)) {
                this.n = bVar;
                this.f13248c.onSubscribe(this);
                if (!this.f13250e) {
                    d f2 = d.f(this.l);
                    this.m.add(f2);
                    this.f13248c.onNext(f2);
                    this.k.c(new a(f2), this.h, this.j);
                    t.c cVar = this.k;
                    long j2 = this.i;
                    cVar.d(this, j2, j2, this.j);
                }
            }
        }

        public void run() {
            b bVar = new b(d.f(this.l), true);
            if (!this.f13250e) {
                this.f13249d.offer(bVar);
            }
            if (f()) {
                k();
            }
        }
    }

    public j4(q<T> qVar, long j, long j2, TimeUnit timeUnit, t tVar, long j3, int i2, boolean z) {
        super(qVar);
        this.f13711c = j;
        this.f13712d = j2;
        this.f13713e = timeUnit;
        this.f13714f = tVar;
        this.g = j3;
        this.h = i2;
        this.i = z;
    }

    public void subscribeActual(s<? super l<T>> sVar) {
        d.a.c0.e eVar = new d.a.c0.e(sVar);
        long j = this.f13711c;
        long j2 = this.f13712d;
        if (j == j2) {
            long j3 = this.g;
            if (j3 == Long.MAX_VALUE) {
                this.f13338b.subscribe(new b(eVar, this.f13711c, this.f13713e, this.f13714f, this.h));
            } else {
                this.f13338b.subscribe(new a(eVar, j, this.f13713e, this.f13714f, this.h, j3, this.i));
            }
        } else {
            this.f13338b.subscribe(new c(eVar, j, j2, this.f13713e, this.f13714f.a(), this.h));
        }
    }
}
