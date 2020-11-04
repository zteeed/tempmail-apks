package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import java.util.ArrayDeque;

/* compiled from: ObservableSkipLast */
public final class h3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final int f13057c;

    /* compiled from: ObservableSkipLast */
    static final class a<T> extends ArrayDeque<T> implements s<T>, b {
        private static final long serialVersionUID = -3807491841935125653L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13058b;

        /* renamed from: c  reason: collision with root package name */
        final int f13059c;

        /* renamed from: d  reason: collision with root package name */
        b f13060d;

        a(s<? super T> sVar, int i) {
            super(i);
            this.f13058b = sVar;
            this.f13059c = i;
        }

        public void dispose() {
            this.f13060d.dispose();
        }

        public void onComplete() {
            this.f13058b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13058b.onError(th);
        }

        public void onNext(T t) {
            if (this.f13059c == size()) {
                this.f13058b.onNext(poll());
            }
            offer(t);
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13060d, bVar)) {
                this.f13060d = bVar;
                this.f13058b.onSubscribe(this);
            }
        }
    }

    public h3(q<T> qVar, int i) {
        super(qVar);
        this.f13057c = i;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13057c));
    }
}
