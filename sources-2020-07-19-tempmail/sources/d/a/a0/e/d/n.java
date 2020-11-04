package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.a0.d.p;
import d.a.c0.c;
import d.a.c0.e;
import d.a.q;
import d.a.s;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableBufferBoundarySupplier */
public final class n<T, U extends Collection<? super T>, B> extends a<T, U> {

    /* renamed from: c  reason: collision with root package name */
    final Callable<? extends q<B>> f13272c;

    /* renamed from: d  reason: collision with root package name */
    final Callable<U> f13273d;

    /* compiled from: ObservableBufferBoundarySupplier */
    static final class a<T, U extends Collection<? super T>, B> extends c<B> {

        /* renamed from: c  reason: collision with root package name */
        final b<T, U, B> f13274c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13275d;

        a(b<T, U, B> bVar) {
            this.f13274c = bVar;
        }

        public void onComplete() {
            if (!this.f13275d) {
                this.f13275d = true;
                this.f13274c.l();
            }
        }

        public void onError(Throwable th) {
            if (this.f13275d) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13275d = true;
            this.f13274c.onError(th);
        }

        public void onNext(B b2) {
            if (!this.f13275d) {
                this.f13275d = true;
                dispose();
                this.f13274c.l();
            }
        }
    }

    /* compiled from: ObservableBufferBoundarySupplier */
    static final class b<T, U extends Collection<? super T>, B> extends p<T, U, U> implements s<T>, d.a.y.b {
        final Callable<U> h;
        final Callable<? extends q<B>> i;
        d.a.y.b j;
        final AtomicReference<d.a.y.b> k = new AtomicReference<>();
        U l;

        b(s<? super U> sVar, Callable<U> callable, Callable<? extends q<B>> callable2) {
            super(sVar, new d.a.a0.f.a());
            this.h = callable;
            this.i = callable2;
        }

        public void dispose() {
            if (!this.f12692e) {
                this.f12692e = true;
                this.j.dispose();
                k();
                if (f()) {
                    this.f12691d.clear();
                }
            }
        }

        /* renamed from: j */
        public void c(s<? super U> sVar, U u) {
            this.f12690c.onNext(u);
        }

        /* access modifiers changed from: package-private */
        public void k() {
            d.a.a0.a.c.f(this.k);
        }

        /* access modifiers changed from: package-private */
        public void l() {
            try {
                U call = this.h.call();
                d.a.a0.b.b.e(call, "The buffer supplied is null");
                U u = (Collection) call;
                try {
                    Object call2 = this.i.call();
                    d.a.a0.b.b.e(call2, "The boundary ObservableSource supplied is null");
                    q qVar = (q) call2;
                    a aVar = new a(this);
                    if (d.a.a0.a.c.h(this.k, aVar)) {
                        synchronized (this) {
                            U u2 = this.l;
                            if (u2 != null) {
                                this.l = u;
                                qVar.subscribe(aVar);
                                h(u2, false, this);
                            }
                        }
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f12692e = true;
                    this.j.dispose();
                    this.f12690c.onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                dispose();
                this.f12690c.onError(th2);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            d.a.a0.j.q.c(r3.f12691d, r3.f12690c, false, r3, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            r3.f12691d.offer(r0);
            r3.f12693f = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (f() == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onComplete() {
            /*
                r3 = this;
                monitor-enter(r3)
                U r0 = r3.l     // Catch:{ all -> 0x0022 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                r1 = 0
                r3.l = r1     // Catch:{ all -> 0x0022 }
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                d.a.a0.c.e<U> r1 = r3.f12691d
                r1.offer(r0)
                r0 = 1
                r3.f12693f = r0
                boolean r0 = r3.f()
                if (r0 == 0) goto L_0x0021
                d.a.a0.c.e<U> r0 = r3.f12691d
                d.a.s<? super V> r1 = r3.f12690c
                r2 = 0
                d.a.a0.j.q.c(r0, r1, r2, r3, r3)
            L_0x0021:
                return
            L_0x0022:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.n.b.onComplete():void");
        }

        public void onError(Throwable th) {
            dispose();
            this.f12690c.onError(th);
        }

        public void onNext(T t) {
            synchronized (this) {
                U u = this.l;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.j, bVar)) {
                this.j = bVar;
                s<? super V> sVar = this.f12690c;
                try {
                    U call = this.h.call();
                    d.a.a0.b.b.e(call, "The buffer supplied is null");
                    this.l = (Collection) call;
                    try {
                        Object call2 = this.i.call();
                        d.a.a0.b.b.e(call2, "The boundary ObservableSource supplied is null");
                        q qVar = (q) call2;
                        a aVar = new a(this);
                        this.k.set(aVar);
                        sVar.onSubscribe(this);
                        if (!this.f12692e) {
                            qVar.subscribe(aVar);
                        }
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.b(th);
                        this.f12692e = true;
                        bVar.dispose();
                        d.m(th, sVar);
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f12692e = true;
                    bVar.dispose();
                    d.m(th2, sVar);
                }
            }
        }
    }

    public n(q<T> qVar, Callable<? extends q<B>> callable, Callable<U> callable2) {
        super(qVar);
        this.f13272c = callable;
        this.f13273d = callable2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super U> sVar) {
        this.f12780b.subscribe(new b(new e(sVar), this.f13273d, this.f13272c));
    }
}
