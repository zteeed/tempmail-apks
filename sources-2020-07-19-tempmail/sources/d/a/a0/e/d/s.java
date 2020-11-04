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
    final q<T> f13468a;

    /* renamed from: b  reason: collision with root package name */
    final Callable<? extends U> f13469b;

    /* renamed from: c  reason: collision with root package name */
    final b<? super U, ? super T> f13470c;

    /* compiled from: ObservableCollectSingle */
    static final class a<T, U> implements d.a.s<T>, d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super U> f13471b;

        /* renamed from: c  reason: collision with root package name */
        final b<? super U, ? super T> f13472c;

        /* renamed from: d  reason: collision with root package name */
        final U f13473d;

        /* renamed from: e  reason: collision with root package name */
        d.a.y.b f13474e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13475f;

        a(v<? super U> vVar, U u, b<? super U, ? super T> bVar) {
            this.f13471b = vVar;
            this.f13472c = bVar;
            this.f13473d = u;
        }

        public void dispose() {
            this.f13474e.dispose();
        }

        public void onComplete() {
            if (!this.f13475f) {
                this.f13475f = true;
                this.f13471b.onSuccess(this.f13473d);
            }
        }

        public void onError(Throwable th) {
            if (this.f13475f) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13475f = true;
            this.f13471b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13475f) {
                try {
                    this.f13472c.a(this.f13473d, t);
                } catch (Throwable th) {
                    this.f13474e.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13474e, bVar)) {
                this.f13474e = bVar;
                this.f13471b.onSubscribe(this);
            }
        }
    }

    public s(q<T> qVar, Callable<? extends U> callable, b<? super U, ? super T> bVar) {
        this.f13468a = qVar;
        this.f13469b = callable;
        this.f13470c = bVar;
    }

    public l<U> a() {
        return d.a.d0.a.n(new r(this.f13468a, this.f13469b, this.f13470c));
    }

    /* access modifiers changed from: protected */
    public void e(v<? super U> vVar) {
        try {
            Object call = this.f13469b.call();
            d.a.a0.b.b.e(call, "The initialSupplier returned a null value");
            this.f13468a.subscribe(new a(vVar, call, this.f13470c));
        } catch (Throwable th) {
            d.n(th, vVar);
        }
    }
}
