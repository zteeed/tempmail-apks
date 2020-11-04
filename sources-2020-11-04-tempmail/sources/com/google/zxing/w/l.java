package com.google.zxing.w;

import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import com.google.zxing.a;
import com.google.zxing.f;
import com.google.zxing.t.b;
import java.util.Map;

/* compiled from: EAN8Writer */
public final class l extends z {
    public b a(String str, a aVar, int i, int i2, Map<f, ?> map) throws WriterException {
        if (aVar == a.EAN_8) {
            return super.a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + y.s(str);
            } catch (FormatException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else if (length == 8) {
            try {
                if (!y.j(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[67];
        int b2 = s.b(zArr, 0, y.f12515d, true) + 0;
        for (int i = 0; i <= 3; i++) {
            b2 += s.b(zArr, b2, y.g[Character.digit(str.charAt(i), 10)], false);
        }
        int b3 = b2 + s.b(zArr, b2, y.f12516e, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            b3 += s.b(zArr, b3, y.g[Character.digit(str.charAt(i2), 10)], true);
        }
        s.b(zArr, b3, y.f12515d, true);
        return zArr;
    }
}
