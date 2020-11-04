package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.o;

/* compiled from: ObservableSkipWhile */
public final class k3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final o<? super T> f13731c;

    /* compiled from: ObservableSkipWhile */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13732b;

        /* renamed from: c  reason: collision with root package name */
        final o<? super T> f13733c;

        /* renamed from: d  reason: collision with root package name */
        b f13734d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13735e;

        a(s<? super T> sVar, o<? super T> oVar) {
            this.f13732b = sVar;
            this.f13733c = oVar;
        }

        public void dispose() {
            this.f13734d.dispose();
        }

        public void onComplete() {
            this.f13732b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13732b.onError(th);
        }

        public void onNext(T t) {
            if (this.f13735e) {
                this.f13732b.onNext(t);
                return;
            }
            try {
                if (!this.f13733c.a(t)) {
                    this.f13735e = true;
                    this.f13732b.onNext(t);
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f13734d.dispose();
                this.f13732b.onError(th);
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13734d, bVar)) {
                this.f13734d = bVar;
                this.f13732b.onSubscribe(this);
            }
        }
    }

    public k3(q<T> qVar, o<? super T> oVar) {
        super(qVar);
        this.f13731c = oVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f13731c));
    }
}
