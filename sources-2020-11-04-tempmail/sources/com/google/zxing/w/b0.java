package com.google.zxing.w;

import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import com.google.zxing.a;
import com.google.zxing.f;
import com.google.zxing.t.b;
import java.util.Map;

/* compiled from: UPCEWriter */
public final class b0 extends z {
    public b a(String str, a aVar, int i, int i2, Map<f, ?> map) throws WriterException {
        if (aVar == a.UPC_E) {
            return super.a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + y.s(a0.t(str));
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
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i = a0.k[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int b2 = s.b(zArr, 0, y.f12515d, true) + 0;
            for (int i2 = 1; i2 <= 6; i2++) {
                int digit2 = Character.digit(str.charAt(i2), 10);
                if (((i >> (6 - i2)) & 1) == 1) {
                    digit2 += 10;
                }
                b2 += s.b(zArr, b2, y.h[digit2], false);
            }
            s.b(zArr, b2, y.f12517f, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }
}
