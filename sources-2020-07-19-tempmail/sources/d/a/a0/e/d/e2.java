package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.n;
import io.reactivex.exceptions.CompositeException;

/* compiled from: ObservableOnErrorReturn */
public final class e2<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super Throwable, ? extends T> f12930c;

    /* compiled from: ObservableOnErrorReturn */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f12931b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super Throwable, ? extends T> f12932c;

        /* renamed from: d  reason: collision with root package name */
        b f12933d;

        a(s<? super T> sVar, n<? super Throwable, ? extends T> nVar) {
            this.f12931b = sVar;
            this.f12932c = nVar;
        }

        public void dispose() {
            this.f12933d.dispose();
        }

        public void onComplete() {
            this.f12931b.onComplete();
        }

        public void onError(Throwable th) {
            try {
                Object apply = this.f12932c.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f12931b.onError(nullPointerException);
                    return;
                }
                this.f12931b.onNext(apply);
                this.f12931b.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f12931b.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(T t) {
            this.f12931b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f12933d, bVar)) {
                this.f12933d = bVar;
                this.f12931b.onSubscribe(this);
            }
        }
    }

    public e2(q<T> qVar, n<? super Throwable, ? extends T> nVar) {
        super(qVar);
        this.f12930c = nVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f12930c));
    }
}
