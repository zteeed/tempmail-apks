package d.a.a0.e.d;

import d.a.a0.a.g;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.o;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableRetryPredicate */
public final class u2<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final o<? super Throwable> f13570c;

    /* renamed from: d  reason: collision with root package name */
    final long f13571d;

    /* compiled from: ObservableRetryPredicate */
    static final class a<T> extends AtomicInteger implements s<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13572b;

        /* renamed from: c  reason: collision with root package name */
        final g f13573c;

        /* renamed from: d  reason: collision with root package name */
        final q<? extends T> f13574d;

        /* renamed from: e  reason: collision with root package name */
        final o<? super Throwable> f13575e;

        /* renamed from: f  reason: collision with root package name */
        long f13576f;

        a(s<? super T> sVar, long j, o<? super Throwable> oVar, g gVar, q<? extends T> qVar) {
            this.f13572b = sVar;
            this.f13573c = gVar;
            this.f13574d = qVar;
            this.f13575e = oVar;
            this.f13576f = j;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f13573c.a()) {
                    this.f13574d.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            this.f13572b.onComplete();
        }

        public void onError(Throwable th) {
            long j = this.f13576f;
            if (j != Long.MAX_VALUE) {
                this.f13576f = j - 1;
            }
            if (j == 0) {
                this.f13572b.onError(th);
                return;
            }
            try {
                if (!this.f13575e.a(th)) {
                    this.f13572b.onError(th);
                } else {
                    a();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f13572b.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(T t) {
            this.f13572b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            this.f13573c.b(bVar);
        }
    }

    public u2(l<T> lVar, long j, o<? super Throwable> oVar) {
        super(lVar);
        this.f13570c = oVar;
        this.f13571d = j;
    }

    public void subscribeActual(s<? super T> sVar) {
        g gVar = new g();
        sVar.onSubscribe(gVar);
        new a(sVar, this.f13571d, this.f13570c, gVar, this.f12780b).a();
    }
}
