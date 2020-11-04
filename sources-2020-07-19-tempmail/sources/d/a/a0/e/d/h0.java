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
    final n<? super T, ? extends k<R>> f13044c;

    /* compiled from: ObservableDematerialize */
    static final class a<T, R> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f13045b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends k<R>> f13046c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13047d;

        /* renamed from: e  reason: collision with root package name */
        b f13048e;

        a(s<? super R> sVar, n<? super T, ? extends k<R>> nVar) {
            this.f13045b = sVar;
            this.f13046c = nVar;
        }

        public void dispose() {
            this.f13048e.dispose();
        }

        public void onComplete() {
            if (!this.f13047d) {
                this.f13047d = true;
                this.f13045b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13047d) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13047d = true;
            this.f13045b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13047d) {
                try {
                    Object apply = this.f13046c.apply(t);
                    d.a.a0.b.b.e(apply, "The selector returned a null Notification");
                    k kVar = (k) apply;
                    if (kVar.g()) {
                        this.f13048e.dispose();
                        onError(kVar.d());
                    } else if (kVar.f()) {
                        this.f13048e.dispose();
                        onComplete();
                    } else {
                        this.f13045b.onNext(kVar.e());
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13048e.dispose();
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
            if (c.p(this.f13048e, bVar)) {
                this.f13048e = bVar;
                this.f13045b.onSubscribe(this);
            }
        }
    }

    public h0(q<T> qVar, n<? super T, ? extends k<R>> nVar) {
        super(qVar);
        this.f13044c = nVar;
    }

    public void subscribeActual(s<? super R> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13044c));
    }
}
