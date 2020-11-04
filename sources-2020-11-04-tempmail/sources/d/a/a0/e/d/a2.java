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
    final w<? extends T> f13347c;

    /* compiled from: ObservableMergeWithSingle */
    static final class a<T> extends AtomicInteger implements s<T>, b {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13348b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReference<b> f13349c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        final C0133a<T> f13350d = new C0133a<>(this);

        /* renamed from: e  reason: collision with root package name */
        final c f13351e = new c();

        /* renamed from: f  reason: collision with root package name */
        volatile e<T> f13352f;
        T g;
        volatile boolean h;
        volatile boolean i;
        volatile int j;

        /* renamed from: d.a.a0.e.d.a2$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableMergeWithSingle */
        static final class C0133a<T> extends AtomicReference<b> implements v<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: b  reason: collision with root package name */
            final a<T> f13353b;

            C0133a(a<T> aVar) {
                this.f13353b = aVar;
            }

            public void onError(Throwable th) {
                this.f13353b.d(th);
            }

            public void onSubscribe(b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }

            public void onSuccess(T t) {
                this.f13353b.e(t);
            }
        }

        a(s<? super T> sVar) {
            this.f13348b = sVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            s<? super T> sVar = this.f13348b;
            int i2 = 1;
            while (!this.h) {
                if (this.f13351e.get() != null) {
                    this.g = null;
                    this.f13352f = null;
                    sVar.onError(this.f13351e.b());
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
                e<T> eVar = this.f13352f;
                T poll = eVar != null ? eVar.poll() : null;
                boolean z2 = poll == null;
                if (z && z2 && i3 == 2) {
                    this.f13352f = null;
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
            this.f13352f = null;
        }

        /* access modifiers changed from: package-private */
        public e<T> c() {
            e<T> eVar = this.f13352f;
            if (eVar != null) {
                return eVar;
            }
            d.a.a0.f.c cVar = new d.a.a0.f.c(l.bufferSize());
            this.f13352f = cVar;
            return cVar;
        }

        /* access modifiers changed from: package-private */
        public void d(Throwable th) {
            if (this.f13351e.a(th)) {
                d.a.a0.a.c.f(this.f13349c);
                a();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void dispose() {
            this.h = true;
            d.a.a0.a.c.f(this.f13349c);
            d.a.a0.a.c.f(this.f13350d);
            if (getAndIncrement() == 0) {
                this.f13352f = null;
                this.g = null;
            }
        }

        /* access modifiers changed from: package-private */
        public void e(T t) {
            if (compareAndSet(0, 1)) {
                this.f13348b.onNext(t);
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
            if (this.f13351e.a(th)) {
                d.a.a0.a.c.f(this.f13350d);
                a();
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.f13348b.onNext(t);
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
            d.a.a0.a.c.n(this.f13349c, bVar);
        }
    }

    public a2(l<T> lVar, w<? extends T> wVar) {
        super(lVar);
        this.f13347c = wVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        this.f13338b.subscribe(aVar);
        this.f13347c.b(aVar.f13350d);
    }
}
