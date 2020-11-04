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
    final q<T> f13803a;

    /* renamed from: b  reason: collision with root package name */
    final R f13804b;

    /* renamed from: c  reason: collision with root package name */
    final c<R, ? super T, R> f13805c;

    /* compiled from: ObservableReduceSeedSingle */
    static final class a<T, R> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super R> f13806b;

        /* renamed from: c  reason: collision with root package name */
        final c<R, ? super T, R> f13807c;

        /* renamed from: d  reason: collision with root package name */
        R f13808d;

        /* renamed from: e  reason: collision with root package name */
        b f13809e;

        a(v<? super R> vVar, c<R, ? super T, R> cVar, R r) {
            this.f13806b = vVar;
            this.f13808d = r;
            this.f13807c = cVar;
        }

        public void dispose() {
            this.f13809e.dispose();
        }

        public void onComplete() {
            R r = this.f13808d;
            if (r != null) {
                this.f13808d = null;
                this.f13806b.onSuccess(r);
            }
        }

        public void onError(Throwable th) {
            if (this.f13808d != null) {
                this.f13808d = null;
                this.f13806b.onError(th);
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            R r = this.f13808d;
            if (r != null) {
                try {
                    R a2 = this.f13807c.a(r, t);
                    d.a.a0.b.b.e(a2, "The reducer returned a null value");
                    this.f13808d = a2;
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13809e.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.f13809e, bVar)) {
                this.f13809e = bVar;
                this.f13806b.onSubscribe(this);
            }
        }
    }

    public m2(q<T> qVar, R r, c<R, ? super T, R> cVar) {
        this.f13803a = qVar;
        this.f13804b = r;
        this.f13805c = cVar;
    }

    /* access modifiers changed from: protected */
    public void e(v<? super R> vVar) {
        this.f13803a.subscribe(new a(vVar, this.f13805c, this.f13804b));
    }
}
