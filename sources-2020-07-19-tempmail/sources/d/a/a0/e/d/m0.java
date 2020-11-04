package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.d.b;
import d.a.q;
import d.a.s;

/* compiled from: ObservableDoFinally */
public final class m0<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final d.a.z.a f13236c;

    /* compiled from: ObservableDoFinally */
    static final class a<T> extends b<T> implements s<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13237b;

        /* renamed from: c  reason: collision with root package name */
        final d.a.z.a f13238c;

        /* renamed from: d  reason: collision with root package name */
        d.a.y.b f13239d;

        /* renamed from: e  reason: collision with root package name */
        d.a.a0.c.b<T> f13240e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13241f;

        a(s<? super T> sVar, d.a.z.a aVar) {
            this.f13237b = sVar;
            this.f13238c = aVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f13238c.run();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    d.a.d0.a.s(th);
                }
            }
        }

        public void clear() {
            this.f13240e.clear();
        }

        public void dispose() {
            this.f13239d.dispose();
            a();
        }

        public int g(int i) {
            d.a.a0.c.b<T> bVar = this.f13240e;
            boolean z = false;
            if (bVar == null || (i & 4) != 0) {
                return 0;
            }
            int g = bVar.g(i);
            if (g != 0) {
                if (g == 1) {
                    z = true;
                }
                this.f13241f = z;
            }
            return g;
        }

        public boolean isEmpty() {
            return this.f13240e.isEmpty();
        }

        public void onComplete() {
            this.f13237b.onComplete();
            a();
        }

        public void onError(Throwable th) {
            this.f13237b.onError(th);
            a();
        }

        public void onNext(T t) {
            this.f13237b.onNext(t);
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13239d, bVar)) {
                this.f13239d = bVar;
                if (bVar instanceof d.a.a0.c.b) {
                    this.f13240e = (d.a.a0.c.b) bVar;
                }
                this.f13237b.onSubscribe(this);
            }
        }

        public T poll() throws Exception {
            T poll = this.f13240e.poll();
            if (poll == null && this.f13241f) {
                a();
            }
            return poll;
        }
    }

    public m0(q<T> qVar, d.a.z.a aVar) {
        super(qVar);
        this.f13236c = aVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13236c));
    }
}
