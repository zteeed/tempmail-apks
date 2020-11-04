package d.a.a0.e.d;

import d.a.a0.d.j;
import d.a.l;
import d.a.s;
import d.a.y.b;
import d.a.z.a;
import d.a.z.f;

/* compiled from: ObservableDoOnLifecycle */
public final class o0<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    private final f<? super b> f13896c;

    /* renamed from: d  reason: collision with root package name */
    private final a f13897d;

    public o0(l<T> lVar, f<? super b> fVar, a aVar) {
        super(lVar);
        this.f13896c = fVar;
        this.f13897d = aVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new j(sVar, this.f13896c, this.f13897d));
    }
}
