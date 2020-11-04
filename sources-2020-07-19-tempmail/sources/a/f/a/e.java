package a.f.a;

import a.f.a.i;
import a.f.a.j.e;
import a.f.a.j.f;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: LinearSystem */
public class e {
    private static int p = 1000;
    public static f q;

    /* renamed from: a  reason: collision with root package name */
    int f163a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, i> f164b;

    /* renamed from: c  reason: collision with root package name */
    private a f165c;

    /* renamed from: d  reason: collision with root package name */
    private int f166d;

    /* renamed from: e  reason: collision with root package name */
    private int f167e;

    /* renamed from: f  reason: collision with root package name */
    b[] f168f;
    public boolean g;
    private boolean[] h;
    int i;
    int j;
    private int k;
    final c l;
    private i[] m;
    private int n;
    private final a o;

    /* compiled from: LinearSystem */
    interface a {
        void a(i iVar);

        i b(e eVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();
    }

    public e() {
        this.f163a = 0;
        this.f164b = null;
        this.f166d = 32;
        this.f167e = 32;
        this.f168f = null;
        this.g = false;
        this.h = new boolean[32];
        this.i = 1;
        this.j = 0;
        this.k = 32;
        this.m = new i[p];
        this.n = 0;
        this.f168f = new b[32];
        D();
        c cVar = new c();
        this.l = cVar;
        this.f165c = new d(cVar);
        this.o = new b(this.l);
    }

