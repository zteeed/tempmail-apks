package com.google.zxing.y;

import com.google.zxing.WriterException;
import com.google.zxing.a;
import com.google.zxing.q;
import com.google.zxing.y.e.c;
import com.google.zxing.y.e.f;
import java.util.Map;

/* compiled from: QRCodeWriter */
public final class b implements q {
    private static com.google.zxing.t.b b(f fVar, int i, int i2, int i3) {
        com.google.zxing.y.e.b a2 = fVar.a();
        if (a2 != null) {
            int e2 = a2.e();
            int d2 = a2.d();
            int i4 = i3 << 1;
            int i5 = e2 + i4;
            int i6 = i4 + d2;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (e2 * min)) / 2;
            int i8 = (max2 - (d2 * min)) / 2;
            com.google.zxing.t.b bVar = new com.google.zxing.t.b(max, max2);
            int i9 = 0;
            while (i9 < d2) {
                int i10 = i7;
                int i11 = 0;
                while (i11 < e2) {
                    if (a2.b(i11, i9) == 1) {
                        bVar.r(i10, i8, min, min);
                    }
                    i11++;
                    i10 += min;
                }
                i9++;
                i8 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    public com.google.zxing.t.b a(String str, a aVar, int i, int i2, Map<com.google.zxing.f, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(aVar)));
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            com.google.zxing.y.c.f fVar = com.google.zxing.y.c.f.L;
            int i3 = 4;
            if (map != null) {
                if (map.containsKey(com.google.zxing.f.ERROR_CORRECTION)) {
                    fVar = com.google.zxing.y.c.f.valueOf(map.get(com.google.zxing.f.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(com.google.zxing.f.MARGIN)) {
                    i3 = Integer.parseInt(map.get(com.google.zxing.f.MARGIN).toString());
                }
            }
            return b(c.n(str, fVar, map), i, i2, i3);
        }
    }
}
