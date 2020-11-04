package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableCount */
public final class z<T> extends a<T, Long> {

    /* compiled from: ObservableCount */
    static final class a implements s<Object>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super Long> f14284b;

        /* renamed from: c  reason: collision with root package name */
        b f14285c;

        /* renamed from: d  reason: collision with root package name */
        long f14286d;

        a(s<? super Long> sVar) {
            this.f14284b = sVar;
        }

        public void dispose() {
            this.f14285c.dispose();
        }

        public void onComplete() {
            this.f14284b.onNext(Long.valueOf(this.f14286d));
            this.f14284b.onComplete();
        }

        public void onError(Throwable th) {
            this.f14284b.onError(th);
        }

        public void onNext(Object obj) {
            this.f14286d++;
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f14285c, bVar)) {
                this.f14285c = bVar;
                this.f14284b.onSubscribe(this);
            }
        }
    }

    public z(q<T> qVar) {
        super(qVar);
    }

    public void subscribeActual(s<? super Long> sVar) {
        this.f13338b.subscribe(new a(sVar));
    }
}
