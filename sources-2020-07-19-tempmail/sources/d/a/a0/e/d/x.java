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
    final j<? extends T> f13659c;

    /* compiled from: ObservableConcatWithMaybe */
    static final class a<T> extends AtomicReference<b> implements s<T>, i<T>, b {
        private static final long serialVersionUID = -1953724749712440952L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13660b;

        /* renamed from: c  reason: collision with root package name */
        j<? extends T> f13661c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13662d;

        a(s<? super T> sVar, j<? extends T> jVar) {
            this.f13660b = sVar;
            this.f13661c = jVar;
        }

        public void dispose() {
            c.f(this);
        }

        public void onComplete() {
            if (this.f13662d) {
                this.f13660b.onComplete();
                return;
            }
            this.f13662d = true;
            c.h(this, (b) null);
            j<? extends T> jVar = this.f13661c;
            this.f13661c = null;
            jVar.b(this);
        }

        public void onError(Throwable th) {
            this.f13660b.onError(th);
        }

        public void onNext(T t) {
            this.f13660b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            if (c.n(this, bVar) && !this.f13662d) {
                this.f13660b.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f13660b.onNext(t);
            this.f13660b.onComplete();
        }
    }

    public x(l<T> lVar, j<? extends T> jVar) {
        super(lVar);
        this.f13659c = jVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13659c));
    }
}
