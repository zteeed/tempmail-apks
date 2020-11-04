package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.a.d;
import d.a.q;
import d.a.s;
import d.a.y.b;
import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: ObservableToList */
public final class b4<T, U extends Collection<? super T>> extends a<T, U> {

    /* renamed from: c  reason: collision with root package name */
    final Callable<U> f12837c;

    /* compiled from: ObservableToList */
    static final class a<T, U extends Collection<? super T>> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super U> f12838b;

        /* renamed from: c  reason: collision with root package name */
        b f12839c;

        /* renamed from: d  reason: collision with root package name */
        U f12840d;

        a(s<? super U> sVar, U u) {
            this.f12838b = sVar;
            this.f12840d = u;
        }

        public void dispose() {
            this.f12839c.dispose();
        }

        public void onComplete() {
            U u = this.f12840d;
            this.f12840d = null;
            this.f12838b.onNext(u);
            this.f12838b.onComplete();
        }

        public void onError(Throwable th) {
            this.f12840d = null;
            this.f12838b.onError(th);
        }

        public void onNext(T t) {
            this.f12840d.add(t);
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f12839c, bVar)) {
                this.f12839c = bVar;
                this.f12838b.onSubscribe(this);
            }
        }
    }

    public b4(q<T> qVar, int i) {
        super(qVar);
        this.f12837c = d.a.a0.b.a.e(i);
    }

    public void subscribeActual(s<? super U> sVar) {
        try {
            U call = this.f12837c.call();
            d.a.a0.b.b.e(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f12780b.subscribe(new a(sVar, (Collection) call));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            d.m(th, sVar);
        }
    }

    public b4(q<T> qVar, Callable<U> callable) {
        super(qVar);
        this.f12837c = callable;
    }
}
