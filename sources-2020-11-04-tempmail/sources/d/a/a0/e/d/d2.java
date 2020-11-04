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
    final n<? super Throwable, ? extends q<? extends T>> f13461c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f13462d;

    /* compiled from: ObservableOnErrorNext */
    static final class a<T> implements s<T> {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13463b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super Throwable, ? extends q<? extends T>> f13464c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f13465d;

        /* renamed from: e  reason: collision with root package name */
        final g f13466e = new g();

        /* renamed from: f  reason: collision with root package name */
        boolean f13467f;
        boolean g;

        a(s<? super T> sVar, n<? super Throwable, ? extends q<? extends T>> nVar, boolean z) {
            this.f13463b = sVar;
            this.f13464c = nVar;
            this.f13465d = z;
        }

        public void onComplete() {
            if (!this.g) {
                this.g = true;
                this.f13467f = true;
                this.f13463b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f13467f) {
                this.f13467f = true;
                if (!this.f13465d || (th instanceof Exception)) {
                    try {
                        q qVar = (q) this.f13464c.apply(th);
                        if (qVar == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.f13463b.onError(nullPointerException);
                            return;
                        }
                        qVar.subscribe(this);
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f13463b.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.f13463b.onError(th);
                }
            } else if (this.g) {
                d.a.d0.a.s(th);
            } else {
                this.f13463b.onError(th);
            }
        }

        public void onNext(T t) {
            if (!this.g) {
                this.f13463b.onNext(t);
            }
        }

        public void onSubscribe(b bVar) {
            this.f13466e.b(bVar);
        }
    }

    public d2(q<T> qVar, n<? super Throwable, ? extends q<? extends T>> nVar, boolean z) {
        super(qVar);
        this.f13461c = nVar;
        this.f13462d = z;
    }

    public void subscribeActual(s<? super T> sVar) {
        a aVar = new a(sVar, this.f13461c, this.f13462d);
        sVar.onSubscribe(aVar.f13466e);
        this.f13338b.subscribe(aVar);
    }
}
