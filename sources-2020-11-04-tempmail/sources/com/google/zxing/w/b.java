package com.google.zxing.w;

/* compiled from: CodaBarWriter */
public final class b extends s {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f12428a;

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f12429b = {'T', 'N', '*', 'E'};

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f12430c = {'/', ':', '+', '.'};

    /* renamed from: d  reason: collision with root package name */
    private static final char f12431d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f12428a = cArr;
        f12431d = cArr[0];
    }

    public boolean[] c(String str) {
        int i;
        if (str.length() < 2) {
            str = f12431d + str + f12431d;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            boolean i2 = a.i(f12428a, upperCase);
            boolean i3 = a.i(f12428a, upperCase2);
            boolean i4 = a.i(f12429b, upperCase);
            boolean i5 = a.i(f12429b, upperCase2);
            if (i2) {
                if (!i3) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(str)));
                }
            } else if (i4) {
                if (!i5) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(str)));
                }
            } else if (i3 || i5) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(str)));
            } else {
                str = f12431d + str + f12431d;
            }
        }
        int i6 = 20;
        for (int i7 = 1; i7 < str.length() - 1; i7++) {
            if (Character.isDigit(str.charAt(i7)) || str.charAt(i7) == '-' || str.charAt(i7) == '$') {
                i6 += 9;
            } else if (a.i(f12430c, str.charAt(i7))) {
                i6 += 10;
            } else {
                throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i7) + '\'');
            }
        }
        boolean[] zArr = new boolean[(i6 + (str.length() - 1))];
        int i8 = 0;
        for (int i9 = 0; i9 < str.length(); i9++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i9));
            if (i9 == 0 || i9 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i10 = 0;
            while (true) {
                char[] cArr = a.f12422d;
                if (i10 >= cArr.length) {
                    i = 0;
                    break;
                } else if (upperCase3 == cArr[i10]) {
                    i = a.f12423e[i10];
                    break;
                } else {
                    i10++;
                }
            }
            int i11 = 0;
            boolean z = true;
            while (true) {
                int i12 = 0;
                while (i11 < 7) {
                    zArr[i8] = z;
                    i8++;
                    if (((i >> (6 - i11)) & 1) == 0 || i12 == 1) {
                        z = !z;
                        i11++;
                    } else {
                        i12++;
                    }
                }
                break;
            }
            if (i9 < str.length() - 1) {
                zArr[i8] = false;
                i8++;
            }
        }
        return zArr;
    }
}
