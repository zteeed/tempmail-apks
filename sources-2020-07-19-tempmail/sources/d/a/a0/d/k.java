package d.a.a0.d;

import d.a.a0.a.c;
import d.a.s;
import d.a.y.b;
import d.a.z.a;
import d.a.z.f;
import d.a.z.o;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ForEachWhileObserver */
public final class k<T> extends AtomicReference<b> implements s<T>, b {
    private static final long serialVersionUID = -4403180040475402120L;

    /* renamed from: b  reason: collision with root package name */
    final o<? super T> f12674b;

    /* renamed from: c  reason: collision with root package name */
    final f<? super Throwable> f12675c;

    /* renamed from: d  reason: collision with root package name */
    final a f12676d;

    /* renamed from: e  reason: collision with root package name */
    boolean f12677e;

    public k(o<? super T> oVar, f<? super Throwable> fVar, a aVar) {
        this.f12674b = oVar;
        this.f12675c = fVar;
        this.f12676d = aVar;
    }

    public void dispose() {
        c.f(this);
    }

    public void onComplete() {
        if (!this.f12677e) {
            this.f12677e = true;
            try {
                this.f12676d.run();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                d.a.d0.a.s(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f12677e) {
            d.a.d0.a.s(th);
            return;
        }
        this.f12677e = true;
        try {
            this.f12675c.a(th);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            d.a.d0.a.s(new CompositeException(th, th2));
        }
    }

    public void onNext(T t) {
        if (!this.f12677e) {
            try {
                if (!this.f12674b.a(t)) {
                    dispose();
                    onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                dispose();
                onError(th);
            }
        }
    }

    public void onSubscribe(b bVar) {
        c.n(this, bVar);
    }
}
