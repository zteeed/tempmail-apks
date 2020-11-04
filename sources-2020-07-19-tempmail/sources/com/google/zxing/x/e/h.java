package com.google.zxing.x.e;

import com.google.zxing.o;

/* compiled from: DetectionResultRowIndicatorColumn */
final class h extends g {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12008c;

    h(c cVar, boolean z) {
        super(cVar);
        this.f12008c = z;
    }

    private void h(a aVar) {
        c a2 = a();
        o h = this.f12008c ? a2.h() : a2.i();
        o b2 = this.f12008c ? a2.b() : a2.c();
        int e2 = e((int) b2.d());
        d[] d2 = d();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int e3 = e((int) h.d()); e3 < e2; e3++) {
            if (d2[e3] != null) {
                d dVar = d2[e3];
                dVar.j();
                int c2 = dVar.c() - i;
                if (c2 == 0) {
                    i2++;
                } else {
                    if (c2 == 1) {
                        i3 = Math.max(i3, i2);
                        i = dVar.c();
                    } else if (dVar.c() >= aVar.c()) {
                        d2[e3] = null;
                    } else {
                        i = dVar.c();
                    }
                    i2 = 1;
                }
            }
        }
    }

    private void l(d[] dVarArr, a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            d dVar = dVarArr[i];
            if (dVarArr[i] != null) {
                int e2 = dVar.e() % 30;
                int c2 = dVar.c();
                if (c2 > aVar.c()) {
                    dVarArr[i] = null;
                } else {
                    if (!this.f12008c) {
                        c2 += 2;
                    }
                    int i2 = c2 % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e2 + 1 != aVar.a()) {
                                dVarArr[i] = null;
                            }
                        } else if (e2 / 3 != aVar.b() || e2 % 3 != aVar.d()) {
                            dVarArr[i] = null;
                        }
                    } else if ((e2 * 3) + 1 != aVar.e()) {
                        dVarArr[i] = null;
                    }
                }
            }
        }
    }

    private void m() {
        for (d dVar : d()) {
            if (dVar != null) {
                dVar.j();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(a aVar) {
        d[] d2 = d();
        m();
        l(d2, aVar);
        c a2 = a();
        o h = this.f12008c ? a2.h() : a2.i();
        o b2 = this.f12008c ? a2.b() : a2.c();
        int e2 = e((int) h.d());
        int e3 = e((int) b2.d());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (e2 < e3) {
            if (d2[e2] != null) {
                d dVar = d2[e2];
                int c2 = dVar.c() - i;
                if (c2 == 0) {
                    i2++;
                } else {
                    if (c2 == 1) {
                        i3 = Math.max(i3, i2);
                        i = dVar.c();
                    } else if (c2 < 0 || dVar.c() >= aVar.c() || c2 > e2) {
                        d2[e2] = null;
                    } else {
                        if (i3 > 2) {
                            c2 *= i3 - 2;
                        }
                        boolean z = c2 >= e2;
                        for (int i4 = 1; i4 <= c2 && !z; i4++) {
                            z = d2[e2 - i4] != null;
                        }
                        if (z) {
                            d2[e2] = null;
                        } else {
                            i = dVar.c();
                        }
                    }
                    i2 = 1;
                }
            }
            e2++;
        }
    }

    /* access modifiers changed from: package-private */
    public a i() {
        d[] d2 = d();
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        for (d dVar : d2) {
            if (dVar != null) {
                dVar.j();
                int e2 = dVar.e() % 30;
                int c2 = dVar.c();
                if (!this.f12008c) {
                    c2 += 2;
                }
                int i = c2 % 3;
                if (i == 0) {
                    bVar2.b((e2 * 3) + 1);
                } else if (i == 1) {
                    bVar4.b(e2 / 3);
                    bVar3.b(e2 % 3);
                } else if (i == 2) {
                    bVar.b(e2 + 1);
                }
            }
        }
        if (bVar.a().length == 0 || bVar2.a().length == 0 || bVar3.a().length == 0 || bVar4.a().length == 0 || bVar.a()[0] <= 0 || bVar2.a()[0] + bVar3.a()[0] < 3 || bVar2.a()[0] + bVar3.a()[0] > 90) {
            return null;
        }
        a aVar = new a(bVar.a()[0], bVar2.a()[0], bVar3.a()[0], bVar4.a()[0]);
        l(d2, aVar);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public int[] j() {
        int c2;
        a i = i();
        if (i == null) {
            return null;
        }
        h(i);
        int c3 = i.c();
        int[] iArr = new int[c3];
        for (d dVar : d()) {
            if (dVar != null && (c2 = dVar.c()) < c3) {
                iArr[c2] = iArr[c2] + 1;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f12008c;
    }

    public String toString() {
        return "IsLeft: " + this.f12008c + 10 + super.toString();
    }
}
