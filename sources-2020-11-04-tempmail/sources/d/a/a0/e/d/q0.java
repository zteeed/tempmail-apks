package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.h;
import d.a.i;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.y.b;

/* compiled from: ObservableElementAtMaybe */
public final class q0<T> extends h<T> implements d.a.a0.c.a<T> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f13970a;

    /* renamed from: b  reason: collision with root package name */
    final long f13971b;

    /* compiled from: ObservableElementAtMaybe */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final i<? super T> f13972b;

        /* renamed from: c  reason: collision with root package name */
        final long f13973c;

        /* renamed from: d  reason: collision with root package name */
        b f13974d;

        /* renamed from: e  reason: collision with root package name */
        long f13975e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13976f;

        a(i<? super T> iVar, long j) {
            this.f13972b = iVar;
            this.f13973c = j;
        }

        public void dispose() {
            this.f13974d.dispose();
        }

        public void onComplete() {
            if (!this.f13976f) {
                this.f13976f = true;
                this.f13972b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13976f) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13976f = true;
            this.f13972b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13976f) {
                long j = this.f13975e;
                if (j == this.f13973c) {
                    this.f13976f = true;
                    this.f13974d.dispose();
                    this.f13972b.onSuccess(t);
                    return;
                }
                this.f13975e = j + 1;
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13974d, bVar)) {
                this.f13974d = bVar;
                this.f13972b.onSubscribe(this);
            }
        }
    }

    public q0(q<T> qVar, long j) {
        this.f13970a = qVar;
        this.f13971b = j;
    }

    public l<T> a() {
        return d.a.d0.a.n(new p0(this.f13970a, this.f13971b, null, false));
    }

    public void d(i<? super T> iVar) {
        this.f13970a.subscribe(new a(iVar, this.f13971b));
    }
}
