package d.a.a0.e.d;

import d.a.h;
import d.a.i;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.c;

/* compiled from: ObservableReduceMaybe */
public final class l2<T> extends h<T> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f13759a;

    /* renamed from: b  reason: collision with root package name */
    final c<T, T, T> f13760b;

    /* compiled from: ObservableReduceMaybe */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final i<? super T> f13761b;

        /* renamed from: c  reason: collision with root package name */
        final c<T, T, T> f13762c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13763d;

        /* renamed from: e  reason: collision with root package name */
        T f13764e;

        /* renamed from: f  reason: collision with root package name */
        b f13765f;

        a(i<? super T> iVar, c<T, T, T> cVar) {
            this.f13761b = iVar;
            this.f13762c = cVar;
        }

        public void dispose() {
            this.f13765f.dispose();
        }

        public void onComplete() {
            if (!this.f13763d) {
                this.f13763d = true;
                T t = this.f13764e;
                this.f13764e = null;
                if (t != null) {
                    this.f13761b.onSuccess(t);
                } else {
                    this.f13761b.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f13763d) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13763d = true;
            this.f13764e = null;
            this.f13761b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13763d) {
                T t2 = this.f13764e;
                if (t2 == null) {
                    this.f13764e = t;
                    return;
                }
                try {
                    T a2 = this.f13762c.a(t2, t);
                    d.a.a0.b.b.e(a2, "The reducer returned a null value");
                    this.f13764e = a2;
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13765f.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.f13765f, bVar)) {
                this.f13765f = bVar;
                this.f13761b.onSubscribe(this);
            }
        }
    }

    public l2(q<T> qVar, c<T, T, T> cVar) {
        this.f13759a = qVar;
        this.f13760b = cVar;
    }

    /* access modifiers changed from: protected */
    public void d(i<? super T> iVar) {
        this.f13759a.subscribe(new a(iVar, this.f13760b));
    }
}
