package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.o;

/* compiled from: ObservableTakeUntilPredicate */
public final class t3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final o<? super T> f14104c;

    /* compiled from: ObservableTakeUntilPredicate */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14105b;

        /* renamed from: c  reason: collision with root package name */
        final o<? super T> f14106c;

        /* renamed from: d  reason: collision with root package name */
        b f14107d;

        /* renamed from: e  reason: collision with root package name */
        boolean f14108e;

        a(s<? super T> sVar, o<? super T> oVar) {
            this.f14105b = sVar;
            this.f14106c = oVar;
        }

        public void dispose() {
            this.f14107d.dispose();
        }

        public void onComplete() {
            if (!this.f14108e) {
                this.f14108e = true;
                this.f14105b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f14108e) {
                this.f14108e = true;
                this.f14105b.onError(th);
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            if (!this.f14108e) {
                this.f14105b.onNext(t);
                try {
                    if (this.f14106c.a(t)) {
                        this.f14108e = true;
                        this.f14107d.dispose();
                        this.f14105b.onComplete();
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f14107d.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f14107d, bVar)) {
                this.f14107d = bVar;
                this.f14105b.onSubscribe(this);
            }
        }
    }

    public t3(q<T> qVar, o<? super T> oVar) {
        super(qVar);
        this.f14104c = oVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f14104c));
    }
}
