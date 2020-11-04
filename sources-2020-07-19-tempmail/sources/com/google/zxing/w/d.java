package com.google.zxing.w;

import com.google.zxing.WriterException;
import com.google.zxing.f;
import com.google.zxing.t.b;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Code128Writer */
public final class d extends s {

    /* compiled from: Code128Writer */
    private enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int f(CharSequence charSequence, int i, int i2) {
        a g;
        a g2;
        char charAt;
        a g3 = g(charSequence, i);
        if (g3 == a.ONE_DIGIT) {
            return 100;
        }
        if (g3 == a.UNCODABLE) {
            if (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || charAt >= '`'))) {
                return 100;
            }
            return 101;
        } else if (i2 == 99) {
            return 99;
        } else {
            if (i2 != 100) {
                if (g3 == a.FNC_1) {
                    g3 = g(charSequence, i + 1);
                }
                if (g3 == a.TWO_DIGITS) {
                    return 99;
                }
                return 100;
            } else if (g3 == a.FNC_1 || (g = g(charSequence, i + 2)) == a.UNCODABLE || g == a.ONE_DIGIT) {
                return 100;
            } else {
                if (g != a.FNC_1) {
                    int i3 = i + 4;
                    while (true) {
                        g2 = g(charSequence, i3);
                        if (g2 != a.TWO_DIGITS) {
                            break;
                        }
                        i3 += 2;
                    }
                    if (g2 == a.ONE_DIGIT) {
                        return 100;
                    }
                    return 99;
                } else if (g(charSequence, i + 3) == a.TWO_DIGITS) {
                    return 99;
                } else {
                    return 100;
                }
            }
        }
    }

    private static a g(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return a.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 < '0' || charAt2 > '9') {
            return a.ONE_DIGIT;
        }
        return a.TWO_DIGITS;
    }

    public b a(String str, com.google.zxing.a aVar, int i, int i2, Map<f, ?> map) throws WriterException {
        if (aVar == com.google.zxing.a.CODE_128) {
            return super.a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt <= 127) {
                        break;
                    } else {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = 103;
            if (i3 < length) {
                int f2 = f(str, i3, i5);
                int i8 = 100;
                if (f2 == i5) {
                    switch (str.charAt(i3)) {
                        case 241:
                            i8 = 102;
                            break;
                        case 242:
                            i8 = 97;
                            break;
                        case 243:
                            i8 = 96;
                            break;
                        case 244:
                            if (i5 == 101) {
                                i8 = 101;
                                break;
                            }
                            break;
                        default:
                            if (i5 != 100) {
                                if (i5 == 101) {
                                    i8 = str.charAt(i3) - ' ';
                                    if (i8 < 0) {
                                        i8 += 96;
                                        break;
                                    }
                                } else {
                                    i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                                    i3++;
                                    break;
                                }
                            } else {
                                i8 = str.charAt(i3) - ' ';
                                break;
                            }
                            break;
                    }
                    i3++;
                } else {
                    if (i5 != 0) {
                        i7 = f2;
                    } else if (f2 == 100) {
                        i7 = 104;
                    } else if (f2 != 101) {
                        i7 = 105;
                    }
                    i8 = i7;
                    i5 = f2;
                }
                arrayList.add(c.f11883a[i8]);
                i4 += i8 * i6;
                if (i3 != 0) {
                    i6++;
                }
            } else {
                arrayList.add(c.f11883a[i4 % 103]);
                arrayList.add(c.f11883a[106]);
                int i9 = 0;
                for (int[] iArr : arrayList) {
                    for (int i10 : (int[]) r13.next()) {
                        i9 += i10;
                    }
                }
                boolean[] zArr = new boolean[i9];
                for (int[] b2 : arrayList) {
                    i += s.b(zArr, i, b2, true);
                }
                return zArr;
            }
        }
    }
}
