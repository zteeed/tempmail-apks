package d.a.a0.e.d;

import d.a.b;
import d.a.c;
import d.a.l;
import d.a.q;
import d.a.s;

/* compiled from: ObservableIgnoreElementsCompletable */
public final class m1<T> extends b implements d.a.a0.c.a<T> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f13242a;

    /* compiled from: ObservableIgnoreElementsCompletable */
    static final class a<T> implements s<T>, d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final c f13243b;

        /* renamed from: c  reason: collision with root package name */
        d.a.y.b f13244c;

        a(c cVar) {
            this.f13243b = cVar;
        }

        public void dispose() {
            this.f13244c.dispose();
        }

        public void onComplete() {
            this.f13243b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13243b.onError(th);
        }

        public void onNext(T t) {
        }

        public void onSubscribe(d.a.y.b bVar) {
            this.f13244c = bVar;
            this.f13243b.onSubscribe(this);
        }
    }

    public m1(q<T> qVar) {
        this.f13242a = qVar;
    }

    public l<T> a() {
        return d.a.d0.a.n(new l1(this.f13242a));
    }

    public void c(c cVar) {
        this.f13242a.subscribe(new a(cVar));
    }
}
