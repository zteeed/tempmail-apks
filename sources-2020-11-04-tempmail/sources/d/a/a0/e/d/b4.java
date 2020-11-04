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
    final Callable<U> f13395c;

    /* compiled from: ObservableToList */
    static final class a<T, U extends Collection<? super T>> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super U> f13396b;

        /* renamed from: c  reason: collision with root package name */
        b f13397c;

        /* renamed from: d  reason: collision with root package name */
        U f13398d;

        a(s<? super U> sVar, U u) {
            this.f13396b = sVar;
            this.f13398d = u;
        }

        public void dispose() {
            this.f13397c.dispose();
        }

        public void onComplete() {
            U u = this.f13398d;
            this.f13398d = null;
            this.f13396b.onNext(u);
            this.f13396b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13398d = null;
            this.f13396b.onError(th);
        }

        public void onNext(T t) {
            this.f13398d.add(t);
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13397c, bVar)) {
                this.f13397c = bVar;
                this.f13396b.onSubscribe(this);
            }
        }
    }

    public b4(q<T> qVar, int i) {
        super(qVar);
        this.f13395c = d.a.a0.b.a.e(i);
    }

    public void subscribeActual(s<? super U> sVar) {
        try {
            U call = this.f13395c.call();
            d.a.a0.b.b.e(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f13338b.subscribe(new a(sVar, (Collection) call));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            d.m(th, sVar);
        }
    }

    public b4(q<T> qVar, Callable<U> callable) {
        super(qVar);
        this.f13395c = callable;
    }
}
