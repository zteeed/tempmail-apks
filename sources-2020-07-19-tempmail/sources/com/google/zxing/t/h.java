package com.google.zxing.t;

import com.google.zxing.NotFoundException;
import com.google.zxing.b;

/* compiled from: GlobalHistogramBinarizer */
public class h extends b {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f11790d = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private byte[] f11791b = f11790d;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f11792c = new int[32];

    public h(com.google.zxing.h hVar) {
        super(hVar);
    }

    private static int g(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            int i10 = i3;
            i3 = i5;
            i5 = i10;
        }
        if (i3 - i5 > length / 16) {
            int i11 = i3 - 1;
            int i12 = i11;
            int i13 = -1;
            while (i11 > i5) {
                int i14 = i11 - i5;
                int i15 = i14 * i14 * (i3 - i11) * (i2 - iArr[i11]);
                if (i15 > i13) {
                    i12 = i11;
                    i13 = i15;
                }
                i11--;
            }
            return i12 << 3;
        }
        throw NotFoundException.a();
    }

    private void h(int i) {
        if (this.f11791b.length < i) {
            this.f11791b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f11792c[i2] = 0;
        }
    }

    public b b() throws NotFoundException {
        com.google.zxing.h e2 = e();
        int d2 = e2.d();
        int a2 = e2.a();
        b bVar = new b(d2, a2);
        h(d2);
        int[] iArr = this.f11792c;
        for (int i = 1; i < 5; i++) {
            byte[] c2 = e2.c((a2 * i) / 5, this.f11791b);
            int i2 = (d2 << 2) / 5;
            for (int i3 = d2 / 5; i3 < i2; i3++) {
                int i4 = (c2[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int g = g(iArr);
        byte[] b2 = e2.b();
        for (int i5 = 0; i5 < a2; i5++) {
            int i6 = i5 * d2;
            for (int i7 = 0; i7 < d2; i7++) {
                if ((b2[i6 + i7] & 255) < g) {
                    bVar.p(i7, i5);
                }
            }
        }
        return bVar;
    }

    public a c(int i, a aVar) throws NotFoundException {
        com.google.zxing.h e2 = e();
        int d2 = e2.d();
        if (aVar == null || aVar.n() < d2) {
            aVar = new a(d2);
        } else {
            aVar.e();
        }
        h(d2);
        byte[] c2 = e2.c(i, this.f11791b);
        int[] iArr = this.f11792c;
        for (int i2 = 0; i2 < d2; i2++) {
            int i3 = (c2[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int g = g(iArr);
        if (d2 < 3) {
            for (int i4 = 0; i4 < d2; i4++) {
                if ((c2[i4] & 255) < g) {
                    aVar.t(i4);
                }
            }
        } else {
            int i5 = 1;
            byte b2 = c2[1] & 255;
            byte b3 = c2[0] & 255;
            byte b4 = b2;
            while (i5 < d2 - 1) {
                int i6 = i5 + 1;
                byte b5 = c2[i6] & 255;
                if ((((b4 << 2) - b3) - b5) / 2 < g) {
                    aVar.t(i5);
                }
                b3 = b4;
                i5 = i6;
                b4 = b5;
            }
        }
        return aVar;
    }
}
