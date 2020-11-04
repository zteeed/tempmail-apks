package com.google.zxing.w;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.d;
import com.google.zxing.m;
import com.google.zxing.o;
import com.google.zxing.t.a;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Code93Reader */
public final class g extends r {

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f11940c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d  reason: collision with root package name */
    static final int[] f11941d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f11942e;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f11943a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    private final int[] f11944b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f11941d = iArr;
        f11942e = iArr[47];
    }

    private static void i(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        j(charSequence, length - 2, 20);
        j(charSequence, length - 1, 15);
    }

    private static void j(CharSequence charSequence, int i, int i2) throws ChecksumException {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f11940c[i3 % 47]) {
            throw ChecksumException.a();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String k(java.lang.CharSequence r9) throws com.google.zxing.FormatException {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r0) goto L_0x009f
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto L_0x0098
            r5 = 100
            if (r4 > r5) goto L_0x0098
            int r5 = r0 + -1
            if (r3 >= r5) goto L_0x0093
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L_0x0082;
                case 98: goto L_0x004c;
                case 99: goto L_0x003b;
                case 100: goto L_0x002f;
                default: goto L_0x002c;
            }
        L_0x002c:
            r4 = 0
            goto L_0x008f
        L_0x002f:
            if (r5 < r8) goto L_0x0036
            if (r5 > r7) goto L_0x0036
            int r5 = r5 + 32
            goto L_0x0088
        L_0x0036:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.a()
            throw r9
        L_0x003b:
            if (r5 < r8) goto L_0x0042
            if (r5 > r6) goto L_0x0042
            int r5 = r5 + -32
            goto L_0x0088
        L_0x0042:
            if (r5 != r7) goto L_0x0047
            r4 = 58
            goto L_0x008f
        L_0x0047:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.a()
            throw r9
        L_0x004c:
            if (r5 < r8) goto L_0x0055
            r4 = 69
            if (r5 > r4) goto L_0x0055
            int r5 = r5 + -38
            goto L_0x0088
        L_0x0055:
            r4 = 70
            if (r5 < r4) goto L_0x0060
            r4 = 74
            if (r5 > r4) goto L_0x0060
            int r5 = r5 + -11
            goto L_0x0088
        L_0x0060:
            r4 = 75
            if (r5 < r4) goto L_0x0069
            if (r5 > r6) goto L_0x0069
            int r5 = r5 + 16
            goto L_0x0088
        L_0x0069:
            r4 = 80
            if (r5 < r4) goto L_0x0074
            r4 = 83
            if (r5 > r4) goto L_0x0074
            int r5 = r5 + 43
            goto L_0x0088
        L_0x0074:
            r4 = 84
            if (r5 < r4) goto L_0x007d
            if (r5 > r7) goto L_0x007d
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x008f
        L_0x007d:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.a()
            throw r9
        L_0x0082:
            if (r5 < r8) goto L_0x008a
            if (r5 > r7) goto L_0x008a
            int r5 = r5 + -64
        L_0x0088:
            char r4 = (char) r5
            goto L_0x008f
        L_0x008a:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.a()
            throw r9
        L_0x008f:
            r1.append(r4)
            goto L_0x009b
        L_0x0093:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.a()
            throw r9
        L_0x0098:
            r1.append(r4)
        L_0x009b:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x009f:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.w.g.k(java.lang.CharSequence):java.lang.String");
    }

    private int[] l(a aVar) throws NotFoundException {
        int n = aVar.n();
        int k = aVar.k(0);
        Arrays.fill(this.f11944b, 0);
        int[] iArr = this.f11944b;
        int length = iArr.length;
        int i = k;
        boolean z = false;
        int i2 = 0;
        while (k < n) {
            if (aVar.i(k) != z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else if (n(iArr) == f11942e) {
                    return new int[]{i, k};
                } else {
                    i += iArr[0] + iArr[1];
                    int i3 = i2 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i2] = 0;
                    i2--;
                }
                iArr[i2] = 1;
                z = !z;
            }
            k++;
        }
        throw NotFoundException.a();
    }

    private static char m(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f11941d;
            if (i2 >= iArr.length) {
                throw NotFoundException.a();
            } else if (iArr[i2] == i) {
                return f11940c[i2];
            } else {
                i2++;
            }
        }
    }

    private static int n(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((((float) iArr[i4]) * 9.0f) / ((float) i));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    public m d(int i, a aVar, Map<d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] l = l(aVar);
        int k = aVar.k(l[1]);
        int n = aVar.n();
        int[] iArr = this.f11944b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f11943a;
        sb.setLength(0);
        while (true) {
            r.g(aVar, k, iArr);
            int n2 = n(iArr);
            if (n2 >= 0) {
                char m = m(n2);
                sb.append(m);
                int i2 = k;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int k2 = aVar.k(i2);
                if (m == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (k2 == n || !aVar.i(k2)) {
                        throw NotFoundException.a();
                    } else if (sb.length() >= 2) {
                        i(sb);
                        sb.setLength(sb.length() - 2);
                        float f2 = (float) i;
                        return new m(k(sb), (byte[]) null, new o[]{new o(((float) (l[1] + l[0])) / 2.0f, f2), new o(((float) k) + (((float) i4) / 2.0f), f2)}, com.google.zxing.a.CODE_93);
                    } else {
                        throw NotFoundException.a();
                    }
                } else {
                    k = k2;
                }
            } else {
                throw NotFoundException.a();
            }
        }
    }
}
