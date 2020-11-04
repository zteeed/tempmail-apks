package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableSkip */
public final class g3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f13022c;

    /* compiled from: ObservableSkip */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13023b;

        /* renamed from: c  reason: collision with root package name */
        long f13024c;

        /* renamed from: d  reason: collision with root package name */
        b f13025d;

        a(s<? super T> sVar, long j) {
            this.f13023b = sVar;
            this.f13024c = j;
        }

        public void dispose() {
            this.f13025d.dispose();
        }

        public void onComplete() {
            this.f13023b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13023b.onError(th);
        }

        public void onNext(T t) {
            long j = this.f13024c;
            if (j != 0) {
                this.f13024c = j - 1;
            } else {
                this.f13023b.onNext(t);
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13025d, bVar)) {
                this.f13025d = bVar;
                this.f13023b.onSubscribe(this);
            }
        }
    }

    public g3(q<T> qVar, long j) {
        super(qVar);
        this.f13022c = j;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13022c));
    }
}
