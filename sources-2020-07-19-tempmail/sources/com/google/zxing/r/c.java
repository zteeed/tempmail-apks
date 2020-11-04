package com.google.zxing.r;

import com.google.zxing.a;
import com.google.zxing.f;
import com.google.zxing.q;
import com.google.zxing.t.b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: AztecWriter */
public final class c implements q {
    private static b b(String str, a aVar, int i, int i2, Charset charset, int i3, int i4) {
        if (aVar == a.AZTEC) {
            return c(com.google.zxing.r.f.c.d(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    private static b c(com.google.zxing.r.f.a aVar, int i, int i2) {
        b a2 = aVar.a();
        if (a2 != null) {
            int n = a2.n();
            int j = a2.j();
            int max = Math.max(i, n);
            int max2 = Math.max(i2, j);
            int min = Math.min(max / n, max2 / j);
            int i3 = (max - (n * min)) / 2;
            int i4 = (max2 - (j * min)) / 2;
            b bVar = new b(max, max2);
            int i5 = 0;
            while (i5 < j) {
                int i6 = i3;
                int i7 = 0;
                while (i7 < n) {
                    if (a2.f(i7, i5)) {
                        bVar.r(i6, i4, min, min);
                    }
                    i7++;
                    i6 += min;
                }
                i5++;
                i4 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    public b a(String str, a aVar, int i, int i2, Map<f, ?> map) {
        int i3;
        int i4;
        Charset charset;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        int i5 = 33;
        if (map != null) {
            if (map.containsKey(f.CHARACTER_SET)) {
                charset2 = Charset.forName(map.get(f.CHARACTER_SET).toString());
            }
            if (map.containsKey(f.ERROR_CORRECTION)) {
                i5 = Integer.parseInt(map.get(f.ERROR_CORRECTION).toString());
            }
            if (map.containsKey(f.AZTEC_LAYERS)) {
                charset = charset2;
                i4 = i5;
                i3 = Integer.parseInt(map.get(f.AZTEC_LAYERS).toString());
                return b(str, aVar, i, i2, charset, i4, i3);
            }
            charset = charset2;
            i4 = i5;
        } else {
            charset = charset2;
            i4 = 33;
        }
        i3 = 0;
        return b(str, aVar, i, i2, charset, i4, i3);
    }
}
