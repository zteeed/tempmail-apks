package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.u;
import d.a.v;
import d.a.y.b;
import d.a.z.o;

/* compiled from: ObservableAllSingle */
public final class g<T> extends u<Boolean> implements d.a.a0.c.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f13000a;

    /* renamed from: b  reason: collision with root package name */
    final o<? super T> f13001b;

    /* compiled from: ObservableAllSingle */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final v<? super Boolean> f13002b;

        /* renamed from: c  reason: collision with root package name */
        final o<? super T> f13003c;

        /* renamed from: d  reason: collision with root package name */
        b f13004d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13005e;

        a(v<? super Boolean> vVar, o<? super T> oVar) {
            this.f13002b = vVar;
            this.f13003c = oVar;
        }

        public void dispose() {
            this.f13004d.dispose();
        }

        public void onComplete() {
            if (!this.f13005e) {
                this.f13005e = true;
                this.f13002b.onSuccess(Boolean.TRUE);
            }
        }

        public void onError(Throwable th) {
            if (this.f13005e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13005e = true;
            this.f13002b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13005e) {
                try {
                    if (!this.f13003c.a(t)) {
                        this.f13005e = true;
                        this.f13004d.dispose();
                        this.f13002b.onSuccess(Boolean.FALSE);
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13004d.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13004d, bVar)) {
                this.f13004d = bVar;
                this.f13002b.onSubscribe(this);
            }
        }
    }

    public g(q<T> qVar, o<? super T> oVar) {
        this.f13000a = qVar;
        this.f13001b = oVar;
    }

    public l<Boolean> a() {
        return d.a.d0.a.n(new f(this.f13000a, this.f13001b));
    }

    /* access modifiers changed from: protected */
    public void e(v<? super Boolean> vVar) {
        this.f13000a.subscribe(new a(vVar, this.f13001b));
    }
}
