package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.l;
import d.a.s;
import d.a.t;
import d.a.y.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableThrottleLatest */
public final class w3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f14208c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f14209d;

    /* renamed from: e  reason: collision with root package name */
    final t f14210e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f14211f;

    /* compiled from: ObservableThrottleLatest */
    static final class a<T> extends AtomicInteger implements s<T>, b, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14212b;

        /* renamed from: c  reason: collision with root package name */
        final long f14213c;

        /* renamed from: d  reason: collision with root package name */
        final TimeUnit f14214d;

        /* renamed from: e  reason: collision with root package name */
        final t.c f14215e;

        /* renamed from: f  reason: collision with root package name */
        final boolean f14216f;
        final AtomicReference<T> g = new AtomicReference<>();
        b h;
        volatile boolean i;
        Throwable j;
        volatile boolean k;
        volatile boolean l;
        boolean m;

        a(s<? super T> sVar, long j2, TimeUnit timeUnit, t.c cVar, boolean z) {
            this.f14212b = sVar;
            this.f14213c = j2;
            this.f14214d = timeUnit;
            this.f14215e = cVar;
            this.f14216f = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                AtomicReference<T> atomicReference = this.g;
                s<? super T> sVar = this.f14212b;
                int i2 = 1;
                while (!this.k) {
                    boolean z = this.i;
                    if (!z || this.j == null) {
                        boolean z2 = atomicReference.get() == null;
                        if (z) {
                            T andSet = atomicReference.getAndSet((Object) null);
                            if (!z2 && this.f14216f) {
                                sVar.onNext(andSet);
                            }
                            sVar.onComplete();
                            this.f14215e.dispose();
                            return;
                        }
                        if (z2) {
                            if (this.l) {
                                this.m = false;
                                this.l = false;
                            }
                        } else if (!this.m || this.l) {
                            sVar.onNext(atomicReference.getAndSet((Object) null));
                            this.l = false;
                            this.m = true;
                            this.f14215e.c(this, this.f14213c, this.f14214d);
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        atomicReference.lazySet((Object) null);
                        sVar.onError(this.j);
                        this.f14215e.dispose();
                        return;
                    }
                }
                atomicReference.lazySet((Object) null);
            }
        }

        public void dispose() {
            this.k = true;
            this.h.dispose();
            this.f14215e.dispose();
            if (getAndIncrement() == 0) {
                this.g.lazySet((Object) null);
            }
        }

        public void onComplete() {
            this.i = true;
            a();
        }

        public void onError(Throwable th) {
            this.j = th;
            this.i = true;
            a();
        }

        public void onNext(T t) {
            this.g.set(t);
            a();
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.h, bVar)) {
                this.h = bVar;
                this.f14212b.onSubscribe(this);
            }
        }

        public void run() {
            this.l = true;
            a();
        }
    }

    public w3(l<T> lVar, long j, TimeUnit timeUnit, t tVar, boolean z) {
        super(lVar);
        this.f14208c = j;
        this.f14209d = timeUnit;
        this.f14210e = tVar;
        this.f14211f = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f14208c, this.f14209d, this.f14210e.a(), this.f14211f));
    }
}
