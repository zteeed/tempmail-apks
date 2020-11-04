package com.google.zxing.r.f;

import com.google.zxing.common.reedsolomon.d;
import com.google.zxing.t.a;
import com.google.zxing.t.b;

/* compiled from: Encoder */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f11725a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int[] a(a aVar, int i, int i2) {
        int[] iArr = new int[i2];
        int n = aVar.n() / i;
        for (int i3 = 0; i3 < n; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= aVar.i((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    private static void b(b bVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                bVar.p(i5, i4);
                bVar.p(i5, i6);
                bVar.p(i4, i5);
                bVar.p(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        bVar.p(i7, i7);
        int i8 = i7 + 1;
        bVar.p(i8, i7);
        bVar.p(i7, i8);
        int i9 = i + i2;
        bVar.p(i9, i7);
        bVar.p(i9, i8);
        bVar.p(i9, i9 - 1);
    }

    private static void c(b bVar, boolean z, int i, a aVar) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (aVar.i(i3)) {
                    bVar.p(i4, i2 - 5);
                }
                if (aVar.i(i3 + 7)) {
                    bVar.p(i2 + 5, i4);
                }
                if (aVar.i(20 - i3)) {
                    bVar.p(i4, i2 + 5);
                }
                if (aVar.i(27 - i3)) {
                    bVar.p(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (aVar.i(i3)) {
                bVar.p(i5, i2 - 7);
            }
            if (aVar.i(i3 + 10)) {
                bVar.p(i2 + 7, i5);
            }
            if (aVar.i(29 - i3)) {
                bVar.p(i5, i2 + 7);
            }
            if (aVar.i(39 - i3)) {
                bVar.p(i2 - 7, i5);
            }
            i3++;
        }
    }

    public static a d(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        a aVar;
        int i6;
        a a2 = new d(bArr).a();
        int i7 = 11;
        int n = ((a2.n() * i) / 100) + 11;
        int n2 = a2.n() + n;
        int i8 = 32;
        int i9 = 0;
        int i10 = 1;
        if (i2 != 0) {
            z = i2 < 0;
            i4 = Math.abs(i2);
            if (z) {
                i8 = 4;
            }
            if (i4 <= i8) {
                i5 = i(i4, z);
                i3 = f11725a[i4];
                int i11 = i5 - (i5 % i3);
                aVar = h(a2, i3);
                if (aVar.n() + n > i11) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                } else if (z && aVar.n() > (i3 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i2)}));
            }
        } else {
            a aVar2 = null;
            int i12 = 0;
            int i13 = 0;
            while (i12 <= 32) {
                boolean z2 = i12 <= 3;
                int i14 = z2 ? i12 + 1 : i12;
                int i15 = i(i14, z2);
                if (n2 <= i15) {
                    if (aVar2 == null || i13 != f11725a[i14]) {
                        int i16 = f11725a[i14];
                        i13 = i16;
                        aVar2 = h(a2, i16);
                    }
                    int i17 = i15 - (i15 % i13);
                    if ((!z2 || aVar2.n() <= (i13 << 6)) && aVar2.n() + n <= i17) {
                        aVar = aVar2;
                        i3 = i13;
                        z = z2;
                        i4 = i14;
                        i5 = i15;
                    }
                }
                i12++;
                i9 = 0;
                i10 = 1;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        a e2 = e(aVar, i5, i3);
        int n3 = aVar.n() / i3;
        a f2 = f(z, i4, n3);
        if (!z) {
            i7 = 14;
        }
        int i18 = i7 + (i4 << 2);
        int[] iArr = new int[i18];
        int i19 = 2;
        if (z) {
            for (int i20 = 0; i20 < i18; i20++) {
                iArr[i20] = i20;
            }
            i6 = i18;
        } else {
            int i21 = i18 / 2;
            i6 = i18 + 1 + (((i21 - 1) / 15) * 2);
            int i22 = i6 / 2;
            for (int i23 = 0; i23 < i21; i23++) {
                int i24 = (i23 / 15) + i23;
                iArr[(i21 - i23) - i10] = (i22 - i24) - 1;
                iArr[i21 + i23] = i24 + i22 + i10;
            }
        }
        b bVar = new b(i6);
        int i25 = 0;
        int i26 = 0;
        while (i25 < i4) {
            int i27 = ((i4 - i25) << i19) + (z ? 9 : 12);
            int i28 = 0;
            while (i28 < i27) {
                int i29 = i28 << 1;
                while (i9 < i19) {
                    if (e2.i(i26 + i29 + i9)) {
                        int i30 = i25 << 1;
                        bVar.p(iArr[i30 + i9], iArr[i30 + i28]);
                    }
                    if (e2.i((i27 << 1) + i26 + i29 + i9)) {
                        int i31 = i25 << 1;
                        bVar.p(iArr[i31 + i28], iArr[((i18 - 1) - i31) - i9]);
                    }
                    if (e2.i((i27 << 2) + i26 + i29 + i9)) {
                        int i32 = (i18 - 1) - (i25 << 1);
                        bVar.p(iArr[i32 - i9], iArr[i32 - i28]);
                    }
                    if (e2.i((i27 * 6) + i26 + i29 + i9)) {
                        int i33 = i25 << 1;
                        bVar.p(iArr[((i18 - 1) - i33) - i28], iArr[i33 + i9]);
                    }
                    i9++;
                    i19 = 2;
                }
                i28++;
                i9 = 0;
                i19 = 2;
            }
            i26 += i27 << 3;
            i25++;
            i9 = 0;
            i19 = 2;
        }
        c(bVar, z, i6, f2);
        if (z) {
            b(bVar, i6 / 2, 5);
        } else {
            int i34 = i6 / 2;
            b(bVar, i34, 7);
            int i35 = 0;
            int i36 = 0;
            while (i36 < (i18 / 2) - 1) {
                for (int i37 = i34 & 1; i37 < i6; i37 += 2) {
                    int i38 = i34 - i35;
                    bVar.p(i38, i37);
                    int i39 = i34 + i35;
                    bVar.p(i39, i37);
                    bVar.p(i37, i38);
                    bVar.p(i37, i39);
                }
                i36 += 15;
                i35 += 16;
            }
        }
        a aVar3 = new a();
        aVar3.c(z);
        aVar3.f(i6);
        aVar3.d(i4);
        aVar3.b(n3);
        aVar3.e(bVar);
        return aVar3;
    }

    private static a e(a aVar, int i, int i2) {
        d dVar = new d(g(i2));
        int i3 = i / i2;
        int[] a2 = a(aVar, i2, i3);
        dVar.b(a2, i3 - (aVar.n() / i2));
        a aVar2 = new a();
        aVar2.d(0, i % i2);
        for (int d2 : a2) {
            aVar2.d(d2, i2);
        }
        return aVar2;
    }

    static a f(boolean z, int i, int i2) {
        a aVar = new a();
        if (z) {
            aVar.d(i - 1, 2);
            aVar.d(i2 - 1, 6);
            return e(aVar, 28, 4);
        }
        aVar.d(i - 1, 5);
        aVar.d(i2 - 1, 11);
        return e(aVar, 40, 4);
    }

    private static com.google.zxing.common.reedsolomon.a g(int i) {
        if (i == 4) {
            return com.google.zxing.common.reedsolomon.a.k;
        }
        if (i == 6) {
            return com.google.zxing.common.reedsolomon.a.j;
        }
        if (i == 8) {
            return com.google.zxing.common.reedsolomon.a.n;
        }
        if (i == 10) {
            return com.google.zxing.common.reedsolomon.a.i;
        }
        if (i == 12) {
            return com.google.zxing.common.reedsolomon.a.h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }

    static a h(a aVar, int i) {
        a aVar2 = new a();
        int n = aVar.n();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < n) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= n || aVar.i(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                aVar2.d(i7, i);
            } else if (i7 == 0) {
                aVar2.d(i4 | 1, i);
            } else {
                aVar2.d(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return aVar2;
    }

    private static int i(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }
}
