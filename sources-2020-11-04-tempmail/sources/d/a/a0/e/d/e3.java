package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.h;
import d.a.i;
import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableSingleMaybe */
public final class e3<T> extends h<T> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f13492a;

    /* compiled from: ObservableSingleMaybe */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final i<? super T> f13493b;

        /* renamed from: c  reason: collision with root package name */
        b f13494c;

        /* renamed from: d  reason: collision with root package name */
        T f13495d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13496e;

        a(i<? super T> iVar) {
            this.f13493b = iVar;
        }

        public void dispose() {
            this.f13494c.dispose();
        }

        public void onComplete() {
            if (!this.f13496e) {
                this.f13496e = true;
                T t = this.f13495d;
                this.f13495d = null;
                if (t == null) {
                    this.f13493b.onComplete();
                } else {
                    this.f13493b.onSuccess(t);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f13496e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13496e = true;
            this.f13493b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13496e) {
                if (this.f13495d != null) {
                    this.f13496e = true;
                    this.f13494c.dispose();
                    this.f13493b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f13495d = t;
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13494c, bVar)) {
                this.f13494c = bVar;
                this.f13493b.onSubscribe(this);
            }
        }
    }

    public e3(q<T> qVar) {
        this.f13492a = qVar;
    }

    public void d(i<? super T> iVar) {
        this.f13492a.subscribe(new a(iVar));
    }
}
