package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.o;

/* compiled from: ObservableSkipWhile */
public final class k3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final o<? super T> f13173c;

    /* compiled from: ObservableSkipWhile */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13174b;

        /* renamed from: c  reason: collision with root package name */
        final o<? super T> f13175c;

        /* renamed from: d  reason: collision with root package name */
        b f13176d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13177e;

        a(s<? super T> sVar, o<? super T> oVar) {
            this.f13174b = sVar;
            this.f13175c = oVar;
        }

        public void dispose() {
            this.f13176d.dispose();
        }

        public void onComplete() {
            this.f13174b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13174b.onError(th);
        }

        public void onNext(T t) {
            if (this.f13177e) {
                this.f13174b.onNext(t);
                return;
            }
            try {
                if (!this.f13175c.a(t)) {
                    this.f13177e = true;
                    this.f13174b.onNext(t);
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f13176d.dispose();
                this.f13174b.onError(th);
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13176d, bVar)) {
                this.f13176d = bVar;
                this.f13174b.onSubscribe(this);
            }
        }
    }

    public k3(q<T> qVar, o<? super T> oVar) {
        super(qVar);
        this.f13173c = oVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13173c));
    }
}
