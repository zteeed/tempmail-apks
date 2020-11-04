package com.google.zxing.r.e;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.common.reedsolomon.c;
import com.google.zxing.o;
import com.google.zxing.t.b;
import com.google.zxing.t.i;

/* compiled from: Detector */
public final class a {
    private static final int[] g = {3808, 476, 2107, 1799};

    /* renamed from: a  reason: collision with root package name */
    private final b f12263a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12264b;

    /* renamed from: c  reason: collision with root package name */
    private int f12265c;

    /* renamed from: d  reason: collision with root package name */
    private int f12266d;

    /* renamed from: e  reason: collision with root package name */
    private int f12267e;

    /* renamed from: f  reason: collision with root package name */
    private int f12268f;

    /* renamed from: com.google.zxing.r.e.a$a  reason: collision with other inner class name */
    /* compiled from: Detector */
    static final class C0113a {

        /* renamed from: a  reason: collision with root package name */
        private final int f12269a;

        /* renamed from: b  reason: collision with root package name */
        private final int f12270b;

        C0113a(int i, int i2) {
            this.f12269a = i;
            this.f12270b = i2;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f12269a;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f12270b;
        }

        /* access modifiers changed from: package-private */
        public o c() {
            return new o((float) a(), (float) b());
        }

        public String toString() {
            return "<" + this.f12269a + ' ' + this.f12270b + '>';
        }
    }

    public a(b bVar) {
        this.f12263a = bVar;
    }

    private static float b(o oVar, o oVar2) {
        return com.google.zxing.t.m.a.a(oVar.c(), oVar.d(), oVar2.c(), oVar2.d());
    }

    private static float c(C0113a aVar, C0113a aVar2) {
        return com.google.zxing.t.m.a.b(aVar.a(), aVar.b(), aVar2.a(), aVar2.b());
    }

    private static o[] d(o[] oVarArr, int i, int i2) {
        float f2 = ((float) i2) / (((float) i) * 2.0f);
        float c2 = oVarArr[0].c() - oVarArr[2].c();
        float d2 = oVarArr[0].d() - oVarArr[2].d();
        float c3 = (oVarArr[0].c() + oVarArr[2].c()) / 2.0f;
        float d3 = (oVarArr[0].d() + oVarArr[2].d()) / 2.0f;
        float f3 = c2 * f2;
        float f4 = d2 * f2;
        o oVar = new o(c3 + f3, d3 + f4);
        o oVar2 = new o(c3 - f3, d3 - f4);
        float c4 = oVarArr[1].c() - oVarArr[3].c();
        float d4 = oVarArr[1].d() - oVarArr[3].d();
        float c5 = (oVarArr[1].c() + oVarArr[3].c()) / 2.0f;
        float d5 = (oVarArr[1].d() + oVarArr[3].d()) / 2.0f;
        float f5 = c4 * f2;
        float f6 = f2 * d4;
        return new o[]{oVar, new o(c5 + f5, d5 + f6), oVar2, new o(c5 - f5, d5 - f6)};
    }

