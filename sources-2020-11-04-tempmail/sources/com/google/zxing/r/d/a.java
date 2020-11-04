package com.google.zxing.r.d;

import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.t.e;
import com.tempmail.m.c;
import com.tempmail.splash.g;
import com.tempmail.t.p;
import com.tempmail.t.y;
import com.tempmail.utils.i;
import com.tempmail.utils.x;
import java.util.Arrays;
import java.util.List;

/* compiled from: Decoder */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f12251b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f12252c = {"CTRL_PS", " ", "a", "b", c.f12927e, "d", "e", "f", g.f13030e, "h", i.f13118a, "j", "k", "l", "m", "n", "o", p.g, "q", "r", "s", "t", "u", "v", "w", x.f13134a, y.f13082d, "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f12253d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f12254e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f12255f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a  reason: collision with root package name */
    private com.google.zxing.r.a f12256a;

    /* renamed from: com.google.zxing.r.d.a$a  reason: collision with other inner class name */
    /* compiled from: Decoder */
    static /* synthetic */ class C0112a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12257a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.r.d.a$b[] r0 = com.google.zxing.r.d.a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12257a = r0
                com.google.zxing.r.d.a$b r1 = com.google.zxing.r.d.a.b.UPPER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12257a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.r.d.a$b r1 = com.google.zxing.r.d.a.b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12257a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.r.d.a$b r1 = com.google.zxing.r.d.a.b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12257a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.r.d.a$b r1 = com.google.zxing.r.d.a.b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12257a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.r.d.a$b r1 = com.google.zxing.r.d.a.b.DIGIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.r.d.a.C0112a.<clinit>():void");
        }
    }

    /* compiled from: Decoder */
    private enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = h(zArr, i << 3);
        }
        return bArr;
    }

    private boolean[] b(boolean[] zArr) throws FormatException {
        com.google.zxing.common.reedsolomon.a aVar;
        int i = 8;
        if (this.f12256a.d() <= 2) {
            i = 6;
            aVar = com.google.zxing.common.reedsolomon.a.j;
        } else if (this.f12256a.d() <= 8) {
            aVar = com.google.zxing.common.reedsolomon.a.n;
        } else if (this.f12256a.d() <= 22) {
            i = 10;
            aVar = com.google.zxing.common.reedsolomon.a.i;
        } else {
            i = 12;
            aVar = com.google.zxing.common.reedsolomon.a.h;
        }
        int c2 = this.f12256a.c();
        int length = zArr.length / i;
        if (length >= c2) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = i(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new com.google.zxing.common.reedsolomon.c(aVar).a(iArr, length - c2);
                int i3 = (1 << i) - 1;
                int i4 = 0;
                for (int i5 = 0; i5 < c2; i5++) {
                    int i6 = iArr[i5];
                    if (i6 == 0 || i6 == i3) {
                        throw FormatException.a();
                    }
                    if (i6 == 1 || i6 == i3 - 1) {
                        i4++;
                    }
                }
                boolean[] zArr2 = new boolean[((c2 * i) - i4)];
                int i7 = 0;
                for (int i8 = 0; i8 < c2; i8++) {
                    int i9 = iArr[i8];
                    if (i9 == 1 || i9 == i3 - 1) {
                        Arrays.fill(zArr2, i7, (i7 + i) - 1, i9 > 1);
                        i7 += i - 1;
                    } else {
                        int i10 = i - 1;
                        while (i10 >= 0) {
                            int i11 = i7 + 1;
                            zArr2[i7] = ((1 << i10) & i9) != 0;
                            i10--;
                            i7 = i11;
                        }
                    }
                }
                return zArr2;
            } catch (ReedSolomonException e2) {
                throw FormatException.b(e2);
            }
        } else {
            throw FormatException.a();
        }
    }

    private boolean[] d(com.google.zxing.t.b bVar) {
        com.google.zxing.t.b bVar2 = bVar;
        boolean e2 = this.f12256a.e();
        int d2 = this.f12256a.d();
        int i = (e2 ? 11 : 14) + (d2 << 2);
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[j(d2, e2)];
        int i2 = 2;
        if (e2) {
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i / 2;
            int i5 = ((i + 1) + (((i4 - 1) / 15) * 2)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = (i6 / 15) + i6;
                iArr[(i4 - i6) - 1] = (i5 - i7) - 1;
                iArr[i4 + i6] = i7 + i5 + 1;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < d2) {
            int i10 = ((d2 - i8) << i2) + (e2 ? 9 : 12);
            int i11 = i8 << 1;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 << 1;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i9 + i14 + i15] = bVar2.f(iArr[i16], iArr[i17]);
                    int i18 = iArr[i17];
                    int i19 = i12 - i15;
                    zArr[(i10 * 2) + i9 + i14 + i15] = bVar2.f(i18, iArr[i19]);
                    int i20 = i12 - i13;
                    zArr[(i10 * 4) + i9 + i14 + i15] = bVar2.f(iArr[i19], iArr[i20]);
                    zArr[(i10 * 6) + i9 + i14 + i15] = bVar2.f(iArr[i20], iArr[i16]);
                    i15++;
                    d2 = d2;
                    e2 = e2;
                    i2 = 2;
                }
                boolean z = e2;
                int i21 = d2;
                i13++;
                i2 = 2;
            }
            boolean z2 = e2;
            int i22 = d2;
            i9 += i10 << 3;
            i8++;
            i2 = 2;
        }
        return zArr;
    }

    private static String e(b bVar, int i) {
        int i2 = C0112a.f12257a[bVar.ordinal()];
        if (i2 == 1) {
            return f12251b[i];
        }
        if (i2 == 2) {
            return f12252c[i];
        }
        if (i2 == 3) {
            return f12253d[i];
        }
        if (i2 == 4) {
            return f12254e[i];
        }
        if (i2 == 5) {
            return f12255f[i];
        }
        throw new IllegalStateException("Bad table");
    }

    private static String f(boolean[] zArr) {
        int length = zArr.length;
        b bVar = b.UPPER;
        StringBuilder sb = new StringBuilder(20);
        b bVar2 = bVar;
        int i = 0;
        while (i < length) {
            if (bVar == b.BINARY) {
                if (length - i < 5) {
                    break;
                }
                int i2 = i(zArr, i, 5);
                i += 5;
                if (i2 == 0) {
                    if (length - i < 11) {
                        break;
                    }
                    i2 = i(zArr, i, 11) + 31;
                    i += 11;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        break;
                    } else if (length - i < 8) {
                        i = length;
                        break;
                    } else {
                        sb.append((char) i(zArr, i, 8));
                        i += 8;
                        i3++;
                    }
                }
            } else {
                int i4 = bVar == b.DIGIT ? 4 : 5;
                if (length - i < i4) {
                    break;
                }
                int i5 = i(zArr, i, i4);
                i += i4;
                String e2 = e(bVar, i5);
                if (e2.startsWith("CTRL_")) {
                    bVar2 = g(e2.charAt(5));
                    if (e2.charAt(6) != 'L') {
                        b bVar3 = bVar2;
                        bVar2 = bVar;
                        bVar = bVar3;
                    }
                } else {
                    sb.append(e2);
                }
            }
            bVar = bVar2;
        }
        return sb.toString();
    }

    private static b g(char c2) {
        if (c2 == 'B') {
            return b.BINARY;
        }
        if (c2 == 'D') {
            return b.DIGIT;
        }
        if (c2 == 'P') {
            return b.PUNCT;
        }
        if (c2 == 'L') {
            return b.LOWER;
        }
        if (c2 != 'M') {
            return b.UPPER;
        }
        return b.MIXED;
    }

    private static byte h(boolean[] zArr, int i) {
        int i2;
        int length = zArr.length - i;
        if (length >= 8) {
            i2 = i(zArr, i, 8);
        } else {
            i2 = i(zArr, i, length) << (8 - length);
        }
        return (byte) i2;
    }

    private static int i(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    private static int j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    public e c(com.google.zxing.r.a aVar) throws FormatException {
        this.f12256a = aVar;
        boolean[] b2 = b(d(aVar.a()));
        e eVar = new e(a(b2), f(b2), (List<byte[]>) null, (String) null);
        eVar.l(b2.length);
        return eVar;
    }
}
