package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.u;
import d.a.v;
import d.a.y.b;
import d.a.z.o;

/* compiled from: ObservableAnySingle */
public final class j<T> extends u<Boolean> implements d.a.a0.c.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f13115a;

    /* renamed from: b  reason: collision with root package name */
    final o<? super T> f13116b;

    /* compiled from: ObservableAnySingle */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super Boolean> f13117b;

        /* renamed from: c  reason: collision with root package name */
        final o<? super T> f13118c;

        /* renamed from: d  reason: collision with root package name */
        b f13119d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13120e;

        a(v<? super Boolean> vVar, o<? super T> oVar) {
            this.f13117b = vVar;
            this.f13118c = oVar;
        }

        public void dispose() {
            this.f13119d.dispose();
        }

        public void onComplete() {
            if (!this.f13120e) {
                this.f13120e = true;
                this.f13117b.onSuccess(Boolean.FALSE);
            }
        }

        public void onError(Throwable th) {
            if (this.f13120e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13120e = true;
            this.f13117b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13120e) {
                try {
                    if (this.f13118c.a(t)) {
                        this.f13120e = true;
                        this.f13119d.dispose();
                        this.f13117b.onSuccess(Boolean.TRUE);
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13119d.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13119d, bVar)) {
                this.f13119d = bVar;
                this.f13117b.onSubscribe(this);
            }
        }
    }

    public j(q<T> qVar, o<? super T> oVar) {
        this.f13115a = qVar;
        this.f13116b = oVar;
    }

    public l<Boolean> a() {
        return d.a.d0.a.n(new i(this.f13115a, this.f13116b));
    }

    /* access modifiers changed from: protected */
    public void e(v<? super Boolean> vVar) {
        this.f13115a.subscribe(new a(vVar, this.f13116b));
    }
}
