package d.a.a0.e.d;

import d.a.a0.a.g;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.d;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableRetryBiPredicate */
public final class t2<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final d<? super Integer, ? super Throwable> f14098c;

    /* compiled from: ObservableRetryBiPredicate */
    static final class a<T> extends AtomicInteger implements s<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14099b;

        /* renamed from: c  reason: collision with root package name */
        final g f14100c;

        /* renamed from: d  reason: collision with root package name */
        final q<? extends T> f14101d;

        /* renamed from: e  reason: collision with root package name */
        final d<? super Integer, ? super Throwable> f14102e;

        /* renamed from: f  reason: collision with root package name */
        int f14103f;

        a(s<? super T> sVar, d<? super Integer, ? super Throwable> dVar, g gVar, q<? extends T> qVar) {
            this.f14099b = sVar;
            this.f14100c = gVar;
            this.f14101d = qVar;
            this.f14102e = dVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f14100c.a()) {
                    this.f14101d.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            this.f14099b.onComplete();
        }

        public void onError(Throwable th) {
            try {
                d<? super Integer, ? super Throwable> dVar = this.f14102e;
                int i = this.f14103f + 1;
                this.f14103f = i;
                if (!dVar.a(Integer.valueOf(i), th)) {
                    this.f14099b.onError(th);
                } else {
                    a();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f14099b.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(T t) {
            this.f14099b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            this.f14100c.b(bVar);
        }
    }

    public t2(l<T> lVar, d<? super Integer, ? super Throwable> dVar) {
        super(lVar);
        this.f14098c = dVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        g gVar = new g();
        sVar.onSubscribe(gVar);
        new a(sVar, this.f14098c, gVar, this.f13338b).a();
    }
}
