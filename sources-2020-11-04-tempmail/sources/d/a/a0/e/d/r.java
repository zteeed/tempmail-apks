package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.a.d;
import d.a.q;
import d.a.s;
import d.a.z.b;
import java.util.concurrent.Callable;

/* compiled from: ObservableCollect */
public final class r<T, U> extends a<T, U> {

    /* renamed from: c  reason: collision with root package name */
    final Callable<? extends U> f13994c;

    /* renamed from: d  reason: collision with root package name */
    final b<? super U, ? super T> f13995d;

    /* compiled from: ObservableCollect */
    static final class a<T, U> implements s<T>, d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super U> f13996b;

        /* renamed from: c  reason: collision with root package name */
        final b<? super U, ? super T> f13997c;

        /* renamed from: d  reason: collision with root package name */
        final U f13998d;

        /* renamed from: e  reason: collision with root package name */
        d.a.y.b f13999e;

        /* renamed from: f  reason: collision with root package name */
        boolean f14000f;

        a(s<? super U> sVar, U u, b<? super U, ? super T> bVar) {
            this.f13996b = sVar;
            this.f13997c = bVar;
            this.f13998d = u;
        }

        public void dispose() {
            this.f13999e.dispose();
        }

        public void onComplete() {
            if (!this.f14000f) {
                this.f14000f = true;
                this.f13996b.onNext(this.f13998d);
                this.f13996b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f14000f) {
                d.a.d0.a.s(th);
                return;
            }
            this.f14000f = true;
            this.f13996b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f14000f) {
                try {
                    this.f13997c.a(this.f13998d, t);
                } catch (Throwable th) {
                    this.f13999e.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13999e, bVar)) {
                this.f13999e = bVar;
                this.f13996b.onSubscribe(this);
            }
        }
    }

    public r(q<T> qVar, Callable<? extends U> callable, b<? super U, ? super T> bVar) {
        super(qVar);
        this.f13994c = callable;
        this.f13995d = bVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super U> sVar) {
        try {
            Object call = this.f13994c.call();
            d.a.a0.b.b.e(call, "The initialSupplier returned a null value");
            this.f13338b.subscribe(new a(sVar, call, this.f13995d));
        } catch (Throwable th) {
            d.m(th, sVar);
        }
    }
}
