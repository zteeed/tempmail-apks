package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.n;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;

/* compiled from: ObservableMapNotification */
public final class w1<T, R> extends a<T, q<? extends R>> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends q<? extends R>> f14191c;

    /* renamed from: d  reason: collision with root package name */
    final n<? super Throwable, ? extends q<? extends R>> f14192d;

    /* renamed from: e  reason: collision with root package name */
    final Callable<? extends q<? extends R>> f14193e;

    /* compiled from: ObservableMapNotification */
    static final class a<T, R> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super q<? extends R>> f14194b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends q<? extends R>> f14195c;

        /* renamed from: d  reason: collision with root package name */
        final n<? super Throwable, ? extends q<? extends R>> f14196d;

        /* renamed from: e  reason: collision with root package name */
        final Callable<? extends q<? extends R>> f14197e;

        /* renamed from: f  reason: collision with root package name */
        b f14198f;

        a(s<? super q<? extends R>> sVar, n<? super T, ? extends q<? extends R>> nVar, n<? super Throwable, ? extends q<? extends R>> nVar2, Callable<? extends q<? extends R>> callable) {
            this.f14194b = sVar;
            this.f14195c = nVar;
            this.f14196d = nVar2;
            this.f14197e = callable;
        }

        public void dispose() {
            this.f14198f.dispose();
        }

        public void onComplete() {
            try {
                Object call = this.f14197e.call();
                d.a.a0.b.b.e(call, "The onComplete ObservableSource returned is null");
                this.f14194b.onNext((q) call);
                this.f14194b.onComplete();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f14194b.onError(th);
            }
        }

        public void onError(Throwable th) {
            try {
                Object apply = this.f14196d.apply(th);
                d.a.a0.b.b.e(apply, "The onError ObservableSource returned is null");
                this.f14194b.onNext((q) apply);
                this.f14194b.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f14194b.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(T t) {
            try {
                Object apply = this.f14195c.apply(t);
                d.a.a0.b.b.e(apply, "The onNext ObservableSource returned is null");
                this.f14194b.onNext((q) apply);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f14194b.onError(th);
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f14198f, bVar)) {
                this.f14198f = bVar;
                this.f14194b.onSubscribe(this);
            }
        }
    }

    public w1(q<T> qVar, n<? super T, ? extends q<? extends R>> nVar, n<? super Throwable, ? extends q<? extends R>> nVar2, Callable<? extends q<? extends R>> callable) {
        super(qVar);
        this.f14191c = nVar;
        this.f14192d = nVar2;
        this.f14193e = callable;
    }

    public void subscribeActual(s<? super q<? extends R>> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f14191c, this.f14192d, this.f14193e));
    }
}
