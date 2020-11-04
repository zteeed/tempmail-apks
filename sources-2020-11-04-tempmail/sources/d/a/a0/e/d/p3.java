package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import java.util.ArrayDeque;

/* compiled from: ObservableTakeLast */
public final class p3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final int f13954c;

    /* compiled from: ObservableTakeLast */
    static final class a<T> extends ArrayDeque<T> implements s<T>, b {
        private static final long serialVersionUID = 7240042530241604978L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13955b;

        /* renamed from: c  reason: collision with root package name */
        final int f13956c;

        /* renamed from: d  reason: collision with root package name */
        b f13957d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f13958e;

        a(s<? super T> sVar, int i) {
            this.f13955b = sVar;
            this.f13956c = i;
        }

        public void dispose() {
            if (!this.f13958e) {
                this.f13958e = true;
                this.f13957d.dispose();
            }
        }

        public void onComplete() {
            s<? super T> sVar = this.f13955b;
            while (!this.f13958e) {
                Object poll = poll();
                if (poll != null) {
                    sVar.onNext(poll);
                } else if (!this.f13958e) {
                    sVar.onComplete();
                    return;
                } else {
                    return;
                }
            }
        }

        public void onError(Throwable th) {
            this.f13955b.onError(th);
        }

        public void onNext(T t) {
            if (this.f13956c == size()) {
                poll();
            }
            offer(t);
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13957d, bVar)) {
                this.f13957d = bVar;
                this.f13955b.onSubscribe(this);
            }
        }
    }

    public p3(q<T> qVar, int i) {
        super(qVar);
        this.f13954c = i;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f13954c));
    }
}