    private void e(o[] oVarArr) throws NotFoundException {
        long j;
        long j2;
        if (!o(oVarArr[0]) || !o(oVarArr[1]) || !o(oVarArr[2]) || !o(oVarArr[3])) {
            throw NotFoundException.a();
        }
        int i = this.f12267e * 2;
        int[] iArr = {r(oVarArr[0], oVarArr[1], i), r(oVarArr[1], oVarArr[2], i), r(oVarArr[2], oVarArr[3], i), r(oVarArr[3], oVarArr[0], i)};
        this.f12268f = m(iArr, i);
        long j3 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[(this.f12268f + i2) % 4];
            if (this.f12264b) {
                j2 = j3 << 7;
                j = (long) ((i3 >> 1) & 127);
            } else {
                j2 = j3 << 10;
                j = (long) (((i3 >> 2) & 992) + ((i3 >> 1) & 31));
            }
            j3 = j2 + j;
        }
        int h = h(j3, this.f12264b);
        if (this.f12264b) {
            this.f12265c = (h >> 6) + 1;
            this.f12266d = (h & 63) + 1;
            return;
        }
        this.f12265c = (h >> 11) + 1;
        this.f12266d = (h & 2047) + 1;
    }

    private o[] f(C0113a aVar) throws NotFoundException {
        this.f12267e = 1;
        C0113a aVar2 = aVar;
        C0113a aVar3 = aVar2;
        C0113a aVar4 = aVar3;
        C0113a aVar5 = aVar4;
        boolean z = true;
        while (this.f12267e < 9) {
            C0113a j = j(aVar2, z, 1, -1);
            C0113a j2 = j(aVar3, z, 1, 1);
            C0113a j3 = j(aVar4, z, -1, 1);
            C0113a j4 = j(aVar5, z, -1, -1);
            if (this.f12267e > 2) {
                double c2 = (double) ((c(j4, j) * ((float) this.f12267e)) / (c(aVar5, aVar2) * ((float) (this.f12267e + 2))));
                if (c2 < 0.75d || c2 > 1.25d || !p(j, j2, j3, j4)) {
                    break;
                }
            }
            z = !z;
            this.f12267e++;
            aVar5 = j4;
            aVar2 = j;
            aVar3 = j2;
            aVar4 = j3;
        }
        int i = this.f12267e;
        if (i == 5 || i == 7) {
            this.f12264b = this.f12267e == 5;
            o[] oVarArr = {new o(((float) aVar2.a()) + 0.5f, ((float) aVar2.b()) - 0.5f), new o(((float) aVar3.a()) + 0.5f, ((float) aVar3.b()) + 0.5f), new o(((float) aVar4.a()) - 0.5f, ((float) aVar4.b()) + 0.5f), new o(((float) aVar5.a()) - 0.5f, ((float) aVar5.b()) - 0.5f)};
            int i2 = this.f12267e;
            return d(oVarArr, (i2 * 2) - 3, i2 * 2);
        }
        throw NotFoundException.a();
    }

    private int g(C0113a aVar, C0113a aVar2) {
        float c2 = c(aVar, aVar2);
        float a2 = ((float) (aVar2.a() - aVar.a())) / c2;
        float b2 = ((float) (aVar2.b() - aVar.b())) / c2;
        float a3 = (float) aVar.a();
        float b3 = (float) aVar.b();
        boolean f2 = this.f12263a.f(aVar.a(), aVar.b());
        int ceil = (int) Math.ceil((double) c2);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            a3 += a2;
            b3 += b2;
            if (this.f12263a.f(com.google.zxing.t.m.a.c(a3), com.google.zxing.t.m.a.c(b3)) != f2) {
                i++;
            }
        }
        float f3 = ((float) i) / c2;
        if (f3 > 0.1f && f3 < 0.9f) {
            return 0;
        }
        if (f3 <= 0.1f) {
            z = true;
        }
        return z == f2 ? 1 : -1;
    }

    private static int h(long j, boolean z) throws NotFoundException {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new c(com.google.zxing.common.reedsolomon.a.k).a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.a();
        }
    }

    private int i() {
        if (this.f12264b) {
            return (this.f12265c * 4) + 11;
        }
        int i = this.f12265c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    private C0113a j(C0113a aVar, boolean z, int i, int i2) {
        int a2 = aVar.a() + i;
        int b2 = aVar.b();
        while (true) {
            b2 += i2;
            if (!n(a2, b2) || this.f12263a.f(a2, b2) != z) {
                int i3 = a2 - i;
                int i4 = b2 - i2;
            } else {
                a2 += i;
            }
        }
        int i32 = a2 - i;
        int i42 = b2 - i2;
        while (n(i32, i42) && this.f12263a.f(i32, i42) == z) {
            i32 += i;
        }
        int i5 = i32 - i;
        while (n(i5, i42) && this.f12263a.f(i5, i42) == z) {
            i42 += i2;
        }
        return new C0113a(i5, i42 - i2);
    }

    private C0113a k() {
        o oVar;
        o oVar2;
        o oVar3;
        o oVar4;
        o oVar5;
        o oVar6;
        o oVar7;
        o oVar8;
        try {
            o[] c2 = new com.google.zxing.t.m.b(this.f12263a).c();
            oVar3 = c2[0];
            oVar2 = c2[1];
            oVar = c2[2];
            oVar4 = c2[3];
        } catch (NotFoundException unused) {
            int n = this.f12263a.n() / 2;
            int j = this.f12263a.j() / 2;
            int i = n + 7;
            int i2 = j - 7;
            o c3 = j(new C0113a(i, i2), false, 1, -1).c();
            int i3 = j + 7;
            o c4 = j(new C0113a(i, i3), false, 1, 1).c();
            int i4 = n - 7;
            o c5 = j(new C0113a(i4, i3), false, -1, 1).c();
            oVar4 = j(new C0113a(i4, i2), false, -1, -1).c();
            o oVar9 = c4;
            oVar = c5;
            oVar3 = c3;
            oVar2 = oVar9;
        }
        int c6 = com.google.zxing.t.m.a.c((((oVar3.c() + oVar4.c()) + oVar2.c()) + oVar.c()) / 4.0f);
        int c7 = com.google.zxing.t.m.a.c((((oVar3.d() + oVar4.d()) + oVar2.d()) + oVar.d()) / 4.0f);
        try {
            o[] c8 = new com.google.zxing.t.m.b(this.f12263a, 15, c6, c7).c();
            oVar6 = c8[0];
            oVar5 = c8[1];
            oVar7 = c8[2];
            oVar8 = c8[3];
        } catch (NotFoundException unused2) {
            int i5 = c6 + 7;
            int i6 = c7 - 7;
            oVar6 = j(new C0113a(i5, i6), false, 1, -1).c();
            int i7 = c7 + 7;
            oVar5 = j(new C0113a(i5, i7), false, 1, 1).c();
            int i8 = c6 - 7;
            oVar7 = j(new C0113a(i8, i7), false, -1, 1).c();
            oVar8 = j(new C0113a(i8, i6), false, -1, -1).c();
        }
        return new C0113a(com.google.zxing.t.m.a.c((((oVar6.c() + oVar8.c()) + oVar5.c()) + oVar7.c()) / 4.0f), com.google.zxing.t.m.a.c((((oVar6.d() + oVar8.d()) + oVar5.d()) + oVar7.d()) / 4.0f));
    }

    private o[] l(o[] oVarArr) {
        return d(oVarArr, this.f12267e * 2, i());
    }

    private static int m(int[] iArr, int i) throws NotFoundException {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.a();
    }

    private boolean n(int i, int i2) {
        return i >= 0 && i < this.f12263a.n() && i2 > 0 && i2 < this.f12263a.j();
    }

    private boolean o(o oVar) {
        return n(com.google.zxing.t.m.a.c(oVar.c()), com.google.zxing.t.m.a.c(oVar.d()));
    }

    private boolean p(C0113a aVar, C0113a aVar2, C0113a aVar3, C0113a aVar4) {
        C0113a aVar5 = new C0113a(aVar.a() - 3, aVar.b() + 3);
        C0113a aVar6 = new C0113a(aVar2.a() - 3, aVar2.b() - 3);
        C0113a aVar7 = new C0113a(aVar3.a() + 3, aVar3.b() - 3);
        C0113a aVar8 = new C0113a(aVar4.a() + 3, aVar4.b() + 3);
        int g2 = g(aVar8, aVar5);
        if (g2 != 0 && g(aVar5, aVar6) == g2 && g(aVar6, aVar7) == g2 && g(aVar7, aVar8) == g2) {
            return true;
        }
        return false;
    }

    private b q(b bVar, o oVar, o oVar2, o oVar3, o oVar4) throws NotFoundException {
        i b2 = i.b();
        int i = i();
        int i2 = i;
        int i3 = i;
        float f2 = ((float) i) / 2.0f;
        int i4 = this.f12267e;
        float f3 = f2 - ((float) i4);
        float f4 = f2 + ((float) i4);
        return b2.c(bVar, i3, i2, f3, f3, f4, f3, f4, f4, f3, f4, oVar.c(), oVar.d(), oVar2.c(), oVar2.d(), oVar3.c(), oVar3.d(), oVar4.c(), oVar4.d());
    }

    private int r(o oVar, o oVar2, int i) {
        float b2 = b(oVar, oVar2);
        float f2 = b2 / ((float) i);
        float c2 = oVar.c();
        float d2 = oVar.d();
        float c3 = ((oVar2.c() - oVar.c()) * f2) / b2;
        float d3 = (f2 * (oVar2.d() - oVar.d())) / b2;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f3 = (float) i3;
            if (this.f12263a.f(com.google.zxing.t.m.a.c((f3 * c3) + c2), com.google.zxing.t.m.a.c((f3 * d3) + d2))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    public com.google.zxing.r.a a(boolean z) throws NotFoundException {
        o[] f2 = f(k());
        if (z) {
            o oVar = f2[0];
            f2[0] = f2[2];
            f2[2] = oVar;
        }
        e(f2);
        b bVar = this.f12263a;
        int i = this.f12268f;
        return new com.google.zxing.r.a(q(bVar, f2[i % 4], f2[(i + 1) % 4], f2[(i + 2) % 4], f2[(i + 3) % 4]), l(f2), this.f12264b, this.f12266d, this.f12265c);
    }
}
