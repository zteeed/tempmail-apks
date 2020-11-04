package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.a0.b.b;
import d.a.l;
import d.a.s;
import io.reactivex.exceptions.a;
import java.util.concurrent.Callable;

/* compiled from: ObservableError */
public final class t0<T> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final Callable<? extends Throwable> f14091b;

    public t0(Callable<? extends Throwable> callable) {
        this.f14091b = callable;
    }

    public void subscribeActual(s<? super T> sVar) {
        try {
            Object call = this.f14091b.call();
            b.e(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) call;
        } catch (Throwable th) {
            th = th;
            a.b(th);
        }
        d.m(th, sVar);
    }
}
