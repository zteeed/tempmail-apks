package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.n;
import io.reactivex.exceptions.CompositeException;

/* compiled from: ObservableOnErrorReturn */
public final class e2<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super Throwable, ? extends T> f13488c;

    /* compiled from: ObservableOnErrorReturn */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13489b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super Throwable, ? extends T> f13490c;

        /* renamed from: d  reason: collision with root package name */
        b f13491d;

        a(s<? super T> sVar, n<? super Throwable, ? extends T> nVar) {
            this.f13489b = sVar;
            this.f13490c = nVar;
        }

        public void dispose() {
            this.f13491d.dispose();
        }

        public void onComplete() {
            this.f13489b.onComplete();
        }

        public void onError(Throwable th) {
            try {
                Object apply = this.f13490c.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f13489b.onError(nullPointerException);
                    return;
                }
                this.f13489b.onNext(apply);
                this.f13489b.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f13489b.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(T t) {
            this.f13489b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13491d, bVar)) {
                this.f13491d = bVar;
                this.f13489b.onSubscribe(this);
            }
        }
    }

    public e2(q<T> qVar, n<? super Throwable, ? extends T> nVar) {
        super(qVar);
        this.f13488c = nVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f13488c));
    }
}
