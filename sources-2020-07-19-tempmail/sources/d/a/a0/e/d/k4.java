package d.a.a0.e.d;

import d.a.c0.e;
import d.a.q;
import d.a.s;
import d.a.z.c;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableWithLatestFrom */
public final class k4<T, U, R> extends a<T, R> {

    /* renamed from: c  reason: collision with root package name */
    final c<? super T, ? super U, ? extends R> f13178c;

    /* renamed from: d  reason: collision with root package name */
    final q<? extends U> f13179d;

    /* compiled from: ObservableWithLatestFrom */
    static final class a<T, U, R> extends AtomicReference<U> implements s<T>, d.a.y.b {
        private static final long serialVersionUID = -312246233408980075L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f13180b;

        /* renamed from: c  reason: collision with root package name */
        final c<? super T, ? super U, ? extends R> f13181c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f13182d = new AtomicReference<>();

        /* renamed from: e  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f13183e = new AtomicReference<>();

        a(s<? super R> sVar, c<? super T, ? super U, ? extends R> cVar) {
            this.f13180b = sVar;
            this.f13181c = cVar;
        }

        public void a(Throwable th) {
            d.a.a0.a.c.f(this.f13182d);
            this.f13180b.onError(th);
        }

        public boolean b(d.a.y.b bVar) {
            return d.a.a0.a.c.n(this.f13183e, bVar);
        }

        public void dispose() {
            d.a.a0.a.c.f(this.f13182d);
            d.a.a0.a.c.f(this.f13183e);
        }

        public void onComplete() {
            d.a.a0.a.c.f(this.f13183e);
            this.f13180b.onComplete();
        }

        public void onError(Throwable th) {
            d.a.a0.a.c.f(this.f13183e);
            this.f13180b.onError(th);
        }

        public void onNext(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    Object a2 = this.f13181c.a(t, obj);
                    d.a.a0.b.b.e(a2, "The combiner returned a null value");
                    this.f13180b.onNext(a2);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    dispose();
                    this.f13180b.onError(th);
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this.f13182d, bVar);
        }
    }

    /* compiled from: ObservableWithLatestFrom */
    final class b implements s<U> {

        /* renamed from: b  reason: collision with root package name */
        private final a<T, U, R> f13184b;

        b(k4 k4Var, a<T, U, R> aVar) {
            this.f13184b = aVar;
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            this.f13184b.a(th);
        }

        public void onNext(U u) {
            this.f13184b.lazySet(u);
        }

        public void onSubscribe(d.a.y.b bVar) {
            this.f13184b.b(bVar);
        }
    }

    public k4(q<T> qVar, c<? super T, ? super U, ? extends R> cVar, q<? extends U> qVar2) {
        super(qVar);
        this.f13178c = cVar;
        this.f13179d = qVar2;
    }

    public void subscribeActual(s<? super R> sVar) {
        e eVar = new e(sVar);
        a aVar = new a(eVar, this.f13178c);
        eVar.onSubscribe(aVar);
        this.f13179d.subscribe(new b(this, aVar));
        this.f12780b.subscribe(aVar);
    }
}
