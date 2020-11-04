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
    final q<T> f14001a;

    /* renamed from: b  reason: collision with root package name */
    final long f14002b;

    /* renamed from: c  reason: collision with root package name */
    final T f14003c;

    /* compiled from: ObservableElementAtSingle */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super T> f14004b;

        /* renamed from: c  reason: collision with root package name */
        final long f14005c;

        /* renamed from: d  reason: collision with root package name */
        final T f14006d;

        /* renamed from: e  reason: collision with root package name */
        b f14007e;

        /* renamed from: f  reason: collision with root package name */
        long f14008f;
        boolean g;

        a(v<? super T> vVar, long j, T t) {
            this.f14004b = vVar;
            this.f14005c = j;
            this.f14006d = t;
        }

        public void dispose() {
            this.f14007e.dispose();
        }

        public void onComplete() {
            if (!this.g) {
                this.g = true;
                T t = this.f14006d;
                if (t != null) {
                    this.f14004b.onSuccess(t);
                } else {
                    this.f14004b.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.g) {
                d.a.d0.a.s(th);
                return;
            }
            this.g = true;
            this.f14004b.onError(th);
        }

        public void onNext(T t) {
            if (!this.g) {
                long j = this.f14008f;
                if (j == this.f14005c) {
                    this.g = true;
                    this.f14007e.dispose();
                    this.f14004b.onSuccess(t);
                    return;
                }
                this.f14008f = j + 1;
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f14007e, bVar)) {
                this.f14007e = bVar;
                this.f14004b.onSubscribe(this);
            }
        }
    }

    public r0(q<T> qVar, long j, T t) {
        this.f14001a = qVar;
        this.f14002b = j;
        this.f14003c = t;
    }

    public l<T> a() {
        return d.a.d0.a.n(new p0(this.f14001a, this.f14002b, this.f14003c, true));
    }

    public void e(v<? super T> vVar) {
        this.f14001a.subscribe(new a(vVar, this.f14002b, this.f14003c));
    }
}
