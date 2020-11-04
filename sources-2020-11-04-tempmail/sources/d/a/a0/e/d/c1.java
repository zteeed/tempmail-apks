package d.a.a0.e.d;

import d.a.a0.b.b;
import d.a.a0.d.i;
import d.a.l;
import d.a.s;
import io.reactivex.exceptions.a;
import java.util.concurrent.Callable;

/* compiled from: ObservableFromCallable */
public final class c1<T> extends l<T> implements Callable<T> {

    /* renamed from: b  reason: collision with root package name */
    final Callable<? extends T> f13413b;

    public c1(Callable<? extends T> callable) {
        this.f13413b = callable;
    }

    public T call() throws Exception {
        T call = this.f13413b.call();
        b.e(call, "The callable returned a null value");
        return call;
    }

    public void subscribeActual(s<? super T> sVar) {
        i iVar = new i(sVar);
        sVar.onSubscribe(iVar);
        if (!iVar.d()) {
            try {
                Object call = this.f13413b.call();
                b.e(call, "Callable returned null");
                iVar.b(call);
            } catch (Throwable th) {
                a.b(th);
                if (!iVar.d()) {
                    sVar.onError(th);
                } else {
                    d.a.d0.a.s(th);
                }
            }
        }
    }
}
