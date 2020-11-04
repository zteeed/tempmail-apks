package d.a.a0.e.d;

import d.a.c0.c;
import d.a.c0.e;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.n;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableDebounce */
public final class c0<T, U> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends q<U>> f13403c;

    /* compiled from: ObservableDebounce */
    static final class a<T, U> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13404b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends q<U>> f13405c;

        /* renamed from: d  reason: collision with root package name */
        b f13406d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReference<b> f13407e = new AtomicReference<>();

        /* renamed from: f  reason: collision with root package name */
        volatile long f13408f;
        boolean g;

        /* renamed from: d.a.a0.e.d.c0$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableDebounce */
        static final class C0134a<T, U> extends c<U> {

            /* renamed from: c  reason: collision with root package name */
            final a<T, U> f13409c;

            /* renamed from: d  reason: collision with root package name */
            final long f13410d;

            /* renamed from: e  reason: collision with root package name */
            final T f13411e;

            /* renamed from: f  reason: collision with root package name */
            boolean f13412f;
            final AtomicBoolean g = new AtomicBoolean();

            C0134a(a<T, U> aVar, long j, T t) {
                this.f13409c = aVar;
                this.f13410d = j;
                this.f13411e = t;
            }

            /* access modifiers changed from: package-private */
            public void c() {
                if (this.g.compareAndSet(false, true)) {
                    this.f13409c.a(this.f13410d, this.f13411e);
                }
            }

            public void onComplete() {
                if (!this.f13412f) {
                    this.f13412f = true;
                    c();
                }
            }

            public void onError(Throwable th) {
                if (this.f13412f) {
                    d.a.d0.a.s(th);
                    return;
                }
                this.f13412f = true;
                this.f13409c.onError(th);
            }

            public void onNext(U u) {
                if (!this.f13412f) {
                    this.f13412f = true;
                    dispose();
                    c();
                }
            }
        }

        a(s<? super T> sVar, n<? super T, ? extends q<U>> nVar) {
            this.f13404b = sVar;
            this.f13405c = nVar;
        }

        /* access modifiers changed from: package-private */
        public void a(long j, T t) {
            if (j == this.f13408f) {
                this.f13404b.onNext(t);
            }
        }

        public void dispose() {
            this.f13406d.dispose();
            d.a.a0.a.c.f(this.f13407e);
        }

        public void onComplete() {
            if (!this.g) {
                this.g = true;
                b bVar = this.f13407e.get();
                if (bVar != d.a.a0.a.c.DISPOSED) {
                    C0134a aVar = (C0134a) bVar;
                    if (aVar != null) {
                        aVar.c();
                    }
                    d.a.a0.a.c.f(this.f13407e);
                    this.f13404b.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            d.a.a0.a.c.f(this.f13407e);
            this.f13404b.onError(th);
        }

        public void onNext(T t) {
            if (!this.g) {
                long j = this.f13408f + 1;
                this.f13408f = j;
                b bVar = this.f13407e.get();
                if (bVar != null) {
                    bVar.dispose();
                }
                try {
                    Object apply = this.f13405c.apply(t);
                    d.a.a0.b.b.e(apply, "The ObservableSource supplied is null");
                    q qVar = (q) apply;
                    C0134a aVar = new C0134a(this, j, t);
                    if (this.f13407e.compareAndSet(bVar, aVar)) {
                        qVar.subscribe(aVar);
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    dispose();
                    this.f13404b.onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.f13406d, bVar)) {
                this.f13406d = bVar;
                this.f13404b.onSubscribe(this);
            }
        }
    }

    public c0(q<T> qVar, n<? super T, ? extends q<U>> nVar) {
        super(qVar);
        this.f13403c = nVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(new e(sVar), this.f13403c));
    }
}
