package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.a.d;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.u;
import d.a.v;
import d.a.y.b;
import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: ObservableToListSingle */
public final class c4<T, U extends Collection<? super T>> extends u<U> implements d.a.a0.c.a<U> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f12878a;

    /* renamed from: b  reason: collision with root package name */
    final Callable<U> f12879b;

    /* compiled from: ObservableToListSingle */
    static final class a<T, U extends Collection<? super T>> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super U> f12880b;

        /* renamed from: c  reason: collision with root package name */
        U f12881c;

        /* renamed from: d  reason: collision with root package name */
        b f12882d;

        a(v<? super U> vVar, U u) {
            this.f12880b = vVar;
            this.f12881c = u;
        }

        public void dispose() {
            this.f12882d.dispose();
        }

        public void onComplete() {
            U u = this.f12881c;
            this.f12881c = null;
            this.f12880b.onSuccess(u);
        }

        public void onError(Throwable th) {
            this.f12881c = null;
            this.f12880b.onError(th);
        }

        public void onNext(T t) {
            this.f12881c.add(t);
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f12882d, bVar)) {
                this.f12882d = bVar;
                this.f12880b.onSubscribe(this);
            }
        }
    }

    public c4(q<T> qVar, int i) {
        this.f12878a = qVar;
        this.f12879b = d.a.a0.b.a.e(i);
    }

    public l<U> a() {
        return d.a.d0.a.n(new b4(this.f12878a, this.f12879b));
    }

    public void e(v<? super U> vVar) {
        try {
            U call = this.f12879b.call();
            d.a.a0.b.b.e(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f12878a.subscribe(new a(vVar, (Collection) call));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            d.n(th, vVar);
        }
    }

    public c4(q<T> qVar, Callable<U> callable) {
        this.f12878a = qVar;
        this.f12879b = callable;
    }
}
