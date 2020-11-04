package d.a.a0.e.d;

import d.a.a0.j.c;
import d.a.a0.j.k;
import d.a.q;
import d.a.s;
import d.a.y.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableTakeUntil */
public final class s3<T, U> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final q<? extends U> f13515c;

    /* compiled from: ObservableTakeUntil */
    static final class a<T, U> extends AtomicInteger implements s<T>, b {
        private static final long serialVersionUID = 1418547743690811973L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13516b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReference<b> f13517c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        final a<T, U>.a f13518d = new C0144a();

        /* renamed from: e  reason: collision with root package name */
        final c f13519e = new c();

        /* renamed from: d.a.a0.e.d.s3$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableTakeUntil */
        final class C0144a extends AtomicReference<b> implements s<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            C0144a() {
            }

            public void onComplete() {
                a.this.a();
            }

            public void onError(Throwable th) {
                a.this.b(th);
            }

            public void onNext(U u) {
                d.a.a0.a.c.f(this);
                a.this.a();
            }

            public void onSubscribe(b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }
        }

        a(s<? super T> sVar) {
            this.f13516b = sVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            d.a.a0.a.c.f(this.f13517c);
            k.a(this.f13516b, this, this.f13519e);
        }

        /* access modifiers changed from: package-private */
        public void b(Throwable th) {
            d.a.a0.a.c.f(this.f13517c);
            k.c(this.f13516b, th, this, this.f13519e);
        }

        public void dispose() {
            d.a.a0.a.c.f(this.f13517c);
            d.a.a0.a.c.f(this.f13518d);
        }

        public void onComplete() {
            d.a.a0.a.c.f(this.f13518d);
            k.a(this.f13516b, this, this.f13519e);
        }

        public void onError(Throwable th) {
            d.a.a0.a.c.f(this.f13518d);
            k.c(this.f13516b, th, this, this.f13519e);
        }

        public void onNext(T t) {
            k.e(this.f13516b, t, this, this.f13519e);
        }

        public void onSubscribe(b bVar) {
            d.a.a0.a.c.n(this.f13517c, bVar);
        }
    }

    public s3(q<T> qVar, q<? extends U> qVar2) {
        super(qVar);
        this.f13515c = qVar2;
    }

    public void subscribeActual(s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        this.f13515c.subscribe(aVar.f13518d);
        this.f12780b.subscribe(aVar);
    }
}
