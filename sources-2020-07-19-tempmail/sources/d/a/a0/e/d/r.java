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
    final Callable<? extends U> f13436c;

    /* renamed from: d  reason: collision with root package name */
    final b<? super U, ? super T> f13437d;

    /* compiled from: ObservableCollect */
    static final class a<T, U> implements s<T>, d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super U> f13438b;

        /* renamed from: c  reason: collision with root package name */
        final b<? super U, ? super T> f13439c;

        /* renamed from: d  reason: collision with root package name */
        final U f13440d;

        /* renamed from: e  reason: collision with root package name */
        d.a.y.b f13441e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13442f;

        a(s<? super U> sVar, U u, b<? super U, ? super T> bVar) {
            this.f13438b = sVar;
            this.f13439c = bVar;
            this.f13440d = u;
        }

        public void dispose() {
            this.f13441e.dispose();
        }

        public void onComplete() {
            if (!this.f13442f) {
                this.f13442f = true;
                this.f13438b.onNext(this.f13440d);
                this.f13438b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13442f) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13442f = true;
            this.f13438b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13442f) {
                try {
                    this.f13439c.a(this.f13440d, t);
                } catch (Throwable th) {
                    this.f13441e.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13441e, bVar)) {
                this.f13441e = bVar;
                this.f13438b.onSubscribe(this);
            }
        }
    }

    public r(q<T> qVar, Callable<? extends U> callable, b<? super U, ? super T> bVar) {
        super(qVar);
        this.f13436c = callable;
        this.f13437d = bVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super U> sVar) {
        try {
            Object call = this.f13436c.call();
            d.a.a0.b.b.e(call, "The initialSupplier returned a null value");
            this.f12780b.subscribe(new a(sVar, call, this.f13437d));
        } catch (Throwable th) {
            d.m(th, sVar);
        }
    }
}
