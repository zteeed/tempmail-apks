package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableTakeLastOne */
public final class q3<T> extends a<T, T> {

    /* compiled from: ObservableTakeLastOne */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13433b;

        /* renamed from: c  reason: collision with root package name */
        b f13434c;

        /* renamed from: d  reason: collision with root package name */
        T f13435d;

        a(s<? super T> sVar) {
            this.f13433b = sVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            T t = this.f13435d;
            if (t != null) {
                this.f13435d = null;
                this.f13433b.onNext(t);
            }
            this.f13433b.onComplete();
        }

        public void dispose() {
            this.f13435d = null;
            this.f13434c.dispose();
        }

        public void onComplete() {
            a();
        }

        public void onError(Throwable th) {
            this.f13435d = null;
            this.f13433b.onError(th);
        }

        public void onNext(T t) {
            this.f13435d = t;
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13434c, bVar)) {
                this.f13434c = bVar;
                this.f13433b.onSubscribe(this);
            }
        }
    }

    public q3(q<T> qVar) {
        super(qVar);
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar));
    }
}
