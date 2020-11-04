package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.e0.b;
import d.a.q;
import d.a.s;
import d.a.t;
import java.util.concurrent.TimeUnit;

/* compiled from: ObservableTimeInterval */
public final class x3<T> extends a<T, b<T>> {

    /* renamed from: c  reason: collision with root package name */
    final t f13682c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f13683d;

    /* compiled from: ObservableTimeInterval */
    static final class a<T> implements s<T>, d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super b<T>> f13684b;

        /* renamed from: c  reason: collision with root package name */
        final TimeUnit f13685c;

        /* renamed from: d  reason: collision with root package name */
        final t f13686d;

        /* renamed from: e  reason: collision with root package name */
        long f13687e;

        /* renamed from: f  reason: collision with root package name */
        d.a.y.b f13688f;

        a(s<? super b<T>> sVar, TimeUnit timeUnit, t tVar) {
            this.f13684b = sVar;
            this.f13686d = tVar;
            this.f13685c = timeUnit;
        }

        public void dispose() {
            this.f13688f.dispose();
        }

        public void onComplete() {
            this.f13684b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13684b.onError(th);
        }

        public void onNext(T t) {
            long b2 = this.f13686d.b(this.f13685c);
            long j = this.f13687e;
            this.f13687e = b2;
            this.f13684b.onNext(new b(t, b2 - j, this.f13685c));
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13688f, bVar)) {
                this.f13688f = bVar;
                this.f13687e = this.f13686d.b(this.f13685c);
                this.f13684b.onSubscribe(this);
            }
        }
    }

    public x3(q<T> qVar, TimeUnit timeUnit, t tVar) {
        super(qVar);
        this.f13682c = tVar;
        this.f13683d = timeUnit;
    }

    public void subscribeActual(s<? super b<T>> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13683d, this.f13682c));
    }
}
