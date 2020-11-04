package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.d.b;
import d.a.q;
import d.a.s;

/* compiled from: ObservableDoFinally */
public final class m0<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final d.a.z.a f13794c;

    /* compiled from: ObservableDoFinally */
    static final class a<T> extends b<T> implements s<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13795b;

        /* renamed from: c  reason: collision with root package name */
        final d.a.z.a f13796c;

        /* renamed from: d  reason: collision with root package name */
        d.a.y.b f13797d;

        /* renamed from: e  reason: collision with root package name */
        d.a.a0.c.b<T> f13798e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13799f;

        a(s<? super T> sVar, d.a.z.a aVar) {
            this.f13795b = sVar;
            this.f13796c = aVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f13796c.run();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    d.a.d0.a.s(th);
                }
            }
        }

        public void clear() {
            this.f13798e.clear();
        }

        public void dispose() {
            this.f13797d.dispose();
            a();
        }

        public int g(int i) {
            d.a.a0.c.b<T> bVar = this.f13798e;
            boolean z = false;
            if (bVar == null || (i & 4) != 0) {
                return 0;
            }
            int g = bVar.g(i);
            if (g != 0) {
                if (g == 1) {
                    z = true;
                }
                this.f13799f = z;
            }
            return g;
        }

        public boolean isEmpty() {
            return this.f13798e.isEmpty();
        }

        public void onComplete() {
            this.f13795b.onComplete();
            a();
        }

        public void onError(Throwable th) {
            this.f13795b.onError(th);
            a();
        }

        public void onNext(T t) {
            this.f13795b.onNext(t);
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13797d, bVar)) {
                this.f13797d = bVar;
                if (bVar instanceof d.a.a0.c.b) {
                    this.f13798e = (d.a.a0.c.b) bVar;
                }
                this.f13795b.onSubscribe(this);
            }
        }

        public T poll() throws Exception {
            T poll = this.f13798e.poll();
            if (poll == null && this.f13799f) {
                a();
            }
            return poll;
        }
    }

    public m0(q<T> qVar, d.a.z.a aVar) {
        super(qVar);
        this.f13794c = aVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f13794c));
    }
}
