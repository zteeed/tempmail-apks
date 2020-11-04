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

/* compiled from: Code39Reader */
public final class e extends r {

    /* renamed from: e  reason: collision with root package name */
    static final int[] f12484e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12485a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12486b;

    /* renamed from: c  reason: collision with root package name */
    private final StringBuilder f12487c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f12488d;

    public e() {
        this(false);
    }

    private static String i(CharSequence charSequence) throws FormatException {
        char c2;
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i = charAt2 - ' ';
                                } else if (charAt2 == 'Z') {
                                    c2 = ':';
                                    sb.append(c2);
                                } else {
                                    throw FormatException.a();
                                }
                            }
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw FormatException.a();
                        } else {
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i = charAt2 + 16;
                    } else if (charAt2 >= 'P' && charAt2 <= 'T') {
                        i = charAt2 + '+';
                    } else if (charAt2 != 'U') {
                        if (charAt2 == 'V') {
                            c2 = '@';
                        } else if (charAt2 == 'W') {
                            c2 = '`';
                        } else if (charAt2 == 'X' || charAt2 == 'Y' || charAt2 == 'Z') {
                            c2 = 127;
                        } else {
                            throw FormatException.a();
                        }
                        sb.append(c2);
                    }
                    c2 = 0;
                    sb.append(c2);
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw FormatException.a();
                } else {
                    i = charAt2 - '@';
                }
                c2 = (char) i;
                sb.append(c2);
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }

    private static int[] j(a aVar, int[] iArr) throws NotFoundException {
        int n = aVar.n();
        int k = aVar.k(0);
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
                } else if (l(iArr) != 148 || !aVar.p(Math.max(0, i - ((k - i) / 2)), i, false)) {
                    i += iArr[0] + iArr[1];
                    int i3 = i2 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i2] = 0;
                    i2--;
                } else {
                    return new int[]{i, k};
                }
                iArr[i2] = 1;
                z = !z;
            }
            k++;
        }
        throw NotFoundException.a();
    }

    private static char k(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f12484e;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i2);
                }
                i2++;
            } else if (i == 148) {
                return '*';
            } else {
                throw NotFoundException.a();
            }
        }
    }

    private static int l(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    public m d(int i, a aVar, Map<d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        String str;
        int[] iArr = this.f12488d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f12487c;
        sb.setLength(0);
        int[] j = j(aVar, iArr);
        int k = aVar.k(j[1]);
        int n = aVar.n();
        while (true) {
            r.g(aVar, k, iArr);
            int l = l(iArr);
            if (l >= 0) {
                char k2 = k(l);
                sb.append(k2);
                int i2 = k;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int k3 = aVar.k(i2);
                if (k2 == '*') {
                    sb.setLength(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    int i6 = (k3 - k) - i4;
                    if (k3 == n || (i6 << 1) >= i4) {
                        if (this.f12485a) {
                            int length = sb.length() - 1;
                            int i7 = 0;
                            for (int i8 = 0; i8 < length; i8++) {
                                i7 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f12487c.charAt(i8));
                            }
                            if (sb.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i7 % 43)) {
                                sb.setLength(length);
                            } else {
                                throw ChecksumException.a();
                            }
                        }
                        if (sb.length() != 0) {
                            if (this.f12486b) {
                                str = i(sb);
                            } else {
                                str = sb.toString();
                            }
                            float f2 = (float) i;
                            return new m(str, (byte[]) null, new o[]{new o(((float) (j[1] + j[0])) / 2.0f, f2), new o(((float) k) + (((float) i4) / 2.0f), f2)}, com.google.zxing.a.CODE_39);
                        }
                        throw NotFoundException.a();
                    }
                    throw NotFoundException.a();
                }
                k = k3;
            } else {
                throw NotFoundException.a();
            }
        }
    }

    public e(boolean z) {
        this(z, false);
    }

    public e(boolean z, boolean z2) {
        this.f12485a = z;
        this.f12486b = z2;
        this.f12487c = new StringBuilder(20);
        this.f12488d = new int[9];
    }
}
