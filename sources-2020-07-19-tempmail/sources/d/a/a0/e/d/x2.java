package d.a.a0.e.d;

import d.a.c0.e;
import d.a.q;
import d.a.s;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSampleWithObservable */
public final class x2<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final q<?> f13674c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f13675d;

    /* compiled from: ObservableSampleWithObservable */
    static final class a<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        /* renamed from: f  reason: collision with root package name */
        final AtomicInteger f13676f = new AtomicInteger();
        volatile boolean g;

        a(s<? super T> sVar, q<?> qVar) {
            super(sVar, qVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.g = true;
            if (this.f13676f.getAndIncrement() == 0) {
                c();
                this.f13677b.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            if (this.f13676f.getAndIncrement() == 0) {
                do {
                    boolean z = this.g;
                    c();
                    if (z) {
                        this.f13677b.onComplete();
                        return;
                    }
                } while (this.f13676f.decrementAndGet() != 0);
            }
        }
    }

    /* compiled from: ObservableSampleWithObservable */
    static final class b<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        b(s<? super T> sVar, q<?> qVar) {
            super(sVar, qVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f13677b.onComplete();
        }

        /* access modifiers changed from: package-private */
        public void e() {
            c();
        }
    }

    /* compiled from: ObservableSampleWithObservable */
    static abstract class c<T> extends AtomicReference<T> implements s<T>, d.a.y.b {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13677b;

        /* renamed from: c  reason: collision with root package name */
        final q<?> f13678c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f13679d = new AtomicReference<>();

        /* renamed from: e  reason: collision with root package name */
        d.a.y.b f13680e;

        c(s<? super T> sVar, q<?> qVar) {
            this.f13677b = sVar;
            this.f13678c = qVar;
        }

        public void a() {
            this.f13680e.dispose();
            b();
        }

        /* access modifiers changed from: package-private */
        public abstract void b();

        /* access modifiers changed from: package-private */
        public void c() {
            Object andSet = getAndSet((Object) null);
            if (andSet != null) {
                this.f13677b.onNext(andSet);
            }
        }

        public void d(Throwable th) {
            this.f13680e.dispose();
            this.f13677b.onError(th);
        }

        public void dispose() {
            d.a.a0.a.c.f(this.f13679d);
            this.f13680e.dispose();
        }

        /* access modifiers changed from: package-private */
        public abstract void e();

        /* access modifiers changed from: package-private */
        public boolean f(d.a.y.b bVar) {
            return d.a.a0.a.c.n(this.f13679d, bVar);
        }

        public void onComplete() {
            d.a.a0.a.c.f(this.f13679d);
            b();
        }

        public void onError(Throwable th) {
            d.a.a0.a.c.f(this.f13679d);
            this.f13677b.onError(th);
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.f13680e, bVar)) {
                this.f13680e = bVar;
                this.f13677b.onSubscribe(this);
                if (this.f13679d.get() == null) {
                    this.f13678c.subscribe(new d(this));
                }
            }
        }
    }

    /* compiled from: ObservableSampleWithObservable */
    static final class d<T> implements s<Object> {

        /* renamed from: b  reason: collision with root package name */
        final c<T> f13681b;

        d(c<T> cVar) {
            this.f13681b = cVar;
        }

        public void onComplete() {
            this.f13681b.a();
        }

        public void onError(Throwable th) {
            this.f13681b.d(th);
        }

        public void onNext(Object obj) {
            this.f13681b.e();
        }

        public void onSubscribe(d.a.y.b bVar) {
            this.f13681b.f(bVar);
        }
    }

    public x2(q<T> qVar, q<?> qVar2, boolean z) {
        super(qVar);
        this.f13674c = qVar2;
        this.f13675d = z;
    }

    public void subscribeActual(s<? super T> sVar) {
        e eVar = new e(sVar);
        if (this.f13675d) {
            this.f12780b.subscribe(new a(eVar, this.f13674c));
        } else {
            this.f12780b.subscribe(new b(eVar, this.f13674c));
        }
    }
}
