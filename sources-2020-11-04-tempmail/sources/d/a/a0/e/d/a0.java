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
    final q<T> f13339a;

    /* compiled from: ObservableCountSingle */
    static final class a implements s<Object>, b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super Long> f13340b;

        /* renamed from: c  reason: collision with root package name */
        b f13341c;

        /* renamed from: d  reason: collision with root package name */
        long f13342d;

        a(v<? super Long> vVar) {
            this.f13340b = vVar;
        }

        public void dispose() {
            this.f13341c.dispose();
            this.f13341c = c.DISPOSED;
        }

        public void onComplete() {
            this.f13341c = c.DISPOSED;
            this.f13340b.onSuccess(Long.valueOf(this.f13342d));
        }

        public void onError(Throwable th) {
            this.f13341c = c.DISPOSED;
            this.f13340b.onError(th);
        }

        public void onNext(Object obj) {
            this.f13342d++;
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13341c, bVar)) {
                this.f13341c = bVar;
                this.f13340b.onSubscribe(this);
            }
        }
    }

    public a0(q<T> qVar) {
        this.f13339a = qVar;
    }

    public l<Long> a() {
        return d.a.d0.a.n(new z(this.f13339a));
    }

    public void e(v<? super Long> vVar) {
        this.f13339a.subscribe(new a(vVar));
    }
}
