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
    final q<T> f13673a;

    /* renamed from: b  reason: collision with root package name */
    final o<? super T> f13674b;

    /* compiled from: ObservableAnySingle */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super Boolean> f13675b;

        /* renamed from: c  reason: collision with root package name */
        final o<? super T> f13676c;

        /* renamed from: d  reason: collision with root package name */
        b f13677d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13678e;

        a(v<? super Boolean> vVar, o<? super T> oVar) {
            this.f13675b = vVar;
            this.f13676c = oVar;
        }

        public void dispose() {
            this.f13677d.dispose();
        }

        public void onComplete() {
            if (!this.f13678e) {
                this.f13678e = true;
                this.f13675b.onSuccess(Boolean.FALSE);
            }
        }

        public void onError(Throwable th) {
            if (this.f13678e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13678e = true;
            this.f13675b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13678e) {
                try {
                    if (this.f13676c.a(t)) {
                        this.f13678e = true;
                        this.f13677d.dispose();
                        this.f13675b.onSuccess(Boolean.TRUE);
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13677d.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13677d, bVar)) {
                this.f13677d = bVar;
                this.f13675b.onSubscribe(this);
            }
        }
    }

    public j(q<T> qVar, o<? super T> oVar) {
        this.f13673a = qVar;
        this.f13674b = oVar;
    }

    public l<Boolean> a() {
        return d.a.d0.a.n(new i(this.f13673a, this.f13674b));
    }

    /* access modifiers changed from: protected */
    public void e(v<? super Boolean> vVar) {
        this.f13673a.subscribe(new a(vVar, this.f13674b));
    }
}
