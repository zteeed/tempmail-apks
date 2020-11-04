package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.a.d;
import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableTake */
public final class o3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f13360c;

    /* compiled from: ObservableTake */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13361b;

        /* renamed from: c  reason: collision with root package name */
        boolean f13362c;

        /* renamed from: d  reason: collision with root package name */
        b f13363d;

        /* renamed from: e  reason: collision with root package name */
        long f13364e;

        a(s<? super T> sVar, long j) {
            this.f13361b = sVar;
            this.f13364e = j;
        }

        public void dispose() {
            this.f13363d.dispose();
        }

        public void onComplete() {
            if (!this.f13362c) {
                this.f13362c = true;
                this.f13363d.dispose();
                this.f13361b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13362c) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13362c = true;
            this.f13363d.dispose();
            this.f13361b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13362c) {
                long j = this.f13364e;
                long j2 = j - 1;
                this.f13364e = j2;
                if (j > 0) {
                    boolean z = j2 == 0;
                    this.f13361b.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13363d, bVar)) {
                this.f13363d = bVar;
                if (this.f13364e == 0) {
                    this.f13362c = true;
                    bVar.dispose();
                    d.h(this.f13361b);
                    return;
                }
                this.f13361b.onSubscribe(this);
            }
        }
    }

    public o3(q<T> qVar, long j) {
        super(qVar);
        this.f13360c = j;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13360c));
    }
}
