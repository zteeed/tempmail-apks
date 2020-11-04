package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.u;
import d.a.v;
import d.a.y.b;
import java.util.NoSuchElementException;

/* compiled from: ObservableSingleSingle */
public final class f3<T> extends u<T> {

    /* renamed from: a  reason: collision with root package name */
    final q<? extends T> f13538a;

    /* renamed from: b  reason: collision with root package name */
    final T f13539b;

    /* compiled from: ObservableSingleSingle */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super T> f13540b;

        /* renamed from: c  reason: collision with root package name */
        final T f13541c;

        /* renamed from: d  reason: collision with root package name */
        b f13542d;

        /* renamed from: e  reason: collision with root package name */
        T f13543e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13544f;

        a(v<? super T> vVar, T t) {
            this.f13540b = vVar;
            this.f13541c = t;
        }

        public void dispose() {
            this.f13542d.dispose();
        }

        public void onComplete() {
            if (!this.f13544f) {
                this.f13544f = true;
                T t = this.f13543e;
                this.f13543e = null;
                if (t == null) {
                    t = this.f13541c;
                }
                if (t != null) {
                    this.f13540b.onSuccess(t);
                } else {
                    this.f13540b.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f13544f) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13544f = true;
            this.f13540b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13544f) {
                if (this.f13543e != null) {
                    this.f13544f = true;
                    this.f13542d.dispose();
                    this.f13540b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f13543e = t;
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13542d, bVar)) {
                this.f13542d = bVar;
                this.f13540b.onSubscribe(this);
            }
        }
    }

    public f3(q<? extends T> qVar, T t) {
        this.f13538a = qVar;
        this.f13539b = t;
    }

    public void e(v<? super T> vVar) {
        this.f13538a.subscribe(new a(vVar, this.f13539b));
    }
}
