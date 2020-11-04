package com.google.zxing.x.e;

import com.google.zxing.FormatException;
import com.google.zxing.t.d;
import com.google.zxing.x.c;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: DecodedBitStreamParser */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f12542a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f12543b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c  reason: collision with root package name */
    private static final BigInteger[] f12544c;

    /* compiled from: DecodedBitStreamParser */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12545a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.x.e.e$b[] r0 = com.google.zxing.x.e.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12545a = r0
                com.google.zxing.x.e.e$b r1 = com.google.zxing.x.e.e.b.ALPHA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12545a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.x.e.e$b r1 = com.google.zxing.x.e.e.b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12545a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.x.e.e$b r1 = com.google.zxing.x.e.e.b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12545a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.x.e.e$b r1 = com.google.zxing.x.e.e.b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12545a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.x.e.e$b r1 = com.google.zxing.x.e.e.b.ALPHA_SHIFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f12545a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.zxing.x.e.e$b r1 = com.google.zxing.x.e.e.b.PUNCT_SHIFT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.x.e.e.a.<clinit>():void");
        }
    }

    /* compiled from: DecodedBitStreamParser */
    private enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f12544c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        f12544c[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f12544c;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    private static int a(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7 = i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long j2 = 900;
        int i8 = 6;
        if (i7 == 901) {
            int[] iArr2 = new int[6];
            int i9 = i2 + 1;
            int i10 = iArr[i2];
            boolean z = false;
            while (true) {
                i6 = 0;
                long j3 = 0;
                while (i5 < iArr[0] && !z) {
                    int i11 = i6 + 1;
                    iArr2[i6] = i4;
                    j3 = (j3 * j) + ((long) i4);
                    int i12 = i5 + 1;
                    i10 = iArr[i5];
                    if (i10 != 928) {
                        switch (i10) {
                            case 900:
                            case 901:
                            case 902:
                                break;
                            default:
                                switch (i10) {
                                    case 922:
                                    case 923:
                                    case 924:
                                        break;
                                    default:
                                        if (i11 % 5 != 0 || i11 <= 0) {
                                            i4 = i10;
                                            i5 = i12;
                                            i6 = i11;
                                            j = 900;
                                            i8 = 6;
                                            break;
                                        } else {
                                            int i13 = 0;
                                            while (i13 < i8) {
                                                byteArrayOutputStream.write((byte) ((int) (j3 >> ((5 - i13) * 8))));
                                                i13++;
                                                i10 = i10;
                                                i8 = 6;
                                            }
                                            int i14 = i10;
                                            i9 = i12;
                                            j2 = 900;
                                        }
                                }
                                break;
                        }
                    }
                    i5 = i12 - 1;
                    i4 = i10;
                    i6 = i11;
                    j = 900;
                    i8 = 6;
                    z = true;
                }
            }
            if (i5 == iArr[0] && i4 < 900) {
                iArr2[i6] = i4;
                i6++;
            }
            for (int i15 = 0; i15 < i6; i15++) {
                byteArrayOutputStream.write((byte) iArr2[i15]);
            }
            i3 = i5;
        } else if (i7 != 924) {
            i3 = i2;
        } else {
            i3 = i2;
            boolean z2 = false;
            while (true) {
                int i16 = 0;
                long j4 = 0;
                while (i3 < iArr[0] && !z2) {
                    int i17 = i3 + 1;
                    int i18 = iArr[i3];
                    if (i18 < 900) {
                        i16++;
                        j4 = (j4 * 900) + ((long) i18);
                    } else {
                        if (i18 != 928) {
                            switch (i18) {
                                case 900:
                                case 901:
                                case 902:
                                    break;
                                default:
                                    switch (i18) {
                                        case 922:
                                        case 923:
                                        case 924:
                                            break;
                                    }
                            }
                        }
                        i3 = i17 - 1;
                        z2 = true;
                        if (i16 % 5 != 0 && i16 > 0) {
                            for (int i19 = 0; i19 < 6; i19++) {
                                byteArrayOutputStream.write((byte) ((int) (j4 >> ((5 - i19) * 8))));
                            }
                        }
                    }
                    i3 = i17;
                    if (i16 % 5 != 0) {
                    }
                }
            }
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i3;
    }

    static com.google.zxing.t.e b(int[] iArr, String str) throws FormatException {
        int i;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charset = StandardCharsets.ISO_8859_1;
        int i2 = iArr[1];
        c cVar = new c();
        int i3 = 2;
        while (i3 < iArr[0]) {
            if (i2 != 913) {
                switch (i2) {
                    case 900:
                        i = g(iArr, i3, sb);
                        break;
                    case 901:
                        i = a(i2, iArr, charset, i3, sb);
                        break;
                    case 902:
                        i = f(iArr, i3, sb);
                        break;
                    default:
                        switch (i2) {
                            case 922:
                            case 923:
                                throw FormatException.a();
                            case 924:
                                break;
                            case 925:
                                i = i3 + 1;
                                break;
                            case 926:
                                i = i3 + 2;
                                break;
                            case 927:
                                i = i3 + 1;
                                charset = Charset.forName(d.g(iArr[i3]).name());
                                break;
                            case 928:
                                i = d(iArr, i3, cVar);
                                break;
                            default:
                                i = g(iArr, i3 - 1, sb);
                                break;
                        }
                        i = a(i2, iArr, charset, i3, sb);
                        break;
                }
            } else {
                i = i3 + 1;
                sb.append((char) iArr[i3]);
            }
            if (i < iArr.length) {
                i3 = i + 1;
                i2 = iArr[i];
            } else {
                throw FormatException.a();
            }
        }
        if (sb.length() != 0) {
            com.google.zxing.t.e eVar = new com.google.zxing.t.e((byte[]) null, sb.toString(), (List<byte[]>) null, str);
            eVar.m(cVar);
            return eVar;
        }
        throw FormatException.a();
    }

    private static String c(int[] iArr, int i) throws FormatException {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f12544c[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.a();
    }

    static int d(int[] iArr, int i, c cVar) throws FormatException {
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i2 = 0;
            while (i2 < 2) {
                iArr2[i2] = iArr[i];
                i2++;
                i++;
            }
            cVar.j(Integer.parseInt(c(iArr2, 2)));
            StringBuilder sb = new StringBuilder();
            int g = g(iArr, i, sb);
            cVar.d(sb.toString());
            int i3 = iArr[g] == 923 ? g + 1 : -1;
            while (g < iArr[0]) {
                int i4 = iArr[g];
                if (i4 == 922) {
                    g++;
                    cVar.g(true);
                } else if (i4 == 923) {
                    int i5 = g + 1;
                    switch (iArr[i5]) {
                        case 0:
                            StringBuilder sb2 = new StringBuilder();
                            g = g(iArr, i5 + 1, sb2);
                            cVar.e(sb2.toString());
                            break;
                        case 1:
                            StringBuilder sb3 = new StringBuilder();
                            g = f(iArr, i5 + 1, sb3);
                            cVar.i(Integer.parseInt(sb3.toString()));
                            break;
                        case 2:
                            StringBuilder sb4 = new StringBuilder();
                            g = f(iArr, i5 + 1, sb4);
                            cVar.l(Long.parseLong(sb4.toString()));
                            break;
                        case 3:
                            StringBuilder sb5 = new StringBuilder();
                            g = g(iArr, i5 + 1, sb5);
                            cVar.k(sb5.toString());
                            break;
                        case 4:
                            StringBuilder sb6 = new StringBuilder();
                            g = g(iArr, i5 + 1, sb6);
                            cVar.b(sb6.toString());
                            break;
                        case 5:
                            StringBuilder sb7 = new StringBuilder();
                            g = f(iArr, i5 + 1, sb7);
                            cVar.f(Long.parseLong(sb7.toString()));
                            break;
                        case 6:
                            StringBuilder sb8 = new StringBuilder();
                            g = f(iArr, i5 + 1, sb8);
                            cVar.c(Integer.parseInt(sb8.toString()));
                            break;
                        default:
                            throw FormatException.a();
                    }
                } else {
                    throw FormatException.a();
                }
            }
            if (i3 != -1) {
                int i6 = g - i3;
                if (cVar.a()) {
                    i6--;
                }
                cVar.h(Arrays.copyOfRange(iArr, i3, i6 + i3));
            }
            return g;
        }
        throw FormatException.a();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bf, code lost:
        r6 = (char) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cb, code lost:
        r6 = 0;
        r11 = r2;
        r2 = r0;
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e0, code lost:
        if (r6 == 0) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e2, code lost:
        r15.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e5, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void e(int[] r12, int[] r13, int r14, java.lang.StringBuilder r15) {
        /*
            com.google.zxing.x.e.e$b r0 = com.google.zxing.x.e.e.b.ALPHA
            r1 = 0
            r2 = r0
            r3 = 0
        L_0x0005:
            if (r3 >= r14) goto L_0x00e9
            r4 = r12[r3]
            int[] r5 = com.google.zxing.x.e.e.a.f12545a
            int r6 = r0.ordinal()
            r5 = r5[r6]
            r6 = 32
            r7 = 29
            r8 = 26
            r9 = 913(0x391, float:1.28E-42)
            r10 = 900(0x384, float:1.261E-42)
            switch(r5) {
                case 1: goto L_0x00bb;
                case 2: goto L_0x009b;
                case 3: goto L_0x0070;
                case 4: goto L_0x0050;
                case 5: goto L_0x003f;
                case 6: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x00df
        L_0x0020:
            if (r4 >= r7) goto L_0x0027
            char[] r0 = f12542a
            char r6 = r0[r4]
            goto L_0x0044
        L_0x0027:
            if (r4 == r7) goto L_0x003b
            if (r4 == r10) goto L_0x0037
            if (r4 == r9) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            r0 = r13[r3]
            char r0 = (char) r0
            r15.append(r0)
        L_0x0034:
            r0 = r2
            goto L_0x00df
        L_0x0037:
            com.google.zxing.x.e.e$b r0 = com.google.zxing.x.e.e.b.ALPHA
            goto L_0x00df
        L_0x003b:
            com.google.zxing.x.e.e$b r0 = com.google.zxing.x.e.e.b.ALPHA
            goto L_0x00df
        L_0x003f:
            if (r4 >= r8) goto L_0x0047
            int r4 = r4 + 65
            char r6 = (char) r4
        L_0x0044:
            r0 = r2
            goto L_0x00e0
        L_0x0047:
            if (r4 == r8) goto L_0x0044
            if (r4 == r10) goto L_0x004c
            goto L_0x0034
        L_0x004c:
            com.google.zxing.x.e.e$b r0 = com.google.zxing.x.e.e.b.ALPHA
            goto L_0x00df
        L_0x0050:
            if (r4 >= r7) goto L_0x0058
            char[] r5 = f12542a
            char r6 = r5[r4]
            goto L_0x00e0
        L_0x0058:
            if (r4 == r7) goto L_0x006c
            if (r4 == r10) goto L_0x0068
            if (r4 == r9) goto L_0x0060
            goto L_0x00df
        L_0x0060:
            r4 = r13[r3]
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x00df
        L_0x0068:
            com.google.zxing.x.e.e$b r0 = com.google.zxing.x.e.e.b.ALPHA
            goto L_0x00df
        L_0x006c:
            com.google.zxing.x.e.e$b r0 = com.google.zxing.x.e.e.b.ALPHA
            goto L_0x00df
        L_0x0070:
            r5 = 25
            if (r4 >= r5) goto L_0x007a
            char[] r5 = f12543b
            char r6 = r5[r4]
            goto L_0x00e0
        L_0x007a:
            if (r4 == r10) goto L_0x0098
            if (r4 == r9) goto L_0x0091
            switch(r4) {
                case 25: goto L_0x008e;
                case 26: goto L_0x00e0;
                case 27: goto L_0x008a;
                case 28: goto L_0x0086;
                case 29: goto L_0x0083;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x00df
        L_0x0083:
            com.google.zxing.x.e.e$b r2 = com.google.zxing.x.e.e.b.PUNCT_SHIFT
            goto L_0x00cb
        L_0x0086:
            com.google.zxing.x.e.e$b r0 = com.google.zxing.x.e.e.b.ALPHA
            goto L_0x00df
        L_0x008a:
            com.google.zxing.x.e.e$b r0 = com.google.zxing.x.e.e.b.LOWER
            goto L_0x00df
        L_0x008e:
            com.google.zxing.x.e.e$b r0 = com.google.zxing.x.e.e.b.PUNCT
            goto L_0x00df
        L_0x0091:
            r4 = r13[r3]
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x00df
        L_0x0098:
            com.google.zxing.x.e.e$b r0 = com.google.zxing.x.e.e.b.ALPHA
            goto L_0x00df
        L_0x009b:
            if (r4 >= r8) goto L_0x00a0
            int r4 = r4 + 97
            goto L_0x00bf
        L_0x00a0:
            if (r4 == r10) goto L_0x00b8
            if (r4 == r9) goto L_0x00b1
            switch(r4) {
                case 26: goto L_0x00e0;
                case 27: goto L_0x00ae;
                case 28: goto L_0x00ab;
                case 29: goto L_0x00a8;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            goto L_0x00df
        L_0x00a8:
            com.google.zxing.x.e.e$b r2 = com.google.zxing.x.e.e.b.PUNCT_SHIFT
            goto L_0x00cb
        L_0x00ab:
            com.google.zxing.x.e.e$b r0 = com.google.zxing.x.e.e.b.MIXED
            goto L_0x00df
        L_0x00ae:
            com.google.zxing.x.e.e$b r2 = com.google.zxing.x.e.e.b.ALPHA_SHIFT
            goto L_0x00cb
        L_0x00b1:
            r4 = r13[r3]
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x00df
        L_0x00b8:
            com.google.zxing.x.e.e$b r0 = com.google.zxing.x.e.e.b.ALPHA
            goto L_0x00df
        L_0x00bb:
            if (r4 >= r8) goto L_0x00c1
            int r4 = r4 + 65
        L_0x00bf:
            char r6 = (char) r4
            goto L_0x00e0
        L_0x00c1:
            if (r4 == r10) goto L_0x00dd
            if (r4 == r9) goto L_0x00d6
            switch(r4) {
                case 26: goto L_0x00e0;
                case 27: goto L_0x00d3;
                case 28: goto L_0x00d0;
                case 29: goto L_0x00c9;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            goto L_0x00df
        L_0x00c9:
            com.google.zxing.x.e.e$b r2 = com.google.zxing.x.e.e.b.PUNCT_SHIFT
        L_0x00cb:
            r6 = 0
            r11 = r2
            r2 = r0
            r0 = r11
            goto L_0x00e0
        L_0x00d0:
            com.google.zxing.x.e.e$b r0 = com.google.zxing.x.e.e.b.MIXED
            goto L_0x00df
        L_0x00d3:
            com.google.zxing.x.e.e$b r0 = com.google.zxing.x.e.e.b.LOWER
            goto L_0x00df
        L_0x00d6:
            r4 = r13[r3]
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x00df
        L_0x00dd:
            com.google.zxing.x.e.e$b r0 = com.google.zxing.x.e.e.b.ALPHA
        L_0x00df:
            r6 = 0
        L_0x00e0:
            if (r6 == 0) goto L_0x00e5
            r15.append(r6)
        L_0x00e5:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.x.e.e.e(int[], int[], int, java.lang.StringBuilder):void");
    }

    private static int f(int[] iArr, int i, StringBuilder sb) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i3 == iArr[0]) {
                z = true;
            }
            if (i4 < 900) {
                iArr2[i2] = i4;
                i2++;
            } else {
                if (!(i4 == 900 || i4 == 901 || i4 == 928)) {
                    switch (i4) {
                        case 922:
                        case 923:
                        case 924:
                            break;
                    }
                }
                i3--;
                z = true;
            }
            if ((i2 % 15 == 0 || i4 == 902 || z) && i2 > 0) {
                sb.append(c(iArr2, i2));
                i2 = 0;
            }
            i = i3;
        }
        return i;
    }

    private static int g(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[((iArr[0] - i) << 1)];
        int[] iArr3 = new int[((iArr[0] - i) << 1)];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i4 < 900) {
                iArr2[i2] = i4 / 30;
                iArr2[i2 + 1] = i4 % 30;
                i2 += 2;
            } else if (i4 != 913) {
                if (i4 != 928) {
                    switch (i4) {
                        case 900:
                            iArr2[i2] = 900;
                            i2++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i4) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                            }
                    }
                }
                i = i3 - 1;
                z = true;
            } else {
                iArr2[i2] = 913;
                i = i3 + 1;
                iArr3[i2] = iArr[i3];
                i2++;
            }
            i = i3;
        }
        e(iArr2, iArr3, i2, sb);
        return i;
    }
}
