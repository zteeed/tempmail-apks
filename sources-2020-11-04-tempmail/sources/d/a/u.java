package d.a;

import d.a.a0.b.b;
import d.a.a0.d.g;
import d.a.d0.a;
import d.a.z.n;

/* compiled from: Single */
public abstract class u<T> implements w<T> {
    public final void b(v<? super T> vVar) {
        b.e(vVar, "observer is null");
        v<? super Object> y = a.y(this, vVar);
        b.e(y, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            e(y);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final T c() {
        g gVar = new g();
        b(gVar);
        return gVar.a();
    }

    public final <R> u<R> d(n<? super T, ? extends R> nVar) {
        b.e(nVar, "mapper is null");
        return a.o(new d.a.a0.e.e.a(this, nVar));
    }

    /* access modifiers changed from: protected */
    public abstract void e(v<? super T> vVar);

    public final l<T> f() {
        if (this instanceof d.a.a0.c.a) {
            return ((d.a.a0.c.a) this).a();
        }
        return a.n(new d.a.a0.e.e.b(this));
    }
}
