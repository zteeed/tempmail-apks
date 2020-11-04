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
    final Callable<? extends D> f13497b;

    /* renamed from: c  reason: collision with root package name */
    final n<? super D, ? extends q<? extends T>> f13498c;

    /* renamed from: d  reason: collision with root package name */
    final f<? super D> f13499d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f13500e;

    /* compiled from: ObservableUsing */
    static final class a<T, D> extends AtomicBoolean implements s<T>, b {
        private static final long serialVersionUID = 5904473792286235046L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13501b;

        /* renamed from: c  reason: collision with root package name */
        final D f13502c;

        /* renamed from: d  reason: collision with root package name */
        final f<? super D> f13503d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f13504e;

        /* renamed from: f  reason: collision with root package name */
        b f13505f;

        a(s<? super T> sVar, D d2, f<? super D> fVar, boolean z) {
            this.f13501b = sVar;
            this.f13502c = d2;
            this.f13503d = fVar;
            this.f13504e = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f13503d.a(this.f13502c);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    d.a.d0.a.s(th);
                }
            }
        }

        public void dispose() {
            a();
            this.f13505f.dispose();
        }

        public void onComplete() {
            if (this.f13504e) {
                if (compareAndSet(false, true)) {
                    try {
                        this.f13503d.a(this.f13502c);
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.b(th);
                        this.f13501b.onError(th);
                        return;
                    }
                }
                this.f13505f.dispose();
                this.f13501b.onComplete();
                return;
            }
            this.f13501b.onComplete();
            this.f13505f.dispose();
            a();
        }

        public void onError(Throwable th) {
            if (this.f13504e) {
                if (compareAndSet(false, true)) {
                    try {
                        this.f13503d.a(this.f13502c);
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        th = new CompositeException(th, th2);
                    }
                }
                this.f13505f.dispose();
                this.f13501b.onError(th);
                return;
            }
            this.f13501b.onError(th);
            this.f13505f.dispose();
            a();
        }

        public void onNext(T t) {
            this.f13501b.onNext(t);
        }

        public void onSubscribe(b bVar) {
            if (c.p(this.f13505f, bVar)) {
                this.f13505f = bVar;
                this.f13501b.onSubscribe(this);
            }
        }
    }

    public e4(Callable<? extends D> callable, n<? super D, ? extends q<? extends T>> nVar, f<? super D> fVar, boolean z) {
        this.f13497b = callable;
        this.f13498c = nVar;
        this.f13499d = fVar;
        this.f13500e = z;
    }

    public void subscribeActual(s<? super T> sVar) {
        try {
            Object call = this.f13497b.call();
            try {
                Object apply = this.f13498c.apply(call);
                d.a.a0.b.b.e(apply, "The sourceSupplier returned a null ObservableSource");
                ((q) apply).subscribe(new a(sVar, call, this.f13499d, this.f13500e));
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
