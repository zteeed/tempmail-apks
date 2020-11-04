package com.google.zxing.y.d;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.d;
import com.google.zxing.o;
import com.google.zxing.p;
import com.google.zxing.t.b;
import com.google.zxing.t.g;
import com.google.zxing.t.i;
import com.google.zxing.t.k;
import com.google.zxing.t.m.a;
import com.google.zxing.y.c.j;
import java.util.Map;

/* compiled from: Detector */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f12101a;

    /* renamed from: b  reason: collision with root package name */
    private p f12102b;

    public c(b bVar) {
        this.f12101a = bVar;
    }

    private float b(o oVar, o oVar2) {
        float j = j((int) oVar.c(), (int) oVar.d(), (int) oVar2.c(), (int) oVar2.d());
        float j2 = j((int) oVar2.c(), (int) oVar2.d(), (int) oVar.c(), (int) oVar.d());
        if (Float.isNaN(j)) {
            return j2 / 7.0f;
        }
        return Float.isNaN(j2) ? j / 7.0f : (j + j2) / 14.0f;
    }

    private static int c(o oVar, o oVar2, o oVar3, float f2) throws NotFoundException {
        int c2 = ((a.c(o.b(oVar, oVar2) / f2) + a.c(o.b(oVar, oVar3) / f2)) / 2) + 7;
        int i = c2 & 3;
        if (i == 0) {
            return c2 + 1;
        }
        if (i == 2) {
            return c2 - 1;
        }
        if (i != 3) {
            return c2;
        }
        throw NotFoundException.a();
    }

    private static k d(o oVar, o oVar2, o oVar3, o oVar4, int i) {
        float f2;
        float f3;
        float f4;
        float f5 = ((float) i) - 3.5f;
        if (oVar4 != null) {
            f3 = oVar4.c();
            f2 = oVar4.d();
            f4 = f5 - 3.0f;
        } else {
            f3 = (oVar2.c() - oVar.c()) + oVar3.c();
            f2 = (oVar2.d() - oVar.d()) + oVar3.d();
            f4 = f5;
        }
        return k.b(3.5f, 3.5f, f5, 3.5f, f4, f4, 3.5f, f5, oVar.c(), oVar.d(), oVar2.c(), oVar2.d(), f3, f2, oVar3.c(), oVar3.d());
    }

    private static b h(b bVar, k kVar, int i) throws NotFoundException {
        return i.b().d(bVar, i, i, kVar);
    }

    private float i(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        c cVar;
        boolean z2;
        int i10 = 1;
        boolean z3 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z3) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int abs2 = Math.abs(i5 - i7);
        int i11 = (-abs) / 2;
        int i12 = -1;
        int i13 = i8 < i6 ? 1 : -1;
        if (i7 < i5) {
            i12 = 1;
        }
        int i14 = i6 + i13;
        int i15 = i8;
        int i16 = i7;
        int i17 = 0;
        while (true) {
            if (i15 == i14) {
                i9 = i14;
                break;
            }
            int i18 = z3 ? i16 : i15;
            int i19 = z3 ? i15 : i16;
            if (i17 == i10) {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = true;
            } else {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = false;
            }
            if (z2 == cVar.f12101a.f(i18, i19)) {
                if (i17 == 2) {
                    return a.b(i15, i16, i8, i7);
                }
                i17++;
            }
            i11 += abs2;
            if (i11 > 0) {
                if (i16 == i5) {
                    break;
                }
                i16 += i12;
                i11 -= abs;
            }
            i15 += i13;
            i14 = i9;
            z3 = z;
            i10 = 1;
        }
        if (i17 == 2) {
            return a.b(i9, i5, i8, i7);
        }
        return Float.NaN;
    }

    private float j(int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float i5 = i(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f2 = ((float) i) / ((float) (i - i6));
            i6 = 0;
        } else if (i6 >= this.f12101a.n()) {
            f2 = ((float) ((this.f12101a.n() - 1) - i)) / ((float) (i6 - i));
            i6 = this.f12101a.n() - 1;
        } else {
            f2 = 1.0f;
        }
        float f4 = (float) i2;
        int i8 = (int) (f4 - (((float) (i4 - i2)) * f2));
        if (i8 < 0) {
            f3 = f4 / ((float) (i2 - i8));
        } else if (i8 >= this.f12101a.j()) {
            f3 = ((float) ((this.f12101a.j() - 1) - i2)) / ((float) (i8 - i2));
            i7 = this.f12101a.j() - 1;
        } else {
            i7 = i8;
            f3 = 1.0f;
        }
        return (i5 + i(i, i2, (int) (((float) i) + (((float) (i6 - i)) * f3)), i7)) - 1.0f;
    }

    /* access modifiers changed from: protected */
    public final float a(o oVar, o oVar2, o oVar3) {
        return (b(oVar, oVar2) + b(oVar, oVar3)) / 2.0f;
    }

    public final g e(Map<d, ?> map) throws NotFoundException, FormatException {
        p pVar;
        if (map == null) {
            pVar = null;
        } else {
            pVar = (p) map.get(d.NEED_RESULT_POINT_CALLBACK);
        }
        this.f12102b = pVar;
        return g(new e(this.f12101a, pVar).f(map));
    }

    /* access modifiers changed from: protected */
    public final a f(float f2, int i, int i2, float f3) throws NotFoundException {
        int i3 = (int) (f3 * f2);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f12101a.n() - 1, i + i3) - max;
        float f4 = 3.0f * f2;
        if (((float) min) >= f4) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f12101a.j() - 1, i2 + i3) - max2;
            if (((float) min2) >= f4) {
                return new b(this.f12101a, max, max2, min, min2, f2, this.f12102b).c();
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    /* access modifiers changed from: protected */
    public final g g(f fVar) throws NotFoundException, FormatException {
        o[] oVarArr;
        d b2 = fVar.b();
        d c2 = fVar.c();
        d a2 = fVar.a();
        float a3 = a(b2, c2, a2);
        if (a3 >= 1.0f) {
            int c3 = c(b2, c2, a2, a3);
            j g = j.g(c3);
            int e2 = g.e() - 7;
            a aVar = null;
            if (g.d().length > 0) {
                float c4 = (c2.c() - b2.c()) + a2.c();
                float d2 = (c2.d() - b2.d()) + a2.d();
                float f2 = 1.0f - (3.0f / ((float) e2));
                int c5 = (int) (b2.c() + ((c4 - b2.c()) * f2));
                int d3 = (int) (b2.d() + (f2 * (d2 - b2.d())));
                int i = 4;
                while (true) {
                    if (i > 16) {
                        break;
                    }
                    try {
                        aVar = f(a3, c5, d3, (float) i);
                        break;
                    } catch (NotFoundException unused) {
                        i <<= 1;
                    }
                }
            }
            b h = h(this.f12101a, d(b2, c2, a2, aVar, c3), c3);
            if (aVar == null) {
                oVarArr = new o[]{a2, b2, c2};
            } else {
                oVarArr = new o[]{a2, b2, c2, aVar};
            }
            return new g(h, oVarArr);
        }
        throw NotFoundException.a();
    }
}
