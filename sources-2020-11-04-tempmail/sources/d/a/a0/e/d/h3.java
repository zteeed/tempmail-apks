package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import java.util.ArrayDeque;

/* compiled from: ObservableSkipLast */
public final class h3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final int f13615c;

    /* compiled from: ObservableSkipLast */
    static final class a<T> extends ArrayDeque<T> implements s<T>, b {
        private static final long serialVersionUID = -3807491841935125653L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13616b;

        /* renamed from: c  reason: collision with root package name */
        final int f13617c;

        /* renamed from: d  reason: collision with root package name */
        b f13618d;

        a(s<? super T> sVar, int i) {
            super(i);
            this.f13616b = sVar;
            this.f13617c = i;
        }

        public void dispose() {
            this.f13618d.dispose();
        }

        public void onComplete() {
            this.f13616b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13616b.onError(th);
        }

        public void onNext(T t) {
            if (this.f13617c == size()) {
                this.f13616b.onNext(poll());
            }
            offer(t);
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13618d, bVar)) {
                this.f13618d = bVar;
                this.f13616b.onSubscribe(this);
            }
        }
    }

    public h3(q<T> qVar, int i) {
        super(qVar);
        this.f13615c = i;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f13615c));
    }
}
