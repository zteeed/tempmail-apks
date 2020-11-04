package a.f.a;

import a.f.a.e;
import a.f.a.i;

/* compiled from: ArrayRow */
public class b implements e.a {

    /* renamed from: a  reason: collision with root package name */
    i f155a = null;

    /* renamed from: b  reason: collision with root package name */
    float f156b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    boolean f157c;

    /* renamed from: d  reason: collision with root package name */
    public final a f158d;

    /* renamed from: e  reason: collision with root package name */
    boolean f159e = false;

    public b(c cVar) {
        this.f158d = new a(this, cVar);
    }

    public void a(i iVar) {
        int i = iVar.f180d;
        float f2 = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f2 = 1000.0f;
            } else if (i == 3) {
                f2 = 1000000.0f;
            } else if (i == 4) {
                f2 = 1.0E9f;
            } else if (i == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f158d.l(iVar, f2);
    }

    public i b(e eVar, boolean[] zArr) {
        return this.f158d.g(zArr, (i) null);
    }

    public void c(e.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f155a = null;
            this.f158d.c();
            int i = 0;
            while (true) {
                a aVar2 = bVar.f158d;
                if (i < aVar2.f149a) {
                    this.f158d.a(aVar2.h(i), bVar.f158d.i(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void clear() {
        this.f158d.c();
        this.f155a = null;
        this.f156b = 0.0f;
    }

    public b d(e eVar, int i) {
        this.f158d.l(eVar.p(i, "ep"), 1.0f);
        this.f158d.l(eVar.p(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public b e(i iVar, int i) {
        this.f158d.l(iVar, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean f(e eVar) {
        boolean z;
        i b2 = this.f158d.b(eVar);
        if (b2 == null) {
            z = true;
        } else {
            v(b2);
            z = false;
        }
        if (this.f158d.f149a == 0) {
            this.f159e = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public b g(i iVar, i iVar2, int i, float f2, i iVar3, i iVar4, int i2) {
        if (iVar2 == iVar3) {
            this.f158d.l(iVar, 1.0f);
            this.f158d.l(iVar4, 1.0f);
            this.f158d.l(iVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f158d.l(iVar, 1.0f);
            this.f158d.l(iVar2, -1.0f);
            this.f158d.l(iVar3, -1.0f);
            this.f158d.l(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f156b = (float) ((-i) + i2);
            }
        } else if (f2 <= 0.0f) {
            this.f158d.l(iVar, -1.0f);
            this.f158d.l(iVar2, 1.0f);
            this.f156b = (float) i;
        } else if (f2 >= 1.0f) {
            this.f158d.l(iVar3, -1.0f);
            this.f158d.l(iVar4, 1.0f);
            this.f156b = (float) i2;
        } else {
            float f3 = 1.0f - f2;
            this.f158d.l(iVar, f3 * 1.0f);
            this.f158d.l(iVar2, f3 * -1.0f);
            this.f158d.l(iVar3, -1.0f * f2);
            this.f158d.l(iVar4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                this.f156b = (((float) (-i)) * f3) + (((float) i2) * f2);
            }
        }
        return this;
    }

    public i getKey() {
        return this.f155a;
    }

    /* access modifiers changed from: package-private */
    public b h(i iVar, int i) {
        this.f155a = iVar;
        float f2 = (float) i;
        iVar.f181e = f2;
        this.f156b = f2;
        this.f159e = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    public b i(i iVar, i iVar2, i iVar3, float f2) {
        this.f158d.l(iVar, -1.0f);
        this.f158d.l(iVar2, 1.0f - f2);
        this.f158d.l(iVar3, f2);
        return this;
    }

    public b j(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f158d.l(iVar, -1.0f);
        this.f158d.l(iVar2, 1.0f);
        this.f158d.l(iVar3, f2);
        this.f158d.l(iVar4, -f2);
        return this;
    }

    public b k(float f2, float f3, float f4, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f156b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f158d.l(iVar, 1.0f);
            this.f158d.l(iVar2, -1.0f);
            this.f158d.l(iVar4, 1.0f);
            this.f158d.l(iVar3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f158d.l(iVar, 1.0f);
            this.f158d.l(iVar2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f158d.l(iVar3, 1.0f);
            this.f158d.l(iVar4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f158d.l(iVar, 1.0f);
            this.f158d.l(iVar2, -1.0f);
            this.f158d.l(iVar4, f5);
            this.f158d.l(iVar3, -f5);
        }
        return this;
    }

    public b l(i iVar, int i) {
        if (i < 0) {
            this.f156b = (float) (i * -1);
            this.f158d.l(iVar, 1.0f);
        } else {
            this.f156b = (float) i;
            this.f158d.l(iVar, -1.0f);
        }
        return this;
    }

    public b m(i iVar, i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f156b = (float) i;
        }
        if (!z) {
            this.f158d.l(iVar, -1.0f);
            this.f158d.l(iVar2, 1.0f);
        } else {
            this.f158d.l(iVar, 1.0f);
            this.f158d.l(iVar2, -1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f156b = (float) i;
        }
        if (!z) {
            this.f158d.l(iVar, -1.0f);
            this.f158d.l(iVar2, 1.0f);
            this.f158d.l(iVar3, 1.0f);
        } else {
            this.f158d.l(iVar, 1.0f);
            this.f158d.l(iVar2, -1.0f);
            this.f158d.l(iVar3, -1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f156b = (float) i;
        }
        if (!z) {
            this.f158d.l(iVar, -1.0f);
            this.f158d.l(iVar2, 1.0f);
            this.f158d.l(iVar3, -1.0f);
        } else {
            this.f158d.l(iVar, 1.0f);
            this.f158d.l(iVar2, -1.0f);
            this.f158d.l(iVar3, 1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f158d.l(iVar3, 0.5f);
        this.f158d.l(iVar4, 0.5f);
        this.f158d.l(iVar, -0.5f);
        this.f158d.l(iVar2, -0.5f);
        this.f156b = -f2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        float f2 = this.f156b;
        if (f2 < 0.0f) {
            this.f156b = f2 * -1.0f;
            this.f158d.j();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        i iVar = this.f155a;
        return iVar != null && (iVar.g == i.a.UNRESTRICTED || this.f156b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    public boolean s(i iVar) {
        return this.f158d.d(iVar);
    }

    public boolean t() {
        return this.f155a == null && this.f156b == 0.0f && this.f158d.f149a == 0;
    }

    public String toString() {
        return x();
    }

    /* access modifiers changed from: package-private */
    public i u(i iVar) {
        return this.f158d.g((boolean[]) null, iVar);
    }

    /* access modifiers changed from: package-private */
    public void v(i iVar) {
        i iVar2 = this.f155a;
        if (iVar2 != null) {
            this.f158d.l(iVar2, -1.0f);
            this.f155a = null;
        }
        float m = this.f158d.m(iVar, true) * -1.0f;
        this.f155a = iVar;
        if (m != 1.0f) {
            this.f156b /= m;
            this.f158d.e(m);
        }
    }

    public void w() {
        this.f155a = null;
        this.f158d.c();
        this.f156b = 0.0f;
        this.f159e = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String x() {
        /*
            r10 = this;
            a.f.a.i r0 = r10.f155a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            a.f.a.i r1 = r10.f155a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f156b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f156b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            a.f.a.a r5 = r10.f158d
            int r5 = r5.f149a
        L_0x005b:
            if (r2 >= r5) goto L_0x00ea
            a.f.a.a r6 = r10.f158d
            a.f.a.i r6 = r6.h(r2)
            if (r6 != 0) goto L_0x0067
            goto L_0x00e6
        L_0x0067:
            a.f.a.a r7 = r10.f158d
            float r7 = r7.i(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0073
            goto L_0x00e6
        L_0x0073:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0091
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b6
        L_0x0091:
            if (r8 <= 0) goto L_0x00a5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b8
        L_0x00a5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00b6:
            float r7 = r7 * r9
        L_0x00b8:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00ce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e5
        L_0x00ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e5:
            r1 = 1
        L_0x00e6:
            int r2 = r2 + 1
            goto L_0x005b
        L_0x00ea:
            if (r1 != 0) goto L_0x00fd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00fd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.b.x():java.lang.String");
    }
}
