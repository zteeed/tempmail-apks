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
    final q<T> f13477a;

    /* compiled from: ObservableLastMaybe */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final i<? super T> f13478b;

        /* renamed from: c  reason: collision with root package name */
        b f13479c;

        /* renamed from: d  reason: collision with root package name */
        T f13480d;

        a(i<? super T> iVar) {
            this.f13478b = iVar;
        }

        public void dispose() {
            this.f13479c.dispose();
            this.f13479c = c.DISPOSED;
        }

        public void onComplete() {
            this.f13479c = c.DISPOSED;
            T t = this.f13480d;
            if (t != null) {
                this.f13480d = null;
                this.f13478b.onSuccess(t);
                return;
            }
            this.f13478b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13479c = c.DISPOSED;
            this.f13480d = null;
            this.f13478b.onError(th);
        }

        public void onNext(T t) {
            this.f13480d = t;
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13479c, bVar)) {
                this.f13479c = bVar;
                this.f13478b.onSubscribe(this);
            }
        }
    }

    public s1(q<T> qVar) {
        this.f13477a = qVar;
    }

    /* access modifiers changed from: protected */
    public void d(i<? super T> iVar) {
        this.f13477a.subscribe(new a(iVar));
    }
}
