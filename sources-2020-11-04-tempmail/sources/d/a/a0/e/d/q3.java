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
        final s<? super T> f13991b;

        /* renamed from: c  reason: collision with root package name */
        b f13992c;

        /* renamed from: d  reason: collision with root package name */
        T f13993d;

        a(s<? super T> sVar) {
            this.f13991b = sVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            T t = this.f13993d;
            if (t != null) {
                this.f13993d = null;
                this.f13991b.onNext(t);
            }
            this.f13991b.onComplete();
        }

        public void dispose() {
            this.f13993d = null;
            this.f13992c.dispose();
        }

        public void onComplete() {
            a();
        }

        public void onError(Throwable th) {
            this.f13993d = null;
            this.f13991b.onError(th);
        }

        public void onNext(T t) {
            this.f13993d = t;
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13992c, bVar)) {
                this.f13992c = bVar;
                this.f13991b.onSubscribe(this);
            }
        }
    }

    public q3(q<T> qVar) {
        super(qVar);
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar));
    }
}
