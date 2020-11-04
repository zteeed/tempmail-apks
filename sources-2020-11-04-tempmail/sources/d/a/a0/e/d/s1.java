package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.h;
import d.a.i;
import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableLastMaybe */
public final class s1<T> extends h<T> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f14035a;

    /* compiled from: ObservableLastMaybe */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final i<? super T> f14036b;

        /* renamed from: c  reason: collision with root package name */
        b f14037c;

        /* renamed from: d  reason: collision with root package name */
        T f14038d;

        a(i<? super T> iVar) {
            this.f14036b = iVar;
        }

        public void dispose() {
            this.f14037c.dispose();
            this.f14037c = c.DISPOSED;
        }

        public void onComplete() {
            this.f14037c = c.DISPOSED;
            T t = this.f14038d;
            if (t != null) {
                this.f14038d = null;
                this.f14036b.onSuccess(t);
                return;
            }
            this.f14036b.onComplete();
        }

        public void onError(Throwable th) {
            this.f14037c = c.DISPOSED;
            this.f14038d = null;
            this.f14036b.onError(th);
        }

        public void onNext(T t) {
            this.f14038d = t;
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f14037c, bVar)) {
                this.f14037c = bVar;
                this.f14036b.onSubscribe(this);
            }
        }
    }

    public s1(q<T> qVar) {
        this.f14035a = qVar;
    }

    /* access modifiers changed from: protected */
    public void d(i<? super T> iVar) {
        this.f14035a.subscribe(new a(iVar));
    }
}
