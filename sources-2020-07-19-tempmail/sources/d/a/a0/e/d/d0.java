package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.c0.e;
import d.a.q;
import d.a.s;
import d.a.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableDebounceTimed */
public final class d0<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f12888c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f12889d;

    /* renamed from: e  reason: collision with root package name */
    final t f12890e;

    /* compiled from: ObservableDebounceTimed */
    static final class a<T> extends AtomicReference<d.a.y.b> implements Runnable, d.a.y.b {
        private static final long serialVersionUID = 6812032969491025141L;

        /* renamed from: b  reason: collision with root package name */
        final T f12891b;

        /* renamed from: c  reason: collision with root package name */
        final long f12892c;

        /* renamed from: d  reason: collision with root package name */
        final b<T> f12893d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicBoolean f12894e = new AtomicBoolean();

        a(T t, long j, b<T> bVar) {
            this.f12891b = t;
            this.f12892c = j;
            this.f12893d = bVar;
        }

        public void a(d.a.y.b bVar) {
            c.h(this, bVar);
        }

        public void dispose() {
            c.f(this);
        }

        public void run() {
            if (this.f12894e.compareAndSet(false, true)) {
                this.f12893d.a(this.f12892c, this.f12891b, this);
            }
        }
    }

    /* compiled from: ObservableDebounceTimed */
    static final class b<T> implements s<T>, d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f12895b;

        /* renamed from: c  reason: collision with root package name */
        final long f12896c;

        /* renamed from: d  reason: collision with root package name */
        final TimeUnit f12897d;

        /* renamed from: e  reason: collision with root package name */
        final t.c f12898e;

        /* renamed from: f  reason: collision with root package name */
        d.a.y.b f12899f;
        d.a.y.b g;
        volatile long h;
        boolean i;

        b(s<? super T> sVar, long j, TimeUnit timeUnit, t.c cVar) {
            this.f12895b = sVar;
            this.f12896c = j;
            this.f12897d = timeUnit;
            this.f12898e = cVar;
        }

        /* access modifiers changed from: package-private */
        public void a(long j, T t, a<T> aVar) {
            if (j == this.h) {
                this.f12895b.onNext(t);
                aVar.dispose();
            }
        }

        public void dispose() {
            this.f12899f.dispose();
            this.f12898e.dispose();
        }

        public void onComplete() {
            if (!this.i) {
                this.i = true;
                d.a.y.b bVar = this.g;
                if (bVar != null) {
                    bVar.dispose();
                }
                a aVar = (a) bVar;
                if (aVar != null) {
                    aVar.run();
                }
                this.f12895b.onComplete();
                this.f12898e.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.i) {
                d.a.d0.a.s(th);
                return;
            }
            d.a.y.b bVar = this.g;
            if (bVar != null) {
                bVar.dispose();
            }
            this.i = true;
            this.f12895b.onError(th);
            this.f12898e.dispose();
        }

        public void onNext(T t) {
            if (!this.i) {
                long j = this.h + 1;
                this.h = j;
                d.a.y.b bVar = this.g;
                if (bVar != null) {
                    bVar.dispose();
                }
                a aVar = new a(t, j, this);
                this.g = aVar;
                aVar.a(this.f12898e.c(aVar, this.f12896c, this.f12897d));
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f12899f, bVar)) {
                this.f12899f = bVar;
                this.f12895b.onSubscribe(this);
            }
        }
    }

    public d0(q<T> qVar, long j, TimeUnit timeUnit, t tVar) {
        super(qVar);
        this.f12888c = j;
        this.f12889d = timeUnit;
        this.f12890e = tVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new b(new e(sVar), this.f12888c, this.f12889d, this.f12890e.a()));
    }
}
