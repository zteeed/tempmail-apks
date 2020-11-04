package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.u;
import d.a.v;
import d.a.y.b;
import d.a.z.o;

/* compiled from: ObservableAllSingle */
public final class g<T> extends u<Boolean> implements d.a.a0.c.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f13558a;

    /* renamed from: b  reason: collision with root package name */
    final o<? super T> f13559b;

    /* compiled from: ObservableAllSingle */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super Boolean> f13560b;

        /* renamed from: c  reason: collision with root package name */
        final o<? super T> f13561c;

        /* renamed from: d  reason: collision with root package name */
        b f13562d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13563e;

        a(v<? super Boolean> vVar, o<? super T> oVar) {
            this.f13560b = vVar;
            this.f13561c = oVar;
        }

        public void dispose() {
            this.f13562d.dispose();
        }

        public void onComplete() {
            if (!this.f13563e) {
                this.f13563e = true;
                this.f13560b.onSuccess(Boolean.TRUE);
            }
        }

        public void onError(Throwable th) {
            if (this.f13563e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13563e = true;
            this.f13560b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13563e) {
                try {
                    if (!this.f13561c.a(t)) {
                        this.f13563e = true;
                        this.f13562d.dispose();
                        this.f13560b.onSuccess(Boolean.FALSE);
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13562d.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13562d, bVar)) {
                this.f13562d = bVar;
                this.f13560b.onSubscribe(this);
            }
        }
    }

    public g(q<T> qVar, o<? super T> oVar) {
        this.f13558a = qVar;
        this.f13559b = oVar;
    }

    public l<Boolean> a() {
        return d.a.d0.a.n(new f(this.f13558a, this.f13559b));
    }

    /* access modifiers changed from: protected */
    public void e(v<? super Boolean> vVar) {
        this.f13558a.subscribe(new a(vVar, this.f13559b));
    }
}
