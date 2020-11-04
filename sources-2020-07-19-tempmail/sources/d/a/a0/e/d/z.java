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
        final s<? super Long> f13726b;

        /* renamed from: c  reason: collision with root package name */
        b f13727c;

        /* renamed from: d  reason: collision with root package name */
        long f13728d;

        a(s<? super Long> sVar) {
            this.f13726b = sVar;
        }

        public void dispose() {
            this.f13727c.dispose();
        }

        public void onComplete() {
            this.f13726b.onNext(Long.valueOf(this.f13728d));
            this.f13726b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13726b.onError(th);
        }

        public void onNext(Object obj) {
            this.f13728d++;
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13727c, bVar)) {
                this.f13727c = bVar;
                this.f13726b.onSubscribe(this);
            }
        }
    }

    public z(q<T> qVar) {
        super(qVar);
    }

    public void subscribeActual(s<? super Long> sVar) {
        this.f12780b.subscribe(new a(sVar));
    }
}
