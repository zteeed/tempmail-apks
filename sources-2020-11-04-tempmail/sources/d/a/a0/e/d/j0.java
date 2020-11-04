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
    final n<? super T, K> f13679c;

    /* renamed from: d  reason: collision with root package name */
    final Callable<? extends Collection<? super K>> f13680d;

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
            if (!this.f13214e) {
                this.f13214e = true;
                this.g.clear();
                this.f13211b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13214e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13214e = true;
            this.g.clear();
            this.f13211b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13214e) {
                if (this.f13215f == 0) {
                    try {
                        K apply = this.h.apply(t);
                        b.e(apply, "The keySelector returned a null key");
                        if (this.g.add(apply)) {
                            this.f13211b.onNext(t);
                        }
                    } catch (Throwable th) {
                        c(th);
                    }
                } else {
                    this.f13211b.onNext(null);
                }
            }
        }

        public T poll() throws Exception {
            T poll;
            Collection<? super K> collection;
            K apply;
            do {
                poll = this.f13213d.poll();
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
        this.f13679c = nVar;
        this.f13680d = callable;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        try {
            Object call = this.f13680d.call();
            b.e(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f13338b.subscribe(new a(sVar, this.f13679c, (Collection) call));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            d.m(th, sVar);
        }
    }
}
