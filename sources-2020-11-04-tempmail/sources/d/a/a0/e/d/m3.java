package d.a.a0.e.d;

import d.a.a0.a.g;
import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableSwitchIfEmpty */
public final class m3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final q<? extends T> f13810c;

    /* compiled from: ObservableSwitchIfEmpty */
    static final class a<T> implements s<T> {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13811b;

        /* renamed from: c  reason: collision with root package name */
        final q<? extends T> f13812c;

        /* renamed from: d  reason: collision with root package name */
        final g f13813d = new g();

        /* renamed from: e  reason: collision with root package name */
        boolean f13814e = true;

        a(s<? super T> sVar, q<? extends T> qVar) {
            this.f13811b = sVar;
            this.f13812c = qVar;
        }

        public void onComplete() {
            if (this.f13814e) {
                this.f13814e = false;
                this.f13812c.subscribe(this);
                return;
            }
            this.f13811b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13811b.onError(th);
        }

        public void onNext(T t) {
            if (this.f13814e) {
                this.f13814e = false;
            }
            this.f13811b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            this.f13813d.c(bVar);
        }
    }

    public m3(q<T> qVar, q<? extends T> qVar2) {
        super(qVar);
        this.f13810c = qVar2;
    }

    public void subscribeActual(s<? super T> sVar) {
        a aVar = new a(sVar, this.f13810c);
        sVar.onSubscribe(aVar.f13813d);
        this.f13338b.subscribe(aVar);
    }
}
