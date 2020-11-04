package com.google.zxing.w;

import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import com.google.zxing.a;
import com.google.zxing.f;
import com.google.zxing.t.b;
import java.util.Map;

/* compiled from: EAN13Writer */
public final class j extends z {
    public b a(String str, a aVar, int i, int i2, Map<f, ?> map) throws WriterException {
        if (aVar == a.EAN_13) {
            return super.a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + y.s(str);
            } catch (FormatException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else if (length == 13) {
            try {
                if (!y.j(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        int i = i.j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b2 = s.b(zArr, 0, y.f11966d, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            b2 += s.b(zArr, b2, y.h[digit], false);
        }
        int b3 = b2 + s.b(zArr, b2, y.f11967e, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            b3 += s.b(zArr, b3, y.g[Character.digit(str.charAt(i3), 10)], true);
        }
        s.b(zArr, b3, y.f11966d, true);
        return zArr;
    }
}
