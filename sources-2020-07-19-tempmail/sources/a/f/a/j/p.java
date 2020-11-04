package a.f.a.j;

import a.f.a.c;
import java.util.ArrayList;

/* compiled from: WidgetContainer */
public class p extends f {
    protected ArrayList<f> k0 = new ArrayList<>();

    public void F0() {
        super.F0();
        ArrayList<f> arrayList = this.k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                f fVar = this.k0.get(i);
                fVar.n0(p(), q());
                if (!(fVar instanceof g)) {
                    fVar.F0();
                }
            }
        }
    }

    public void I0(f fVar) {
        this.k0.add(fVar);
        if (fVar.u() != null) {
            ((p) fVar.u()).L0(fVar);
        }
        fVar.p0(this);
    }

    public g J0() {
        f u = u();
        g gVar = this instanceof g ? (g) this : null;
        while (u != null) {
            f u2 = u.u();
            if (u instanceof g) {
                gVar = (g) u;
            }
            u = u2;
        }
        return gVar;
    }

    public void K0() {
        F0();
        ArrayList<f> arrayList = this.k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                f fVar = this.k0.get(i);
                if (fVar instanceof p) {
                    ((p) fVar).K0();
                }
            }
        }
    }

    public void L0(f fVar) {
        this.k0.remove(fVar);
        fVar.p0((f) null);
    }

    public void M0() {
        this.k0.clear();
    }

    public void Q() {
        this.k0.clear();
        super.Q();
    }

    public void T(c cVar) {
        super.T(cVar);
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            this.k0.get(i).T(cVar);
        }
    }

    public void n0(int i, int i2) {
        super.n0(i, i2);
        int size = this.k0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.k0.get(i3).n0(z(), A());
        }
    }
}
