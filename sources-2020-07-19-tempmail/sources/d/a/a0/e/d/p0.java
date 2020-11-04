package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import java.util.NoSuchElementException;

/* compiled from: ObservableElementAt */
public final class p0<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f13375c;

    /* renamed from: d  reason: collision with root package name */
    final T f13376d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f13377e;

    /* compiled from: ObservableElementAt */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13378b;

        /* renamed from: c  reason: collision with root package name */
        final long f13379c;

        /* renamed from: d  reason: collision with root package name */
        final T f13380d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f13381e;

        /* renamed from: f  reason: collision with root package name */
        b f13382f;
        long g;
        boolean h;

        a(s<? super T> sVar, long j, T t, boolean z) {
            this.f13378b = sVar;
            this.f13379c = j;
            this.f13380d = t;
            this.f13381e = z;
        }

        public void dispose() {
            this.f13382f.dispose();
        }

        public void onComplete() {
            if (!this.h) {
                this.h = true;
                T t = this.f13380d;
                if (t != null || !this.f13381e) {
                    if (t != null) {
                        this.f13378b.onNext(t);
                    }
                    this.f13378b.onComplete();
                    return;
                }
                this.f13378b.onError(new NoSuchElementException());
            }
        }

        public void onError(Throwable th) {
            if (this.h) {
                d.a.d0.a.s(th);
                return;
            }
            this.h = true;
            this.f13378b.onError(th);
        }

        public void onNext(T t) {
            if (!this.h) {
                long j = this.g;
                if (j == this.f13379c) {
                    this.h = true;
                    this.f13382f.dispose();
                    this.f13378b.onNext(t);
                    this.f13378b.onComplete();
                    return;
                }
                this.g = j + 1;
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13382f, bVar)) {
                this.f13382f = bVar;
                this.f13378b.onSubscribe(this);
            }
        }
    }

    public p0(q<T> qVar, long j, T t, boolean z) {
        super(qVar);
        this.f13375c = j;
        this.f13376d = t;
        this.f13377e = z;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13375c, this.f13376d, this.f13377e));
    }
}
