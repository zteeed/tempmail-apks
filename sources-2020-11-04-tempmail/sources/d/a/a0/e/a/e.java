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
        final b<? super T> f13270b;

        /* renamed from: c  reason: collision with root package name */
        c f13271c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13272d;

        a(b<? super T> bVar) {
            this.f13270b = bVar;
        }

        public void cancel() {
            this.f13271c.cancel();
        }

        public void f(c cVar) {
            if (d.a.a0.i.b.o(this.f13271c, cVar)) {
                this.f13271c = cVar;
                this.f13270b.f(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public void onComplete() {
            if (!this.f13272d) {
                this.f13272d = true;
                this.f13270b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13272d) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13272d = true;
            this.f13270b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13272d) {
                if (get() != 0) {
                    this.f13270b.onNext(t);
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
        this.f13253c.h(new a(bVar));
    }
}
