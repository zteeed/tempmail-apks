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
    final c<R, ? super T, R> f13354c;

    /* renamed from: d  reason: collision with root package name */
    final Callable<R> f13355d;

    /* compiled from: ObservableScanSeed */
    static final class a<T, R> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f13356b;

        /* renamed from: c  reason: collision with root package name */
        final c<R, ? super T, R> f13357c;

        /* renamed from: d  reason: collision with root package name */
        R f13358d;

        /* renamed from: e  reason: collision with root package name */
        b f13359e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13360f;

        a(s<? super R> sVar, c<R, ? super T, R> cVar, R r) {
            this.f13356b = sVar;
            this.f13357c = cVar;
            this.f13358d = r;
        }

        public void dispose() {
            this.f13359e.dispose();
        }

        public void onComplete() {
            if (!this.f13360f) {
                this.f13360f = true;
                this.f13356b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13360f) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13360f = true;
            this.f13356b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13360f) {
                try {
                    R a2 = this.f13357c.a(this.f13358d, t);
                    d.a.a0.b.b.e(a2, "The accumulator returned a null value");
                    this.f13358d = a2;
                    this.f13356b.onNext(a2);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13359e.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.f13359e, bVar)) {
                this.f13359e = bVar;
                this.f13356b.onSubscribe(this);
                this.f13356b.onNext(this.f13358d);
            }
        }
    }

    public a3(q<T> qVar, Callable<R> callable, c<R, ? super T, R> cVar) {
        super(qVar);
        this.f13354c = cVar;
        this.f13355d = callable;
    }

    public void subscribeActual(s<? super R> sVar) {
        try {
            R call = this.f13355d.call();
            d.a.a0.b.b.e(call, "The seed supplied is null");
            this.f13338b.subscribe(new a(sVar, this.f13354c, call));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            d.m(th, sVar);
        }
    }
}
