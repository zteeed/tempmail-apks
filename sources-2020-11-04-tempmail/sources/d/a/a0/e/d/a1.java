package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.n;

/* compiled from: ObservableFlattenIterable */
public final class a1<T, R> extends a<T, R> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends Iterable<? extends R>> f13343c;

    /* compiled from: ObservableFlattenIterable */
    static final class a<T, R> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f13344b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends Iterable<? extends R>> f13345c;

        /* renamed from: d  reason: collision with root package name */
        b f13346d;

        a(s<? super R> sVar, n<? super T, ? extends Iterable<? extends R>> nVar) {
            this.f13344b = sVar;
            this.f13345c = nVar;
        }

        public void dispose() {
            this.f13346d.dispose();
            this.f13346d = c.DISPOSED;
        }

        public void onComplete() {
            b bVar = this.f13346d;
            c cVar = c.DISPOSED;
            if (bVar != cVar) {
                this.f13346d = cVar;
                this.f13344b.onComplete();
            }
        }

        public void onError(Throwable th) {
            b bVar = this.f13346d;
            c cVar = c.DISPOSED;
            if (bVar == cVar) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13346d = cVar;
            this.f13344b.onError(th);
        }

        public void onNext(T t) {
            if (this.f13346d != c.DISPOSED) {
                try {
                    s<? super R> sVar = this.f13344b;
                    for (Object next : (Iterable) this.f13345c.apply(t)) {
                        try {
                            try {
                                d.a.a0.b.b.e(next, "The iterator returned a null value");
                                sVar.onNext(next);
                            } catch (Throwable th) {
                                io.reactivex.exceptions.a.b(th);
                                this.f13346d.dispose();
                                onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            this.f13346d.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    this.f13346d.dispose();
                    onError(th3);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13346d, bVar)) {
                this.f13346d = bVar;
                this.f13344b.onSubscribe(this);
            }
        }
    }

    public a1(q<T> qVar, n<? super T, ? extends Iterable<? extends R>> nVar) {
        super(qVar);
        this.f13343c = nVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super R> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f13343c));
    }
}
