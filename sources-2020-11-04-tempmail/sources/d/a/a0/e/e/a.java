package d.a.a0.e.e;

import d.a.u;
import d.a.v;
import d.a.w;
import d.a.y.b;
import d.a.z.n;

/* compiled from: SingleMap */
public final class a<T, R> extends u<R> {

    /* renamed from: a  reason: collision with root package name */
    final w<? extends T> f14326a;

    /* renamed from: b  reason: collision with root package name */
    final n<? super T, ? extends R> f14327b;

    /* renamed from: d.a.a0.e.e.a$a  reason: collision with other inner class name */
    /* compiled from: SingleMap */
    static final class C0151a<T, R> implements v<T> {

        /* renamed from: b  reason: collision with root package name */
        final v<? super R> f14328b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends R> f14329c;

        C0151a(v<? super R> vVar, n<? super T, ? extends R> nVar) {
            this.f14328b = vVar;
            this.f14329c = nVar;
        }

        public void onError(Throwable th) {
            this.f14328b.onError(th);
        }

        public void onSubscribe(b bVar) {
            this.f14328b.onSubscribe(bVar);
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.f14329c.apply(t);
                d.a.a0.b.b.e(apply, "The mapper function returned a null value.");
                this.f14328b.onSuccess(apply);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                onError(th);
            }
        }
    }

    public a(w<? extends T> wVar, n<? super T, ? extends R> nVar) {
        this.f14326a = wVar;
        this.f14327b = nVar;
    }

    /* access modifiers changed from: protected */
    public void e(v<? super R> vVar) {
        this.f14326a.b(new C0151a(vVar, this.f14327b));
    }
}
