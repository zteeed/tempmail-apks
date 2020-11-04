package com.google.zxing.w;

import com.google.zxing.WriterException;
import com.google.zxing.a;
import com.google.zxing.f;
import com.google.zxing.t.b;
import java.util.Map;

/* compiled from: Code93Writer */
public class h extends s {
    private static int f(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
        return 9;
    }

    private static int g(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    private static void h(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    public b a(String str, a aVar, int i, int i2, Map<f, ?> map) throws WriterException {
        if (aVar == a.CODE_93) {
            return super.a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            h(g.f11941d[47], iArr);
            boolean[] zArr = new boolean[(((str.length() + 2 + 2) * 9) + 1)];
            int f2 = f(zArr, 0, iArr);
            for (int i = 0; i < length; i++) {
                h(g.f11941d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i))], iArr);
                f2 += f(zArr, f2, iArr);
            }
            int g = g(str, 20);
            h(g.f11941d[g], iArr);
            int f3 = f2 + f(zArr, f2, iArr);
            h(g.f11941d[g(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(g), 15)], iArr);
            int f4 = f3 + f(zArr, f3, iArr);
            h(g.f11941d[47], iArr);
            zArr[f4 + f(zArr, f4, iArr)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
