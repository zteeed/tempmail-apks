package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.e0.b;
import d.a.q;
import d.a.s;
import d.a.t;
import java.util.concurrent.TimeUnit;

/* compiled from: ObservableTimeInterval */
public final class x3<T> extends a<T, b<T>> {

    /* renamed from: c  reason: collision with root package name */
    final t f14240c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f14241d;

    /* compiled from: ObservableTimeInterval */
    static final class a<T> implements s<T>, d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super b<T>> f14242b;

        /* renamed from: c  reason: collision with root package name */
        final TimeUnit f14243c;

        /* renamed from: d  reason: collision with root package name */
        final t f14244d;

        /* renamed from: e  reason: collision with root package name */
        long f14245e;

        /* renamed from: f  reason: collision with root package name */
        d.a.y.b f14246f;

        a(s<? super b<T>> sVar, TimeUnit timeUnit, t tVar) {
            this.f14242b = sVar;
            this.f14244d = tVar;
            this.f14243c = timeUnit;
        }

        public void dispose() {
            this.f14246f.dispose();
        }

        public void onComplete() {
            this.f14242b.onComplete();
        }

        public void onError(Throwable th) {
            this.f14242b.onError(th);
        }

        public void onNext(T t) {
            long b2 = this.f14244d.b(this.f14243c);
            long j = this.f14245e;
            this.f14245e = b2;
            this.f14242b.onNext(new b(t, b2 - j, this.f14243c));
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f14246f, bVar)) {
                this.f14246f = bVar;
                this.f14245e = this.f14244d.b(this.f14243c);
                this.f14242b.onSubscribe(this);
            }
        }
    }

    public x3(q<T> qVar, TimeUnit timeUnit, t tVar) {
        super(qVar);
        this.f14240c = tVar;
        this.f14241d = timeUnit;
    }

    public void subscribeActual(s<? super b<T>> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f14241d, this.f14240c));
    }
}
