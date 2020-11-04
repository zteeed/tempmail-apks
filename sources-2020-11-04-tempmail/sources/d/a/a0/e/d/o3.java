package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.a.d;
import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableTake */
public final class o3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f13918c;

    /* compiled from: ObservableTake */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13919b;

        /* renamed from: c  reason: collision with root package name */
        boolean f13920c;

        /* renamed from: d  reason: collision with root package name */
        b f13921d;

        /* renamed from: e  reason: collision with root package name */
        long f13922e;

        a(s<? super T> sVar, long j) {
            this.f13919b = sVar;
            this.f13922e = j;
        }

        public void dispose() {
            this.f13921d.dispose();
        }

        public void onComplete() {
            if (!this.f13920c) {
                this.f13920c = true;
                this.f13921d.dispose();
                this.f13919b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13920c) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13920c = true;
            this.f13921d.dispose();
            this.f13919b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13920c) {
                long j = this.f13922e;
                long j2 = j - 1;
                this.f13922e = j2;
                if (j > 0) {
                    boolean z = j2 == 0;
                    this.f13919b.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13921d, bVar)) {
                this.f13921d = bVar;
                if (this.f13922e == 0) {
                    this.f13920c = true;
                    bVar.dispose();
                    d.h(this.f13919b);
                    return;
                }
                this.f13919b.onSubscribe(this);
            }
        }
    }

    public o3(q<T> qVar, long j) {
        super(qVar);
        this.f13918c = j;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f13918c));
    }
}
