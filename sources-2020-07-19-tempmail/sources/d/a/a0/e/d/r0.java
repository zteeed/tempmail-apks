package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.u;
import d.a.v;
import d.a.y.b;
import java.util.NoSuchElementException;

/* compiled from: ObservableElementAtSingle */
public final class r0<T> extends u<T> implements d.a.a0.c.a<T> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f13443a;

    /* renamed from: b  reason: collision with root package name */
    final long f13444b;

    /* renamed from: c  reason: collision with root package name */
    final T f13445c;

    /* compiled from: ObservableElementAtSingle */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super T> f13446b;

        /* renamed from: c  reason: collision with root package name */
        final long f13447c;

        /* renamed from: d  reason: collision with root package name */
        final T f13448d;

        /* renamed from: e  reason: collision with root package name */
        b f13449e;

        /* renamed from: f  reason: collision with root package name */
        long f13450f;
        boolean g;

        a(v<? super T> vVar, long j, T t) {
            this.f13446b = vVar;
            this.f13447c = j;
            this.f13448d = t;
        }

        public void dispose() {
            this.f13449e.dispose();
        }

        public void onComplete() {
            if (!this.g) {
                this.g = true;
                T t = this.f13448d;
                if (t != null) {
                    this.f13446b.onSuccess(t);
                } else {
                    this.f13446b.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.g) {
                d.a.d0.a.s(th);
                return;
            }
            this.g = true;
            this.f13446b.onError(th);
        }

        public void onNext(T t) {
            if (!this.g) {
                long j = this.f13450f;
                if (j == this.f13447c) {
                    this.g = true;
                    this.f13449e.dispose();
                    this.f13446b.onSuccess(t);
                    return;
                }
                this.f13450f = j + 1;
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13449e, bVar)) {
                this.f13449e = bVar;
                this.f13446b.onSubscribe(this);
            }
        }
    }

    public r0(q<T> qVar, long j, T t) {
        this.f13443a = qVar;
        this.f13444b = j;
        this.f13445c = t;
    }

    public l<T> a() {
        return d.a.d0.a.n(new p0(this.f13443a, this.f13444b, this.f13445c, true));
    }

    public void e(v<? super T> vVar) {
        this.f13443a.subscribe(new a(vVar, this.f13444b, this.f13445c));
    }
}
