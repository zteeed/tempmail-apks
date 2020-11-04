package d.a.a0.e.d;

import d.a.a0.a.g;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.n;
import io.reactivex.exceptions.CompositeException;

/* compiled from: ObservableOnErrorNext */
public final class d2<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super Throwable, ? extends q<? extends T>> f12903c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f12904d;

    /* compiled from: ObservableOnErrorNext */
    static final class a<T> implements s<T> {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f12905b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super Throwable, ? extends q<? extends T>> f12906c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f12907d;

        /* renamed from: e  reason: collision with root package name */
        final g f12908e = new g();

        /* renamed from: f  reason: collision with root package name */
        boolean f12909f;
        boolean g;

        a(s<? super T> sVar, n<? super Throwable, ? extends q<? extends T>> nVar, boolean z) {
            this.f12905b = sVar;
            this.f12906c = nVar;
            this.f12907d = z;
        }

        public void onComplete() {
            if (!this.g) {
                this.g = true;
                this.f12909f = true;
                this.f12905b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f12909f) {
                this.f12909f = true;
                if (!this.f12907d || (th instanceof Exception)) {
                    try {
                        q qVar = (q) this.f12906c.apply(th);
                        if (qVar == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.f12905b.onError(nullPointerException);
                            return;
                        }
                        qVar.subscribe(this);
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f12905b.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.f12905b.onError(th);
                }
            } else if (this.g) {
                d.a.d0.a.s(th);
            } else {
                this.f12905b.onError(th);
            }
        }

        public void onNext(T t) {
            if (!this.g) {
                this.f12905b.onNext(t);
            }
        }

        public void onSubscribe(b bVar) {
            this.f12908e.b(bVar);
        }
    }

    public d2(q<T> qVar, n<? super Throwable, ? extends q<? extends T>> nVar, boolean z) {
        super(qVar);
        this.f12903c = nVar;
        this.f12904d = z;
    }

    public void subscribeActual(s<? super T> sVar) {
        a aVar = new a(sVar, this.f12903c, this.f12904d);
        sVar.onSubscribe(aVar.f12908e);
        this.f12780b.subscribe(aVar);
    }
}
