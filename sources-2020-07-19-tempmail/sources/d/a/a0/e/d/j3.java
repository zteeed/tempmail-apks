package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.c0.e;
import d.a.q;
import d.a.s;

/* compiled from: ObservableSkipUntil */
public final class j3<T, U> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final q<U> f13143c;

    /* compiled from: ObservableSkipUntil */
    final class a implements s<U> {

        /* renamed from: b  reason: collision with root package name */
        final d.a.a0.a.a f13144b;

        /* renamed from: c  reason: collision with root package name */
        final b<T> f13145c;

        /* renamed from: d  reason: collision with root package name */
        final e<T> f13146d;

        /* renamed from: e  reason: collision with root package name */
        d.a.y.b f13147e;

        a(j3 j3Var, d.a.a0.a.a aVar, b<T> bVar, e<T> eVar) {
            this.f13144b = aVar;
            this.f13145c = bVar;
            this.f13146d = eVar;
        }

        public void onComplete() {
            this.f13145c.f13151e = true;
        }

        public void onError(Throwable th) {
            this.f13144b.dispose();
            this.f13146d.onError(th);
        }

        public void onNext(U u) {
            this.f13147e.dispose();
            this.f13145c.f13151e = true;
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13147e, bVar)) {
                this.f13147e = bVar;
                this.f13144b.a(1, bVar);
            }
        }
    }

    /* compiled from: ObservableSkipUntil */
    static final class b<T> implements s<T> {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13148b;

        /* renamed from: c  reason: collision with root package name */
        final d.a.a0.a.a f13149c;

        /* renamed from: d  reason: collision with root package name */
        d.a.y.b f13150d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f13151e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13152f;

        b(s<? super T> sVar, d.a.a0.a.a aVar) {
            this.f13148b = sVar;
            this.f13149c = aVar;
        }

        public void onComplete() {
            this.f13149c.dispose();
            this.f13148b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13149c.dispose();
            this.f13148b.onError(th);
        }

        public void onNext(T t) {
            if (this.f13152f) {
                this.f13148b.onNext(t);
            } else if (this.f13151e) {
                this.f13152f = true;
                this.f13148b.onNext(t);
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13150d, bVar)) {
                this.f13150d = bVar;
                this.f13149c.a(0, bVar);
            }
        }
    }

    public j3(q<T> qVar, q<U> qVar2) {
        super(qVar);
        this.f13143c = qVar2;
    }

    public void subscribeActual(s<? super T> sVar) {
        e eVar = new e(sVar);
        d.a.a0.a.a aVar = new d.a.a0.a.a(2);
        eVar.onSubscribe(aVar);
        b bVar = new b(eVar, aVar);
        this.f13143c.subscribe(new a(this, aVar, bVar, eVar));
        this.f12780b.subscribe(bVar);
    }
}
