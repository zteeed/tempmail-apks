package d.a.a0.e.d;

import d.a.a0.c.e;
import d.a.a0.j.c;
import d.a.i;
import d.a.j;
import d.a.l;
import d.a.s;
import d.a.y.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableMergeWithMaybe */
public final class z1<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final j<? extends T> f13737c;

    /* compiled from: ObservableMergeWithMaybe */
    static final class a<T> extends AtomicInteger implements s<T>, b {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13738b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReference<b> f13739c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        final C0152a<T> f13740d = new C0152a<>(this);

        /* renamed from: e  reason: collision with root package name */
        final c f13741e = new c();

        /* renamed from: f  reason: collision with root package name */
        volatile e<T> f13742f;
        T g;
        volatile boolean h;
        volatile boolean i;
        volatile int j;

        /* renamed from: d.a.a0.e.d.z1$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableMergeWithMaybe */
        static final class C0152a<T> extends AtomicReference<b> implements i<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: b  reason: collision with root package name */
            final a<T> f13743b;

            C0152a(a<T> aVar) {
                this.f13743b = aVar;
            }

            public void onComplete() {
                this.f13743b.d();
            }

            public void onError(Throwable th) {
                this.f13743b.e(th);
            }

            public void onSubscribe(b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }

            public void onSuccess(T t) {
                this.f13743b.f(t);
            }
        }

        a(s<? super T> sVar) {
            this.f13738b = sVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            s<? super T> sVar = this.f13738b;
            int i2 = 1;
            while (!this.h) {
                if (this.f13741e.get() != null) {
                    this.g = null;
                    this.f13742f = null;
                    sVar.onError(this.f13741e.b());
                    return;
                }
                int i3 = this.j;
                if (i3 == 1) {
                    T t = this.g;
                    this.g = null;
                    this.j = 2;
                    sVar.onNext(t);
                    i3 = 2;
                }
                boolean z = this.i;
                e<T> eVar = this.f13742f;
                T poll = eVar != null ? eVar.poll() : null;
                boolean z2 = poll == null;
                if (z && z2 && i3 == 2) {
                    this.f13742f = null;
                    sVar.onComplete();
                    return;
                } else if (z2) {
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    sVar.onNext(poll);
                }
            }
            this.g = null;
            this.f13742f = null;
        }

        /* access modifiers changed from: package-private */
        public e<T> c() {
            e<T> eVar = this.f13742f;
            if (eVar != null) {
                return eVar;
            }
            d.a.a0.f.c cVar = new d.a.a0.f.c(l.bufferSize());
            this.f13742f = cVar;
            return cVar;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.j = 2;
            a();
        }

        public void dispose() {
            this.h = true;
            d.a.a0.a.c.f(this.f13739c);
            d.a.a0.a.c.f(this.f13740d);
            if (getAndIncrement() == 0) {
                this.f13742f = null;
                this.g = null;
            }
        }

        /* access modifiers changed from: package-private */
        public void e(Throwable th) {
            if (this.f13741e.a(th)) {
                d.a.a0.a.c.f(this.f13739c);
                a();
                return;
            }
            d.a.d0.a.s(th);
        }

        /* access modifiers changed from: package-private */
        public void f(T t) {
            if (compareAndSet(0, 1)) {
                this.f13738b.onNext(t);
                this.j = 2;
            } else {
                this.g = t;
                this.j = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        public void onComplete() {
            this.i = true;
            a();
        }

        public void onError(Throwable th) {
            if (this.f13741e.a(th)) {
                d.a.a0.a.c.f(this.f13740d);
                a();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.f13738b.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                c().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        public void onSubscribe(b bVar) {
            d.a.a0.a.c.n(this.f13739c, bVar);
        }
    }

    public z1(l<T> lVar, j<? extends T> jVar) {
        super(lVar);
        this.f13737c = jVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        this.f12780b.subscribe(aVar);
        this.f13737c.b(aVar.f13740d);
    }
}
