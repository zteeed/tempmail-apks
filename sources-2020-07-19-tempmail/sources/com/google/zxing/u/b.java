package com.google.zxing.u;

import com.google.zxing.a;
import com.google.zxing.f;
import com.google.zxing.q;
import com.google.zxing.u.e.e;
import com.google.zxing.u.e.i;
import com.google.zxing.u.e.j;
import com.google.zxing.u.e.k;
import com.google.zxing.u.e.l;
import java.util.Map;

/* compiled from: DataMatrixWriter */
public final class b implements q {
    private static com.google.zxing.t.b b(com.google.zxing.y.e.b bVar, int i, int i2) {
        com.google.zxing.t.b bVar2;
        int e2 = bVar.e();
        int d2 = bVar.d();
        int max = Math.max(i, e2);
        int max2 = Math.max(i2, d2);
        int min = Math.min(max / e2, max2 / d2);
        int i3 = (max - (e2 * min)) / 2;
        int i4 = (max2 - (d2 * min)) / 2;
        if (i2 < d2 || i < e2) {
            bVar2 = new com.google.zxing.t.b(e2, d2);
            i3 = 0;
            i4 = 0;
        } else {
            bVar2 = new com.google.zxing.t.b(i, i2);
        }
        bVar2.c();
        int i5 = 0;
        while (i5 < d2) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < e2) {
                if (bVar.b(i7, i5) == 1) {
                    bVar2.r(i6, i4, min, min);
                }
                i7++;
                i6 += min;
            }
            i5++;
            i4 += min;
        }
        return bVar2;
    }

    private static com.google.zxing.t.b c(e eVar, k kVar, int i, int i2) {
        int h = kVar.h();
        int g = kVar.g();
        com.google.zxing.y.e.b bVar = new com.google.zxing.y.e.b(kVar.j(), kVar.i());
        int i3 = 0;
        for (int i4 = 0; i4 < g; i4++) {
            if (i4 % kVar.f11861e == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < kVar.j(); i6++) {
                    bVar.g(i5, i3, i6 % 2 == 0);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < h; i8++) {
                if (i8 % kVar.f11860d == 0) {
                    bVar.g(i7, i3, true);
                    i7++;
                }
                bVar.g(i7, i3, eVar.e(i8, i4));
                i7++;
                int i9 = kVar.f11860d;
                if (i8 % i9 == i9 - 1) {
                    bVar.g(i7, i3, i4 % 2 == 0);
                    i7++;
                }
            }
            i3++;
            int i10 = kVar.f11861e;
            if (i4 % i10 == i10 - 1) {
                int i11 = 0;
                for (int i12 = 0; i12 < kVar.j(); i12++) {
                    bVar.g(i11, i3, true);
                    i11++;
                }
                i3++;
            }
        }
        return b(bVar, i, i2);
    }

    public com.google.zxing.t.b a(String str, a aVar, int i, int i2, Map<f, ?> map) {
        com.google.zxing.e eVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        } else {
            l lVar = l.FORCE_NONE;
            com.google.zxing.e eVar2 = null;
            if (map != null) {
                l lVar2 = (l) map.get(f.DATA_MATRIX_SHAPE);
                if (lVar2 != null) {
                    lVar = lVar2;
                }
                com.google.zxing.e eVar3 = (com.google.zxing.e) map.get(f.MIN_SIZE);
                if (eVar3 == null) {
                    eVar3 = null;
                }
                eVar = (com.google.zxing.e) map.get(f.MAX_SIZE);
                if (eVar == null) {
                    eVar = null;
                }
                eVar2 = eVar3;
            } else {
                eVar = null;
            }
            String b2 = j.b(str, lVar, eVar2, eVar);
            k l = k.l(b2.length(), lVar, eVar2, eVar, true);
            e eVar4 = new e(i.c(b2, l), l.h(), l.g());
            eVar4.h();
            return c(eVar4, l, i, i2);
        }
    }
}
