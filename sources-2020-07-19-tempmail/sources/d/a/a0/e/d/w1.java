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
    final n<? super T, ? extends q<? extends R>> f13633c;

    /* renamed from: d  reason: collision with root package name */
    final n<? super Throwable, ? extends q<? extends R>> f13634d;

    /* renamed from: e  reason: collision with root package name */
    final Callable<? extends q<? extends R>> f13635e;

    /* compiled from: ObservableMapNotification */
    static final class a<T, R> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super q<? extends R>> f13636b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends q<? extends R>> f13637c;

        /* renamed from: d  reason: collision with root package name */
        final n<? super Throwable, ? extends q<? extends R>> f13638d;

        /* renamed from: e  reason: collision with root package name */
        final Callable<? extends q<? extends R>> f13639e;

        /* renamed from: f  reason: collision with root package name */
        b f13640f;

        a(s<? super q<? extends R>> sVar, n<? super T, ? extends q<? extends R>> nVar, n<? super Throwable, ? extends q<? extends R>> nVar2, Callable<? extends q<? extends R>> callable) {
            this.f13636b = sVar;
            this.f13637c = nVar;
            this.f13638d = nVar2;
            this.f13639e = callable;
        }

        public void dispose() {
            this.f13640f.dispose();
        }

        public void onComplete() {
            try {
                Object call = this.f13639e.call();
                d.a.a0.b.b.e(call, "The onComplete ObservableSource returned is null");
                this.f13636b.onNext((q) call);
                this.f13636b.onComplete();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f13636b.onError(th);
            }
        }

        public void onError(Throwable th) {
            try {
                Object apply = this.f13638d.apply(th);
                d.a.a0.b.b.e(apply, "The onError ObservableSource returned is null");
                this.f13636b.onNext((q) apply);
                this.f13636b.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f13636b.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(T t) {
            try {
                Object apply = this.f13637c.apply(t);
                d.a.a0.b.b.e(apply, "The onNext ObservableSource returned is null");
                this.f13636b.onNext((q) apply);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f13636b.onError(th);
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13640f, bVar)) {
                this.f13640f = bVar;
                this.f13636b.onSubscribe(this);
            }
        }
    }

    public w1(q<T> qVar, n<? super T, ? extends q<? extends R>> nVar, n<? super Throwable, ? extends q<? extends R>> nVar2, Callable<? extends q<? extends R>> callable) {
        super(qVar);
        this.f13633c = nVar;
        this.f13634d = nVar2;
        this.f13635e = callable;
    }

    public void subscribeActual(s<? super q<? extends R>> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13633c, this.f13634d, this.f13635e));
    }
}
