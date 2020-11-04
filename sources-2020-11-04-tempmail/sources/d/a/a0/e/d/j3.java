package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.c0.e;
import d.a.q;
import d.a.s;

/* compiled from: ObservableSkipUntil */
public final class j3<T, U> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final q<U> f13701c;

    /* compiled from: ObservableSkipUntil */
    final class a implements s<U> {

        /* renamed from: b  reason: collision with root package name */
        final d.a.a0.a.a f13702b;

        /* renamed from: c  reason: collision with root package name */
        final b<T> f13703c;

        /* renamed from: d  reason: collision with root package name */
        final e<T> f13704d;

        /* renamed from: e  reason: collision with root package name */
        d.a.y.b f13705e;

        a(j3 j3Var, d.a.a0.a.a aVar, b<T> bVar, e<T> eVar) {
            this.f13702b = aVar;
            this.f13703c = bVar;
            this.f13704d = eVar;
        }

        public void onComplete() {
            this.f13703c.f13709e = true;
        }

        public void onError(Throwable th) {
            this.f13702b.dispose();
            this.f13704d.onError(th);
        }

        public void onNext(U u) {
            this.f13705e.dispose();
            this.f13703c.f13709e = true;
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13705e, bVar)) {
                this.f13705e = bVar;
                this.f13702b.a(1, bVar);
            }
        }
    }

    /* compiled from: ObservableSkipUntil */
    static final class b<T> implements s<T> {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13706b;

        /* renamed from: c  reason: collision with root package name */
        final d.a.a0.a.a f13707c;

        /* renamed from: d  reason: collision with root package name */
        d.a.y.b f13708d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f13709e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13710f;

        b(s<? super T> sVar, d.a.a0.a.a aVar) {
            this.f13706b = sVar;
            this.f13707c = aVar;
        }

        public void onComplete() {
            this.f13707c.dispose();
            this.f13706b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13707c.dispose();
            this.f13706b.onError(th);
        }

        public void onNext(T t) {
            if (this.f13710f) {
                this.f13706b.onNext(t);
            } else if (this.f13709e) {
                this.f13710f = true;
                this.f13706b.onNext(t);
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13708d, bVar)) {
                this.f13708d = bVar;
                this.f13707c.a(0, bVar);
            }
        }
    }

    public j3(q<T> qVar, q<U> qVar2) {
        super(qVar);
        this.f13701c = qVar2;
    }

    public void subscribeActual(s<? super T> sVar) {
        e eVar = new e(sVar);
        d.a.a0.a.a aVar = new d.a.a0.a.a(2);
        eVar.onSubscribe(aVar);
        b bVar = new b(eVar, aVar);
        this.f13701c.subscribe(new a(this, aVar, bVar, eVar));
        this.f13338b.subscribe(bVar);
    }
}
