package d.a.a0.e.d;

import d.a.a0.a.g;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.y.b;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableRepeat */
public final class p2<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f13949c;

    /* compiled from: ObservableRepeat */
    static final class a<T> extends AtomicInteger implements s<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13950b;

        /* renamed from: c  reason: collision with root package name */
        final g f13951c;

        /* renamed from: d  reason: collision with root package name */
        final q<? extends T> f13952d;

        /* renamed from: e  reason: collision with root package name */
        long f13953e;

        a(s<? super T> sVar, long j, g gVar, q<? extends T> qVar) {
            this.f13950b = sVar;
            this.f13951c = gVar;
            this.f13952d = qVar;
            this.f13953e = j;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f13951c.a()) {
                    this.f13952d.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            long j = this.f13953e;
            if (j != Long.MAX_VALUE) {
                this.f13953e = j - 1;
            }
            if (j != 0) {
                a();
            } else {
                this.f13950b.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f13950b.onError(th);
        }

        public void onNext(T t) {
            this.f13950b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            this.f13951c.b(bVar);
        }
    }

    public p2(l<T> lVar, long j) {
        super(lVar);
        this.f13949c = j;
    }

    public void subscribeActual(s<? super T> sVar) {
        g gVar = new g();
        sVar.onSubscribe(gVar);
        long j = this.f13949c;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j - 1;
        }
        new a(sVar, j2, gVar, this.f13338b).a();
    }
}
