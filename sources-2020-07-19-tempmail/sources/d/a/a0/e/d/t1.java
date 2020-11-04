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
    final q<T> f13534a;

    /* renamed from: b  reason: collision with root package name */
    final T f13535b;

    /* compiled from: ObservableLastSingle */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super T> f13536b;

        /* renamed from: c  reason: collision with root package name */
        final T f13537c;

        /* renamed from: d  reason: collision with root package name */
        b f13538d;

        /* renamed from: e  reason: collision with root package name */
        T f13539e;

        a(v<? super T> vVar, T t) {
            this.f13536b = vVar;
            this.f13537c = t;
        }

        public void dispose() {
            this.f13538d.dispose();
            this.f13538d = c.DISPOSED;
        }

        public void onComplete() {
            this.f13538d = c.DISPOSED;
            T t = this.f13539e;
            if (t != null) {
                this.f13539e = null;
                this.f13536b.onSuccess(t);
                return;
            }
            T t2 = this.f13537c;
            if (t2 != null) {
                this.f13536b.onSuccess(t2);
            } else {
                this.f13536b.onError(new NoSuchElementException());
            }
        }

        public void onError(Throwable th) {
            this.f13538d = c.DISPOSED;
            this.f13539e = null;
            this.f13536b.onError(th);
        }

        public void onNext(T t) {
            this.f13539e = t;
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13538d, bVar)) {
                this.f13538d = bVar;
                this.f13536b.onSubscribe(this);
            }
        }
    }

    public t1(q<T> qVar, T t) {
        this.f13534a = qVar;
        this.f13535b = t;
    }

    /* access modifiers changed from: protected */
    public void e(v<? super T> vVar) {
        this.f13534a.subscribe(new a(vVar, this.f13535b));
    }
}
