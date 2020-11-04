package d.a;

import d.a.a0.b.b;
import d.a.a0.d.g;
import d.a.d0.a;

/* compiled from: Maybe */
public abstract class h<T> implements j<T> {
    public final void b(i<? super T> iVar) {
        b.e(iVar, "observer is null");
        i<? super Object> w = a.w(this, iVar);
        b.e(w, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            d(w);
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

    /* access modifiers changed from: protected */
    public abstract void d(i<? super T> iVar);
}
