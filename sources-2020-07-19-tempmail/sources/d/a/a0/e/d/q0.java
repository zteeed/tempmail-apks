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
    final q<T> f13412a;

    /* renamed from: b  reason: collision with root package name */
    final long f13413b;

    /* compiled from: ObservableElementAtMaybe */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final i<? super T> f13414b;

        /* renamed from: c  reason: collision with root package name */
        final long f13415c;

        /* renamed from: d  reason: collision with root package name */
        b f13416d;

        /* renamed from: e  reason: collision with root package name */
        long f13417e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13418f;

        a(i<? super T> iVar, long j) {
            this.f13414b = iVar;
            this.f13415c = j;
        }

        public void dispose() {
            this.f13416d.dispose();
        }

        public void onComplete() {
            if (!this.f13418f) {
                this.f13418f = true;
                this.f13414b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13418f) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13418f = true;
            this.f13414b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13418f) {
                long j = this.f13417e;
                if (j == this.f13415c) {
                    this.f13418f = true;
                    this.f13416d.dispose();
                    this.f13414b.onSuccess(t);
                    return;
                }
                this.f13417e = j + 1;
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13416d, bVar)) {
                this.f13416d = bVar;
                this.f13414b.onSubscribe(this);
            }
        }
    }

    public q0(q<T> qVar, long j) {
        this.f13412a = qVar;
        this.f13413b = j;
    }

    public l<T> a() {
        return d.a.d0.a.n(new p0(this.f13412a, this.f13413b, null, false));
    }

    public void d(i<? super T> iVar) {
        this.f13412a.subscribe(new a(iVar, this.f13413b));
    }
}
