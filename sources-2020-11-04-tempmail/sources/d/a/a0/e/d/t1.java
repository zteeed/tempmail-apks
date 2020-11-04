package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.u;
import d.a.v;
import d.a.y.b;
import java.util.NoSuchElementException;

/* compiled from: ObservableLastSingle */
public final class t1<T> extends u<T> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f14092a;

    /* renamed from: b  reason: collision with root package name */
    final T f14093b;

    /* compiled from: ObservableLastSingle */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super T> f14094b;

        /* renamed from: c  reason: collision with root package name */
        final T f14095c;

        /* renamed from: d  reason: collision with root package name */
        b f14096d;

        /* renamed from: e  reason: collision with root package name */
        T f14097e;

        a(v<? super T> vVar, T t) {
            this.f14094b = vVar;
            this.f14095c = t;
        }

        public void dispose() {
            this.f14096d.dispose();
            this.f14096d = c.DISPOSED;
        }

        public void onComplete() {
            this.f14096d = c.DISPOSED;
            T t = this.f14097e;
            if (t != null) {
                this.f14097e = null;
                this.f14094b.onSuccess(t);
                return;
            }
            T t2 = this.f14095c;
            if (t2 != null) {
                this.f14094b.onSuccess(t2);
            } else {
                this.f14094b.onError(new NoSuchElementException());
            }
        }

        public void onError(Throwable th) {
            this.f14096d = c.DISPOSED;
            this.f14097e = null;
            this.f14094b.onError(th);
        }

        public void onNext(T t) {
            this.f14097e = t;
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f14096d, bVar)) {
                this.f14096d = bVar;
                this.f14094b.onSubscribe(this);
            }
        }
    }

    public t1(q<T> qVar, T t) {
        this.f14092a = qVar;
        this.f14093b = t;
    }

    /* access modifiers changed from: protected */
    public void e(v<? super T> vVar) {
        this.f14092a.subscribe(new a(vVar, this.f14093b));
    }
}
