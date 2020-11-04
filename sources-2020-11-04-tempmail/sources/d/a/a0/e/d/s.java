package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.a.d;
import d.a.l;
import d.a.q;
import d.a.u;
import d.a.v;
import d.a.z.b;
import java.util.concurrent.Callable;

/* compiled from: ObservableCollectSingle */
public final class s<T, U> extends u<U> implements d.a.a0.c.a<U> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f14026a;

    /* renamed from: b  reason: collision with root package name */
    final Callable<? extends U> f14027b;

    /* renamed from: c  reason: collision with root package name */
    final b<? super U, ? super T> f14028c;

    /* compiled from: ObservableCollectSingle */
    static final class a<T, U> implements d.a.s<T>, d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super U> f14029b;

        /* renamed from: c  reason: collision with root package name */
        final b<? super U, ? super T> f14030c;

        /* renamed from: d  reason: collision with root package name */
        final U f14031d;

        /* renamed from: e  reason: collision with root package name */
        d.a.y.b f14032e;

        /* renamed from: f  reason: collision with root package name */
        boolean f14033f;

        a(v<? super U> vVar, U u, b<? super U, ? super T> bVar) {
            this.f14029b = vVar;
            this.f14030c = bVar;
            this.f14031d = u;
        }

        public void dispose() {
            this.f14032e.dispose();
        }

        public void onComplete() {
            if (!this.f14033f) {
                this.f14033f = true;
                this.f14029b.onSuccess(this.f14031d);
            }
        }

        public void onError(Throwable th) {
            if (this.f14033f) {
                d.a.d0.a.s(th);
                return;
            }
            this.f14033f = true;
            this.f14029b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f14033f) {
                try {
                    this.f14030c.a(this.f14031d, t);
                } catch (Throwable th) {
                    this.f14032e.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f14032e, bVar)) {
                this.f14032e = bVar;
                this.f14029b.onSubscribe(this);
            }
        }
    }

    public s(q<T> qVar, Callable<? extends U> callable, b<? super U, ? super T> bVar) {
        this.f14026a = qVar;
        this.f14027b = callable;
        this.f14028c = bVar;
    }

    public l<U> a() {
        return d.a.d0.a.n(new r(this.f14026a, this.f14027b, this.f14028c));
    }

    /* access modifiers changed from: protected */
    public void e(v<? super U> vVar) {
        try {
            Object call = this.f14027b.call();
            d.a.a0.b.b.e(call, "The initialSupplier returned a null value");
            this.f14026a.subscribe(new a(vVar, call, this.f14028c));
        } catch (Throwable th) {
            d.n(th, vVar);
        }
    }
}