    private final int C(a aVar, boolean z) {
        f fVar = q;
        if (fVar != null) {
            fVar.h++;
        }
        for (int i2 = 0; i2 < this.i; i2++) {
            this.h[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            f fVar2 = q;
            if (fVar2 != null) {
                fVar2.i++;
            }
            i3++;
            if (i3 >= this.i * 2) {
                return i3;
            }
            if (aVar.getKey() != null) {
                this.h[aVar.getKey().f178b] = true;
            }
            i b2 = aVar.b(this, this.h);
            if (b2 != null) {
                boolean[] zArr = this.h;
                int i4 = b2.f178b;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (b2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.j; i6++) {
                    b bVar = this.f168f[i6];
                    if (bVar.f155a.g != i.a.UNRESTRICTED && !bVar.f159e && bVar.s(b2)) {
                        float f3 = bVar.f158d.f(b2);
                        if (f3 < 0.0f) {
                            float f4 = (-bVar.f156b) / f3;
                            if (f4 < f2) {
                                i5 = i6;
                                f2 = f4;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar2 = this.f168f[i5];
                    bVar2.f155a.f179c = -1;
                    f fVar3 = q;
                    if (fVar3 != null) {
                        fVar3.j++;
                    }
                    bVar2.v(b2);
                    i iVar = bVar2.f155a;
                    iVar.f179c = i5;
                    iVar.f(bVar2);
                }
            }
            z2 = true;
        }
        return i3;
    }

    private void D() {
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.f168f;
            if (i2 < bVarArr.length) {
                b bVar = bVarArr[i2];
                if (bVar != null) {
                    this.l.f160a.a(bVar);
                }
                this.f168f[i2] = null;
                i2++;
            } else {
                return;
            }
        }
    }

    private final void F(b bVar) {
        if (this.j > 0) {
            bVar.f158d.o(bVar, this.f168f);
            if (bVar.f158d.f149a == 0) {
                bVar.f159e = true;
            }
        }
    }

    private i a(i.a aVar, String str) {
        i b2 = this.l.f161b.b();
        if (b2 == null) {
            b2 = new i(aVar, str);
            b2.e(aVar, str);
        } else {
            b2.d();
            b2.e(aVar, str);
        }
        int i2 = this.n;
        int i3 = p;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            p = i4;
            this.m = (i[]) Arrays.copyOf(this.m, i4);
        }
        i[] iVarArr = this.m;
        int i5 = this.n;
        this.n = i5 + 1;
        iVarArr[i5] = b2;
        return b2;
    }

    private void g(b bVar) {
        bVar.d(this, 0);
    }

    private final void m(b bVar) {
        b[] bVarArr = this.f168f;
        int i2 = this.j;
        if (bVarArr[i2] != null) {
            this.l.f160a.a(bVarArr[i2]);
        }
        b[] bVarArr2 = this.f168f;
        int i3 = this.j;
        bVarArr2[i3] = bVar;
        i iVar = bVar.f155a;
        iVar.f179c = i3;
        this.j = i3 + 1;
        iVar.f(bVar);
    }

    private void o() {
        for (int i2 = 0; i2 < this.j; i2++) {
            b bVar = this.f168f[i2];
            bVar.f155a.f181e = bVar.f156b;
        }
    }

    public static b t(e eVar, i iVar, i iVar2, i iVar3, float f2, boolean z) {
        b s = eVar.s();
        if (z) {
            eVar.g(s);
        }
        s.i(iVar, iVar2, iVar3, f2);
        return s;
    }

    private int v(a aVar) throws Exception {
        float f2;
        boolean z;
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            if (i2 >= this.j) {
                z = false;
                break;
            }
            b[] bVarArr = this.f168f;
            if (bVarArr[i2].f155a.g != i.a.UNRESTRICTED && bVarArr[i2].f156b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            f fVar = q;
            if (fVar != null) {
                fVar.k++;
            }
            i3++;
            float f3 = Float.MAX_VALUE;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            int i7 = 0;
            while (i4 < this.j) {
                b bVar = this.f168f[i4];
                if (bVar.f155a.g != i.a.UNRESTRICTED && !bVar.f159e && bVar.f156b < f2) {
                    int i8 = 1;
                    while (i8 < this.i) {
                        i iVar = this.l.f162c[i8];
                        float f4 = bVar.f158d.f(iVar);
                        if (f4 > f2) {
                            for (int i9 = 0; i9 < 7; i9++) {
                                float f5 = iVar.f182f[i9] / f4;
                                if ((f5 < f3 && i9 == i7) || i9 > i7) {
                                    i6 = i8;
                                    i7 = i9;
                                    f3 = f5;
                                    i5 = i4;
                                }
                            }
                        }
                        i8++;
                        f2 = 0.0f;
                    }
                }
                i4++;
                f2 = 0.0f;
            }
            if (i5 != -1) {
                b bVar2 = this.f168f[i5];
                bVar2.f155a.f179c = -1;
                f fVar2 = q;
                if (fVar2 != null) {
                    fVar2.j++;
                }
                bVar2.v(this.l.f162c[i6]);
                i iVar2 = bVar2.f155a;
                iVar2.f179c = i5;
                iVar2.f(bVar2);
            } else {
                z2 = true;
            }
            if (i3 > this.i / 2) {
                z2 = true;
            }
            f2 = 0.0f;
        }
        return i3;
    }

    public static f x() {
        return q;
    }

    private void z() {
        int i2 = this.f166d * 2;
        this.f166d = i2;
        this.f168f = (b[]) Arrays.copyOf(this.f168f, i2);
        c cVar = this.l;
        cVar.f162c = (i[]) Arrays.copyOf(cVar.f162c, this.f166d);
        int i3 = this.f166d;
        this.h = new boolean[i3];
        this.f167e = i3;
        this.k = i3;
        f fVar = q;
        if (fVar != null) {
            fVar.f172d++;
            fVar.o = Math.max(fVar.o, (long) i3);
            f fVar2 = q;
            fVar2.A = fVar2.o;
        }
    }

    public void A() throws Exception {
        f fVar = q;
        if (fVar != null) {
            fVar.f173e++;
        }
        if (this.g) {
            f fVar2 = q;
            if (fVar2 != null) {
                fVar2.q++;
            }
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.j) {
                    z = true;
                    break;
                } else if (!this.f168f[i2].f159e) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                B(this.f165c);
                return;
            }
            f fVar3 = q;
            if (fVar3 != null) {
                fVar3.p++;
            }
            o();
            return;
        }
        B(this.f165c);
    }

