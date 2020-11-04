package d.a.a0.e.d;

import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableIgnoreElements */
public final class l1<T> extends a<T, T> {

    /* compiled from: ObservableIgnoreElements */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13757b;

        /* renamed from: c  reason: collision with root package name */
        b f13758c;

        a(s<? super T> sVar) {
            this.f13757b = sVar;
        }

        public void dispose() {
            this.f13758c.dispose();
        }

        public void onComplete() {
            this.f13757b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13757b.onError(th);
        }

        public void onNext(T t) {
        }

        public void onSubscribe(b bVar) {
            this.f13758c = bVar;
            this.f13757b.onSubscribe(this);
        }
    }

    public l1(q<T> qVar) {
        super(qVar);
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar));
    }
}
