package d.a.a0.e.d;

import d.a.a0.a.g;
import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableSwitchIfEmpty */
public final class m3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final q<? extends T> f13252c;

    /* compiled from: ObservableSwitchIfEmpty */
    static final class a<T> implements s<T> {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13253b;

        /* renamed from: c  reason: collision with root package name */
        final q<? extends T> f13254c;

        /* renamed from: d  reason: collision with root package name */
        final g f13255d = new g();

        /* renamed from: e  reason: collision with root package name */
        boolean f13256e = true;

        a(s<? super T> sVar, q<? extends T> qVar) {
            this.f13253b = sVar;
            this.f13254c = qVar;
        }

        public void onComplete() {
            if (this.f13256e) {
                this.f13256e = false;
                this.f13254c.subscribe(this);
                return;
            }
            this.f13253b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13253b.onError(th);
        }

        public void onNext(T t) {
            if (this.f13256e) {
                this.f13256e = false;
            }
            this.f13253b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            this.f13255d.c(bVar);
        }
    }

    public m3(q<T> qVar, q<? extends T> qVar2) {
        super(qVar);
        this.f13252c = qVar2;
    }

    public void subscribeActual(s<? super T> sVar) {
        a aVar = new a(sVar, this.f13252c);
        sVar.onSubscribe(aVar.f13255d);
        this.f12780b.subscribe(aVar);
    }
}
