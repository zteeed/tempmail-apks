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
    final long f13446c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f13447d;

    /* renamed from: e  reason: collision with root package name */
    final t f13448e;

    /* compiled from: ObservableDebounceTimed */
    static final class a<T> extends AtomicReference<d.a.y.b> implements Runnable, d.a.y.b {
        private static final long serialVersionUID = 6812032969491025141L;

        /* renamed from: b  reason: collision with root package name */
        final T f13449b;

        /* renamed from: c  reason: collision with root package name */
        final long f13450c;

        /* renamed from: d  reason: collision with root package name */
        final b<T> f13451d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicBoolean f13452e = new AtomicBoolean();

        a(T t, long j, b<T> bVar) {
            this.f13449b = t;
            this.f13450c = j;
            this.f13451d = bVar;
        }

        public void a(d.a.y.b bVar) {
            c.h(this, bVar);
        }

        public void dispose() {
            c.f(this);
        }

        public void run() {
            if (this.f13452e.compareAndSet(false, true)) {
                this.f13451d.a(this.f13450c, this.f13449b, this);
            }
        }
    }

    /* compiled from: ObservableDebounceTimed */
    static final class b<T> implements s<T>, d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13453b;

        /* renamed from: c  reason: collision with root package name */
        final long f13454c;

        /* renamed from: d  reason: collision with root package name */
        final TimeUnit f13455d;

        /* renamed from: e  reason: collision with root package name */
        final t.c f13456e;

        /* renamed from: f  reason: collision with root package name */
        d.a.y.b f13457f;
        d.a.y.b g;
        volatile long h;
        boolean i;

        b(s<? super T> sVar, long j, TimeUnit timeUnit, t.c cVar) {
            this.f13453b = sVar;
            this.f13454c = j;
            this.f13455d = timeUnit;
            this.f13456e = cVar;
        }

        /* access modifiers changed from: package-private */
        public void a(long j, T t, a<T> aVar) {
            if (j == this.h) {
                this.f13453b.onNext(t);
                aVar.dispose();
            }
        }

        public void dispose() {
            this.f13457f.dispose();
            this.f13456e.dispose();
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
                this.f13453b.onComplete();
                this.f13456e.dispose();
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
            this.f13453b.onError(th);
            this.f13456e.dispose();
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
                aVar.a(this.f13456e.c(aVar, this.f13454c, this.f13455d));
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13457f, bVar)) {
                this.f13457f = bVar;
                this.f13453b.onSubscribe(this);
            }
        }
    }

    public d0(q<T> qVar, long j, TimeUnit timeUnit, t tVar) {
        super(qVar);
        this.f13446c = j;
        this.f13447d = timeUnit;
        this.f13448e = tVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new b(new e(sVar), this.f13446c, this.f13447d, this.f13448e.a()));
    }
}
