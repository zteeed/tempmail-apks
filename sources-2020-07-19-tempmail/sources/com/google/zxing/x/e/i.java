package com.google.zxing.x.e;

import com.google.zxing.x.a;
import java.lang.reflect.Array;

/* compiled from: PDF417CodewordDecoder */
final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final float[][] f12009a;

    static {
        int i;
        int length = a.f11973b.length;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = length;
        f12009a = (float[][]) Array.newInstance(float.class, iArr);
        int i2 = 0;
        while (true) {
            int[] iArr2 = a.f11973b;
            if (i2 < iArr2.length) {
                int i3 = iArr2[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f2 = 0.0f;
                    while (true) {
                        i = i3 & 1;
                        if (i != i4) {
                            break;
                        }
                        f2 += 1.0f;
                        i3 >>= 1;
                    }
                    f12009a[i2][(8 - i5) - 1] = f2 / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private static int a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | ((long) i3);
            }
        }
        return (int) j;
    }

    private static int b(int[] iArr) {
        int d2 = com.google.zxing.t.m.a.d(iArr);
        float[] fArr = new float[8];
        if (d2 > 1) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = ((float) iArr[i]) / ((float) d2);
            }
        }
        float f2 = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f12009a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float f3 = 0.0f;
            float[] fArr3 = fArr2[i3];
            for (int i4 = 0; i4 < 8; i4++) {
                float f4 = fArr3[i4] - fArr[i4];
                f3 += f4 * f4;
                if (f3 >= f2) {
                    break;
                }
            }
            if (f3 < f2) {
                i2 = a.f11973b[i3];
                f2 = f3;
            }
            i3++;
        }
    }

    private static int c(int[] iArr) {
        int a2 = a(iArr);
        if (a.a(a2) == -1) {
            return -1;
        }
        return a2;
    }

    static int d(int[] iArr) {
        int c2 = c(e(iArr));
        if (c2 != -1) {
            return c2;
        }
        return b(iArr);
    }

    private static int[] e(int[] iArr) {
        float d2 = (float) com.google.zxing.t.m.a.d(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            if (((float) (iArr[i2] + i)) <= (d2 / 34.0f) + ((((float) i3) * d2) / 17.0f)) {
                i += iArr[i2];
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
