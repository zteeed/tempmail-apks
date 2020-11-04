package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableHide */
public final class k1<T> extends a<T, T> {

    /* compiled from: ObservableHide */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13165b;

        /* renamed from: c  reason: collision with root package name */
        b f13166c;

        a(s<? super T> sVar) {
            this.f13165b = sVar;
        }

        public void dispose() {
            this.f13166c.dispose();
        }

        public void onComplete() {
            this.f13165b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13165b.onError(th);
        }

        public void onNext(T t) {
            this.f13165b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13166c, bVar)) {
                this.f13166c = bVar;
                this.f13165b.onSubscribe(this);
            }
        }
    }

    public k1(q<T> qVar) {
        super(qVar);
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar));
    }
}
