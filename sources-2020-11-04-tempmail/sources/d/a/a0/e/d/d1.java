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
    final Future<? extends T> f13458b;

    /* renamed from: c  reason: collision with root package name */
    final long f13459c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f13460d;

    public d1(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f13458b = future;
        this.f13459c = j;
        this.f13460d = timeUnit;
    }

    public void subscribeActual(s<? super T> sVar) {
        i iVar = new i(sVar);
        sVar.onSubscribe(iVar);
        if (!iVar.d()) {
            try {
                Object obj = this.f13460d != null ? this.f13458b.get(this.f13459c, this.f13460d) : this.f13458b.get();
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
