package d.a;

import d.a.d0.a;

/* compiled from: Completable */
public abstract class b implements d {
    private static NullPointerException d(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    public final void b(c cVar) {
        d.a.a0.b.b.e(cVar, "observer is null");
        try {
            c v = a.v(this, cVar);
            d.a.a0.b.b.e(v, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            c(v);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            a.s(th);
            throw d(th);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c(c cVar);
}
