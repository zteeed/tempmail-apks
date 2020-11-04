package d.a.a0.e.d;

import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.c;

/* compiled from: ObservableScan */
public final class z2<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final c<T, T, T> f13744c;

    /* compiled from: ObservableScan */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13745b;

        /* renamed from: c  reason: collision with root package name */
        final c<T, T, T> f13746c;

        /* renamed from: d  reason: collision with root package name */
        b f13747d;

        /* renamed from: e  reason: collision with root package name */
        T f13748e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13749f;

        a(s<? super T> sVar, c<T, T, T> cVar) {
            this.f13745b = sVar;
            this.f13746c = cVar;
        }

        public void dispose() {
            this.f13747d.dispose();
        }

        public void onComplete() {
            if (!this.f13749f) {
                this.f13749f = true;
                this.f13745b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13749f) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13749f = true;
            this.f13745b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13749f) {
                s<? super T> sVar = this.f13745b;
                T t2 = this.f13748e;
                if (t2 == null) {
                    this.f13748e = t;
                    sVar.onNext(t);
                    return;
                }
                try {
                    T a2 = this.f13746c.a(t2, t);
                    d.a.a0.b.b.e(a2, "The value returned by the accumulator is null");
                    this.f13748e = a2;
                    sVar.onNext(a2);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13747d.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.f13747d, bVar)) {
                this.f13747d = bVar;
                this.f13745b.onSubscribe(this);
            }
        }
    }

    public z2(q<T> qVar, c<T, T, T> cVar) {
        super(qVar);
        this.f13744c = cVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13744c));
    }
}
