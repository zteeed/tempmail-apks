package d.a.a0.e.d;

import d.a.q;
import d.a.s;
import d.a.z.f;

/* compiled from: ObservableDoAfterNext */
public final class l0<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final f<? super T> f13198c;

    /* compiled from: ObservableDoAfterNext */
    static final class a<T> extends d.a.a0.d.a<T, T> {
        final f<? super T> g;

        a(s<? super T> sVar, f<? super T> fVar) {
            super(sVar);
            this.g = fVar;
        }

        public int g(int i) {
            return d(i);
        }

        public void onNext(T t) {
            this.f12653b.onNext(t);
            if (this.f12657f == 0) {
                try {
                    this.g.a(t);
                } catch (Throwable th) {
                    c(th);
                }
            }
        }

        public T poll() throws Exception {
            T poll = this.f12655d.poll();
            if (poll != null) {
                this.g.a(poll);
            }
            return poll;
        }
    }

    public l0(q<T> qVar, f<? super T> fVar) {
        super(qVar);
        this.f13198c = fVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13198c));
    }
}
