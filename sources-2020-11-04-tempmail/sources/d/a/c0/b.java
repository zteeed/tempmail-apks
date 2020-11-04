package d.a.c0;

import d.a.a0.j.h;
import d.a.s;

/* compiled from: DefaultObserver */
public abstract class b<T> implements s<T> {

    /* renamed from: b  reason: collision with root package name */
    private d.a.y.b f14495b;

    /* access modifiers changed from: protected */
    public void a() {
    }

    public final void onSubscribe(d.a.y.b bVar) {
        if (h.d(this.f14495b, bVar, getClass())) {
            this.f14495b = bVar;
            a();
        }
    }
}
