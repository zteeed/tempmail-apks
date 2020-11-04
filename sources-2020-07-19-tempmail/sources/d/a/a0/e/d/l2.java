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
    final q<T> f13201a;

    /* renamed from: b  reason: collision with root package name */
    final c<T, T, T> f13202b;

    /* compiled from: ObservableReduceMaybe */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final i<? super T> f13203b;

        /* renamed from: c  reason: collision with root package name */
        final c<T, T, T> f13204c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13205d;

        /* renamed from: e  reason: collision with root package name */
        T f13206e;

        /* renamed from: f  reason: collision with root package name */
        b f13207f;

        a(i<? super T> iVar, c<T, T, T> cVar) {
            this.f13203b = iVar;
            this.f13204c = cVar;
        }

        public void dispose() {
            this.f13207f.dispose();
        }

        public void onComplete() {
            if (!this.f13205d) {
                this.f13205d = true;
                T t = this.f13206e;
                this.f13206e = null;
                if (t != null) {
                    this.f13203b.onSuccess(t);
                } else {
                    this.f13203b.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f13205d) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13205d = true;
            this.f13206e = null;
            this.f13203b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13205d) {
                T t2 = this.f13206e;
                if (t2 == null) {
                    this.f13206e = t;
                    return;
                }
                try {
                    T a2 = this.f13204c.a(t2, t);
                    d.a.a0.b.b.e(a2, "The reducer returned a null value");
                    this.f13206e = a2;
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13207f.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.f13207f, bVar)) {
                this.f13207f = bVar;
                this.f13203b.onSubscribe(this);
            }
        }
    }

    public l2(q<T> qVar, c<T, T, T> cVar) {
        this.f13201a = qVar;
        this.f13202b = cVar;
    }

    /* access modifiers changed from: protected */
    public void d(i<? super T> iVar) {
        this.f13201a.subscribe(new a(iVar, this.f13202b));
    }
}
