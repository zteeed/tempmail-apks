package d.a.a0.e.a;

import d.a.g;
import d.a.z.f;
import f.a.b;
import f.a.c;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableOnBackpressureDrop */
public final class d<T> extends a<T, T> implements f<T> {

    /* renamed from: d  reason: collision with root package name */
    final f<? super T> f13265d = this;

    /* compiled from: FlowableOnBackpressureDrop */
    static final class a<T> extends AtomicLong implements g<T>, c {
        private static final long serialVersionUID = -6246093802440953054L;

        /* renamed from: b  reason: collision with root package name */
        final b<? super T> f13266b;

        /* renamed from: c  reason: collision with root package name */
        final f<? super T> f13267c;

        /* renamed from: d  reason: collision with root package name */
        c f13268d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13269e;

        a(b<? super T> bVar, f<? super T> fVar) {
            this.f13266b = bVar;
            this.f13267c = fVar;
        }

        public void cancel() {
            this.f13268d.cancel();
        }

        public void f(c cVar) {
            if (d.a.a0.i.b.o(this.f13268d, cVar)) {
                this.f13268d = cVar;
                this.f13266b.f(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public void onComplete() {
            if (!this.f13269e) {
                this.f13269e = true;
                this.f13266b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13269e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13269e = true;
            this.f13266b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13269e) {
                if (get() != 0) {
                    this.f13266b.onNext(t);
                    d.a.a0.j.d.c(this, 1);
                    return;
                }
                try {
                    this.f13267c.a(t);
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
        this.f13253c.h(new a(bVar, this.f13265d));
    }
}
