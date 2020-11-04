package androidx.lifecycle;

import androidx.lifecycle.g;

class CompositeGeneratedAdaptersObserver implements i {

    /* renamed from: a  reason: collision with root package name */
    private final e[] f1636a;

    CompositeGeneratedAdaptersObserver(e[] eVarArr) {
        this.f1636a = eVarArr;
    }

    public void c(k kVar, g.a aVar) {
        o oVar = new o();
        for (e a2 : this.f1636a) {
            a2.a(kVar, aVar, false, oVar);
        }
        for (e a3 : this.f1636a) {
            a3.a(kVar, aVar, true, oVar);
        }
    }
}
