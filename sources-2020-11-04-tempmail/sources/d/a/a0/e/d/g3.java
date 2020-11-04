package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableSkip */
public final class g3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f13580c;

    /* compiled from: ObservableSkip */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13581b;

        /* renamed from: c  reason: collision with root package name */
        long f13582c;

        /* renamed from: d  reason: collision with root package name */
        b f13583d;

        a(s<? super T> sVar, long j) {
            this.f13581b = sVar;
            this.f13582c = j;
        }

        public void dispose() {
            this.f13583d.dispose();
        }

        public void onComplete() {
            this.f13581b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13581b.onError(th);
        }

        public void onNext(T t) {
            long j = this.f13582c;
            if (j != 0) {
                this.f13582c = j - 1;
            } else {
                this.f13581b.onNext(t);
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13583d, bVar)) {
                this.f13583d = bVar;
                this.f13581b.onSubscribe(this);
            }
        }
    }

    public g3(q<T> qVar, long j) {
        super(qVar);
        this.f13580c = j;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f13580c));
    }
}
