package d.a.a0.e.d;

import d.a.c0.c;
import d.a.f0.d;
import d.a.l;
import d.a.q;
import d.a.s;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableWindowBoundarySupplier */
public final class i4<T, B> extends a<T, l<T>> {

    /* renamed from: c  reason: collision with root package name */
    final Callable<? extends q<B>> f13664c;

    /* renamed from: d  reason: collision with root package name */
    final int f13665d;

    /* compiled from: ObservableWindowBoundarySupplier */
    static final class a<T, B> extends c<B> {

        /* renamed from: c  reason: collision with root package name */
        final b<T, B> f13666c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13667d;

        a(b<T, B> bVar) {
            this.f13666c = bVar;
        }

        public void onComplete() {
            if (!this.f13667d) {
                this.f13667d = true;
                this.f13666c.c();
            }
        }

        public void onError(Throwable th) {
            if (this.f13667d) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13667d = true;
            this.f13666c.d(th);
        }

        public void onNext(B b2) {
            if (!this.f13667d) {
                this.f13667d = true;
                dispose();
                this.f13666c.e(this);
            }
        }
    }

    /* compiled from: ObservableWindowBoundarySupplier */
    static final class b<T, B> extends AtomicInteger implements s<T>, d.a.y.b, Runnable {
        static final a<Object, Object> m = new a<>((b) null);
        static final Object n = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super l<T>> f13668b;

        /* renamed from: c  reason: collision with root package name */
        final int f13669c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReference<a<T, B>> f13670d = new AtomicReference<>();

        /* renamed from: e  reason: collision with root package name */
        final AtomicInteger f13671e = new AtomicInteger(1);

        /* renamed from: f  reason: collision with root package name */
        final d.a.a0.f.a<Object> f13672f = new d.a.a0.f.a<>();
        final d.a.a0.j.c g = new d.a.a0.j.c();
        final AtomicBoolean h = new AtomicBoolean();
        final Callable<? extends q<B>> i;
        d.a.y.b j;
        volatile boolean k;
        d<T> l;

        b(s<? super l<T>> sVar, int i2, Callable<? extends q<B>> callable) {
            this.f13668b = sVar;
            this.f13669c = i2;
            this.i = callable;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            d.a.y.b andSet = this.f13670d.getAndSet(m);
            if (andSet != null && andSet != m) {
                andSet.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (getAndIncrement() == 0) {
                s<? super l<T>> sVar = this.f13668b;
                d.a.a0.f.a<Object> aVar = this.f13672f;
                d.a.a0.j.c cVar = this.g;
                int i2 = 1;
                while (this.f13671e.get() != 0) {
                    d<T> dVar = this.l;
                    boolean z = this.k;
                    if (!z || cVar.get() == null) {
                        Object poll = aVar.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable b2 = cVar.b();
                            if (b2 == null) {
                                if (dVar != null) {
                                    this.l = null;
                                    dVar.onComplete();
                                }
                                sVar.onComplete();
                                return;
                            }
                            if (dVar != null) {
                                this.l = null;
                                dVar.onError(b2);
                            }
                            sVar.onError(b2);
                            return;
                        } else if (z2) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else if (poll != n) {
                            dVar.onNext(poll);
                        } else {
                            if (dVar != null) {
                                this.l = null;
                                dVar.onComplete();
                            }
                            if (!this.h.get()) {
                                d<T> g2 = d.g(this.f13669c, this);
                                this.l = g2;
                                this.f13671e.getAndIncrement();
                                try {
                                    Object call = this.i.call();
                                    d.a.a0.b.b.e(call, "The other Callable returned a null ObservableSource");
                                    q qVar = (q) call;
                                    a aVar2 = new a(this);
                                    if (this.f13670d.compareAndSet((Object) null, aVar2)) {
                                        qVar.subscribe(aVar2);
                                        sVar.onNext(g2);
                                    }
                                } catch (Throwable th) {
                                    io.reactivex.exceptions.a.b(th);
                                    cVar.a(th);
                                    this.k = true;
                                }
                            }
                        }
                    } else {
                        aVar.clear();
                        Throwable b3 = cVar.b();
                        if (dVar != null) {
                            this.l = null;
                            dVar.onError(b3);
                        }
                        sVar.onError(b3);
                        return;
                    }
                }
                aVar.clear();
                this.l = null;
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.j.dispose();
            this.k = true;
            b();
        }

        /* access modifiers changed from: package-private */
        public void d(Throwable th) {
            this.j.dispose();
            if (this.g.a(th)) {
                this.k = true;
                b();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void dispose() {
            if (this.h.compareAndSet(false, true)) {
                a();
                if (this.f13671e.decrementAndGet() == 0) {
                    this.j.dispose();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e(a<T, B> aVar) {
            this.f13670d.compareAndSet(aVar, (Object) null);
            this.f13672f.offer(n);
            b();
        }

        public void onComplete() {
            a();
            this.k = true;
            b();
        }

        public void onError(Throwable th) {
            a();
            if (this.g.a(th)) {
                this.k = true;
                b();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            this.f13672f.offer(t);
            b();
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.j, bVar)) {
                this.j = bVar;
                this.f13668b.onSubscribe(this);
                this.f13672f.offer(n);
                b();
            }
        }

        public void run() {
            if (this.f13671e.decrementAndGet() == 0) {
                this.j.dispose();
            }
        }
    }

    public i4(q<T> qVar, Callable<? extends q<B>> callable, int i) {
        super(qVar);
        this.f13664c = callable;
        this.f13665d = i;
    }

    public void subscribeActual(s<? super l<T>> sVar) {
        this.f13338b.subscribe(new b(sVar, this.f13665d, this.f13664c));
    }
}
