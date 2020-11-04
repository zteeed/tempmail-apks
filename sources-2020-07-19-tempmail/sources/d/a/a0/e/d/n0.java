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
    final f<? super T> f13276c;

    /* renamed from: d  reason: collision with root package name */
    final f<? super Throwable> f13277d;

    /* renamed from: e  reason: collision with root package name */
    final d.a.z.a f13278e;

    /* renamed from: f  reason: collision with root package name */
    final d.a.z.a f13279f;

    /* compiled from: ObservableDoOnEach */
    static final class a<T> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13280b;

        /* renamed from: c  reason: collision with root package name */
        final f<? super T> f13281c;

        /* renamed from: d  reason: collision with root package name */
        final f<? super Throwable> f13282d;

        /* renamed from: e  reason: collision with root package name */
        final d.a.z.a f13283e;

        /* renamed from: f  reason: collision with root package name */
        final d.a.z.a f13284f;
        b g;
        boolean h;

        a(s<? super T> sVar, f<? super T> fVar, f<? super Throwable> fVar2, d.a.z.a aVar, d.a.z.a aVar2) {
            this.f13280b = sVar;
            this.f13281c = fVar;
            this.f13282d = fVar2;
            this.f13283e = aVar;
            this.f13284f = aVar2;
        }

        public void dispose() {
            this.g.dispose();
        }

        public void onComplete() {
            if (!this.h) {
                try {
                    this.f13283e.run();
                    this.h = true;
                    this.f13280b.onComplete();
                    try {
                        this.f13284f.run();
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
                this.f13282d.a(th);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                th = new CompositeException(th, th2);
            }
            this.f13280b.onError(th);
            try {
                this.f13284f.run();
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                d.a.d0.a.s(th3);
            }
        }

        public void onNext(T t) {
            if (!this.h) {
                try {
                    this.f13281c.a(t);
                    this.f13280b.onNext(t);
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
                this.f13280b.onSubscribe(this);
            }
        }
    }

    public n0(q<T> qVar, f<? super T> fVar, f<? super Throwable> fVar2, d.a.z.a aVar, d.a.z.a aVar2) {
        super(qVar);
        this.f13276c = fVar;
        this.f13277d = fVar2;
        this.f13278e = aVar;
        this.f13279f = aVar2;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13276c, this.f13277d, this.f13278e, this.f13279f));
    }
}
