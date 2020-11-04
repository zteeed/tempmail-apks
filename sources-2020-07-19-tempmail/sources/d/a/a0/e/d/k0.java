package d.a.a0.e.d;

import d.a.q;
import d.a.s;
import d.a.z.d;
import d.a.z.n;

/* compiled from: ObservableDistinctUntilChanged */
public final class k0<T, K> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, K> f13163c;

    /* renamed from: d  reason: collision with root package name */
    final d<? super K, ? super K> f13164d;

    /* compiled from: ObservableDistinctUntilChanged */
    static final class a<T, K> extends d.a.a0.d.a<T, T> {
        final n<? super T, K> g;
        final d<? super K, ? super K> h;
        K i;
        boolean j;

        a(s<? super T> sVar, n<? super T, K> nVar, d<? super K, ? super K> dVar) {
            super(sVar);
            this.g = nVar;
            this.h = dVar;
        }

        public int g(int i2) {
            return d(i2);
        }

        public void onNext(T t) {
            if (!this.f12656e) {
                if (this.f12657f != 0) {
                    this.f12653b.onNext(t);
                    return;
                }
                try {
                    K apply = this.g.apply(t);
                    if (this.j) {
                        boolean a2 = this.h.a(this.i, apply);
                        this.i = apply;
                        if (a2) {
                            return;
                        }
                    } else {
                        this.j = true;
                        this.i = apply;
                    }
                    this.f12653b.onNext(t);
                } catch (Throwable th) {
                    c(th);
                }
            }
        }

        public T poll() throws Exception {
            while (true) {
                T poll = this.f12655d.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.g.apply(poll);
                if (!this.j) {
                    this.j = true;
                    this.i = apply;
                    return poll;
                } else if (!this.h.a(this.i, apply)) {
                    this.i = apply;
                    return poll;
                } else {
                    this.i = apply;
                }
            }
        }
    }

    public k0(q<T> qVar, n<? super T, K> nVar, d<? super K, ? super K> dVar) {
        super(qVar);
        this.f13163c = nVar;
        this.f13164d = dVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13163c, this.f13164d));
    }
}
