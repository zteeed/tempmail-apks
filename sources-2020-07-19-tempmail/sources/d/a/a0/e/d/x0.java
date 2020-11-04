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
    final q<T> f13663a;

    /* renamed from: b  reason: collision with root package name */
    final n<? super T, ? extends d> f13664b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f13665c;

    /* compiled from: ObservableFlatMapCompletableCompletable */
    static final class a<T> extends AtomicInteger implements d.a.y.b, s<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: b  reason: collision with root package name */
        final c f13666b;

        /* renamed from: c  reason: collision with root package name */
        final d.a.a0.j.c f13667c = new d.a.a0.j.c();

        /* renamed from: d  reason: collision with root package name */
        final n<? super T, ? extends d> f13668d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f13669e;

        /* renamed from: f  reason: collision with root package name */
        final d.a.y.a f13670f = new d.a.y.a();
        d.a.y.b g;
        volatile boolean h;

        /* renamed from: d.a.a0.e.d.x0$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableFlatMapCompletableCompletable */
        final class C0148a extends AtomicReference<d.a.y.b> implements c, d.a.y.b {
            private static final long serialVersionUID = 8606673141535671828L;

            C0148a() {
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
            this.f13666b = cVar;
            this.f13668d = nVar;
            this.f13669e = z;
            lazySet(1);
        }

        /* access modifiers changed from: package-private */
        public void a(a<T>.a aVar) {
            this.f13670f.c(aVar);
            onComplete();
        }

        /* access modifiers changed from: package-private */
        public void b(a<T>.a aVar, Throwable th) {
            this.f13670f.c(aVar);
            onError(th);
        }

        public void dispose() {
            this.h = true;
            this.g.dispose();
            this.f13670f.dispose();
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable b2 = this.f13667c.b();
                if (b2 != null) {
                    this.f13666b.onError(b2);
                } else {
                    this.f13666b.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f13667c.a(th)) {
                d.a.d0.a.s(th);
            } else if (!this.f13669e) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f13666b.onError(this.f13667c.b());
                }
            } else if (decrementAndGet() == 0) {
                this.f13666b.onError(this.f13667c.b());
            }
        }

        public void onNext(T t) {
            try {
                Object apply = this.f13668d.apply(t);
                d.a.a0.b.b.e(apply, "The mapper returned a null CompletableSource");
                d dVar = (d) apply;
                getAndIncrement();
                C0148a aVar = new C0148a();
                if (!this.h && this.f13670f.b(aVar)) {
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
                this.f13666b.onSubscribe(this);
            }
        }
    }

    public x0(q<T> qVar, n<? super T, ? extends d> nVar, boolean z) {
        this.f13663a = qVar;
        this.f13664b = nVar;
        this.f13665c = z;
    }

    public l<T> a() {
        return d.a.d0.a.n(new w0(this.f13663a, this.f13664b, this.f13665c));
    }

    /* access modifiers changed from: protected */
    public void c(c cVar) {
        this.f13663a.subscribe(new a(cVar, this.f13664b, this.f13665c));
    }
}
