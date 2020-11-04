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
    final long f13641c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f13642d;

    /* renamed from: e  reason: collision with root package name */
    final t f13643e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f13644f;

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
                this.f13645b.onComplete();
            }
        }

        public void run() {
            if (this.h.incrementAndGet() == 2) {
                c();
                if (this.h.decrementAndGet() == 0) {
                    this.f13645b.onComplete();
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
            this.f13645b.onComplete();
        }

        public void run() {
            c();
        }
    }

    /* compiled from: ObservableSampleTimed */
    static abstract class c<T> extends AtomicReference<T> implements s<T>, d.a.y.b, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13645b;

        /* renamed from: c  reason: collision with root package name */
        final long f13646c;

        /* renamed from: d  reason: collision with root package name */
        final TimeUnit f13647d;

        /* renamed from: e  reason: collision with root package name */
        final t f13648e;

        /* renamed from: f  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f13649f = new AtomicReference<>();
        d.a.y.b g;

        c(s<? super T> sVar, long j, TimeUnit timeUnit, t tVar) {
            this.f13645b = sVar;
            this.f13646c = j;
            this.f13647d = timeUnit;
            this.f13648e = tVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            d.a.a0.a.c.f(this.f13649f);
        }

        /* access modifiers changed from: package-private */
        public abstract void b();

        /* access modifiers changed from: package-private */
        public void c() {
            Object andSet = getAndSet((Object) null);
            if (andSet != null) {
                this.f13645b.onNext(andSet);
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
            this.f13645b.onError(th);
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.g, bVar)) {
                this.g = bVar;
                this.f13645b.onSubscribe(this);
                t tVar = this.f13648e;
                long j = this.f13646c;
                d.a.a0.a.c.h(this.f13649f, tVar.e(this, j, j, this.f13647d));
            }
        }
    }

    public w2(q<T> qVar, long j, TimeUnit timeUnit, t tVar, boolean z) {
        super(qVar);
        this.f13641c = j;
        this.f13642d = timeUnit;
        this.f13643e = tVar;
        this.f13644f = z;
    }

    public void subscribeActual(s<? super T> sVar) {
        e eVar = new e(sVar);
        if (this.f13644f) {
            this.f12780b.subscribe(new a(eVar, this.f13641c, this.f13642d, this.f13643e));
        } else {
            this.f12780b.subscribe(new b(eVar, this.f13641c, this.f13642d, this.f13643e));
        }
    }
}
