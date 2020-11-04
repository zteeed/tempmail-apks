package d.a.a0.e.d;

import d.a.q;
import d.a.s;
import d.a.u;
import d.a.v;
import d.a.y.b;
import d.a.z.c;

/* compiled from: ObservableReduceSeedSingle */
public final class m2<T, R> extends u<R> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f13245a;

    /* renamed from: b  reason: collision with root package name */
    final R f13246b;

    /* renamed from: c  reason: collision with root package name */
    final c<R, ? super T, R> f13247c;

    /* compiled from: ObservableReduceSeedSingle */
    static final class a<T, R> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super R> f13248b;

        /* renamed from: c  reason: collision with root package name */
        final c<R, ? super T, R> f13249c;

        /* renamed from: d  reason: collision with root package name */
        R f13250d;

        /* renamed from: e  reason: collision with root package name */
        b f13251e;

        a(v<? super R> vVar, c<R, ? super T, R> cVar, R r) {
            this.f13248b = vVar;
            this.f13250d = r;
            this.f13249c = cVar;
        }

        public void dispose() {
            this.f13251e.dispose();
        }

        public void onComplete() {
            R r = this.f13250d;
            if (r != null) {
                this.f13250d = null;
                this.f13248b.onSuccess(r);
            }
        }

        public void onError(Throwable th) {
            if (this.f13250d != null) {
                this.f13250d = null;
                this.f13248b.onError(th);
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            R r = this.f13250d;
            if (r != null) {
                try {
                    R a2 = this.f13249c.a(r, t);
                    d.a.a0.b.b.e(a2, "The reducer returned a null value");
                    this.f13250d = a2;
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13251e.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.f13251e, bVar)) {
                this.f13251e = bVar;
                this.f13248b.onSubscribe(this);
            }
        }
    }

    public m2(q<T> qVar, R r, c<R, ? super T, R> cVar) {
        this.f13245a = qVar;
        this.f13246b = r;
        this.f13247c = cVar;
    }

    /* access modifiers changed from: protected */
    public void e(v<? super R> vVar) {
        this.f13245a.subscribe(new a(vVar, this.f13247c, this.f13246b));
    }
}
