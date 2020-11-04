package d.a.a0.e.a;

import d.a.a0.j.d;
import d.a.f;
import d.a.g;
import f.a.b;
import f.a.c;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableOnBackpressureError */
public final class e<T> extends a<T, T> {

    /* compiled from: FlowableOnBackpressureError */
    static final class a<T> extends AtomicLong implements g<T>, c {
        private static final long serialVersionUID = -3176480756392482682L;

        /* renamed from: b  reason: collision with root package name */
        final b<? super T> f12712b;

        /* renamed from: c  reason: collision with root package name */
        c f12713c;

        /* renamed from: d  reason: collision with root package name */
        boolean f12714d;

        a(b<? super T> bVar) {
            this.f12712b = bVar;
        }

        public void cancel() {
            this.f12713c.cancel();
        }

        public void f(c cVar) {
            if (d.a.a0.i.b.o(this.f12713c, cVar)) {
                this.f12713c = cVar;
                this.f12712b.f(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public void onComplete() {
            if (!this.f12714d) {
                this.f12714d = true;
                this.f12712b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f12714d) {
                d.a.d0.a.s(th);
                return;
            }
            this.f12714d = true;
            this.f12712b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f12714d) {
                if (get() != 0) {
                    this.f12712b.onNext(t);
                    d.c(this, 1);
                    return;
                }
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        public void request(long j) {
            if (d.a.a0.i.b.n(j)) {
                d.a(this, j);
            }
        }
    }

    public e(f<T> fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    public void i(b<? super T> bVar) {
        this.f12695c.h(new a(bVar));
    }
}
