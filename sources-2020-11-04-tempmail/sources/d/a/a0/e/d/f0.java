package d.a.a0.e.d;

import d.a.c0.e;
import d.a.q;
import d.a.s;
import d.a.t;
import java.util.concurrent.TimeUnit;

/* compiled from: ObservableDelay */
public final class f0<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f13511c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f13512d;

    /* renamed from: e  reason: collision with root package name */
    final t f13513e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f13514f;

    /* compiled from: ObservableDelay */
    static final class a<T> implements s<T>, d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13515b;

        /* renamed from: c  reason: collision with root package name */
        final long f13516c;

        /* renamed from: d  reason: collision with root package name */
        final TimeUnit f13517d;

        /* renamed from: e  reason: collision with root package name */
        final t.c f13518e;

        /* renamed from: f  reason: collision with root package name */
        final boolean f13519f;
        d.a.y.b g;

        /* renamed from: d.a.a0.e.d.f0$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableDelay */
        final class C0137a implements Runnable {
            C0137a() {
            }

            public void run() {
                try {
                    a.this.f13515b.onComplete();
                } finally {
                    a.this.f13518e.dispose();
                }
            }
        }

        /* compiled from: ObservableDelay */
        final class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private final Throwable f13521b;

            b(Throwable th) {
                this.f13521b = th;
            }

            public void run() {
                try {
                    a.this.f13515b.onError(this.f13521b);
                } finally {
                    a.this.f13518e.dispose();
                }
            }
        }

        /* compiled from: ObservableDelay */
        final class c implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private final T f13523b;

            c(T t) {
                this.f13523b = t;
            }

            public void run() {
                a.this.f13515b.onNext(this.f13523b);
            }
        }

        a(s<? super T> sVar, long j, TimeUnit timeUnit, t.c cVar, boolean z) {
            this.f13515b = sVar;
            this.f13516c = j;
            this.f13517d = timeUnit;
            this.f13518e = cVar;
            this.f13519f = z;
        }

        public void dispose() {
            this.g.dispose();
            this.f13518e.dispose();
        }

        public void onComplete() {
            this.f13518e.c(new C0137a(), this.f13516c, this.f13517d);
        }

        public void onError(Throwable th) {
            this.f13518e.c(new b(th), this.f13519f ? this.f13516c : 0, this.f13517d);
        }

        public void onNext(T t) {
            this.f13518e.c(new c(t), this.f13516c, this.f13517d);
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.g, bVar)) {
                this.g = bVar;
                this.f13515b.onSubscribe(this);
            }
        }
    }

    public f0(q<T> qVar, long j, TimeUnit timeUnit, t tVar, boolean z) {
        super(qVar);
        this.f13511c = j;
        this.f13512d = timeUnit;
        this.f13513e = tVar;
        this.f13514f = z;
    }

    public void subscribeActual(s<? super T> sVar) {
        e eVar;
        if (this.f13514f) {
            eVar = sVar;
        } else {
            eVar = new e(sVar);
        }
        this.f13338b.subscribe(new a(eVar, this.f13511c, this.f13512d, this.f13513e.a(), this.f13514f));
    }
}
