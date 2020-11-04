package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.n;

/* compiled from: ObservableFlattenIterable */
public final class a1<T, R> extends a<T, R> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends Iterable<? extends R>> f12785c;

    /* compiled from: ObservableFlattenIterable */
    static final class a<T, R> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f12786b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends Iterable<? extends R>> f12787c;

        /* renamed from: d  reason: collision with root package name */
        b f12788d;

        a(s<? super R> sVar, n<? super T, ? extends Iterable<? extends R>> nVar) {
            this.f12786b = sVar;
            this.f12787c = nVar;
        }

        public void dispose() {
            this.f12788d.dispose();
            this.f12788d = c.DISPOSED;
        }

        public void onComplete() {
            b bVar = this.f12788d;
            c cVar = c.DISPOSED;
            if (bVar != cVar) {
                this.f12788d = cVar;
                this.f12786b.onComplete();
            }
        }

        public void onError(Throwable th) {
            b bVar = this.f12788d;
            c cVar = c.DISPOSED;
            if (bVar == cVar) {
                d.a.d0.a.s(th);
                return;
            }
            this.f12788d = cVar;
            this.f12786b.onError(th);
        }

        public void onNext(T t) {
            if (this.f12788d != c.DISPOSED) {
                try {
                    s<? super R> sVar = this.f12786b;
                    for (Object next : (Iterable) this.f12787c.apply(t)) {
                        try {
                            try {
                                d.a.a0.b.b.e(next, "The iterator returned a null value");
                                sVar.onNext(next);
                            } catch (Throwable th) {
                                io.reactivex.exceptions.a.b(th);
                                this.f12788d.dispose();
                                onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            this.f12788d.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    this.f12788d.dispose();
                    onError(th3);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f12788d, bVar)) {
                this.f12788d = bVar;
                this.f12786b.onSubscribe(this);
            }
        }
    }

    public a1(q<T> qVar, n<? super T, ? extends Iterable<? extends R>> nVar) {
        super(qVar);
        this.f12785c = nVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super R> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f12785c));
    }
}
