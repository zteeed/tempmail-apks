package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.a.d;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.y.b;
import d.a.z.f;
import d.a.z.n;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableUsing */
public final class e4<T, D> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final Callable<? extends D> f12939b;

    /* renamed from: c  reason: collision with root package name */
    final n<? super D, ? extends q<? extends T>> f12940c;

    /* renamed from: d  reason: collision with root package name */
    final f<? super D> f12941d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f12942e;

    /* compiled from: ObservableUsing */
    static final class a<T, D> extends AtomicBoolean implements s<T>, b {
        private static final long serialVersionUID = 5904473792286235046L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f12943b;

        /* renamed from: c  reason: collision with root package name */
        final D f12944c;

        /* renamed from: d  reason: collision with root package name */
        final f<? super D> f12945d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f12946e;

        /* renamed from: f  reason: collision with root package name */
        b f12947f;

        a(s<? super T> sVar, D d2, f<? super D> fVar, boolean z) {
            this.f12943b = sVar;
            this.f12944c = d2;
            this.f12945d = fVar;
            this.f12946e = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f12945d.a(this.f12944c);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    d.a.d0.a.s(th);
                }
            }
        }

        public void dispose() {
            a();
            this.f12947f.dispose();
        }

        public void onComplete() {
            if (this.f12946e) {
                if (compareAndSet(false, true)) {
                    try {
                        this.f12945d.a(this.f12944c);
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.b(th);
                        this.f12943b.onError(th);
                        return;
                    }
                }
                this.f12947f.dispose();
                this.f12943b.onComplete();
                return;
            }
            this.f12943b.onComplete();
            this.f12947f.dispose();
            a();
        }

        public void onError(Throwable th) {
            if (this.f12946e) {
                if (compareAndSet(false, true)) {
                    try {
                        this.f12945d.a(this.f12944c);
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        th = new CompositeException(th, th2);
                    }
                }
                this.f12947f.dispose();
                this.f12943b.onError(th);
                return;
            }
            this.f12943b.onError(th);
            this.f12947f.dispose();
            a();
        }

        public void onNext(T t) {
            this.f12943b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f12947f, bVar)) {
                this.f12947f = bVar;
                this.f12943b.onSubscribe(this);
            }
        }
    }

    public e4(Callable<? extends D> callable, n<? super D, ? extends q<? extends T>> nVar, f<? super D> fVar, boolean z) {
        this.f12939b = callable;
        this.f12940c = nVar;
        this.f12941d = fVar;
        this.f12942e = z;
    }

    public void subscribeActual(s<? super T> sVar) {
        try {
            Object call = this.f12939b.call();
            try {
                Object apply = this.f12940c.apply(call);
                d.a.a0.b.b.e(apply, "The sourceSupplier returned a null ObservableSource");
                ((q) apply).subscribe(new a(sVar, call, this.f12941d, this.f12942e));
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                d.m(new CompositeException(th, th), sVar);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            d.m(th2, sVar);
        }
    }
}
