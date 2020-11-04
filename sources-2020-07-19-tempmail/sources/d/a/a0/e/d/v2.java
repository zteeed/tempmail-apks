package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.a0.j.c;
import d.a.a0.j.k;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.n;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableRetryWhen */
public final class v2<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super l<Throwable>, ? extends q<?>> f13606c;

    /* compiled from: ObservableRetryWhen */
    static final class a<T> extends AtomicInteger implements s<T>, b {
        private static final long serialVersionUID = 802743776666017014L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13607b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicInteger f13608c = new AtomicInteger();

        /* renamed from: d  reason: collision with root package name */
        final c f13609d = new c();

        /* renamed from: e  reason: collision with root package name */
        final d.a.f0.c<Throwable> f13610e;

        /* renamed from: f  reason: collision with root package name */
        final a<T>.a f13611f = new C0146a();
        final AtomicReference<b> g = new AtomicReference<>();
        final q<T> h;
        volatile boolean i;

        /* renamed from: d.a.a0.e.d.v2$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableRetryWhen */
        final class C0146a extends AtomicReference<b> implements s<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            C0146a() {
            }

            public void onComplete() {
                a.this.a();
            }

            public void onError(Throwable th) {
                a.this.b(th);
            }

            public void onNext(Object obj) {
                a.this.c();
            }

            public void onSubscribe(b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }
        }

        a(s<? super T> sVar, d.a.f0.c<Throwable> cVar, q<T> qVar) {
            this.f13607b = sVar;
            this.f13610e = cVar;
            this.h = qVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            d.a.a0.a.c.f(this.g);
            k.a(this.f13607b, this, this.f13609d);
        }

        /* access modifiers changed from: package-private */
        public void b(Throwable th) {
            d.a.a0.a.c.f(this.g);
            k.c(this.f13607b, th, this, this.f13609d);
        }

        /* access modifiers changed from: package-private */
        public void c() {
            e();
        }

        public boolean d() {
            return d.a.a0.a.c.g(this.g.get());
        }

        public void dispose() {
            d.a.a0.a.c.f(this.g);
            d.a.a0.a.c.f(this.f13611f);
        }

        /* access modifiers changed from: package-private */
        public void e() {
            if (this.f13608c.getAndIncrement() == 0) {
                while (!d()) {
                    if (!this.i) {
                        this.i = true;
                        this.h.subscribe(this);
                    }
                    if (this.f13608c.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            d.a.a0.a.c.f(this.f13611f);
            k.a(this.f13607b, this, this.f13609d);
        }

        public void onError(Throwable th) {
            d.a.a0.a.c.h(this.g, (b) null);
            this.i = false;
            this.f13610e.onNext(th);
        }

        public void onNext(T t) {
            k.e(this.f13607b, t, this, this.f13609d);
        }

        public void onSubscribe(b bVar) {
            d.a.a0.a.c.h(this.g, bVar);
        }
    }

    public v2(q<T> qVar, n<? super l<Throwable>, ? extends q<?>> nVar) {
        super(qVar);
        this.f13606c = nVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        d.a.f0.c d2 = d.a.f0.a.f().d();
        try {
            Object apply = this.f13606c.apply(d2);
            d.a.a0.b.b.e(apply, "The handler returned a null ObservableSource");
            q qVar = (q) apply;
            a aVar = new a(sVar, d2, this.f12780b);
            sVar.onSubscribe(aVar);
            qVar.subscribe(aVar.f13611f);
            aVar.e();
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            d.m(th, sVar);
        }
    }
}
