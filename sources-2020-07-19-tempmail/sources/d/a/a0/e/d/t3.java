package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.o;

/* compiled from: ObservableTakeUntilPredicate */
public final class t3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final o<? super T> f13546c;

    /* compiled from: ObservableTakeUntilPredicate */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13547b;

        /* renamed from: c  reason: collision with root package name */
        final o<? super T> f13548c;

        /* renamed from: d  reason: collision with root package name */
        b f13549d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13550e;

        a(s<? super T> sVar, o<? super T> oVar) {
            this.f13547b = sVar;
            this.f13548c = oVar;
        }

        public void dispose() {
            this.f13549d.dispose();
        }

        public void onComplete() {
            if (!this.f13550e) {
                this.f13550e = true;
                this.f13547b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f13550e) {
                this.f13550e = true;
                this.f13547b.onError(th);
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            if (!this.f13550e) {
                this.f13547b.onNext(t);
                try {
                    if (this.f13548c.a(t)) {
                        this.f13550e = true;
                        this.f13549d.dispose();
                        this.f13547b.onComplete();
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13549d.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13549d, bVar)) {
                this.f13549d = bVar;
                this.f13547b.onSubscribe(this);
            }
        }
    }

    public t3(q<T> qVar, o<? super T> oVar) {
        super(qVar);
        this.f13546c = oVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13546c));
    }
}
