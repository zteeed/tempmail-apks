package d.a.a0.e.d;

import d.a.a0.b.b;
import d.a.q;
import d.a.s;
import d.a.z.n;

/* compiled from: ObservableMap */
public final class v1<T, U> extends a<T, U> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends U> f14163c;

    /* compiled from: ObservableMap */
    static final class a<T, U> extends d.a.a0.d.a<T, U> {
        final n<? super T, ? extends U> g;

        a(s<? super U> sVar, n<? super T, ? extends U> nVar) {
            super(sVar);
            this.g = nVar;
        }

        public int g(int i) {
            return d(i);
        }

        public void onNext(T t) {
            if (!this.f13214e) {
                if (this.f13215f != 0) {
                    this.f13211b.onNext(null);
                    return;
                }
                try {
                    Object apply = this.g.apply(t);
                    b.e(apply, "The mapper function returned a null value.");
                    this.f13211b.onNext(apply);
                } catch (Throwable th) {
                    c(th);
                }
            }
        }

        public U poll() throws Exception {
            T poll = this.f13213d.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.g.apply(poll);
            b.e(apply, "The mapper function returned a null value.");
            return apply;
        }
    }

    public v1(q<T> qVar, n<? super T, ? extends U> nVar) {
        super(qVar);
        this.f14163c = nVar;
    }

    public void subscribeActual(s<? super U> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f14163c));
    }
}
