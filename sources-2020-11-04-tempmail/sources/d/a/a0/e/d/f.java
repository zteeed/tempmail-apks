package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.o;

/* compiled from: ObservableAll */
public final class f<T> extends a<T, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    final o<? super T> f13506c;

    /* compiled from: ObservableAll */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super Boolean> f13507b;

        /* renamed from: c  reason: collision with root package name */
        final o<? super T> f13508c;

        /* renamed from: d  reason: collision with root package name */
        b f13509d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13510e;

        a(s<? super Boolean> sVar, o<? super T> oVar) {
            this.f13507b = sVar;
            this.f13508c = oVar;
        }

        public void dispose() {
            this.f13509d.dispose();
        }

        public void onComplete() {
            if (!this.f13510e) {
                this.f13510e = true;
                this.f13507b.onNext(Boolean.TRUE);
                this.f13507b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13510e) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13510e = true;
            this.f13507b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13510e) {
                try {
                    if (!this.f13508c.a(t)) {
                        this.f13510e = true;
                        this.f13509d.dispose();
                        this.f13507b.onNext(Boolean.FALSE);
                        this.f13507b.onComplete();
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13509d.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13509d, bVar)) {
                this.f13509d = bVar;
                this.f13507b.onSubscribe(this);
            }
        }
    }

    public f(q<T> qVar, o<? super T> oVar) {
        super(qVar);
        this.f13506c = oVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super Boolean> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f13506c));
    }
}
