package d.a.a0.e.e;

import d.a.u;
import d.a.v;
import d.a.w;
import d.a.y.b;
import d.a.z.n;

/* compiled from: SingleMap */
public final class a<T, R> extends u<R> {

    /* renamed from: a  reason: collision with root package name */
    final w<? extends T> f13768a;

    /* renamed from: b  reason: collision with root package name */
    final n<? super T, ? extends R> f13769b;

    /* renamed from: d.a.a0.e.e.a$a  reason: collision with other inner class name */
    /* compiled from: SingleMap */
    static final class C0153a<T, R> implements v<T> {

        /* renamed from: b  reason: collision with root package name */
        final v<? super R> f13770b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends R> f13771c;

        C0153a(v<? super R> vVar, n<? super T, ? extends R> nVar) {
            this.f13770b = vVar;
            this.f13771c = nVar;
        }

        public void onError(Throwable th) {
            this.f13770b.onError(th);
        }

        public void onSubscribe(b bVar) {
            this.f13770b.onSubscribe(bVar);
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.f13771c.apply(t);
                d.a.a0.b.b.e(apply, "The mapper function returned a null value.");
                this.f13770b.onSuccess(apply);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                onError(th);
            }
        }
    }

    public a(w<? extends T> wVar, n<? super T, ? extends R> nVar) {
        this.f13768a = wVar;
        this.f13769b = nVar;
    }

    /* access modifiers changed from: protected */
    public void e(v<? super R> vVar) {
        this.f13768a.b(new C0153a(vVar, this.f13769b));
    }
}
