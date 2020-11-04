package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.g;

class ReflectiveGenericLifecycleObserver implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1654a;

    /* renamed from: b  reason: collision with root package name */
    private final b.a f1655b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1654a = obj;
        this.f1655b = b.f1663c.c(obj.getClass());
    }

    public void c(k kVar, g.a aVar) {
        this.f1655b.a(kVar, aVar, this.f1654a);
    }
}
