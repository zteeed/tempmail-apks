package d.a.a0.e.d;

import d.a.l;
import d.a.q;
import d.a.s;

/* compiled from: ObservableFromUnsafeSource */
public final class g1<T> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final q<T> f13013b;

    public g1(q<T> qVar) {
        this.f13013b = qVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f13013b.subscribe(sVar);
    }
}
