package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.a0.j.q;
import d.a.c0.e;
import d.a.s;
import d.a.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableBufferTimed */
public final class p<T, U extends Collection<? super T>> extends a<T, U> {

    /* renamed from: c  reason: collision with root package name */
    final long f13925c;

    /* renamed from: d  reason: collision with root package name */
    final long f13926d;

    /* renamed from: e  reason: collision with root package name */
    final TimeUnit f13927e;

    /* renamed from: f  reason: collision with root package name */
    final t f13928f;
    final Callable<U> g;
    final int h;
    final boolean i;

    /* compiled from: ObservableBufferTimed */
    static final class a<T, U extends Collection<? super T>> extends d.a.a0.d.p<T, U, U> implements Runnable, d.a.y.b {
        final Callable<U> h;
        final long i;
        final TimeUnit j;
        final int k;
        final boolean l;
        final t.c m;
        U n;
        d.a.y.b o;
        d.a.y.b p;
        long q;
        long r;

        a(s<? super U> sVar, Callable<U> callable, long j2, TimeUnit timeUnit, int i2, boolean z, t.c cVar) {
            super(sVar, new d.a.a0.f.a());
            this.h = callable;
            this.i = j2;
            this.j = timeUnit;
            this.k = i2;
            this.l = z;
            this.m = cVar;
        }

        public void dispose() {
            if (!this.f13250e) {
                this.f13250e = true;
                this.p.dispose();
                this.m.dispose();
                synchronized (this) {
                    this.n = null;
                }
            }
        }

        /* renamed from: j */
        public void c(s<? super U> sVar, U u) {
            sVar.onNext(u);
        }

        public void onComplete() {
            U u;
            this.m.dispose();
            synchronized (this) {
                u = this.n;
                this.n = null;
            }
            if (u != null) {
                this.f13249d.offer(u);
                this.f13251f = true;
                if (f()) {
                    q.c(this.f13249d, this.f13248c, false, this, this);
                }
            }
        }

        public void onError(Throwable th) {
            synchronized (this) {
                this.n = null;
            }
            this.f13248c.onError(th);
            this.m.dispose();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r7.l == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            r7.o.dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
            i(r0, false, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r8 = r7.h.call();
            d.a.a0.b.b.e(r8, "The buffer supplied is null");
            r8 = (java.util.Collection) r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r7.n = r8;
            r7.r++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
            if (r7.l == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
            r0 = r7.m;
            r4 = r7.i;
            r7.o = r0.d(r7, r4, r4, r7.j);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
            io.reactivex.exceptions.a.b(r8);
            r7.f13248c.onError(r8);
            dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNext(T r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                U r0 = r7.n     // Catch:{ all -> 0x0065 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                return
            L_0x0007:
                r0.add(r8)     // Catch:{ all -> 0x0065 }
                int r8 = r0.size()     // Catch:{ all -> 0x0065 }
                int r1 = r7.k     // Catch:{ all -> 0x0065 }
                if (r8 >= r1) goto L_0x0014
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                return
            L_0x0014:
                r8 = 0
                r7.n = r8     // Catch:{ all -> 0x0065 }
                long r1 = r7.q     // Catch:{ all -> 0x0065 }
                r3 = 1
                long r1 = r1 + r3
                r7.q = r1     // Catch:{ all -> 0x0065 }
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                boolean r8 = r7.l
                if (r8 == 0) goto L_0x0028
                d.a.y.b r8 = r7.o
                r8.dispose()
            L_0x0028:
                r8 = 0
                r7.i(r0, r8, r7)
                java.util.concurrent.Callable<U> r8 = r7.h     // Catch:{ all -> 0x0058 }
                java.lang.Object r8 = r8.call()     // Catch:{ all -> 0x0058 }
                java.lang.String r0 = "The buffer supplied is null"
                d.a.a0.b.b.e(r8, r0)     // Catch:{ all -> 0x0058 }
                java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x0058 }
                monitor-enter(r7)
                r7.n = r8     // Catch:{ all -> 0x0055 }
                long r0 = r7.r     // Catch:{ all -> 0x0055 }
                long r0 = r0 + r3
                r7.r = r0     // Catch:{ all -> 0x0055 }
                monitor-exit(r7)     // Catch:{ all -> 0x0055 }
                boolean r8 = r7.l
                if (r8 == 0) goto L_0x0054
                d.a.t$c r0 = r7.m
                long r4 = r7.i
                java.util.concurrent.TimeUnit r6 = r7.j
                r1 = r7
                r2 = r4
                d.a.y.b r8 = r0.d(r1, r2, r4, r6)
                r7.o = r8
            L_0x0054:
                return
            L_0x0055:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0055 }
                throw r8
            L_0x0058:
                r8 = move-exception
                io.reactivex.exceptions.a.b(r8)
                d.a.s<? super V> r0 = r7.f13248c
                r0.onError(r8)
                r7.dispose()
                return
            L_0x0065:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.p.a.onNext(java.lang.Object):void");
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.p, bVar)) {
                this.p = bVar;
                try {
                    U call = this.h.call();
                    d.a.a0.b.b.e(call, "The buffer supplied is null");
                    this.n = (Collection) call;
                    this.f13248c.onSubscribe(this);
                    t.c cVar = this.m;
                    long j2 = this.i;
                    this.o = cVar.d(this, j2, j2, this.j);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    bVar.dispose();
                    d.m(th, this.f13248c);
                    this.m.dispose();
                }
            }
        }