    /* access modifiers changed from: package-private */
    public void B(a aVar) throws Exception {
        f fVar = q;
        if (fVar != null) {
            fVar.s++;
            fVar.t = Math.max(fVar.t, (long) this.i);
            f fVar2 = q;
            fVar2.u = Math.max(fVar2.u, (long) this.j);
        }
        F((b) aVar);
        v(aVar);
        C(aVar, false);
        o();
    }

    public void E() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.l;
            i[] iVarArr = cVar.f162c;
            if (i2 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i2];
            if (iVar != null) {
                iVar.d();
            }
            i2++;
        }
        cVar.f161b.c(this.m, this.n);
        this.n = 0;
        Arrays.fill(this.l.f162c, (Object) null);
        HashMap<String, i> hashMap = this.f164b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f163a = 0;
        this.f165c.clear();
        this.i = 1;
        for (int i3 = 0; i3 < this.j; i3++) {
            this.f168f[i3].f157c = false;
        }
        D();
        this.j = 0;
    }

    public void b(f fVar, f fVar2, float f2, int i2) {
        f fVar3 = fVar;
        f fVar4 = fVar2;
        i r = r(fVar3.h(e.d.LEFT));
        i r2 = r(fVar3.h(e.d.TOP));
        i r3 = r(fVar3.h(e.d.RIGHT));
        i r4 = r(fVar3.h(e.d.BOTTOM));
        i r5 = r(fVar4.h(e.d.LEFT));
        i r6 = r(fVar4.h(e.d.TOP));
        i r7 = r(fVar4.h(e.d.RIGHT));
        i r8 = r(fVar4.h(e.d.BOTTOM));
        b s = s();
        double d2 = (double) f2;
        i iVar = r3;
        double d3 = (double) i2;
        s.p(r2, r4, r6, r8, (float) (Math.sin(d2) * d3));
        d(s);
        b s2 = s();
        s2.p(r, iVar, r5, r7, (float) (Math.cos(d2) * d3));
        d(s2);
    }

    public void c(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3, int i4) {
        int i5 = i4;
        b s = s();
        s.g(iVar, iVar2, i2, f2, iVar3, iVar4, i3);
        if (i5 != 6) {
            s.d(this, i5);
        }
        d(s);
    }

    public void d(b bVar) {
        i u;
        if (bVar != null) {
            f fVar = q;
            if (fVar != null) {
                fVar.f174f++;
                if (bVar.f159e) {
                    fVar.g++;
                }
            }
            boolean z = true;
            if (this.j + 1 >= this.k || this.i + 1 >= this.f167e) {
                z();
            }
            boolean z2 = false;
            if (!bVar.f159e) {
                F(bVar);
                if (!bVar.t()) {
                    bVar.q();
                    if (bVar.f(this)) {
                        i q2 = q();
                        bVar.f155a = q2;
                        m(bVar);
                        this.o.c(bVar);
                        C(this.o, true);
                        if (q2.f179c == -1) {
                            if (bVar.f155a == q2 && (u = bVar.u(q2)) != null) {
                                f fVar2 = q;
                                if (fVar2 != null) {
                                    fVar2.j++;
                                }
                                bVar.v(u);
                            }
                            if (!bVar.f159e) {
                                bVar.f155a.f(bVar);
                            }
                            this.j--;
                        }
                    } else {
                        z = false;
                    }
                    if (bVar.r()) {
                        z2 = z;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z2) {
                m(bVar);
            }
        }
    }

    public b e(i iVar, i iVar2, int i2, int i3) {
        b s = s();
        s.m(iVar, iVar2, i2);
        if (i3 != 6) {
            s.d(this, i3);
        }
        d(s);
        return s;
    }

    public void f(i iVar, int i2) {
        int i3 = iVar.f179c;
        if (i3 != -1) {
            b bVar = this.f168f[i3];
            if (bVar.f159e) {
                bVar.f156b = (float) i2;
            } else if (bVar.f158d.f149a == 0) {
                bVar.f159e = true;
                bVar.f156b = (float) i2;
            } else {
                b s = s();
                s.l(iVar, i2);
                d(s);
            }
        } else {
            b s2 = s();
            s2.h(iVar, i2);
            d(s2);
        }
    }

    public void h(i iVar, i iVar2, boolean z) {
        b s = s();
        i u = u();
        u.f180d = 0;
        s.n(iVar, iVar2, u, 0);
        if (z) {
            n(s, (int) (s.f158d.f(u) * -1.0f), 1);
        }
        d(s);
    }

    public void i(i iVar, i iVar2, int i2, int i3) {
        b s = s();
        i u = u();
        u.f180d = 0;
        s.n(iVar, iVar2, u, i2);
        if (i3 != 6) {
            n(s, (int) (s.f158d.f(u) * -1.0f), i3);
        }
        d(s);
    }

    public void j(i iVar, i iVar2, boolean z) {
        b s = s();
        i u = u();
        u.f180d = 0;
        s.o(iVar, iVar2, u, 0);
        if (z) {
            n(s, (int) (s.f158d.f(u) * -1.0f), 1);
        }
        d(s);
    }

    public void k(i iVar, i iVar2, int i2, int i3) {
        b s = s();
        i u = u();
        u.f180d = 0;
        s.o(iVar, iVar2, u, i2);
        if (i3 != 6) {
            n(s, (int) (s.f158d.f(u) * -1.0f), i3);
        }
        d(s);
    }

    public void l(i iVar, i iVar2, i iVar3, i iVar4, float f2, int i2) {
        b s = s();
        s.j(iVar, iVar2, iVar3, iVar4, f2);
        if (i2 != 6) {
            s.d(this, i2);
        }
        d(s);
    }

    /* access modifiers changed from: package-private */
    public void n(b bVar, int i2, int i3) {
        bVar.e(p(i3, (String) null), i2);
    }

    public i p(int i2, String str) {
        f fVar = q;
        if (fVar != null) {
            fVar.l++;
        }
        if (this.i + 1 >= this.f167e) {
            z();
        }
        i a2 = a(i.a.ERROR, str);
        int i3 = this.f163a + 1;
        this.f163a = i3;
        this.i++;
        a2.f178b = i3;
        a2.f180d = i2;
        this.l.f162c[i3] = a2;
        this.f165c.a(a2);
        return a2;
    }

    public i q() {
        f fVar = q;
        if (fVar != null) {
            fVar.n++;
        }
        if (this.i + 1 >= this.f167e) {
            z();
        }
        i a2 = a(i.a.SLACK, (String) null);
        int i2 = this.f163a + 1;
        this.f163a = i2;
        this.i++;
        a2.f178b = i2;
        this.l.f162c[i2] = a2;
        return a2;
    }

    public i r(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f167e) {
            z();
        }
        if (obj instanceof a.f.a.j.e) {
            a.f.a.j.e eVar = (a.f.a.j.e) obj;
            iVar = eVar.g();
            if (iVar == null) {
                eVar.n(this.l);
                iVar = eVar.g();
            }
            int i2 = iVar.f178b;
            if (i2 == -1 || i2 > this.f163a || this.l.f162c[i2] == null) {
                if (iVar.f178b != -1) {
                    iVar.d();
                }
                int i3 = this.f163a + 1;
                this.f163a = i3;
                this.i++;
                iVar.f178b = i3;
                iVar.g = i.a.UNRESTRICTED;
                this.l.f162c[i3] = iVar;
            }
        }
        return iVar;
    }

    public b s() {
        b b2 = this.l.f160a.b();
        if (b2 == null) {
            b2 = new b(this.l);
        } else {
            b2.w();
        }
        i.b();
        return b2;
    }

    public i u() {
        f fVar = q;
        if (fVar != null) {
            fVar.m++;
        }
        if (this.i + 1 >= this.f167e) {
            z();
        }
        i a2 = a(i.a.SLACK, (String) null);
        int i2 = this.f163a + 1;
        this.f163a = i2;
        this.i++;
        a2.f178b = i2;
        this.l.f162c[i2] = a2;
        return a2;
    }

    public c w() {
        return this.l;
    }

    public int y(Object obj) {
        i g2 = ((a.f.a.j.e) obj).g();
        if (g2 != null) {
            return (int) (g2.f181e + 0.5f);
        }
        return 0;
    }
}
