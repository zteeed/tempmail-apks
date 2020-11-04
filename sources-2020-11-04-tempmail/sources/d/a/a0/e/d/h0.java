package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.k;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.n;

/* compiled from: ObservableDematerialize */
public final class h0<T, R> extends a<T, R> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends k<R>> f13602c;

    /* compiled from: ObservableDematerialize */
    static final class a<T, R> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f13603b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends k<R>> f13604c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13605d;

        /* renamed from: e  reason: collision with root package name */
        b f13606e;

        a(s<? super R> sVar, n<? super T, ? extends k<R>> nVar) {
            this.f13603b = sVar;
            this.f13604c = nVar;
        }

        public void dispose() {
            this.f13606e.dispose();
        }

        public void onComplete() {
            if (!this.f13605d) {
                this.f13605d = true;
                this.f13603b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13605d) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13605d = true;
            this.f13603b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13605d) {
                try {
                    Object apply = this.f13604c.apply(t);
                    d.a.a0.b.b.e(apply, "The selector returned a null Notification");
                    k kVar = (k) apply;
                    if (kVar.g()) {
                        this.f13606e.dispose();
                        onError(kVar.d());
                    } else if (kVar.f()) {
                        this.f13606e.dispose();
                        onComplete();
                    } else {
                        this.f13603b.onNext(kVar.e());
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13606e.dispose();
                    onError(th);
                }
            } else if (t instanceof k) {
                k kVar2 = (k) t;
                if (kVar2.g()) {
                    d.a.d0.a.s(kVar2.d());
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13606e, bVar)) {
                this.f13606e = bVar;
                this.f13603b.onSubscribe(this);
            }
        }
    }

    public h0(q<T> qVar, n<? super T, ? extends k<R>> nVar) {
        super(qVar);
        this.f13602c = nVar;
    }

    public void subscribeActual(s<? super R> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f13602c));
    }
}
