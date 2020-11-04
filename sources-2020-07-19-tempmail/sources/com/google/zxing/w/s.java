package com.google.zxing.w;

import com.google.zxing.WriterException;
import com.google.zxing.a;
import com.google.zxing.f;
import com.google.zxing.q;
import com.google.zxing.t.b;
import java.util.Map;

/* compiled from: OneDimensionalCodeWriter */
public abstract class s implements q {
    protected static int b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    private static b e(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        b bVar = new b(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                bVar.r(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return bVar;
    }

    public b a(String str, a aVar, int i, int i2, Map<f, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        } else {
            int d2 = d();
            if (map != null && map.containsKey(f.MARGIN)) {
                d2 = Integer.parseInt(map.get(f.MARGIN).toString());
            }
            return e(c(str), i, i2, d2);
        }
    }

    public abstract boolean[] c(String str);

    public int d() {
        return 10;
    }
}
