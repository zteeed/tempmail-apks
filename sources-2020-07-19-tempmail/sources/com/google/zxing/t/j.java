package com.google.zxing.t;

import com.google.zxing.NotFoundException;
import com.google.zxing.b;
import com.google.zxing.h;
import java.lang.reflect.Array;

/* compiled from: HybridBinarizer */
public final class j extends h {

    /* renamed from: e  reason: collision with root package name */
    private b f11794e;

    public j(h hVar) {
        super(hVar);
    }

    private static int[][] i(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        int i7 = 8;
        int i8 = i4 - 8;
        int i9 = i3 - 8;
        int[] iArr = new int[2];
        iArr[1] = i5;
        iArr[0] = i6;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i10 = 0;
        while (i10 < i6) {
            int i11 = i10 << 3;
            if (i11 > i8) {
                i11 = i8;
            }
            int i12 = 0;
            while (i12 < i5) {
                int i13 = i12 << 3;
                if (i13 > i9) {
                    i13 = i9;
                }
                int i14 = (i11 * i3) + i13;
                byte b2 = 255;
                int i15 = 0;
                int i16 = 0;
                byte b3 = 0;
                while (i15 < i7) {
                    byte b4 = b3;
                    int i17 = 0;
                    while (i17 < i7) {
                        byte b5 = bArr[i14 + i17] & 255;
                        i16 += b5;
                        if (b5 < b2) {
                            b2 = b5;
                        }
                        if (b5 > b4) {
                            b4 = b5;
                        }
                        i17++;
                        i7 = 8;
                    }
                    if (b4 - b2 <= 24) {
                        i15++;
                        i14 += i3;
                        b3 = b4;
                        i7 = 8;
                    }
                    while (true) {
                        i15++;
                        i14 += i3;
                        if (i15 >= 8) {
                            break;
                        }
                        int i18 = 0;
                        for (int i19 = 8; i18 < i19; i19 = 8) {
                            i16 += bArr[i14 + i18] & 255;
                            i18++;
                        }
                    }
                    i15++;
                    i14 += i3;
                    b3 = b4;
                    i7 = 8;
                }
                int i20 = i16 >> 6;
                if (b3 - b2 <= 24) {
                    i20 = b2 / 2;
                    if (i10 > 0 && i12 > 0) {
                        int i21 = i10 - 1;
                        int i22 = i12 - 1;
                        int i23 = ((iArr2[i21][i12] + (iArr2[i10][i22] * 2)) + iArr2[i21][i22]) / 4;
                        if (b2 < i23) {
                            i20 = i23;
                        }
                        iArr2[i10][i12] = i20;
                        i12++;
                        i7 = 8;
                    }
                }
                iArr2[i10][i12] = i20;
                i12++;
                i7 = 8;
            }
            i10++;
            i7 = 8;
        }
        return iArr2;
    }

    private static void j(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, b bVar) {
        int i5 = i;
        int i6 = i2;
        int i7 = i4 - 8;
        int i8 = i3 - 8;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = i9 << 3;
            int i11 = i10 > i7 ? i7 : i10;
            int k = k(i9, 2, i6 - 3);
            for (int i12 = 0; i12 < i5; i12++) {
                int i13 = i12 << 3;
                int i14 = i13 > i8 ? i8 : i13;
                int k2 = k(i12, 2, i5 - 3);
                int i15 = 0;
                for (int i16 = -2; i16 <= 2; i16++) {
                    int[] iArr2 = iArr[k + i16];
                    i15 += iArr2[k2 - 2] + iArr2[k2 - 1] + iArr2[k2] + iArr2[k2 + 1] + iArr2[k2 + 2];
                }
                l(bArr, i14, i11, i15 / 25, i3, bVar);
            }
        }
    }

    private static int k(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private static void l(byte[] bArr, int i, int i2, int i3, int i4, b bVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    bVar.p(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    public b a(h hVar) {
        return new j(hVar);
    }

    public b b() throws NotFoundException {
        b bVar = this.f11794e;
        if (bVar != null) {
            return bVar;
        }
        h e2 = e();
        int d2 = e2.d();
        int a2 = e2.a();
        if (d2 < 40 || a2 < 40) {
            this.f11794e = super.b();
        } else {
            byte[] b2 = e2.b();
            int i = d2 >> 3;
            if ((d2 & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = a2 >> 3;
            if ((a2 & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] i5 = i(b2, i2, i4, d2, a2);
            b bVar2 = new b(d2, a2);
            j(b2, i2, i4, d2, a2, i5, bVar2);
            this.f11794e = bVar2;
        }
        return this.f11794e;
    }
}
