package a.f.a.j;

import a.f.a.j.e;
import a.f.a.j.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Analyzer */
public class a {
    public static void a(g gVar) {
        if ((gVar.R0() & 32) != 32) {
            j(gVar);
            return;
        }
        gVar.D0 = true;
        gVar.x0 = false;
        gVar.y0 = false;
        gVar.z0 = false;
        ArrayList<f> arrayList = gVar.k0;
        List<h> list = gVar.w0;
        boolean z = gVar.s() == f.b.WRAP_CONTENT;
        boolean z2 = gVar.B() == f.b.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (f next : arrayList) {
            next.p = null;
            next.d0 = false;
            next.S();
        }
        for (f next2 : arrayList) {
            if (next2.p == null && !b(next2, list, z3)) {
                j(gVar);
                gVar.D0 = false;
                return;
            }
        }
        int i = 0;
        int i2 = 0;
        for (h next3 : list) {
            i = Math.max(i, c(next3, 0));
            i2 = Math.max(i2, c(next3, 1));
        }
        if (z) {
            gVar.g0(f.b.FIXED);
            gVar.y0(i);
            gVar.x0 = true;
            gVar.y0 = true;
            gVar.A0 = i;
        }
        if (z2) {
            gVar.u0(f.b.FIXED);
            gVar.b0(i2);
            gVar.x0 = true;
            gVar.z0 = true;
            gVar.B0 = i2;
        }
        i(list, 0, gVar.D());
        i(list, 1, gVar.r());
    }

    private static boolean b(f fVar, List<h> list, boolean z) {
        h hVar = new h(new ArrayList(), true);
        list.add(hVar);
        return k(fVar, hVar, list, z);
    }

