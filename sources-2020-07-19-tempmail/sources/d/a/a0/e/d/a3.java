package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.c;
import java.util.concurrent.Callable;

/* compiled from: ObservableScanSeed */
public final class a3<T, R> extends a<T, R> {

    /* renamed from: c  reason: collision with root package name */
    final c<R, ? super T, R> f12796c;

    /* renamed from: d  reason: collision with root package name */
    final Callable<R> f12797d;

    /* compiled from: ObservableScanSeed */
    static final class a<T, R> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f12798b;

        /* renamed from: c  reason: collision with root package name */
        final c<R, ? super T, R> f12799c;

        /* renamed from: d  reason: collision with root package name */
        R f12800d;

        /* renamed from: e  reason: collision with root package name */
        b f12801e;

        /* renamed from: f  reason: collision with root package name */
        boolean f12802f;

        a(s<? super R> sVar, c<R, ? super T, R> cVar, R r) {
            this.f12798b = sVar;
            this.f12799c = cVar;
            this.f12800d = r;
        }

        public void dispose() {
            this.f12801e.dispose();
        }

        public void onComplete() {
            if (!this.f12802f) {
                this.f12802f = true;
                this.f12798b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f12802f) {
                d.a.d0.a.s(th);
                return;
            }
            this.f12802f = true;
            this.f12798b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f12802f) {
                try {
                    R a2 = this.f12799c.a(this.f12800d, t);
                    d.a.a0.b.b.e(a2, "The accumulator returned a null value");
                    this.f12800d = a2;
                    this.f12798b.onNext(a2);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f12801e.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.f12801e, bVar)) {
                this.f12801e = bVar;
                this.f12798b.onSubscribe(this);
                this.f12798b.onNext(this.f12800d);
            }
        }
    }

    public a3(q<T> qVar, Callable<R> callable, c<R, ? super T, R> cVar) {
        super(qVar);
        this.f12796c = cVar;
        this.f12797d = callable;
    }

    public void subscribeActual(s<? super R> sVar) {
        try {
            R call = this.f12797d.call();
            d.a.a0.b.b.e(call, "The seed supplied is null");
            this.f12780b.subscribe(new a(sVar, this.f12796c, call));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            d.m(th, sVar);
        }
    }
}
