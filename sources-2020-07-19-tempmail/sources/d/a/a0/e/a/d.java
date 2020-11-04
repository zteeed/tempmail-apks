package d.a.a0.e.a;

import d.a.g;
import d.a.z.f;
import f.a.b;
import f.a.c;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableOnBackpressureDrop */
public final class d<T> extends a<T, T> implements f<T> {

    /* renamed from: d  reason: collision with root package name */
    final f<? super T> f12707d = this;

    /* compiled from: FlowableOnBackpressureDrop */
    static final class a<T> extends AtomicLong implements g<T>, c {
        private static final long serialVersionUID = -6246093802440953054L;

        /* renamed from: b  reason: collision with root package name */
        final b<? super T> f12708b;

        /* renamed from: c  reason: collision with root package name */
        final f<? super T> f12709c;

        /* renamed from: d  reason: collision with root package name */
        c f12710d;

        /* renamed from: e  reason: collision with root package name */
        boolean f12711e;

        a(b<? super T> bVar, f<? super T> fVar) {
            this.f12708b = bVar;
            this.f12709c = fVar;
        }

        public void cancel() {
            this.f12710d.cancel();
        }

        public void f(c cVar) {
            if (d.a.a0.i.b.o(this.f12710d, cVar)) {
                this.f12710d = cVar;
                this.f12708b.f(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public void onComplete() {
            if (!this.f12711e) {
                this.f12711e = true;
                this.f12708b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f12711e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f12711e = true;
            this.f12708b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f12711e) {
                if (get() != 0) {
                    this.f12708b.onNext(t);
                    d.a.a0.j.d.c(this, 1);
                    return;
                }
                try {
                    this.f12709c.a(t);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    cancel();
                    onError(th);
                }
            }
        }

        public void request(long j) {
            if (d.a.a0.i.b.n(j)) {
                d.a.a0.j.d.a(this, j);
            }
        }
    }

    public d(d.a.f<T> fVar) {
        super(fVar);
    }

    public void a(T t) {
    }

    /* access modifiers changed from: protected */
    public void i(b<? super T> bVar) {
        this.f12695c.h(new a(bVar, this.f12707d));
    }
}
