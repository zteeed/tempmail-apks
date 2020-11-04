package d.a.a0.e.d;

import d.a.c0.e;
import d.a.q;
import d.a.s;
import d.a.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSampleTimed */
public final class w2<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f14199c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f14200d;

    /* renamed from: e  reason: collision with root package name */
    final t f14201e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f14202f;

    /* compiled from: ObservableSampleTimed */
    static final class a<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger h = new AtomicInteger(1);

        a(s<? super T> sVar, long j, TimeUnit timeUnit, t tVar) {
            super(sVar, j, timeUnit, tVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            c();
            if (this.h.decrementAndGet() == 0) {
                this.f14203b.onComplete();
            }
        }

        public void run() {
            if (this.h.incrementAndGet() == 2) {
                c();
                if (this.h.decrementAndGet() == 0) {
                    this.f14203b.onComplete();
                }
            }
        }
    }

    /* compiled from: ObservableSampleTimed */
    static final class b<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        b(s<? super T> sVar, long j, TimeUnit timeUnit, t tVar) {
            super(sVar, j, timeUnit, tVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f14203b.onComplete();
        }

        public void run() {
            c();
        }
    }

    /* compiled from: ObservableSampleTimed */
    static abstract class c<T> extends AtomicReference<T> implements s<T>, d.a.y.b, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14203b;

        /* renamed from: c  reason: collision with root package name */
        final long f14204c;

        /* renamed from: d  reason: collision with root package name */
        final TimeUnit f14205d;

        /* renamed from: e  reason: collision with root package name */
        final t f14206e;

        /* renamed from: f  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f14207f = new AtomicReference<>();
        d.a.y.b g;

        c(s<? super T> sVar, long j, TimeUnit timeUnit, t tVar) {
            this.f14203b = sVar;
            this.f14204c = j;
            this.f14205d = timeUnit;
            this.f14206e = tVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            d.a.a0.a.c.f(this.f14207f);
        }

        /* access modifiers changed from: package-private */
        public abstract void b();

        /* access modifiers changed from: package-private */
        public void c() {
            Object andSet = getAndSet((Object) null);
            if (andSet != null) {
                this.f14203b.onNext(andSet);
            }
        }

        public void dispose() {
            a();
            this.g.dispose();
        }

        public void onComplete() {
            a();
            b();
        }

        public void onError(Throwable th) {
            a();
            this.f14203b.onError(th);
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.g, bVar)) {
                this.g = bVar;
                this.f14203b.onSubscribe(this);
                t tVar = this.f14206e;
                long j = this.f14204c;
                d.a.a0.a.c.h(this.f14207f, tVar.e(this, j, j, this.f14205d));
            }
        }
    }

    public w2(q<T> qVar, long j, TimeUnit timeUnit, t tVar, boolean z) {
        super(qVar);
        this.f14199c = j;
        this.f14200d = timeUnit;
        this.f14201e = tVar;
        this.f14202f = z;
    }

    public void subscribeActual(s<? super T> sVar) {
        e eVar = new e(sVar);
        if (this.f14202f) {
            this.f13338b.subscribe(new a(eVar, this.f14199c, this.f14200d, this.f14201e));
        } else {
            this.f13338b.subscribe(new b(eVar, this.f14199c, this.f14200d, this.f14201e));
        }
    }
}
