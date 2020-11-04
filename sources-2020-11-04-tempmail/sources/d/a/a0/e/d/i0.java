package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.j.g;
import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableDetach */
public final class i0<T> extends a<T, T> {

    /* compiled from: ObservableDetach */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        s<? super T> f13633b;

        /* renamed from: c  reason: collision with root package name */
        b f13634c;

        a(s<? super T> sVar) {
            this.f13633b = sVar;
        }

        public void dispose() {
            b bVar = this.f13634c;
            this.f13634c = g.INSTANCE;
            this.f13633b = g.g();
            bVar.dispose();
        }

        public void onComplete() {
            s<? super T> sVar = this.f13633b;
            this.f13634c = g.INSTANCE;
            this.f13633b = g.g();
            sVar.onComplete();
        }

        public void onError(Throwable th) {
            s<? super T> sVar = this.f13633b;
            this.f13634c = g.INSTANCE;
            this.f13633b = g.g();
            sVar.onError(th);
        }

        public void onNext(T t) {
            this.f13633b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13634c, bVar)) {
                this.f13634c = bVar;
                this.f13633b.onSubscribe(this);
            }
        }
    }

    public i0(q<T> qVar) {
        super(qVar);
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar));
    }
}
