package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.a0.b.b;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: ObservableDistinct */
public final class j0<T, K> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, K> f13121c;

    /* renamed from: d  reason: collision with root package name */
    final Callable<? extends Collection<? super K>> f13122d;

    /* compiled from: ObservableDistinct */
    static final class a<T, K> extends d.a.a0.d.a<T, T> {
        final Collection<? super K> g;
        final n<? super T, K> h;

        a(s<? super T> sVar, n<? super T, K> nVar, Collection<? super K> collection) {
            super(sVar);
            this.h = nVar;
            this.g = collection;
        }

        public void clear() {
            this.g.clear();
            super.clear();
        }

        public int g(int i) {
            return d(i);
        }

        public void onComplete() {
            if (!this.f12656e) {
                this.f12656e = true;
                this.g.clear();
                this.f12653b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f12656e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f12656e = true;
            this.g.clear();
            this.f12653b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f12656e) {
                if (this.f12657f == 0) {
                    try {
                        K apply = this.h.apply(t);
                        b.e(apply, "The keySelector returned a null key");
                        if (this.g.add(apply)) {
                            this.f12653b.onNext(t);
                        }
                    } catch (Throwable th) {
                        c(th);
                    }
                } else {
                    this.f12653b.onNext(null);
                }
            }
        }

        public T poll() throws Exception {
            T poll;
            Collection<? super K> collection;
            K apply;
            do {
                poll = this.f12655d.poll();
                if (poll == null) {
                    break;
                }
                collection = this.g;
                apply = this.h.apply(poll);
                b.e(apply, "The keySelector returned a null key");
            } while (!collection.add(apply));
            return poll;
        }
    }

    public j0(q<T> qVar, n<? super T, K> nVar, Callable<? extends Collection<? super K>> callable) {
        super(qVar);
        this.f13121c = nVar;
        this.f13122d = callable;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        try {
            Object call = this.f13122d.call();
            b.e(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f12780b.subscribe(new a(sVar, this.f13121c, (Collection) call));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            d.m(th, sVar);
        }
    }
}
