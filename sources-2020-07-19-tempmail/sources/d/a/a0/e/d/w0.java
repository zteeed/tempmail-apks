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
    final n<? super T, ? extends d> f13625c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f13626d;

    /* compiled from: ObservableFlatMapCompletable */
    static final class a<T> extends b<T> implements s<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13627b;

        /* renamed from: c  reason: collision with root package name */
        final c f13628c = new c();

        /* renamed from: d  reason: collision with root package name */
        final n<? super T, ? extends d> f13629d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f13630e;

        /* renamed from: f  reason: collision with root package name */
        final d.a.y.a f13631f = new d.a.y.a();
        d.a.y.b g;
        volatile boolean h;

        /* renamed from: d.a.a0.e.d.w0$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableFlatMapCompletable */
        final class C0147a extends AtomicReference<d.a.y.b> implements d.a.c, d.a.y.b {
            private static final long serialVersionUID = 8606673141535671828L;

            C0147a() {
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
            this.f13627b = sVar;
            this.f13629d = nVar;
            this.f13630e = z;
            lazySet(1);
        }

        /* access modifiers changed from: package-private */
        public void a(a<T>.a aVar) {
            this.f13631f.c(aVar);
            onComplete();
        }

        /* access modifiers changed from: package-private */
        public void b(a<T>.a aVar, Throwable th) {
            this.f13631f.c(aVar);
            onError(th);
        }

        public void clear() {
        }

        public void dispose() {
            this.h = true;
            this.g.dispose();
            this.f13631f.dispose();
        }

        public int g(int i) {
            return i & 2;
        }

        public boolean isEmpty() {
            return true;
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable b2 = this.f13628c.b();
                if (b2 != null) {
                    this.f13627b.onError(b2);
                } else {
                    this.f13627b.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f13628c.a(th)) {
                d.a.d0.a.s(th);
            } else if (!this.f13630e) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f13627b.onError(this.f13628c.b());
                }
            } else if (decrementAndGet() == 0) {
                this.f13627b.onError(this.f13628c.b());
            }
        }

        public void onNext(T t) {
            try {
                Object apply = this.f13629d.apply(t);
                d.a.a0.b.b.e(apply, "The mapper returned a null CompletableSource");
                d dVar = (d) apply;
                getAndIncrement();
                C0147a aVar = new C0147a();
                if (!this.h && this.f13631f.b(aVar)) {
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
                this.f13627b.onSubscribe(this);
            }
        }

        public T poll() throws Exception {
            return null;
        }
    }

    public w0(q<T> qVar, n<? super T, ? extends d> nVar, boolean z) {
        super(qVar);
        this.f13625c = nVar;
        this.f13626d = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13625c, this.f13626d));
    }
}
