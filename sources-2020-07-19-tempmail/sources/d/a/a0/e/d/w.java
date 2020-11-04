package d.a.a0.e.d;

import d.a.c;
import d.a.d;
import d.a.l;
import d.a.s;
import d.a.y.b;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatWithCompletable */
public final class w<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final d f13621c;

    /* compiled from: ObservableConcatWithCompletable */
    static final class a<T> extends AtomicReference<b> implements s<T>, c, b {
        private static final long serialVersionUID = -1953724749712440952L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13622b;

        /* renamed from: c  reason: collision with root package name */
        d f13623c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13624d;

        a(s<? super T> sVar, d dVar) {
            this.f13622b = sVar;
            this.f13623c = dVar;
        }

        public void dispose() {
            d.a.a0.a.c.f(this);
        }

        public void onComplete() {
            if (this.f13624d) {
                this.f13622b.onComplete();
                return;
            }
            this.f13624d = true;
            d.a.a0.a.c.h(this, (b) null);
            d dVar = this.f13623c;
            this.f13623c = null;
            dVar.b(this);
        }

        public void onError(Throwable th) {
            this.f13622b.onError(th);
        }

        public void onNext(T t) {
            this.f13622b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.n(this, bVar) && !this.f13624d) {
                this.f13622b.onSubscribe(this);
            }
        }
    }

    public w(l<T> lVar, d dVar) {
        super(lVar);
        this.f13621c = dVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13621c));
    }
}
