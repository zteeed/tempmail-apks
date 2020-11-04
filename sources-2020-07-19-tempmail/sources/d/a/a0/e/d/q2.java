package d.a.a0.e.d;

import d.a.a0.a.g;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.e;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableRepeatUntil */
public final class q2<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final e f13428c;

    /* compiled from: ObservableRepeatUntil */
    static final class a<T> extends AtomicInteger implements s<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13429b;

        /* renamed from: c  reason: collision with root package name */
        final g f13430c;

        /* renamed from: d  reason: collision with root package name */
        final q<? extends T> f13431d;

        /* renamed from: e  reason: collision with root package name */
        final e f13432e;

        a(s<? super T> sVar, e eVar, g gVar, q<? extends T> qVar) {
            this.f13429b = sVar;
            this.f13430c = gVar;
            this.f13431d = qVar;
            this.f13432e = eVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                do {
                    this.f13431d.subscribe(this);
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public void onComplete() {
            try {
                if (this.f13432e.a()) {
                    this.f13429b.onComplete();
                } else {
                    a();
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f13429b.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.f13429b.onError(th);
        }

        public void onNext(T t) {
            this.f13429b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            this.f13430c.b(bVar);
        }
    }

    public q2(l<T> lVar, e eVar) {
        super(lVar);
        this.f13428c = eVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        g gVar = new g();
        sVar.onSubscribe(gVar);
        new a(sVar, this.f13428c, gVar, this.f12780b).a();
    }
}
