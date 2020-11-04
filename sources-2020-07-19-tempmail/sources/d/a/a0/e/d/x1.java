package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.k;
import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableMaterialize */
public final class x1<T> extends a<T, k<T>> {

    /* compiled from: ObservableMaterialize */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super k<T>> f13672b;

        /* renamed from: c  reason: collision with root package name */
        b f13673c;

        a(s<? super k<T>> sVar) {
            this.f13672b = sVar;
        }

        public void dispose() {
            this.f13673c.dispose();
        }

        public void onComplete() {
            this.f13672b.onNext(k.a());
            this.f13672b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13672b.onNext(k.b(th));
            this.f13672b.onComplete();
        }

        public void onNext(T t) {
            this.f13672b.onNext(k.c(t));
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13673c, bVar)) {
                this.f13673c = bVar;
                this.f13672b.onSubscribe(this);
            }
        }
    }

    public x1(q<T> qVar) {
        super(qVar);
    }

    public void subscribeActual(s<? super k<T>> sVar) {
        this.f12780b.subscribe(new a(sVar));
    }
}
