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
    final q<? extends T> f12980a;

    /* renamed from: b  reason: collision with root package name */
    final T f12981b;

    /* compiled from: ObservableSingleSingle */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super T> f12982b;

        /* renamed from: c  reason: collision with root package name */
        final T f12983c;

        /* renamed from: d  reason: collision with root package name */
        b f12984d;

        /* renamed from: e  reason: collision with root package name */
        T f12985e;

        /* renamed from: f  reason: collision with root package name */
        boolean f12986f;

        a(v<? super T> vVar, T t) {
            this.f12982b = vVar;
            this.f12983c = t;
        }

        public void dispose() {
            this.f12984d.dispose();
        }

        public void onComplete() {
            if (!this.f12986f) {
                this.f12986f = true;
                T t = this.f12985e;
                this.f12985e = null;
                if (t == null) {
                    t = this.f12983c;
                }
                if (t != null) {
                    this.f12982b.onSuccess(t);
                } else {
                    this.f12982b.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f12986f) {
                d.a.d0.a.s(th);
                return;
            }
            this.f12986f = true;
            this.f12982b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f12986f) {
                if (this.f12985e != null) {
                    this.f12986f = true;
                    this.f12984d.dispose();
                    this.f12982b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f12985e = t;
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f12984d, bVar)) {
                this.f12984d = bVar;
                this.f12982b.onSubscribe(this);
            }
        }
    }

    public f3(q<? extends T> qVar, T t) {
        this.f12980a = qVar;
        this.f12981b = t;
    }

    public void e(v<? super T> vVar) {
        this.f12980a.subscribe(new a(vVar, this.f12981b));
    }
}
