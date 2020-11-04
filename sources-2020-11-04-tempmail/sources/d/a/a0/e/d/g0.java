package d.a.a0.e.d;

import d.a.a0.a.g;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableDelaySubscriptionOther */
public final class g0<T, U> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final q<? extends T> f13564b;

    /* renamed from: c  reason: collision with root package name */
    final q<U> f13565c;

    /* compiled from: ObservableDelaySubscriptionOther */
    final class a implements s<U> {

        /* renamed from: b  reason: collision with root package name */
        final g f13566b;

        /* renamed from: c  reason: collision with root package name */
        final s<? super T> f13567c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13568d;

        /* renamed from: d.a.a0.e.d.g0$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableDelaySubscriptionOther */
        final class C0138a implements s<T> {
            C0138a() {
            }

            public void onComplete() {
                a.this.f13567c.onComplete();
            }

            public void onError(Throwable th) {
                a.this.f13567c.onError(th);
            }

            public void onNext(T t) {
                a.this.f13567c.onNext(t);
            }

            public void onSubscribe(b bVar) {
                a.this.f13566b.c(bVar);
            }
        }

        a(g gVar, s<? super T> sVar) {
            this.f13566b = gVar;
            this.f13567c = sVar;
        }

        public void onComplete() {
            if (!this.f13568d) {
                this.f13568d = true;
                g0.this.f13564b.subscribe(new C0138a());
            }
        }

        public void onError(Throwable th) {
            if (this.f13568d) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13568d = true;
            this.f13567c.onError(th);
        }

        public void onNext(U u) {
            onComplete();
        }

        public void onSubscribe(b bVar) {
            this.f13566b.c(bVar);
        }
    }

    public g0(q<? extends T> qVar, q<U> qVar2) {
        this.f13564b = qVar;
        this.f13565c = qVar2;
    }

    public void subscribeActual(s<? super T> sVar) {
        g gVar = new g();
        sVar.onSubscribe(gVar);
        this.f13565c.subscribe(new a(gVar, sVar));
    }
}
