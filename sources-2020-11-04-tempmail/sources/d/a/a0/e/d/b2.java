package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.l;
import d.a.s;

/* compiled from: ObservableNever */
public final class b2 extends l<Object> {

    /* renamed from: b  reason: collision with root package name */
    public static final l<Object> f13380b = new b2();

    private b2() {
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super Object> sVar) {
        sVar.onSubscribe(d.NEVER);
    }
}
