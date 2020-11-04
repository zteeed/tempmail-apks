package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.i;
import d.a.j;
import d.a.l;
import d.a.s;
import d.a.y.b;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatWithMaybe */
public final class x<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final j<? extends T> f14217c;

    /* compiled from: ObservableConcatWithMaybe */
    static final class a<T> extends AtomicReference<b> implements s<T>, i<T>, b {
        private static final long serialVersionUID = -1953724749712440952L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14218b;

        /* renamed from: c  reason: collision with root package name */
        j<? extends T> f14219c;

        /* renamed from: d  reason: collision with root package name */
        boolean f14220d;

        a(s<? super T> sVar, j<? extends T> jVar) {
            this.f14218b = sVar;
            this.f14219c = jVar;
        }

        public void dispose() {
            c.f(this);
        }

        public void onComplete() {
            if (this.f14220d) {
                this.f14218b.onComplete();
                return;
            }
            this.f14220d = true;
            c.h(this, (b) null);
            j<? extends T> jVar = this.f14219c;
            this.f14219c = null;
            jVar.b(this);
        }

        public void onError(Throwable th) {
            this.f14218b.onError(th);
        }

        public void onNext(T t) {
            this.f14218b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            if (c.n(this, bVar) && !this.f14220d) {
                this.f14218b.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f14218b.onNext(t);
            this.f14218b.onComplete();
        }
    }

    public x(l<T> lVar, j<? extends T> jVar) {
        super(lVar);
        this.f14217c = jVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f14217c));
    }
}
