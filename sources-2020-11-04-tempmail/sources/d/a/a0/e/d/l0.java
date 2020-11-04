package d.a.a0.e.d;

import d.a.q;
import d.a.s;
import d.a.z.f;

/* compiled from: ObservableDoAfterNext */
public final class l0<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final f<? super T> f13756c;

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
            this.f13211b.onNext(t);
            if (this.f13215f == 0) {
                try {
                    this.g.a(t);
                } catch (Throwable th) {
                    c(th);
                }
            }
        }

        public T poll() throws Exception {
            T poll = this.f13213d.poll();
            if (poll != null) {
                this.g.a(poll);
            }
            return poll;
        }
    }

    public l0(q<T> qVar, f<? super T> fVar) {
        super(qVar);
        this.f13756c = fVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f13756c));
    }
}
