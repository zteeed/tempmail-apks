package d.a.a0.e.d;

import d.a.a0.c.d;
import d.a.a0.e.d.y2;
import d.a.l;
import d.a.s;

/* compiled from: ObservableJust */
public final class r1<T> extends l<T> implements d<T> {

    /* renamed from: b  reason: collision with root package name */
    private final T f14009b;

    public r1(T t) {
        this.f14009b = t;
    }

    public T call() {
        return this.f14009b;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        y2.a aVar = new y2.a(sVar, this.f14009b);
        sVar.onSubscribe(aVar);
        aVar.run();
    }
}
