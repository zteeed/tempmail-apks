package d.a.a0.e.d;

import d.a.a0.b.b;
import d.a.a0.d.i;
import d.a.l;
import d.a.s;
import io.reactivex.exceptions.a;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: ObservableFromFuture */
public final class d1<T> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final Future<? extends T> f12900b;

    /* renamed from: c  reason: collision with root package name */
    final long f12901c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f12902d;

    public d1(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f12900b = future;
        this.f12901c = j;
        this.f12902d = timeUnit;
    }

    public void subscribeActual(s<? super T> sVar) {
        i iVar = new i(sVar);
        sVar.onSubscribe(iVar);
        if (!iVar.d()) {
            try {
                Object obj = this.f12902d != null ? this.f12900b.get(this.f12901c, this.f12902d) : this.f12900b.get();
                b.e(obj, "Future returned null");
                iVar.b(obj);
            } catch (Throwable th) {
                a.b(th);
                if (!iVar.d()) {
                    sVar.onError(th);
                }
            }
        }
    }
}
