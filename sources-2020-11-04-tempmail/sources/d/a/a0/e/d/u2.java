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
    final o<? super Throwable> f14128c;

    /* renamed from: d  reason: collision with root package name */
    final long f14129d;

    /* compiled from: ObservableRetryPredicate */
    static final class a<T> extends AtomicInteger implements s<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14130b;

        /* renamed from: c  reason: collision with root package name */
        final g f14131c;

        /* renamed from: d  reason: collision with root package name */
        final q<? extends T> f14132d;

        /* renamed from: e  reason: collision with root package name */
        final o<? super Throwable> f14133e;

        /* renamed from: f  reason: collision with root package name */
        long f14134f;

        a(s<? super T> sVar, long j, o<? super Throwable> oVar, g gVar, q<? extends T> qVar) {
            this.f14130b = sVar;
            this.f14131c = gVar;
            this.f14132d = qVar;
            this.f14133e = oVar;
            this.f14134f = j;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f14131c.a()) {
                    this.f14132d.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            this.f14130b.onComplete();
        }

        public void onError(Throwable th) {
            long j = this.f14134f;
            if (j != Long.MAX_VALUE) {
                this.f14134f = j - 1;
            }
            if (j == 0) {
                this.f14130b.onError(th);
                return;
            }
            try {
                if (!this.f14133e.a(th)) {
                    this.f14130b.onError(th);
                } else {
                    a();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f14130b.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(T t) {
            this.f14130b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            this.f14131c.b(bVar);
        }
    }

    public u2(l<T> lVar, long j, o<? super Throwable> oVar) {
        super(lVar);
        this.f14128c = oVar;
        this.f14129d = j;
    }

    public void subscribeActual(s<? super T> sVar) {
        g gVar = new g();
        sVar.onSubscribe(gVar);
        new a(sVar, this.f14129d, this.f14128c, gVar, this.f13338b).a();
    }
}