        public void run() {
            try {
                U call = this.h.call();
                d.a.a0.b.b.e(call, "The bufferSupplier returned a null buffer");
                U u = (Collection) call;
                synchronized (this) {
                    U u2 = this.n;
                    if (u2 != null) {
                        if (this.q == this.r) {
                            this.n = u;
                            i(u2, false, this);
                        }
                    }
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                dispose();
                this.f13248c.onError(th);
            }
        }
    }

    /* compiled from: ObservableBufferTimed */
    static final class b<T, U extends Collection<? super T>> extends d.a.a0.d.p<T, U, U> implements Runnable, d.a.y.b {
        final Callable<U> h;
        final long i;
        final TimeUnit j;
        final t k;
        d.a.y.b l;
        U m;
        final AtomicReference<d.a.y.b> n = new AtomicReference<>();

        b(s<? super U> sVar, Callable<U> callable, long j2, TimeUnit timeUnit, t tVar) {
            super(sVar, new d.a.a0.f.a());
            this.h = callable;
            this.i = j2;
            this.j = timeUnit;
            this.k = tVar;
        }

        public void dispose() {
            d.a.a0.a.c.f(this.n);
            this.l.dispose();
        }

        /* renamed from: j */
        public void c(s<? super U> sVar, U u) {
            this.f13248c.onNext(u);
        }

        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.m;
                this.m = null;
            }
            if (u != null) {
                this.f13249d.offer(u);
                this.f13251f = true;
                if (f()) {
                    q.c(this.f13249d, this.f13248c, false, (d.a.y.b) null, this);
                }
            }
            d.a.a0.a.c.f(this.n);
        }

        public void onError(Throwable th) {
            synchronized (this) {
                this.m = null;
            }
            this.f13248c.onError(th);
            d.a.a0.a.c.f(this.n);
        }

        public void onNext(T t) {
            synchronized (this) {
                U u = this.m;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.l, bVar)) {
                this.l = bVar;
                try {
                    U call = this.h.call();
                    d.a.a0.b.b.e(call, "The buffer supplied is null");
                    this.m = (Collection) call;
                    this.f13248c.onSubscribe(this);
                    if (!this.f13250e) {
                        t tVar = this.k;
                        long j2 = this.i;
                        d.a.y.b e2 = tVar.e(this, j2, j2, this.j);
                        if (!this.n.compareAndSet((Object) null, e2)) {
                            e2.dispose();
                        }
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    dispose();
                    d.m(th, this.f13248c);
                }
            }
        }

        public void run() {
            U u;
            try {
                U call = this.h.call();
                d.a.a0.b.b.e(call, "The bufferSupplier returned a null buffer");
                U u2 = (Collection) call;
                synchronized (this) {
                    u = this.m;
                    if (u != null) {
                        this.m = u2;
                    }
                }
                if (u == null) {
                    d.a.a0.a.c.f(this.n);
                } else {
                    h(u, false, this);
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f13248c.onError(th);
                dispose();
            }
        }
    }

    /* compiled from: ObservableBufferTimed */
    static final class c<T, U extends Collection<? super T>> extends d.a.a0.d.p<T, U, U> implements Runnable, d.a.y.b {
        final Callable<U> h;
        final long i;
        final long j;
        final TimeUnit k;
        final t.c l;
        final List<U> m = new LinkedList();
        d.a.y.b n;

        /* compiled from: ObservableBufferTimed */
        final class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private final U f13929b;

            a(U u) {
                this.f13929b = u;
            }

            public void run() {
                synchronized (c.this) {
                    c.this.m.remove(this.f13929b);
                }
                c cVar = c.this;
                cVar.i(this.f13929b, false, cVar.l);
            }
        }

        /* compiled from: ObservableBufferTimed */
        final class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private final U f13931b;

            b(U u) {
                this.f13931b = u;
            }

            public void run() {
                synchronized (c.this) {
                    c.this.m.remove(this.f13931b);
                }
                c cVar = c.this;
                cVar.i(this.f13931b, false, cVar.l);
            }
        }

        c(s<? super U> sVar, Callable<U> callable, long j2, long j3, TimeUnit timeUnit, t.c cVar) {
            super(sVar, new d.a.a0.f.a());
            this.h = callable;
            this.i = j2;
            this.j = j3;
            this.k = timeUnit;
            this.l = cVar;
        }

        public void dispose() {
            if (!this.f13250e) {
                this.f13250e = true;
                m();
                this.n.dispose();
                this.l.dispose();
            }
        }

        /* renamed from: j */
        public void c(s<? super U> sVar, U u) {
            sVar.onNext(u);
        }

        /* access modifiers changed from: package-private */
        public void m() {
            synchronized (this) {
                this.m.clear();
            }
        }

        public void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList<>(this.m);
                this.m.clear();
            }
            for (Collection offer : arrayList) {
                this.f13249d.offer(offer);
            }
            this.f13251f = true;
            if (f()) {
                q.c(this.f13249d, this.f13248c, false, this.l, this);
            }
        }

        public void onError(Throwable th) {
            this.f13251f = true;
            m();
            this.f13248c.onError(th);
            this.l.dispose();
        }

        public void onNext(T t) {
            synchronized (this) {
                for (U add : this.m) {
                    add.add(t);
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.n, bVar)) {
                this.n = bVar;
                try {
                    U call = this.h.call();
                    d.a.a0.b.b.e(call, "The buffer supplied is null");
                    Collection collection = (Collection) call;
                    this.m.add(collection);
                    this.f13248c.onSubscribe(this);
                    t.c cVar = this.l;
                    long j2 = this.j;
                    cVar.d(this, j2, j2, this.k);
                    this.l.c(new b(collection), this.i, this.k);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    bVar.dispose();
                    d.m(th, this.f13248c);
                    this.l.dispose();
                }
            }
        }

        public void run() {
            if (!this.f13250e) {
                try {
                    U call = this.h.call();
                    d.a.a0.b.b.e(call, "The bufferSupplier returned a null buffer");
                    Collection collection = (Collection) call;
                    synchronized (this) {
                        if (!this.f13250e) {
                            this.m.add(collection);
                            this.l.c(new a(collection), this.i, this.k);
                        }
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13248c.onError(th);
                    dispose();
                }
            }
        }
    }

    public p(d.a.q<T> qVar, long j, long j2, TimeUnit timeUnit, t tVar, Callable<U> callable, int i2, boolean z) {
        super(qVar);
        this.f13925c = j;
        this.f13926d = j2;
        this.f13927e = timeUnit;
        this.f13928f = tVar;
        this.g = callable;
        this.h = i2;
        this.i = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super U> sVar) {
        if (this.f13925c == this.f13926d && this.h == Integer.MAX_VALUE) {
            this.f13338b.subscribe(new b(new e(sVar), this.g, this.f13925c, this.f13927e, this.f13928f));
            return;
        }
        t.c a2 = this.f13928f.a();
        if (this.f13925c == this.f13926d) {
            this.f13338b.subscribe(new a(new e(sVar), this.g, this.f13925c, this.f13927e, this.h, this.i, a2));
        } else {
            this.f13338b.subscribe(new c(new e(sVar), this.g, this.f13925c, this.f13926d, this.f13927e, a2));
        }
    }
}
