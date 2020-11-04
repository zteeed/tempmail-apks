package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.a0.b.b;
import d.a.l;
import d.a.q;
import d.a.s;
import io.reactivex.exceptions.a;
import java.util.concurrent.Callable;

/* compiled from: ObservableDefer */
public final class e0<T> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final Callable<? extends q<? extends T>> f12923b;

    public e0(Callable<? extends q<? extends T>> callable) {
        this.f12923b = callable;
    }

    public void subscribeActual(s<? super T> sVar) {
        try {
            Object call = this.f12923b.call();
            b.e(call, "null ObservableSource supplied");
            ((q) call).subscribe(sVar);
        } catch (Throwable th) {
            a.b(th);
            d.m(th, sVar);
        }
    }
}
