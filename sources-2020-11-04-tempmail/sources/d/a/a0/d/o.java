package d.a.a0.d;

import d.a.a0.a.c;
import d.a.s;
import d.a.y.b;
import d.a.z.a;
import d.a.z.f;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LambdaObserver */
public final class o<T> extends AtomicReference<b> implements s<T>, b {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: b  reason: collision with root package name */
    final f<? super T> f13244b;

    /* renamed from: c  reason: collision with root package name */
    final f<? super Throwable> f13245c;

    /* renamed from: d  reason: collision with root package name */
    final a f13246d;

    /* renamed from: e  reason: collision with root package name */
    final f<? super b> f13247e;

    public o(f<? super T> fVar, f<? super Throwable> fVar2, a aVar, f<? super b> fVar3) {
        this.f13244b = fVar;
        this.f13245c = fVar2;
        this.f13246d = aVar;
        this.f13247e = fVar3;
    }

    public boolean a() {
        return get() == c.DISPOSED;
    }

    public void dispose() {
        c.f(this);
    }

    public void onComplete() {
        if (!a()) {
            lazySet(c.DISPOSED);
            try {
                this.f13246d.run();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                d.a.d0.a.s(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (!a()) {
            lazySet(c.DISPOSED);
            try {
                this.f13245c.a(th);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                d.a.d0.a.s(new CompositeException(th, th2));
            }
        } else {
            d.a.d0.a.s(th);
        }
    }

    public void onNext(T t) {
        if (!a()) {
            try {
                this.f13244b.a(t);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                ((b) get()).dispose();
                onError(th);
            }
        }
    }

    public void onSubscribe(b bVar) {
        if (c.n(this, bVar)) {
            try {
                this.f13247e.a(this);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                bVar.dispose();
                onError(th);
            }
        }
    }
}
