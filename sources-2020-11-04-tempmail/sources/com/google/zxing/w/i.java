package com.google.zxing.w;

import com.google.zxing.NotFoundException;
import com.google.zxing.t.a;

/* compiled from: EAN13Reader */
public final class i extends y {
    static final int[] j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    private final int[] i = new int[4];

    private static void t(StringBuilder sb, int i2) throws NotFoundException {
        for (int i3 = 0; i3 < 10; i3++) {
            if (i2 == j[i3]) {
                sb.insert(0, (char) (i3 + 48));
                return;
            }
        }
        throw NotFoundException.a();
    }

    /* access modifiers changed from: protected */
    public int m(a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int n = aVar.n();
        int i2 = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 6 && i2 < n; i4++) {
            int k = y.k(aVar, iArr2, i2, y.h);
            sb.append((char) ((k % 10) + 48));
            for (int i5 : iArr2) {
                i2 += i5;
            }
            if (k >= 10) {
                i3 |= 1 << (5 - i4);
            }
        }
        t(sb, i3);
        int i6 = y.o(aVar, i2, true, y.f12516e)[1];
        for (int i7 = 0; i7 < 6 && i6 < n; i7++) {
            sb.append((char) (y.k(aVar, iArr2, i6, y.g) + 48));
            for (int i8 : iArr2) {
                i6 += i8;
            }
        }
        return i6;
    }

    /* access modifiers changed from: package-private */
    public com.google.zxing.a r() {
        return com.google.zxing.a.EAN_13;
    }
}
