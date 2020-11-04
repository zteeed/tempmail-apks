package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.u;
import d.a.v;
import d.a.y.b;

/* compiled from: ObservableCountSingle */
public final class a0<T> extends u<Long> implements d.a.a0.c.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f12781a;

    /* compiled from: ObservableCountSingle */
    static final class a implements s<Object>, b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super Long> f12782b;

        /* renamed from: c  reason: collision with root package name */
        b f12783c;

        /* renamed from: d  reason: collision with root package name */
        long f12784d;

        a(v<? super Long> vVar) {
            this.f12782b = vVar;
        }

        public void dispose() {
            this.f12783c.dispose();
            this.f12783c = c.DISPOSED;
        }

        public void onComplete() {
            this.f12783c = c.DISPOSED;
            this.f12782b.onSuccess(Long.valueOf(this.f12784d));
        }

        public void onError(Throwable th) {
            this.f12783c = c.DISPOSED;
            this.f12782b.onError(th);
        }

        public void onNext(Object obj) {
            this.f12784d++;
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f12783c, bVar)) {
                this.f12783c = bVar;
                this.f12782b.onSubscribe(this);
            }
        }
    }

    public a0(q<T> qVar) {
        this.f12781a = qVar;
    }

    public l<Long> a() {
        return d.a.d0.a.n(new z(this.f12781a));
    }

    public void e(v<? super Long> vVar) {
        this.f12781a.subscribe(new a(vVar));
    }
}
