package d.a.a0.e.e;

import d.a.a0.a.c;
import d.a.a0.d.i;
import d.a.l;
import d.a.s;
import d.a.v;
import d.a.w;

/* compiled from: SingleToObservable */
public final class b<T> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final w<? extends T> f14330b;

    /* compiled from: SingleToObservable */
    static final class a<T> extends i<T> implements v<T> {
        private static final long serialVersionUID = 3786543492451018833L;

        /* renamed from: d  reason: collision with root package name */
        d.a.y.b f14331d;

        a(s<? super T> sVar) {
            super(sVar);
        }

        public void dispose() {
            super.dispose();
            this.f14331d.dispose();
        }

        public void onError(Throwable th) {
            c(th);
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f14331d, bVar)) {
                this.f14331d = bVar;
                this.f13226b.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            b(t);
        }
    }

    public b(w<? extends T> wVar) {
        this.f14330b = wVar;
    }

    public static <T> v<T> d(s<? super T> sVar) {
        return new a(sVar);
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f14330b.b(d(sVar));
    }
}
