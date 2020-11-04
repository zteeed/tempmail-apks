package d.a.a0.e.d;

import d.a.b;
import d.a.c;
import d.a.d;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapCompletableCompletable */
public final class x0<T> extends b implements d.a.a0.c.a<T> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f14221a;

    /* renamed from: b  reason: collision with root package name */
    final n<? super T, ? extends d> f14222b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f14223c;

    /* compiled from: ObservableFlatMapCompletableCompletable */
    static final class a<T> extends AtomicInteger implements d.a.y.b, s<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: b  reason: collision with root package name */
        final c f14224b;

        /* renamed from: c  reason: collision with root package name */
        final d.a.a0.j.c f14225c = new d.a.a0.j.c();

        /* renamed from: d  reason: collision with root package name */
        final n<? super T, ? extends d> f14226d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f14227e;

        /* renamed from: f  reason: collision with root package name */
        final d.a.y.a f14228f = new d.a.y.a();
        d.a.y.b g;
        volatile boolean h;

        /* renamed from: d.a.a0.e.d.x0$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableFlatMapCompletableCompletable */
        final class C0146a extends AtomicReference<d.a.y.b> implements c, d.a.y.b {
            private static final long serialVersionUID = 8606673141535671828L;

            C0146a() {
            }

            public void dispose() {
                d.a.a0.a.c.f(this);
            }

            public void onComplete() {
                a.this.a(this);
            }

            public void onError(Throwable th) {
                a.this.b(this, th);
            }

            public void onSubscribe(d.a.y.b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }
        }

        a(c cVar, n<? super T, ? extends d> nVar, boolean z) {
            this.f14224b = cVar;
            this.f14226d = nVar;
            this.f14227e = z;
            lazySet(1);
        }

        /* access modifiers changed from: package-private */
        public void a(a<T>.a aVar) {
            this.f14228f.c(aVar);
            onComplete();
        }

        /* access modifiers changed from: package-private */
        public void b(a<T>.a aVar, Throwable th) {
            this.f14228f.c(aVar);
            onError(th);
        }

        public void dispose() {
            this.h = true;
            this.g.dispose();
            this.f14228f.dispose();
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable b2 = this.f14225c.b();
                if (b2 != null) {
                    this.f14224b.onError(b2);
                } else {
                    this.f14224b.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f14225c.a(th)) {
                d.a.d0.a.s(th);
            } else if (!this.f14227e) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f14224b.onError(this.f14225c.b());
                }
            } else if (decrementAndGet() == 0) {
                this.f14224b.onError(this.f14225c.b());
            }
        }

        public void onNext(T t) {
            try {
                Object apply = this.f14226d.apply(t);
                d.a.a0.b.b.e(apply, "The mapper returned a null CompletableSource");
                d dVar = (d) apply;
                getAndIncrement();
                C0146a aVar = new C0146a();
                if (!this.h && this.f14228f.b(aVar)) {
                    dVar.b(aVar);
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.g.dispose();
                onError(th);
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.g, bVar)) {
                this.g = bVar;
                this.f14224b.onSubscribe(this);
            }
        }
    }

    public x0(q<T> qVar, n<? super T, ? extends d> nVar, boolean z) {
        this.f14221a = qVar;
        this.f14222b = nVar;
        this.f14223c = z;
    }

    public l<T> a() {
        return d.a.d0.a.n(new w0(this.f14221a, this.f14222b, this.f14223c));
    }

    /* access modifiers changed from: protected */
    public void c(c cVar) {
        this.f14221a.subscribe(new a(cVar, this.f14222b, this.f14223c));
    }
}
