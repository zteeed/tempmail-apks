package com.google.zxing.t.m;

import com.google.zxing.NotFoundException;
import com.google.zxing.o;

/* compiled from: WhiteRectangleDetector */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.zxing.t.b f12352a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12353b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12354c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12355d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12356e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12357f;
    private final int g;

    public b(com.google.zxing.t.b bVar) throws NotFoundException {
        this(bVar, 10, bVar.n() / 2, bVar.j() / 2);
    }

    private o[] a(o oVar, o oVar2, o oVar3, o oVar4) {
        float c2 = oVar.c();
        float d2 = oVar.d();
        float c3 = oVar2.c();
        float d3 = oVar2.d();
        float c4 = oVar3.c();
        float d4 = oVar3.d();
        float c5 = oVar4.c();
        float d5 = oVar4.d();
        if (c2 < ((float) this.f12354c) / 2.0f) {
            return new o[]{new o(c5 - 1.0f, d5 + 1.0f), new o(c3 + 1.0f, d3 + 1.0f), new o(c4 - 1.0f, d4 - 1.0f), new o(c2 + 1.0f, d2 - 1.0f)};
        }
        return new o[]{new o(c5 + 1.0f, d5 + 1.0f), new o(c3 + 1.0f, d3 - 1.0f), new o(c4 - 1.0f, d4 + 1.0f), new o(c2 - 1.0f, d2 - 1.0f)};
    }

    private boolean b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f12352a.f(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f12352a.f(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    private o d(float f2, float f3, float f4, float f5) {
        int c2 = a.c(a.a(f2, f3, f4, f5));
        float f6 = (float) c2;
        float f7 = (f4 - f2) / f6;
        float f8 = (f5 - f3) / f6;
        for (int i = 0; i < c2; i++) {
            float f9 = (float) i;
            int c3 = a.c((f9 * f7) + f2);
            int c4 = a.c((f9 * f8) + f3);
            if (this.f12352a.f(c3, c4)) {
                return new o((float) c3, (float) c4);
            }
        }
        return null;
    }

    public o[] c() throws NotFoundException {
        int i = this.f12355d;
        int i2 = this.f12356e;
        int i3 = this.g;
        int i4 = this.f12357f;
        boolean z = false;
        int i5 = 1;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (true) {
            if (!z2) {
                break;
            }
            boolean z8 = true;
            boolean z9 = false;
            while (true) {
                if ((z8 || !z3) && i2 < this.f12354c) {
                    z8 = b(i3, i4, i2, false);
                    if (z8) {
                        i2++;
                        z3 = true;
                        z9 = true;
                    } else if (!z3) {
                        i2++;
                    }
                }
            }
            if (i2 >= this.f12354c) {
                break;
            }
            boolean z10 = true;
            while (true) {
                if ((z10 || !z4) && i4 < this.f12353b) {
                    z10 = b(i, i2, i4, true);
                    if (z10) {
                        i4++;
                        z4 = true;
                        z9 = true;
                    } else if (!z4) {
                        i4++;
                    }
                }
            }
            if (i4 >= this.f12353b) {
                break;
            }
            boolean z11 = true;
            while (true) {
                if ((z11 || !z5) && i >= 0) {
                    z11 = b(i3, i4, i, false);
                    if (z11) {
                        i--;
                        z5 = true;
                        z9 = true;
                    } else if (!z5) {
                        i--;
                    }
                }
            }
            if (i < 0) {
                break;
            }
            z2 = z9;
            boolean z12 = true;
            while (true) {
                if ((z12 || !z7) && i3 >= 0) {
                    z12 = b(i, i2, i3, true);
                    if (z12) {
                        i3--;
                        z2 = true;
                        z7 = true;
                    } else if (!z7) {
                        i3--;
                    }
                }
            }
            if (i3 < 0) {
                break;
            } else if (z2) {
                z6 = true;
            }
        }
        z = true;
        if (z || !z6) {
            throw NotFoundException.a();
        }
        int i6 = i2 - i;
        o oVar = null;
        o oVar2 = null;
        int i7 = 1;
        while (oVar2 == null && i7 < i6) {
            oVar2 = d((float) i, (float) (i4 - i7), (float) (i + i7), (float) i4);
            i7++;
        }
        if (oVar2 != null) {
            o oVar3 = null;
            int i8 = 1;
            while (oVar3 == null && i8 < i6) {
                oVar3 = d((float) i, (float) (i3 + i8), (float) (i + i8), (float) i3);
                i8++;
            }
            if (oVar3 != null) {
                o oVar4 = null;
                int i9 = 1;
                while (oVar4 == null && i9 < i6) {
                    oVar4 = d((float) i2, (float) (i3 + i9), (float) (i2 - i9), (float) i3);
                    i9++;
                }
                if (oVar4 != null) {
                    while (oVar == null && i5 < i6) {
                        oVar = d((float) i2, (float) (i4 - i5), (float) (i2 - i5), (float) i4);
                        i5++;
                    }
                    if (oVar != null) {
                        return a(oVar, oVar2, oVar4, oVar3);
                    }
                    throw NotFoundException.a();
                }
                throw NotFoundException.a();
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    public b(com.google.zxing.t.b bVar, int i, int i2, int i3) throws NotFoundException {
        this.f12352a = bVar;
        this.f12353b = bVar.j();
        int n = bVar.n();
        this.f12354c = n;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f12355d = i5;
        int i6 = i2 + i4;
        this.f12356e = i6;
        int i7 = i3 - i4;
        this.g = i7;
        int i8 = i3 + i4;
        this.f12357f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= this.f12353b || i6 >= n) {
            throw NotFoundException.a();
        }
    }
}
