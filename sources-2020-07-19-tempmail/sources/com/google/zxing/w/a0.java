package com.google.zxing.w;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.t.a;

/* compiled from: UPCEReader */
public final class a0 extends y {
    private static final int[] j = {1, 1, 1, 1, 1, 1};
    static final int[][] k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    private final int[] i = new int[4];

    public static String t(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c2 = cArr[5];
        switch (c2) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c2);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c2);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    private static void u(StringBuilder sb, int i2) throws NotFoundException {
        for (int i3 = 0; i3 <= 1; i3++) {
            for (int i4 = 0; i4 < 10; i4++) {
                if (i2 == k[i3][i4]) {
                    sb.insert(0, (char) (i3 + 48));
                    sb.append((char) (i4 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.a();
    }

    /* access modifiers changed from: protected */
    public boolean i(String str) throws FormatException {
        return super.i(t(str));
    }

    /* access modifiers changed from: protected */
    public int[] l(a aVar, int i2) throws NotFoundException {
        return y.o(aVar, i2, true, j);
    }

    /* access modifiers changed from: protected */
    public int m(a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int n = aVar.n();
        int i2 = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 6 && i2 < n; i4++) {
            int k2 = y.k(aVar, iArr2, i2, y.h);
            sb.append((char) ((k2 % 10) + 48));
            for (int i5 : iArr2) {
                i2 += i5;
            }
            if (k2 >= 10) {
                i3 |= 1 << (5 - i4);
            }
        }
        u(sb, i3);
        return i2;
    }

    /* access modifiers changed from: package-private */
    public com.google.zxing.a r() {
        return com.google.zxing.a.UPC_E;
    }
}
