package d.a.a0.e.d;

import d.a.c0.e;
import d.a.l;
import d.a.s;

/* compiled from: ObservableSerialized */
public final class d3<T> extends a<T, T> {
    public d3(l<T> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new e(sVar));
    }
}
