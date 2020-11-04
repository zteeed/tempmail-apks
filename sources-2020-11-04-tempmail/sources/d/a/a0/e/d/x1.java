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
        final s<? super k<T>> f14230b;

        /* renamed from: c  reason: collision with root package name */
        b f14231c;

        a(s<? super k<T>> sVar) {
            this.f14230b = sVar;
        }

        public void dispose() {
            this.f14231c.dispose();
        }

        public void onComplete() {
            this.f14230b.onNext(k.a());
            this.f14230b.onComplete();
        }

        public void onError(Throwable th) {
            this.f14230b.onNext(k.b(th));
            this.f14230b.onComplete();
        }

        public void onNext(T t) {
            this.f14230b.onNext(k.c(t));
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f14231c, bVar)) {
                this.f14231c = bVar;
                this.f14230b.onSubscribe(this);
            }
        }
    }

    public x1(q<T> qVar) {
        super(qVar);
    }

    public void subscribeActual(s<? super k<T>> sVar) {
        this.f13338b.subscribe(new a(sVar));
    }
}
