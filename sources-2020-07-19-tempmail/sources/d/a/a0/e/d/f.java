package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.o;

/* compiled from: ObservableAll */
public final class f<T> extends a<T, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    final o<? super T> f12948c;

    /* compiled from: ObservableAll */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super Boolean> f12949b;

        /* renamed from: c  reason: collision with root package name */
        final o<? super T> f12950c;

        /* renamed from: d  reason: collision with root package name */
        b f12951d;

        /* renamed from: e  reason: collision with root package name */
        boolean f12952e;

        a(s<? super Boolean> sVar, o<? super T> oVar) {
            this.f12949b = sVar;
            this.f12950c = oVar;
        }

        public void dispose() {
            this.f12951d.dispose();
        }

        public void onComplete() {
            if (!this.f12952e) {
                this.f12952e = true;
                this.f12949b.onNext(Boolean.TRUE);
                this.f12949b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f12952e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f12952e = true;
            this.f12949b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f12952e) {
                try {
                    if (!this.f12950c.a(t)) {
                        this.f12952e = true;
                        this.f12951d.dispose();
                        this.f12949b.onNext(Boolean.FALSE);
                        this.f12949b.onComplete();
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f12951d.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f12951d, bVar)) {
                this.f12951d = bVar;
                this.f12949b.onSubscribe(this);
            }
        }
    }

    public f(q<T> qVar, o<? super T> oVar) {
        super(qVar);
        this.f12948c = oVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super Boolean> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f12948c));
    }
}
