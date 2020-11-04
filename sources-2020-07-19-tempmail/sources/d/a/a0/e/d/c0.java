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
    final n<? super T, ? extends q<U>> f12845c;

    /* compiled from: ObservableDebounce */
    static final class a<T, U> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f12846b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends q<U>> f12847c;

        /* renamed from: d  reason: collision with root package name */
        b f12848d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReference<b> f12849e = new AtomicReference<>();

        /* renamed from: f  reason: collision with root package name */
        volatile long f12850f;
        boolean g;

        /* renamed from: d.a.a0.e.d.c0$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableDebounce */
        static final class C0136a<T, U> extends c<U> {

            /* renamed from: c  reason: collision with root package name */
            final a<T, U> f12851c;

            /* renamed from: d  reason: collision with root package name */
            final long f12852d;

            /* renamed from: e  reason: collision with root package name */
            final T f12853e;

            /* renamed from: f  reason: collision with root package name */
            boolean f12854f;
            final AtomicBoolean g = new AtomicBoolean();

            C0136a(a<T, U> aVar, long j, T t) {
                this.f12851c = aVar;
                this.f12852d = j;
                this.f12853e = t;
            }

            /* access modifiers changed from: package-private */
            public void c() {
                if (this.g.compareAndSet(false, true)) {
                    this.f12851c.a(this.f12852d, this.f12853e);
                }
            }

            public void onComplete() {
                if (!this.f12854f) {
                    this.f12854f = true;
                    c();
                }
            }

            public void onError(Throwable th) {
                if (this.f12854f) {
                    d.a.d0.a.s(th);
                    return;
                }
                this.f12854f = true;
                this.f12851c.onError(th);
            }

            public void onNext(U u) {
                if (!this.f12854f) {
                    this.f12854f = true;
                    dispose();
                    c();
                }
            }
        }

        a(s<? super T> sVar, n<? super T, ? extends q<U>> nVar) {
            this.f12846b = sVar;
            this.f12847c = nVar;
        }

        /* access modifiers changed from: package-private */
        public void a(long j, T t) {
            if (j == this.f12850f) {
                this.f12846b.onNext(t);
            }
        }

        public void dispose() {
            this.f12848d.dispose();
            d.a.a0.a.c.f(this.f12849e);
        }

        public void onComplete() {
            if (!this.g) {
                this.g = true;
                b bVar = this.f12849e.get();
                if (bVar != d.a.a0.a.c.DISPOSED) {
                    C0136a aVar = (C0136a) bVar;
                    if (aVar != null) {
                        aVar.c();
                    }
                    d.a.a0.a.c.f(this.f12849e);
                    this.f12846b.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            d.a.a0.a.c.f(this.f12849e);
            this.f12846b.onError(th);
        }

        public void onNext(T t) {
            if (!this.g) {
                long j = this.f12850f + 1;
                this.f12850f = j;
                b bVar = this.f12849e.get();
                if (bVar != null) {
                    bVar.dispose();
                }
                try {
                    Object apply = this.f12847c.apply(t);
                    d.a.a0.b.b.e(apply, "The ObservableSource supplied is null");
                    q qVar = (q) apply;
                    C0136a aVar = new C0136a(this, j, t);
                    if (this.f12849e.compareAndSet(bVar, aVar)) {
                        qVar.subscribe(aVar);
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    dispose();
                    this.f12846b.onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.f12848d, bVar)) {
                this.f12848d = bVar;
                this.f12846b.onSubscribe(this);
            }
        }
    }

    public c0(q<T> qVar, n<? super T, ? extends q<U>> nVar) {
        super(qVar);
        this.f12845c = nVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(new e(sVar), this.f12845c));
    }
}