    private static int c(h hVar, int i) {
        int i2 = i * 2;
        List<f> b2 = hVar.b(i);
        int size = b2.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            f fVar = b2.get(i4);
            e[] eVarArr = fVar.A;
            int i5 = i2 + 1;
            i3 = Math.max(i3, d(fVar, i, eVarArr[i5].f198d == null || !(eVarArr[i2].f198d == null || eVarArr[i5].f198d == null), 0));
        }
        hVar.f231e[i] = i3;
        return i3;
    }

    private static int d(f fVar, int i, boolean z, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int D;
        int i8;
        int i9;
        int i10;
        f fVar2 = fVar;
        int i11 = i;
        boolean z2 = z;
        int i12 = 0;
        if (!fVar2.b0) {
            return 0;
        }
        boolean z3 = fVar2.w.f198d != null && i11 == 1;
        if (z2) {
            i6 = fVar.j();
            i5 = fVar.r() - fVar.j();
            i4 = i11 * 2;
            i3 = i4 + 1;
        } else {
            i6 = fVar.r() - fVar.j();
            i5 = fVar.j();
            i3 = i11 * 2;
            i4 = i3 + 1;
        }
        e[] eVarArr = fVar2.A;
        if (eVarArr[i3].f198d == null || eVarArr[i4].f198d != null) {
            i7 = 1;
        } else {
            i7 = -1;
            int i13 = i3;
            i3 = i4;
            i4 = i13;
        }
        int i14 = z3 ? i2 - i6 : i2;
        int d2 = (fVar2.A[i4].d() * i7) + e(fVar, i);
        int i15 = i14 + d2;
        int D2 = (i11 == 0 ? fVar.D() : fVar.r()) * i7;
        Iterator<n> it = fVar2.A[i4].f().f240a.iterator();
        while (it.hasNext()) {
            i12 = Math.max(i12, d(((l) it.next()).f235c.f196b, i11, z2, i15));
        }
        int i16 = 0;
        for (Iterator<n> it2 = fVar2.A[i3].f().f240a.iterator(); it2.hasNext(); it2 = it2) {
            i16 = Math.max(i16, d(((l) it2.next()).f235c.f196b, i11, z2, D2 + i15));
        }
        if (z3) {
            i12 -= i6;
            D = i16 + i5;
        } else {
            D = i16 + ((i11 == 0 ? fVar.D() : fVar.r()) * i7);
        }
        int i17 = 1;
        if (i11 == 1) {
            Iterator<n> it3 = fVar2.w.f().f240a.iterator();
            int i18 = 0;
            while (it3.hasNext()) {
                Iterator<n> it4 = it3;
                l lVar = (l) it3.next();
                if (i7 == i17) {
                    i18 = Math.max(i18, d(lVar.f235c.f196b, i11, z2, i6 + i15));
                    i10 = i3;
                } else {
                    i10 = i3;
                    i18 = Math.max(i18, d(lVar.f235c.f196b, i11, z2, (i5 * i7) + i15));
                }
                it3 = it4;
                i3 = i10;
                i17 = 1;
            }
            i8 = i3;
            int i19 = i18;
            i9 = (fVar2.w.f().f240a.size() <= 0 || z3) ? i19 : i7 == 1 ? i19 + i6 : i19 - i5;
        } else {
            i8 = i3;
            i9 = 0;
        }
        int max = d2 + Math.max(i12, Math.max(D, i9));
        int i20 = D2 + i15;
        if (i7 == -1) {
            int i21 = i20;
            i20 = i15;
            i15 = i21;
        }
        if (z2) {
            k.e(fVar2, i11, i15);
            fVar2.Z(i15, i20, i11);
        } else {
            fVar2.p.a(fVar2, i11);
            fVar2.q0(i15, i11);
        }
        if (fVar.o(i) == f.b.MATCH_CONSTRAINT && fVar2.G != 0.0f) {
            fVar2.p.a(fVar2, i11);
        }
        e[] eVarArr2 = fVar2.A;
        if (!(eVarArr2[i4].f198d == null || eVarArr2[i8].f198d == null)) {
            f u = fVar.u();
            e[] eVarArr3 = fVar2.A;
            if (eVarArr3[i4].f198d.f196b == u && eVarArr3[i8].f198d.f196b == u) {
                fVar2.p.a(fVar2, i11);
            }
        }
        return max;
    }

    private static int e(f fVar, int i) {
        f fVar2;
        e eVar;
        int i2 = i * 2;
        e[] eVarArr = fVar.A;
        e eVar2 = eVarArr[i2];
        e eVar3 = eVarArr[i2 + 1];
        e eVar4 = eVar2.f198d;
        if (eVar4 == null || eVar4.f196b != (fVar2 = fVar.D) || (eVar = eVar3.f198d) == null || eVar.f196b != fVar2) {
            return 0;
        }
        return (int) (((float) (((fVar2.t(i) - eVar2.d()) - eVar3.d()) - fVar.t(i))) * (i == 0 ? fVar.V : fVar.W));
    }

    private static void f(g gVar, f fVar, h hVar) {
        hVar.f230d = false;
        gVar.D0 = false;
        fVar.b0 = false;
    }

    private static int g(f fVar) {
        float f2;
        float f3;
        if (fVar.s() == f.b.MATCH_CONSTRAINT) {
            if (fVar.H == 0) {
                f3 = ((float) fVar.r()) * fVar.G;
            } else {
                f3 = ((float) fVar.r()) / fVar.G;
            }
            int i = (int) f3;
            fVar.y0(i);
            return i;
        } else if (fVar.B() != f.b.MATCH_CONSTRAINT) {
            return -1;
        } else {
            if (fVar.H == 1) {
                f2 = ((float) fVar.D()) * fVar.G;
            } else {
                f2 = ((float) fVar.D()) / fVar.G;
            }
            int i2 = (int) f2;
            fVar.b0(i2);
            return i2;
        }
    }

    private static void h(e eVar) {
        l f2 = eVar.f();
        e eVar2 = eVar.f198d;
        if (eVar2 != null && eVar2.f198d != eVar) {
            eVar2.f().a(f2);
        }
    }

    public static void i(List<h> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (f next : list.get(i3).c(i)) {
                if (next.b0) {
                    l(next, i, i2);
                }
            }
        }
    }

    private static void j(g gVar) {
        gVar.w0.clear();
        gVar.w0.add(0, new h(gVar.k0));
    }

    private static boolean k(f fVar, h hVar, List<h> list, boolean z) {
        e eVar;
        e eVar2;
        e eVar3;
        f fVar2;
        e eVar4;
        e eVar5;
        e eVar6;
        e eVar7;
        f fVar3;
        e eVar8;
        if (fVar == null) {
            return true;
        }
        fVar.c0 = false;
        g gVar = (g) fVar.u();
        h hVar2 = fVar.p;
        if (hVar2 == null) {
            fVar.b0 = true;
            hVar.f227a.add(fVar);
            fVar.p = hVar;
            if (fVar.s.f198d == null && fVar.u.f198d == null && fVar.t.f198d == null && fVar.v.f198d == null && fVar.w.f198d == null && fVar.z.f198d == null) {
                f(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
            }
            if (!(fVar.t.f198d == null || fVar.v.f198d == null)) {
                f.b B = gVar.B();
                f.b bVar = f.b.WRAP_CONTENT;
                if (z) {
                    f(gVar, fVar, hVar);
                    return false;
                } else if (!(fVar.t.f198d.f196b == fVar.u() && fVar.v.f198d.f196b == fVar.u())) {
                    f(gVar, fVar, hVar);
                }
            }
            if (!(fVar.s.f198d == null || fVar.u.f198d == null)) {
                f.b s = gVar.s();
                f.b bVar2 = f.b.WRAP_CONTENT;
                if (z) {
                    f(gVar, fVar, hVar);
                    return false;
                } else if (!(fVar.s.f198d.f196b == fVar.u() && fVar.u.f198d.f196b == fVar.u())) {
                    f(gVar, fVar, hVar);
                }
            }
            if (((fVar.s() == f.b.MATCH_CONSTRAINT) ^ (fVar.B() == f.b.MATCH_CONSTRAINT)) && fVar.G != 0.0f) {
                g(fVar);
            } else if (fVar.s() == f.b.MATCH_CONSTRAINT || fVar.B() == f.b.MATCH_CONSTRAINT) {
                f(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
            }
            if (((fVar.s.f198d == null && fVar.u.f198d == null) || (((eVar5 = fVar.s.f198d) != null && eVar5.f196b == fVar.D && fVar.u.f198d == null) || (((eVar6 = fVar.u.f198d) != null && eVar6.f196b == fVar.D && fVar.s.f198d == null) || ((eVar7 = fVar.s.f198d) != null && eVar7.f196b == (fVar3 = fVar.D) && (eVar8 = fVar.u.f198d) != null && eVar8.f196b == fVar3)))) && fVar.z.f198d == null && !(fVar instanceof i) && !(fVar instanceof j)) {
                hVar.f232f.add(fVar);
            }
            if (((fVar.t.f198d == null && fVar.v.f198d == null) || (((eVar = fVar.t.f198d) != null && eVar.f196b == fVar.D && fVar.v.f198d == null) || (((eVar2 = fVar.v.f198d) != null && eVar2.f196b == fVar.D && fVar.t.f198d == null) || ((eVar3 = fVar.t.f198d) != null && eVar3.f196b == (fVar2 = fVar.D) && (eVar4 = fVar.v.f198d) != null && eVar4.f196b == fVar2)))) && fVar.z.f198d == null && fVar.w.f198d == null && !(fVar instanceof i) && !(fVar instanceof j)) {
                hVar.g.add(fVar);
            }
            if (fVar instanceof j) {
                f(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
                j jVar = (j) fVar;
                for (int i = 0; i < jVar.l0; i++) {
                    if (!k(jVar.k0[i], hVar, list, z)) {
                        return false;
                    }
                }
            }
            for (e eVar9 : fVar.A) {
                e eVar10 = eVar9.f198d;
                if (!(eVar10 == null || eVar10.f196b == fVar.u())) {
                    if (eVar9.f197c == e.d.CENTER) {
                        f(gVar, fVar, hVar);
                        if (z) {
                            return false;
                        }
                    } else {
                        h(eVar9);
                    }
                    if (!k(eVar9.f198d.f196b, hVar, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (hVar2 != hVar) {
            hVar.f227a.addAll(hVar2.f227a);
            hVar.f232f.addAll(fVar.p.f232f);
            hVar.g.addAll(fVar.p.g);
            if (!fVar.p.f230d) {
                hVar.f230d = false;
            }
            list.remove(fVar.p);
            for (f fVar4 : fVar.p.f227a) {
                fVar4.p = hVar;
            }
        }
        return true;
    }

    private static void l(f fVar, int i, int i2) {
        int i3 = i * 2;
        e[] eVarArr = fVar.A;
        e eVar = eVarArr[i3];
        e eVar2 = eVarArr[i3 + 1];
        if ((eVar.f198d == null || eVar2.f198d == null) ? false : true) {
            k.e(fVar, i, e(fVar, i) + eVar.d());
        } else if (fVar.G == 0.0f || fVar.o(i) != f.b.MATCH_CONSTRAINT) {
            int v = i2 - fVar.v(i);
            int t = v - fVar.t(i);
            fVar.Z(t, v, i);
            k.e(fVar, i, t);
        } else {
            int g = g(fVar);
            int i4 = (int) fVar.A[i3].f().g;
            eVar2.f().f238f = eVar.f();
            eVar2.f().g = (float) g;
            eVar2.f().f241b = 1;
            fVar.Z(i4, i4 + g, i);
        }
    }
}
