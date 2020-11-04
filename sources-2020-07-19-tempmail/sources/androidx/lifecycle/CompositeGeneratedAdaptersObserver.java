package androidx.lifecycle;

import androidx.lifecycle.e;

public class CompositeGeneratedAdaptersObserver implements d {

    /* renamed from: a  reason: collision with root package name */
    private final c[] f1584a;

    CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.f1584a = cVarArr;
    }

    public void c(g gVar, e.a aVar) {
        k kVar = new k();
        for (c a2 : this.f1584a) {
            a2.a(gVar, aVar, false, kVar);
        }
        for (c a3 : this.f1584a) {
            a3.a(gVar, aVar, true, kVar);
        }
    }
}
