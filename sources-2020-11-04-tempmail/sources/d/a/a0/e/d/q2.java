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
    final e f13986c;

    /* compiled from: ObservableRepeatUntil */
    static final class a<T> extends AtomicInteger implements s<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13987b;

        /* renamed from: c  reason: collision with root package name */
        final g f13988c;

        /* renamed from: d  reason: collision with root package name */
        final q<? extends T> f13989d;

        /* renamed from: e  reason: collision with root package name */
        final e f13990e;

        a(s<? super T> sVar, e eVar, g gVar, q<? extends T> qVar) {
            this.f13987b = sVar;
            this.f13988c = gVar;
            this.f13989d = qVar;
            this.f13990e = eVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                do {
                    this.f13989d.subscribe(this);
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public void onComplete() {
            try {
                if (this.f13990e.a()) {
                    this.f13987b.onComplete();
                } else {
                    a();
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f13987b.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.f13987b.onError(th);
        }

        public void onNext(T t) {
            this.f13987b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            this.f13988c.b(bVar);
        }
    }

    public q2(l<T> lVar, e eVar) {
        super(lVar);
        this.f13986c = eVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        g gVar = new g();
        sVar.onSubscribe(gVar);
        new a(sVar, this.f13986c, gVar, this.f13338b).a();
    }
}
