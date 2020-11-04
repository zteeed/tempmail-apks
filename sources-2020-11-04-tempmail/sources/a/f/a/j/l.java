package a.f.a.j;

import a.f.a.e;
import a.f.a.i;
import a.f.a.j.e;

/* compiled from: ResolutionAnchor */
public class l extends n {

    /* renamed from: c  reason: collision with root package name */
    e f235c;

    /* renamed from: d  reason: collision with root package name */
    l f236d;

    /* renamed from: e  reason: collision with root package name */
    float f237e;

    /* renamed from: f  reason: collision with root package name */
    l f238f;
    float g;
    int h = 0;
    private l i;
    private m j = null;
    private int k = 1;
    private m l = null;
    private int m = 1;

    public l(e eVar) {
        this.f235c = eVar;
    }

    public void e() {
        super.e();
        this.f236d = null;
        this.f237e = 0.0f;
        this.j = null;
        this.k = 1;
        this.l = null;
        this.m = 1;
        this.f238f = null;
        this.g = 0.0f;
        this.i = null;
        this.h = 0;
    }

    public void f() {
        l lVar;
        l lVar2;
        l lVar3;
        l lVar4;
        l lVar5;
        l lVar6;
        float f2;
        float f3;
        float f4;
        float f5;
        l lVar7;
        boolean z = true;
        if (this.f241b != 1 && this.h != 4) {
            m mVar = this.j;
            if (mVar != null) {
                if (mVar.f241b == 1) {
                    this.f237e = ((float) this.k) * mVar.f239c;
                } else {
                    return;
                }
            }
            m mVar2 = this.l;
            if (mVar2 != null) {
                if (mVar2.f241b == 1) {
                    float f6 = mVar2.f239c;
                } else {
                    return;
                }
            }
            if (this.h == 1 && ((lVar7 = this.f236d) == null || lVar7.f241b == 1)) {
                l lVar8 = this.f236d;
                if (lVar8 == null) {
                    this.f238f = this;
                    this.g = this.f237e;
                } else {
                    this.f238f = lVar8.f238f;
                    this.g = lVar8.g + this.f237e;
                }
                b();
            } else if (this.h == 2 && (lVar4 = this.f236d) != null && lVar4.f241b == 1 && (lVar5 = this.i) != null && (lVar6 = lVar5.f236d) != null && lVar6.f241b == 1) {
                if (e.x() != null) {
                    e.x().v++;
                }
                this.f238f = this.f236d.f238f;
                l lVar9 = this.i;
                lVar9.f238f = lVar9.f236d.f238f;
                e.d dVar = this.f235c.f197c;
                int i2 = 0;
                if (!(dVar == e.d.RIGHT || dVar == e.d.BOTTOM)) {
                    z = false;
                }
                if (z) {
                    f3 = this.f236d.g;
                    f2 = this.i.f236d.g;
                } else {
                    f3 = this.i.f236d.g;
                    f2 = this.f236d.g;
                }
                float f7 = f3 - f2;
                e eVar = this.f235c;
                e.d dVar2 = eVar.f197c;
                if (dVar2 == e.d.LEFT || dVar2 == e.d.RIGHT) {
                    f5 = f7 - ((float) this.f235c.f196b.D());
                    f4 = this.f235c.f196b.V;
                } else {
                    f5 = f7 - ((float) eVar.f196b.r());
                    f4 = this.f235c.f196b.W;
                }
                int d2 = this.f235c.d();
                int d3 = this.i.f235c.d();
                if (this.f235c.i() == this.i.f235c.i()) {
                    f4 = 0.5f;
                    d3 = 0;
                } else {
                    i2 = d2;
                }
                float f8 = (float) i2;
                float f9 = (float) d3;
                float f10 = (f5 - f8) - f9;
                if (z) {
                    l lVar10 = this.i;
                    lVar10.g = lVar10.f236d.g + f9 + (f10 * f4);
                    this.g = (this.f236d.g - f8) - (f10 * (1.0f - f4));
                } else {
                    this.g = this.f236d.g + f8 + (f10 * f4);
                    l lVar11 = this.i;
                    lVar11.g = (lVar11.f236d.g - f9) - (f10 * (1.0f - f4));
                }
                b();
                this.i.b();
            } else if (this.h == 3 && (lVar = this.f236d) != null && lVar.f241b == 1 && (lVar2 = this.i) != null && (lVar3 = lVar2.f236d) != null && lVar3.f241b == 1) {
                if (a.f.a.e.x() != null) {
                    a.f.a.e.x().w++;
                }
                l lVar12 = this.f236d;
                this.f238f = lVar12.f238f;
                l lVar13 = this.i;
                l lVar14 = lVar13.f236d;
                lVar13.f238f = lVar14.f238f;
                this.g = lVar12.g + this.f237e;
                lVar13.g = lVar14.g + lVar13.f237e;
                b();
                this.i.b();
            } else if (this.h == 5) {
                this.f235c.f196b.U();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(a.f.a.e eVar) {
        i g2 = this.f235c.g();
        l lVar = this.f238f;
        if (lVar == null) {
            eVar.f(g2, (int) (this.g + 0.5f));
        } else {
            eVar.e(g2, eVar.r(lVar.f235c), (int) (this.g + 0.5f), 6);
        }
    }

    public void h(int i2, l lVar, int i3) {
        this.h = i2;
        this.f236d = lVar;
        this.f237e = (float) i3;
        lVar.a(this);
    }

    public void i(l lVar, int i2) {
        this.f236d = lVar;
        this.f237e = (float) i2;
        lVar.a(this);
    }

    public void j(l lVar, int i2, m mVar) {
        this.f236d = lVar;
        lVar.a(this);
        this.j = mVar;
        this.k = i2;
        mVar.a(this);
    }

    public float k() {
        return this.g;
    }

    public void l(l lVar, float f2) {
        if (this.f241b == 0 || !(this.f238f == lVar || this.g == f2)) {
            this.f238f = lVar;
            this.g = f2;
            if (this.f241b == 1) {
                c();
            }
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public String m(int i2) {
        return i2 == 1 ? "DIRECT" : i2 == 2 ? "CENTER" : i2 == 3 ? "MATCH" : i2 == 4 ? "CHAIN" : i2 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public void n(l lVar, float f2) {
        this.i = lVar;
    }

    public void o(l lVar, int i2, m mVar) {
        this.i = lVar;
        this.l = mVar;
        this.m = i2;
    }

    public void p(int i2) {
        this.h = i2;
    }

    public void q() {
        e i2 = this.f235c.i();
        if (i2 != null) {
            if (i2.i() == this.f235c) {
                this.h = 4;
                i2.f().h = 4;
            }
            int d2 = this.f235c.d();
            e.d dVar = this.f235c.f197c;
            if (dVar == e.d.RIGHT || dVar == e.d.BOTTOM) {
                d2 = -d2;
            }
            i(i2.f(), d2);
        }
    }

    public String toString() {
        if (this.f241b != 1) {
            return "{ " + this.f235c + " UNRESOLVED} type: " + m(this.h);
        } else if (this.f238f == this) {
            return "[" + this.f235c + ", RESOLVED: " + this.g + "]  type: " + m(this.h);
        } else {
            return "[" + this.f235c + ", RESOLVED: " + this.f238f + ":" + this.g + "] type: " + m(this.h);
        }
    }
}
