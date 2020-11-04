package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.o;

/* compiled from: ObservableTakeWhile */
public final class u3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final o<? super T> f13577c;

    /* compiled from: ObservableTakeWhile */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13578b;

        /* renamed from: c  reason: collision with root package name */
        final o<? super T> f13579c;

        /* renamed from: d  reason: collision with root package name */
        b f13580d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13581e;

        a(s<? super T> sVar, o<? super T> oVar) {
            this.f13578b = sVar;
            this.f13579c = oVar;
        }

        public void dispose() {
            this.f13580d.dispose();
        }

        public void onComplete() {
            if (!this.f13581e) {
                this.f13581e = true;
                this.f13578b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13581e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13581e = true;
            this.f13578b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13581e) {
                try {
                    if (!this.f13579c.a(t)) {
                        this.f13581e = true;
                        this.f13580d.dispose();
                        this.f13578b.onComplete();
                        return;
                    }
                    this.f13578b.onNext(t);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13580d.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13580d, bVar)) {
                this.f13580d = bVar;
                this.f13578b.onSubscribe(this);
            }
        }
    }

    public u3(q<T> qVar, o<? super T> oVar) {
        super(qVar);
        this.f13577c = oVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13577c));
    }
}
