package a.f.a.j;

import a.f.a.e;
import a.f.a.i;
import a.f.a.j.e;

/* compiled from: ResolutionAnchor */
public class l extends n {

    /* renamed from: c  reason: collision with root package name */
    e f234c;

    /* renamed from: d  reason: collision with root package name */
    l f235d;

    /* renamed from: e  reason: collision with root package name */
    float f236e;

    /* renamed from: f  reason: collision with root package name */
    l f237f;
    float g;
    int h = 0;
    private l i;
    private m j = null;
    private int k = 1;
    private m l = null;
    private int m = 1;

    public l(e eVar) {
        this.f234c = eVar;
    }

    public void e() {
        super.e();
        this.f235d = null;
        this.f236e = 0.0f;
        this.j = null;
        this.k = 1;
        this.l = null;
        this.m = 1;
        this.f237f = null;
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
        if (this.f240b != 1 && this.h != 4) {
            m mVar = this.j;
            if (mVar != null) {
                if (mVar.f240b == 1) {
                    this.f236e = ((float) this.k) * mVar.f238c;
                } else {
                    return;
                }
            }
            m mVar2 = this.l;
            if (mVar2 != null) {
                if (mVar2.f240b == 1) {
                    float f6 = mVar2.f238c;
                } else {
                    return;
                }
            }
            if (this.h == 1 && ((lVar7 = this.f235d) == null || lVar7.f240b == 1)) {
                l lVar8 = this.f235d;
                if (lVar8 == null) {
                    this.f237f = this;
                    this.g = this.f236e;
                } else {
                    this.f237f = lVar8.f237f;
                    this.g = lVar8.g + this.f236e;
                }
                b();
            } else if (this.h == 2 && (lVar4 = this.f235d) != null && lVar4.f240b == 1 && (lVar5 = this.i) != null && (lVar6 = lVar5.f235d) != null && lVar6.f240b == 1) {
                if (e.x() != null) {
                    e.x().v++;
                }
                this.f237f = this.f235d.f237f;
                l lVar9 = this.i;
                lVar9.f237f = lVar9.f235d.f237f;
                e.d dVar = this.f234c.f196c;
                int i2 = 0;
                if (!(dVar == e.d.RIGHT || dVar == e.d.BOTTOM)) {
                    z = false;
                }
                if (z) {
                    f3 = this.f235d.g;
                    f2 = this.i.f235d.g;
                } else {
                    f3 = this.i.f235d.g;
                    f2 = this.f235d.g;
                }
                float f7 = f3 - f2;
                e eVar = this.f234c;
                e.d dVar2 = eVar.f196c;
                if (dVar2 == e.d.LEFT || dVar2 == e.d.RIGHT) {
                    f5 = f7 - ((float) this.f234c.f195b.D());
                    f4 = this.f234c.f195b.V;
                } else {
                    f5 = f7 - ((float) eVar.f195b.r());
                    f4 = this.f234c.f195b.W;
                }
                int d2 = this.f234c.d();
                int d3 = this.i.f234c.d();
                if (this.f234c.i() == this.i.f234c.i()) {
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
                    lVar10.g = lVar10.f235d.g + f9 + (f10 * f4);
                    this.g = (this.f235d.g - f8) - (f10 * (1.0f - f4));
                } else {
                    this.g = this.f235d.g + f8 + (f10 * f4);
                    l lVar11 = this.i;
                    lVar11.g = (lVar11.f235d.g - f9) - (f10 * (1.0f - f4));
                }
                b();
                this.i.b();
            } else if (this.h == 3 && (lVar = this.f235d) != null && lVar.f240b == 1 && (lVar2 = this.i) != null && (lVar3 = lVar2.f235d) != null && lVar3.f240b == 1) {
                if (a.f.a.e.x() != null) {
                    a.f.a.e.x().w++;
                }
                l lVar12 = this.f235d;
                this.f237f = lVar12.f237f;
                l lVar13 = this.i;
                l lVar14 = lVar13.f235d;
                lVar13.f237f = lVar14.f237f;
                this.g = lVar12.g + this.f236e;
                lVar13.g = lVar14.g + lVar13.f236e;
                b();
                this.i.b();
            } else if (this.h == 5) {
                this.f234c.f195b.U();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(a.f.a.e eVar) {
        i g2 = this.f234c.g();
        l lVar = this.f237f;
        if (lVar == null) {
            eVar.f(g2, (int) (this.g + 0.5f));
        } else {
            eVar.e(g2, eVar.r(lVar.f234c), (int) (this.g + 0.5f), 6);
        }
    }

    public void h(int i2, l lVar, int i3) {
        this.h = i2;
        this.f235d = lVar;
        this.f236e = (float) i3;
        lVar.a(this);
    }

    public void i(l lVar, int i2) {
        this.f235d = lVar;
        this.f236e = (float) i2;
        lVar.a(this);
    }

    public void j(l lVar, int i2, m mVar) {
        this.f235d = lVar;
        lVar.a(this);
        this.j = mVar;
        this.k = i2;
        mVar.a(this);
    }

    public float k() {
        return this.g;
    }

    public void l(l lVar, float f2) {
        if (this.f240b == 0 || !(this.f237f == lVar || this.g == f2)) {
            this.f237f = lVar;
            this.g = f2;
            if (this.f240b == 1) {
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
        e i2 = this.f234c.i();
        if (i2 != null) {
            if (i2.i() == this.f234c) {
                this.h = 4;
                i2.f().h = 4;
            }
            int d2 = this.f234c.d();
            e.d dVar = this.f234c.f196c;
            if (dVar == e.d.RIGHT || dVar == e.d.BOTTOM) {
                d2 = -d2;
            }
            i(i2.f(), d2);
        }
    }

    public String toString() {
        if (this.f240b != 1) {
            return "{ " + this.f234c + " UNRESOLVED} type: " + m(this.h);
        } else if (this.f237f == this) {
            return "[" + this.f234c + ", RESOLVED: " + this.g + "]  type: " + m(this.h);
        } else {
            return "[" + this.f234c + ", RESOLVED: " + this.f237f + ":" + this.g + "] type: " + m(this.h);
        }
    }
}
