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
    final d<? super Integer, ? super Throwable> f13540c;

    /* compiled from: ObservableRetryBiPredicate */
    static final class a<T> extends AtomicInteger implements s<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13541b;

        /* renamed from: c  reason: collision with root package name */
        final g f13542c;

        /* renamed from: d  reason: collision with root package name */
        final q<? extends T> f13543d;

        /* renamed from: e  reason: collision with root package name */
        final d<? super Integer, ? super Throwable> f13544e;

        /* renamed from: f  reason: collision with root package name */
        int f13545f;

        a(s<? super T> sVar, d<? super Integer, ? super Throwable> dVar, g gVar, q<? extends T> qVar) {
            this.f13541b = sVar;
            this.f13542c = gVar;
            this.f13543d = qVar;
            this.f13544e = dVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f13542c.a()) {
                    this.f13543d.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            this.f13541b.onComplete();
        }

        public void onError(Throwable th) {
            try {
                d<? super Integer, ? super Throwable> dVar = this.f13544e;
                int i = this.f13545f + 1;
                this.f13545f = i;
                if (!dVar.a(Integer.valueOf(i), th)) {
                    this.f13541b.onError(th);
                } else {
                    a();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f13541b.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(T t) {
            this.f13541b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            this.f13542c.b(bVar);
        }
    }

    public t2(l<T> lVar, d<? super Integer, ? super Throwable> dVar) {
        super(lVar);
        this.f13540c = dVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        g gVar = new g();
        sVar.onSubscribe(gVar);
        new a(sVar, this.f13540c, gVar, this.f12780b).a();
    }
}
