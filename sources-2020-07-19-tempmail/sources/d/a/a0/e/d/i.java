package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.o;

/* compiled from: ObservableAny */
public final class i<T> extends a<T, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    final o<? super T> f13070c;

    /* compiled from: ObservableAny */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super Boolean> f13071b;

        /* renamed from: c  reason: collision with root package name */
        final o<? super T> f13072c;

        /* renamed from: d  reason: collision with root package name */
        b f13073d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13074e;

        a(s<? super Boolean> sVar, o<? super T> oVar) {
            this.f13071b = sVar;
            this.f13072c = oVar;
        }

        public void dispose() {
            this.f13073d.dispose();
        }

        public void onComplete() {
            if (!this.f13074e) {
                this.f13074e = true;
                this.f13071b.onNext(Boolean.FALSE);
                this.f13071b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13074e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13074e = true;
            this.f13071b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13074e) {
                try {
                    if (this.f13072c.a(t)) {
                        this.f13074e = true;
                        this.f13073d.dispose();
                        this.f13071b.onNext(Boolean.TRUE);
                        this.f13071b.onComplete();
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13073d.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13073d, bVar)) {
                this.f13073d = bVar;
                this.f13071b.onSubscribe(this);
            }
        }
    }

    public i(q<T> qVar, o<? super T> oVar) {
        super(qVar);
        this.f13070c = oVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super Boolean> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13070c));
    }
}
