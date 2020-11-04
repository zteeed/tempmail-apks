package d.a.a0.e.d;

import d.a.c0.e;
import d.a.q;
import d.a.s;
import d.a.t;
import java.util.concurrent.TimeUnit;

/* compiled from: ObservableDelay */
public final class f0<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f12953c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f12954d;

    /* renamed from: e  reason: collision with root package name */
    final t f12955e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f12956f;

    /* compiled from: ObservableDelay */
    static final class a<T> implements s<T>, d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f12957b;

        /* renamed from: c  reason: collision with root package name */
        final long f12958c;

        /* renamed from: d  reason: collision with root package name */
        final TimeUnit f12959d;

        /* renamed from: e  reason: collision with root package name */
        final t.c f12960e;

        /* renamed from: f  reason: collision with root package name */
        final boolean f12961f;
        d.a.y.b g;

        /* renamed from: d.a.a0.e.d.f0$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableDelay */
        final class C0139a implements Runnable {
            C0139a() {
            }

            public void run() {
                try {
                    a.this.f12957b.onComplete();
                } finally {
                    a.this.f12960e.dispose();
                }
            }
        }

        /* compiled from: ObservableDelay */
        final class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private final Throwable f12963b;

            b(Throwable th) {
                this.f12963b = th;
            }

            public void run() {
                try {
                    a.this.f12957b.onError(this.f12963b);
                } finally {
                    a.this.f12960e.dispose();
                }
            }
        }

        /* compiled from: ObservableDelay */
        final class c implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private final T f12965b;

            c(T t) {
                this.f12965b = t;
            }

            public void run() {
                a.this.f12957b.onNext(this.f12965b);
            }
        }

        a(s<? super T> sVar, long j, TimeUnit timeUnit, t.c cVar, boolean z) {
            this.f12957b = sVar;
            this.f12958c = j;
            this.f12959d = timeUnit;
            this.f12960e = cVar;
            this.f12961f = z;
        }

        public void dispose() {
            this.g.dispose();
            this.f12960e.dispose();
        }

        public void onComplete() {
            this.f12960e.c(new C0139a(), this.f12958c, this.f12959d);
        }

        public void onError(Throwable th) {
            this.f12960e.c(new b(th), this.f12961f ? this.f12958c : 0, this.f12959d);
        }

        public void onNext(T t) {
            this.f12960e.c(new c(t), this.f12958c, this.f12959d);
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.g, bVar)) {
                this.g = bVar;
                this.f12957b.onSubscribe(this);
            }
        }
    }

    public f0(q<T> qVar, long j, TimeUnit timeUnit, t tVar, boolean z) {
        super(qVar);
        this.f12953c = j;
        this.f12954d = timeUnit;
        this.f12955e = tVar;
        this.f12956f = z;
    }

    public void subscribeActual(s<? super T> sVar) {
        e eVar;
        if (this.f12956f) {
            eVar = sVar;
        } else {
            eVar = new e(sVar);
        }
        this.f12780b.subscribe(new a(eVar, this.f12953c, this.f12954d, this.f12955e.a(), this.f12956f));
    }
}
