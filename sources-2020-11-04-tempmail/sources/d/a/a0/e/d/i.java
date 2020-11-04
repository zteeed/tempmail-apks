package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.o;

/* compiled from: ObservableAny */
public final class i<T> extends a<T, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    final o<? super T> f13628c;

    /* compiled from: ObservableAny */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super Boolean> f13629b;

        /* renamed from: c  reason: collision with root package name */
        final o<? super T> f13630c;

        /* renamed from: d  reason: collision with root package name */
        b f13631d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13632e;

        a(s<? super Boolean> sVar, o<? super T> oVar) {
            this.f13629b = sVar;
            this.f13630c = oVar;
        }

        public void dispose() {
            this.f13631d.dispose();
        }

        public void onComplete() {
            if (!this.f13632e) {
                this.f13632e = true;
                this.f13629b.onNext(Boolean.FALSE);
                this.f13629b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13632e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13632e = true;
            this.f13629b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13632e) {
                try {
                    if (this.f13630c.a(t)) {
                        this.f13632e = true;
                        this.f13631d.dispose();
                        this.f13629b.onNext(Boolean.TRUE);
                        this.f13629b.onComplete();
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13631d.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13631d, bVar)) {
                this.f13631d = bVar;
                this.f13629b.onSubscribe(this);
            }
        }
    }

    public i(q<T> qVar, o<? super T> oVar) {
        super(qVar);
        this.f13628c = oVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super Boolean> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f13628c));
    }
}
