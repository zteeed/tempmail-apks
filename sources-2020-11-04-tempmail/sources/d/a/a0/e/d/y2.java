package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableScalarXMap */
public final class y2 {

    /* compiled from: ObservableScalarXMap */
    public static final class a<T> extends AtomicInteger implements d.a.a0.c.b<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14266b;

        /* renamed from: c  reason: collision with root package name */
        final T f14267c;

        public a(s<? super T> sVar, T t) {
            this.f14266b = sVar;
            this.f14267c = t;
        }

        public void clear() {
            lazySet(3);
        }

        public void dispose() {
            set(3);
        }

        public int g(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public boolean isEmpty() {
            return get() != 1;
        }

        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f14267c;
        }

        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f14266b.onNext(this.f14267c);
                if (get() == 2) {
                    lazySet(3);
                    this.f14266b.onComplete();
                }
            }
        }
    }

    /* compiled from: ObservableScalarXMap */
    static final class b<T, R> extends l<R> {

        /* renamed from: b  reason: collision with root package name */
        final T f14268b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends q<? extends R>> f14269c;

        b(T t, n<? super T, ? extends q<? extends R>> nVar) {
            this.f14268b = t;
            this.f14269c = nVar;
        }

        public void subscribeActual(s<? super R> sVar) {
            try {
                Object apply = this.f14269c.apply(this.f14268b);
                d.a.a0.b.b.e(apply, "The mapper returned a null ObservableSource");
                q qVar = (q) apply;
                if (qVar instanceof Callable) {
                    try {
                        Object call = ((Callable) qVar).call();
                        if (call == null) {
                            d.h(sVar);
                            return;
                        }
                        a aVar = new a(sVar, call);
                        sVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.b(th);
                        d.m(th, sVar);
                    }
                } else {
                    qVar.subscribe(sVar);
                }
            } catch (Throwable th2) {
                d.m(th2, sVar);
            }
        }
    }

    public static <T, U> l<U> a(T t, n<? super T, ? extends q<? extends U>> nVar) {
        return d.a.d0.a.n(new b(t, nVar));
    }

    public static <T, R> boolean b(q<T> qVar, s<? super R> sVar, n<? super T, ? extends q<? extends R>> nVar) {
        if (!(qVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) qVar).call();
            if (call == null) {
                d.h(sVar);
                return true;
            }
            try {
                Object apply = nVar.apply(call);
                d.a.a0.b.b.e(apply, "The mapper returned a null ObservableSource");
                q qVar2 = (q) apply;
                if (qVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) qVar2).call();
                        if (call2 == null) {
                            d.h(sVar);
                            return true;
                        }
                        a aVar = new a(sVar, call2);
                        sVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.b(th);
                        d.m(th, sVar);
                        return true;
                    }
                } else {
                    qVar2.subscribe(sVar);
                }
                return true;
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                d.m(th2, sVar);
                return true;
            }
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            d.m(th3, sVar);
            return true;
        }
    }
}
