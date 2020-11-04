package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.a.d;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservablePublishSelector */
public final class i2<T, R> extends a<T, R> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super l<T>, ? extends q<R>> f13650c;

    /* compiled from: ObservablePublishSelector */
    static final class a<T, R> implements s<T> {

        /* renamed from: b  reason: collision with root package name */
        final d.a.f0.a<T> f13651b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f13652c;

        a(d.a.f0.a<T> aVar, AtomicReference<d.a.y.b> atomicReference) {
            this.f13651b = aVar;
            this.f13652c = atomicReference;
        }

        public void onComplete() {
            this.f13651b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13651b.onError(th);
        }

        public void onNext(T t) {
            this.f13651b.onNext(t);
        }

        public void onSubscribe(d.a.y.b bVar) {
            c.n(this.f13652c, bVar);
        }
    }

    /* compiled from: ObservablePublishSelector */
    static final class b<T, R> extends AtomicReference<d.a.y.b> implements s<R>, d.a.y.b {
        private static final long serialVersionUID = 854110278590336484L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f13653b;

        /* renamed from: c  reason: collision with root package name */
        d.a.y.b f13654c;

        b(s<? super R> sVar) {
            this.f13653b = sVar;
        }

        public void dispose() {
            this.f13654c.dispose();
            c.f(this);
        }

        public void onComplete() {
            c.f(this);
            this.f13653b.onComplete();
        }

        public void onError(Throwable th) {
            c.f(this);
            this.f13653b.onError(th);
        }

        public void onNext(R r) {
            this.f13653b.onNext(r);
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13654c, bVar)) {
                this.f13654c = bVar;
                this.f13653b.onSubscribe(this);
            }
        }
    }

    public i2(q<T> qVar, n<? super l<T>, ? extends q<R>> nVar) {
        super(qVar);
        this.f13650c = nVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super R> sVar) {
        d.a.f0.a f2 = d.a.f0.a.f();
        try {
            Object apply = this.f13650c.apply(f2);
            d.a.a0.b.b.e(apply, "The selector returned a null ObservableSource");
            q qVar = (q) apply;
            b bVar = new b(sVar);
            qVar.subscribe(bVar);
            this.f13338b.subscribe(new a(f2, bVar));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            d.m(th, sVar);
        }
    }
}
