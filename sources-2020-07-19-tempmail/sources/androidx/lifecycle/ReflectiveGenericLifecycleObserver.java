package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.e;

class ReflectiveGenericLifecycleObserver implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1599a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0046a f1600b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1599a = obj;
        this.f1600b = a.f1602c.c(obj.getClass());
    }

    public void c(g gVar, e.a aVar) {
        this.f1600b.a(gVar, aVar, this.f1599a);
    }
}
