package d.a.a0.e.d;

import d.a.a0.c.e;
import d.a.a0.j.c;
import d.a.l;
import d.a.s;
import d.a.v;
import d.a.w;
import d.a.y.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableMergeWithSingle */
public final class a2<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final w<? extends T> f12789c;

    /* compiled from: ObservableMergeWithSingle */
    static final class a<T> extends AtomicInteger implements s<T>, b {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f12790b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReference<b> f12791c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        final C0135a<T> f12792d = new C0135a<>(this);

        /* renamed from: e  reason: collision with root package name */
        final c f12793e = new c();

        /* renamed from: f  reason: collision with root package name */
        volatile e<T> f12794f;
        T g;
        volatile boolean h;
        volatile boolean i;
        volatile int j;

        /* renamed from: d.a.a0.e.d.a2$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableMergeWithSingle */
        static final class C0135a<T> extends AtomicReference<b> implements v<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: b  reason: collision with root package name */
            final a<T> f12795b;

            C0135a(a<T> aVar) {
                this.f12795b = aVar;
            }

            public void onError(Throwable th) {
                this.f12795b.d(th);
            }

            public void onSubscribe(b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }

            public void onSuccess(T t) {
                this.f12795b.e(t);
            }
        }

        a(s<? super T> sVar) {
            this.f12790b = sVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            s<? super T> sVar = this.f12790b;
            int i2 = 1;
            while (!this.h) {
                if (this.f12793e.get() != null) {
                    this.g = null;
                    this.f12794f = null;
                    sVar.onError(this.f12793e.b());
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
                e<T> eVar = this.f12794f;
                T poll = eVar != null ? eVar.poll() : null;
                boolean z2 = poll == null;
                if (z && z2 && i3 == 2) {
                    this.f12794f = null;
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
            this.f12794f = null;
        }

        /* access modifiers changed from: package-private */
        public e<T> c() {
            e<T> eVar = this.f12794f;
            if (eVar != null) {
                return eVar;
            }
            d.a.a0.f.c cVar = new d.a.a0.f.c(l.bufferSize());
            this.f12794f = cVar;
            return cVar;
        }

        /* access modifiers changed from: package-private */
        public void d(Throwable th) {
            if (this.f12793e.a(th)) {
                d.a.a0.a.c.f(this.f12791c);
                a();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void dispose() {
            this.h = true;
            d.a.a0.a.c.f(this.f12791c);
            d.a.a0.a.c.f(this.f12792d);
            if (getAndIncrement() == 0) {
                this.f12794f = null;
                this.g = null;
            }
        }

        /* access modifiers changed from: package-private */
        public void e(T t) {
            if (compareAndSet(0, 1)) {
                this.f12790b.onNext(t);
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
            if (this.f12793e.a(th)) {
                d.a.a0.a.c.f(this.f12792d);
                a();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.f12790b.onNext(t);
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
            d.a.a0.a.c.n(this.f12791c, bVar);
        }
    }

    public a2(l<T> lVar, w<? extends T> wVar) {
        super(lVar);
        this.f12789c = wVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        this.f12780b.subscribe(aVar);
        this.f12789c.b(aVar.f12792d);
    }
}
