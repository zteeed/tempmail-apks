package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.t;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSubscribeOn */
public final class l3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final t f13766c;

    /* compiled from: ObservableSubscribeOn */
    static final class a<T> extends AtomicReference<d.a.y.b> implements s<T>, d.a.y.b {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13767b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f13768c = new AtomicReference<>();

        a(s<? super T> sVar) {
            this.f13767b = sVar;
        }

        /* access modifiers changed from: package-private */
        public void a(d.a.y.b bVar) {
            c.n(this, bVar);
        }

        public void dispose() {
            c.f(this.f13768c);
            c.f(this);
        }

        public void onComplete() {
            this.f13767b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13767b.onError(th);
        }

        public void onNext(T t) {
            this.f13767b.onNext(t);
        }

        public void onSubscribe(d.a.y.b bVar) {
            c.n(this.f13768c, bVar);
        }
    }

    /* compiled from: ObservableSubscribeOn */
    final class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final a<T> f13769b;

        b(a<T> aVar) {
            this.f13769b = aVar;
        }

        public void run() {
            l3.this.f13338b.subscribe(this.f13769b);
        }
    }

    public l3(q<T> qVar, t tVar) {
        super(qVar);
        this.f13766c = tVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        aVar.a(this.f13766c.c(new b(aVar)));
    }
}
