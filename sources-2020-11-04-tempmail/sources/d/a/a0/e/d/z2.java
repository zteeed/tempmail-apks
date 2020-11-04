package d.a.a0.e.d;

import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.c;

/* compiled from: ObservableScan */
public final class z2<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final c<T, T, T> f14302c;

    /* compiled from: ObservableScan */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14303b;

        /* renamed from: c  reason: collision with root package name */
        final c<T, T, T> f14304c;

        /* renamed from: d  reason: collision with root package name */
        b f14305d;

        /* renamed from: e  reason: collision with root package name */
        T f14306e;

        /* renamed from: f  reason: collision with root package name */
        boolean f14307f;

        a(s<? super T> sVar, c<T, T, T> cVar) {
            this.f14303b = sVar;
            this.f14304c = cVar;
        }

        public void dispose() {
            this.f14305d.dispose();
        }

        public void onComplete() {
            if (!this.f14307f) {
                this.f14307f = true;
                this.f14303b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f14307f) {
                d.a.d0.a.s(th);
                return;
            }
            this.f14307f = true;
            this.f14303b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f14307f) {
                s<? super T> sVar = this.f14303b;
                T t2 = this.f14306e;
                if (t2 == null) {
                    this.f14306e = t;
                    sVar.onNext(t);
                    return;
                }
                try {
                    T a2 = this.f14304c.a(t2, t);
                    d.a.a0.b.b.e(a2, "The value returned by the accumulator is null");
                    this.f14306e = a2;
                    sVar.onNext(a2);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f14305d.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.f14305d, bVar)) {
                this.f14305d = bVar;
                this.f14303b.onSubscribe(this);
            }
        }
    }

    public z2(q<T> qVar, c<T, T, T> cVar) {
        super(qVar);
        this.f14302c = cVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f14302c));
    }
}
