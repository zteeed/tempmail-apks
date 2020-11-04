package d.a.a0.e.d;

import d.a.a0.d.b;
import d.a.a0.j.c;
import d.a.d;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapCompletable */
public final class w0<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends d> f14183c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f14184d;

    /* compiled from: ObservableFlatMapCompletable */
    static final class a<T> extends b<T> implements s<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14185b;

        /* renamed from: c  reason: collision with root package name */
        final c f14186c = new c();

        /* renamed from: d  reason: collision with root package name */
        final n<? super T, ? extends d> f14187d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f14188e;

        /* renamed from: f  reason: collision with root package name */
        final d.a.y.a f14189f = new d.a.y.a();
        d.a.y.b g;
        volatile boolean h;

        /* renamed from: d.a.a0.e.d.w0$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableFlatMapCompletable */
        final class C0145a extends AtomicReference<d.a.y.b> implements d.a.c, d.a.y.b {
            private static final long serialVersionUID = 8606673141535671828L;

            C0145a() {
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

        a(s<? super T> sVar, n<? super T, ? extends d> nVar, boolean z) {
            this.f14185b = sVar;
            this.f14187d = nVar;
            this.f14188e = z;
            lazySet(1);
        }

        /* access modifiers changed from: package-private */
        public void a(a<T>.a aVar) {
            this.f14189f.c(aVar);
            onComplete();
        }

        /* access modifiers changed from: package-private */
        public void b(a<T>.a aVar, Throwable th) {
            this.f14189f.c(aVar);
            onError(th);
        }

        public void clear() {
        }

        public void dispose() {
            this.h = true;
            this.g.dispose();
            this.f14189f.dispose();
        }

        public int g(int i) {
            return i & 2;
        }

        public boolean isEmpty() {
            return true;
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable b2 = this.f14186c.b();
                if (b2 != null) {
                    this.f14185b.onError(b2);
                } else {
                    this.f14185b.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f14186c.a(th)) {
                d.a.d0.a.s(th);
            } else if (!this.f14188e) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f14185b.onError(this.f14186c.b());
                }
            } else if (decrementAndGet() == 0) {
                this.f14185b.onError(this.f14186c.b());
            }
        }

        public void onNext(T t) {
            try {
                Object apply = this.f14187d.apply(t);
                d.a.a0.b.b.e(apply, "The mapper returned a null CompletableSource");
                d dVar = (d) apply;
                getAndIncrement();
                C0145a aVar = new C0145a();
                if (!this.h && this.f14189f.b(aVar)) {
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
                this.f14185b.onSubscribe(this);
            }
        }

        public T poll() throws Exception {
            return null;
        }
    }

    public w0(q<T> qVar, n<? super T, ? extends d> nVar, boolean z) {
        super(qVar);
        this.f14183c = nVar;
        this.f14184d = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f14183c, this.f14184d));
    }
}
