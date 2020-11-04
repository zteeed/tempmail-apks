package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.t;
import d.a.y.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableUnsubscribeOn */
public final class d4<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final t f12910c;

    /* compiled from: ObservableUnsubscribeOn */
    static final class a<T> extends AtomicBoolean implements s<T>, b {
        private static final long serialVersionUID = 1015244841293359600L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f12911b;

        /* renamed from: c  reason: collision with root package name */
        final t f12912c;

        /* renamed from: d  reason: collision with root package name */
        b f12913d;

        /* renamed from: d.a.a0.e.d.d4$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableUnsubscribeOn */
        final class C0138a implements Runnable {
            C0138a() {
            }

            public void run() {
                a.this.f12913d.dispose();
            }
        }

        a(s<? super T> sVar, t tVar) {
            this.f12911b = sVar;
            this.f12912c = tVar;
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f12912c.c(new C0138a());
            }
        }

        public void onComplete() {
            if (!get()) {
                this.f12911b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get()) {
                d.a.d0.a.s(th);
            } else {
                this.f12911b.onError(th);
            }
        }

        public void onNext(T t) {
            if (!get()) {
                this.f12911b.onNext(t);
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f12913d, bVar)) {
                this.f12913d = bVar;
                this.f12911b.onSubscribe(this);
            }
        }
    }

    public d4(q<T> qVar, t tVar) {
        super(qVar);
        this.f12910c = tVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f12910c));
    }
}
