package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.o;

/* compiled from: ObservableTakeWhile */
public final class u3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final o<? super T> f14135c;

    /* compiled from: ObservableTakeWhile */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14136b;

        /* renamed from: c  reason: collision with root package name */
        final o<? super T> f14137c;

        /* renamed from: d  reason: collision with root package name */
        b f14138d;

        /* renamed from: e  reason: collision with root package name */
        boolean f14139e;

        a(s<? super T> sVar, o<? super T> oVar) {
            this.f14136b = sVar;
            this.f14137c = oVar;
        }

        public void dispose() {
            this.f14138d.dispose();
        }

        public void onComplete() {
            if (!this.f14139e) {
                this.f14139e = true;
                this.f14136b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f14139e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f14139e = true;
            this.f14136b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f14139e) {
                try {
                    if (!this.f14137c.a(t)) {
                        this.f14139e = true;
                        this.f14138d.dispose();
                        this.f14136b.onComplete();
                        return;
                    }
                    this.f14136b.onNext(t);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f14138d.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f14138d, bVar)) {
                this.f14138d = bVar;
                this.f14136b.onSubscribe(this);
            }
        }
    }

    public u3(q<T> qVar, o<? super T> oVar) {
        super(qVar);
        this.f14135c = oVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f14135c));
    }
}
