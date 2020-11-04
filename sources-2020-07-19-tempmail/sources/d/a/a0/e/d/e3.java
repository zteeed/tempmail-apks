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
    final q<T> f12934a;

    /* compiled from: ObservableSingleMaybe */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final i<? super T> f12935b;

        /* renamed from: c  reason: collision with root package name */
        b f12936c;

        /* renamed from: d  reason: collision with root package name */
        T f12937d;

        /* renamed from: e  reason: collision with root package name */
        boolean f12938e;

        a(i<? super T> iVar) {
            this.f12935b = iVar;
        }

        public void dispose() {
            this.f12936c.dispose();
        }

        public void onComplete() {
            if (!this.f12938e) {
                this.f12938e = true;
                T t = this.f12937d;
                this.f12937d = null;
                if (t == null) {
                    this.f12935b.onComplete();
                } else {
                    this.f12935b.onSuccess(t);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f12938e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f12938e = true;
            this.f12935b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f12938e) {
                if (this.f12937d != null) {
                    this.f12938e = true;
                    this.f12936c.dispose();
                    this.f12935b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f12937d = t;
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f12936c, bVar)) {
                this.f12936c = bVar;
                this.f12935b.onSubscribe(this);
            }
        }
    }

    public e3(q<T> qVar) {
        this.f12934a = qVar;
    }

    public void d(i<? super T> iVar) {
        this.f12934a.subscribe(new a(iVar));
    }
}
