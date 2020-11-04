package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import java.util.NoSuchElementException;

/* compiled from: ObservableElementAt */
public final class p0<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f13933c;

    /* renamed from: d  reason: collision with root package name */
    final T f13934d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f13935e;

    /* compiled from: ObservableElementAt */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13936b;

        /* renamed from: c  reason: collision with root package name */
        final long f13937c;

        /* renamed from: d  reason: collision with root package name */
        final T f13938d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f13939e;

        /* renamed from: f  reason: collision with root package name */
        b f13940f;
        long g;
        boolean h;

        a(s<? super T> sVar, long j, T t, boolean z) {
            this.f13936b = sVar;
            this.f13937c = j;
            this.f13938d = t;
            this.f13939e = z;
        }

        public void dispose() {
            this.f13940f.dispose();
        }

        public void onComplete() {
            if (!this.h) {
                this.h = true;
                T t = this.f13938d;
                if (t != null || !this.f13939e) {
                    if (t != null) {
                        this.f13936b.onNext(t);
                    }
                    this.f13936b.onComplete();
                    return;
                }
                this.f13936b.onError(new NoSuchElementException());
            }
        }

        public void onError(Throwable th) {
            if (this.h) {
                d.a.d0.a.s(th);
                return;
            }
            this.h = true;
            this.f13936b.onError(th);
        }

        public void onNext(T t) {
            if (!this.h) {
                long j = this.g;
                if (j == this.f13937c) {
                    this.h = true;
                    this.f13940f.dispose();
                    this.f13936b.onNext(t);
                    this.f13936b.onComplete();
                    return;
                }
                this.g = j + 1;
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13940f, bVar)) {
                this.f13940f = bVar;
                this.f13936b.onSubscribe(this);
            }
        }
    }

    public p0(q<T> qVar, long j, T t, boolean z) {
        super(qVar);
        this.f13933c = j;
        this.f13934d = t;
        this.f13935e = z;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f13933c, this.f13934d, this.f13935e));
    }
}
