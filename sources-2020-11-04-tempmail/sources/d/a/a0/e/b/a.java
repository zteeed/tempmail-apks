package d.a.a0.e.b;

import d.a.a0.a.c;
import d.a.a0.d.i;
import d.a.l;
import d.a.s;
import d.a.y.b;

/* compiled from: MaybeToObservable */
public final class a<T> extends l<T> {

    /* renamed from: d.a.a0.e.b.a$a  reason: collision with other inner class name */
    /* compiled from: MaybeToObservable */
    static final class C0125a<T> extends i<T> implements d.a.i<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: d  reason: collision with root package name */
        b f13278d;

        C0125a(s<? super T> sVar) {
            super(sVar);
        }

        public void dispose() {
            super.dispose();
            this.f13278d.dispose();
        }

        public void onComplete() {
            a();
        }

        public void onError(Throwable th) {
            c(th);
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13278d, bVar)) {
                this.f13278d = bVar;
                this.f13226b.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            b(t);
        }
    }

    public static <T> d.a.i<T> d(s<? super T> sVar) {
        return new C0125a(sVar);
    }
}
