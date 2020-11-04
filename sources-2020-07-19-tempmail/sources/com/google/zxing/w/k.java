package com.google.zxing.w;

import com.google.zxing.NotFoundException;
import com.google.zxing.t.a;

/* compiled from: EAN8Reader */
public final class k extends y {
    private final int[] i = new int[4];

    /* access modifiers changed from: protected */
    public int m(a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int n = aVar.n();
        int i2 = iArr[1];
        for (int i3 = 0; i3 < 4 && i2 < n; i3++) {
            sb.append((char) (y.k(aVar, iArr2, i2, y.g) + 48));
            for (int i4 : iArr2) {
                i2 += i4;
            }
        }
        int i5 = y.o(aVar, i2, true, y.f11967e)[1];
        for (int i6 = 0; i6 < 4 && i5 < n; i6++) {
            sb.append((char) (y.k(aVar, iArr2, i5, y.g) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    /* access modifiers changed from: package-private */
    public com.google.zxing.a r() {
        return com.google.zxing.a.EAN_8;
    }
}
