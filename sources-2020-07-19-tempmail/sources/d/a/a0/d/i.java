package d.a.a0.d;

import d.a.d0.a;
import d.a.s;

/* compiled from: DeferredScalarDisposable */
public class i<T> extends b<T> {
    private static final long serialVersionUID = -5502432239815349361L;

    /* renamed from: b  reason: collision with root package name */
    protected final s<? super T> f12668b;

    /* renamed from: c  reason: collision with root package name */
    protected T f12669c;

    public i(s<? super T> sVar) {
        this.f12668b = sVar;
    }

    public final void a() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.f12668b.onComplete();
        }
    }

    public final void b(T t) {
        int i = get();
        if ((i & 54) == 0) {
            s<? super T> sVar = this.f12668b;
            if (i == 8) {
                this.f12669c = t;
                lazySet(16);
                sVar.onNext(null);
            } else {
                lazySet(2);
                sVar.onNext(t);
            }
            if (get() != 4) {
                sVar.onComplete();
            }
        }
    }

    public final void c(Throwable th) {
        if ((get() & 54) != 0) {
            a.s(th);
            return;
        }
        lazySet(2);
        this.f12668b.onError(th);
    }

    public final void clear() {
        lazySet(32);
        this.f12669c = null;
    }

    public final boolean d() {
        return get() == 4;
    }

    public void dispose() {
        set(4);
        this.f12669c = null;
    }

    public final int g(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.f12669c;
        this.f12669c = null;
        lazySet(32);
        return t;
    }
}
