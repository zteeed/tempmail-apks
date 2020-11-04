package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.l;
import d.a.s;
import d.a.v;
import d.a.w;
import d.a.y.b;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatWithSingle */
public final class y<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final w<? extends T> f14247c;

    /* compiled from: ObservableConcatWithSingle */
    static final class a<T> extends AtomicReference<b> implements s<T>, v<T>, b {
        private static final long serialVersionUID = -1953724749712440952L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14248b;

        /* renamed from: c  reason: collision with root package name */
        w<? extends T> f14249c;

        /* renamed from: d  reason: collision with root package name */
        boolean f14250d;

        a(s<? super T> sVar, w<? extends T> wVar) {
            this.f14248b = sVar;
            this.f14249c = wVar;
        }

        public void dispose() {
            c.f(this);
        }

        public void onComplete() {
            this.f14250d = true;
            c.h(this, (b) null);
            w<? extends T> wVar = this.f14249c;
            this.f14249c = null;
            wVar.b(this);
        }

        public void onError(Throwable th) {
            this.f14248b.onError(th);
        }

        public void onNext(T t) {
            this.f14248b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            if (c.n(this, bVar) && !this.f14250d) {
                this.f14248b.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f14248b.onNext(t);
            this.f14248b.onComplete();
        }
    }

    public y(l<T> lVar, w<? extends T> wVar) {
        super(lVar);
        this.f14247c = wVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f14247c));
    }
}
