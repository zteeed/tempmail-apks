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
    final w<? extends T> f13689c;

    /* compiled from: ObservableConcatWithSingle */
    static final class a<T> extends AtomicReference<b> implements s<T>, v<T>, b {
        private static final long serialVersionUID = -1953724749712440952L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13690b;

        /* renamed from: c  reason: collision with root package name */
        w<? extends T> f13691c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13692d;

        a(s<? super T> sVar, w<? extends T> wVar) {
            this.f13690b = sVar;
            this.f13691c = wVar;
        }

        public void dispose() {
            c.f(this);
        }

        public void onComplete() {
            this.f13692d = true;
            c.h(this, (b) null);
            w<? extends T> wVar = this.f13691c;
            this.f13691c = null;
            wVar.b(this);
        }

        public void onError(Throwable th) {
            this.f13690b.onError(th);
        }

        public void onNext(T t) {
            this.f13690b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            if (c.n(this, bVar) && !this.f13692d) {
                this.f13690b.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f13690b.onNext(t);
            this.f13690b.onComplete();
        }
    }

    public y(l<T> lVar, w<? extends T> wVar) {
        super(lVar);
        this.f13689c = wVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13689c));
    }
}
