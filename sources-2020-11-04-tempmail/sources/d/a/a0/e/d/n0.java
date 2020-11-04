package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.f;
import io.reactivex.exceptions.CompositeException;

/* compiled from: ObservableDoOnEach */
public final class n0<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final f<? super T> f13834c;

    /* renamed from: d  reason: collision with root package name */
    final f<? super Throwable> f13835d;

    /* renamed from: e  reason: collision with root package name */
    final d.a.z.a f13836e;

    /* renamed from: f  reason: collision with root package name */
    final d.a.z.a f13837f;

    /* compiled from: ObservableDoOnEach */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13838b;

        /* renamed from: c  reason: collision with root package name */
        final f<? super T> f13839c;

        /* renamed from: d  reason: collision with root package name */
        final f<? super Throwable> f13840d;

        /* renamed from: e  reason: collision with root package name */
        final d.a.z.a f13841e;

        /* renamed from: f  reason: collision with root package name */
        final d.a.z.a f13842f;
        b g;
        boolean h;

        a(s<? super T> sVar, f<? super T> fVar, f<? super Throwable> fVar2, d.a.z.a aVar, d.a.z.a aVar2) {
            this.f13838b = sVar;
            this.f13839c = fVar;
            this.f13840d = fVar2;
            this.f13841e = aVar;
            this.f13842f = aVar2;
        }

        public void dispose() {
            this.g.dispose();
        }

        public void onComplete() {
            if (!this.h) {
                try {
                    this.f13841e.run();
                    this.h = true;
                    this.f13838b.onComplete();
                    try {
                        this.f13842f.run();
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.b(th);
                        d.a.d0.a.s(th);
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    onError(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.h) {
                d.a.d0.a.s(th);
                return;
            }
            this.h = true;
            try {
                this.f13840d.a(th);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                th = new CompositeException(th, th2);
            }
            this.f13838b.onError(th);
            try {
                this.f13842f.run();
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                d.a.d0.a.s(th3);
            }
        }

        public void onNext(T t) {
            if (!this.h) {
                try {
                    this.f13839c.a(t);
                    this.f13838b.onNext(t);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.g.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.g, bVar)) {
                this.g = bVar;
                this.f13838b.onSubscribe(this);
            }
        }
    }

    public n0(q<T> qVar, f<? super T> fVar, f<? super Throwable> fVar2, d.a.z.a aVar, d.a.z.a aVar2) {
        super(qVar);
        this.f13834c = fVar;
        this.f13835d = fVar2;
        this.f13836e = aVar;
        this.f13837f = aVar2;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f13834c, this.f13835d, this.f13836e, this.f13837f));
    }
}
