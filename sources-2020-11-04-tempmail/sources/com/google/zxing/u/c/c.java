package com.google.zxing.u.c;

import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import java.util.Collection;

/* compiled from: DecodedBitStreamParser */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f12365a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f12366b;

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f12367c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f12368d;

    /* renamed from: e  reason: collision with root package name */
    private static final char[] f12369e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* compiled from: DecodedBitStreamParser */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12370a;

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
                com.google.zxing.u.c.c$b[] r0 = com.google.zxing.u.c.c.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12370a = r0
                com.google.zxing.u.c.c$b r1 = com.google.zxing.u.c.c.b.C40_ENCODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12370a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.u.c.c$b r1 = com.google.zxing.u.c.c.b.TEXT_ENCODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12370a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.u.c.c$b r1 = com.google.zxing.u.c.c.b.ANSIX12_ENCODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12370a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.u.c.c$b r1 = com.google.zxing.u.c.c.b.EDIFACT_ENCODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12370a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.u.c.c$b r1 = com.google.zxing.u.c.c.b.BASE256_ENCODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.u.c.c.a.<clinit>():void");
        }
    }

    /* compiled from: DecodedBitStreamParser */
    private enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f12366b = cArr;
        f12368d = cArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.zxing.t.e a(byte[] r7) throws com.google.zxing.FormatException {
        /*
            com.google.zxing.t.c r0 = new com.google.zxing.t.c
            r0.<init>(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 0
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 1
            r3.<init>(r4)
            com.google.zxing.u.c.c$b r5 = com.google.zxing.u.c.c.b.ASCII_ENCODE
        L_0x001a:
            com.google.zxing.u.c.c$b r6 = com.google.zxing.u.c.c.b.ASCII_ENCODE
            if (r5 != r6) goto L_0x0023
            com.google.zxing.u.c.c$b r5 = c(r0, r1, r2)
            goto L_0x0053
        L_0x0023:
            int[] r6 = com.google.zxing.u.c.c.a.f12370a
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 == r4) goto L_0x004e
            r6 = 2
            if (r5 == r6) goto L_0x004a
            r6 = 3
            if (r5 == r6) goto L_0x0046
            r6 = 4
            if (r5 == r6) goto L_0x0042
            r6 = 5
            if (r5 != r6) goto L_0x003d
            d(r0, r1, r3)
            goto L_0x0051
        L_0x003d:
            com.google.zxing.FormatException r7 = com.google.zxing.FormatException.a()
            throw r7
        L_0x0042:
            f(r0, r1)
            goto L_0x0051
        L_0x0046:
            b(r0, r1)
            goto L_0x0051
        L_0x004a:
            g(r0, r1)
            goto L_0x0051
        L_0x004e:
            e(r0, r1)
        L_0x0051:
            com.google.zxing.u.c.c$b r5 = com.google.zxing.u.c.c.b.ASCII_ENCODE
        L_0x0053:
            com.google.zxing.u.c.c$b r6 = com.google.zxing.u.c.c.b.PAD_ENCODE
            if (r5 == r6) goto L_0x005d
            int r6 = r0.a()
            if (r6 > 0) goto L_0x001a
        L_0x005d:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0066
            r1.append(r2)
        L_0x0066:
            com.google.zxing.t.e r0 = new com.google.zxing.t.e
            java.lang.String r1 = r1.toString()
            boolean r2 = r3.isEmpty()
            r4 = 0
            if (r2 == 0) goto L_0x0074
            r3 = r4
        L_0x0074:
            r0.<init>(r7, r1, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.u.c.c.a(byte[]):com.google.zxing.t.e");
    }

    private static void b(com.google.zxing.t.c cVar, StringBuilder sb) throws FormatException {
        int d2;
        int[] iArr = new int[3];
        while (cVar.a() != 8 && (d2 = cVar.d(8)) != 254) {
            h(d2, cVar.d(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    sb.append(13);
                } else if (i2 == 1) {
                    sb.append('*');
                } else if (i2 == 2) {
                    sb.append('>');
                } else if (i2 == 3) {
                    sb.append(' ');
                } else if (i2 < 14) {
                    sb.append((char) (i2 + 44));
                } else if (i2 < 40) {
                    sb.append((char) (i2 + 51));
                } else {
                    throw FormatException.a();
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static b c(com.google.zxing.t.c cVar, StringBuilder sb, StringBuilder sb2) throws FormatException {
        boolean z = false;
        do {
            int d2 = cVar.d(8);
            if (d2 == 0) {
                throw FormatException.a();
            } else if (d2 <= 128) {
                if (z) {
                    d2 += 128;
                }
                sb.append((char) (d2 - 1));
                return b.ASCII_ENCODE;
            } else if (d2 == 129) {
                return b.PAD_ENCODE;
            } else {
                if (d2 <= 229) {
                    int i = d2 - 130;
                    if (i < 10) {
                        sb.append('0');
                    }
                    sb.append(i);
                } else {
                    switch (d2) {
                        case 230:
                            return b.C40_ENCODE;
                        case 231:
                            return b.BASE256_ENCODE;
                        case 232:
                            sb.append(29);
                            break;
                        case 233:
                        case 234:
                        case 241:
                            break;
                        case 235:
                            z = true;
                            break;
                        case 236:
                            sb.append("[)>\u001e05\u001d");
                            sb2.insert(0, "\u001e\u0004");
                            break;
                        case 237:
                            sb.append("[)>\u001e06\u001d");
                            sb2.insert(0, "\u001e\u0004");
                            break;
                        case 238:
                            return b.ANSIX12_ENCODE;
                        case 239:
                            return b.TEXT_ENCODE;
                        case 240:
                            return b.EDIFACT_ENCODE;
                        default:
                            if (!(d2 == 254 && cVar.a() == 0)) {
                                throw FormatException.a();
                            }
                    }
                }
            }
        } while (cVar.a() > 0);
        return b.ASCII_ENCODE;
    }

    private static void d(com.google.zxing.t.c cVar, StringBuilder sb, Collection<byte[]> collection) throws FormatException {
        int c2 = cVar.c() + 1;
        int i = c2 + 1;
        int i2 = i(cVar.d(8), c2);
        if (i2 == 0) {
            i2 = cVar.a() / 8;
        } else if (i2 >= 250) {
            i2 = ((i2 - 249) * 250) + i(cVar.d(8), i);
            i++;
        }
        if (i2 >= 0) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                if (cVar.a() >= 8) {
                    bArr[i3] = (byte) i(cVar.d(8), i);
                    i3++;
                    i++;
                } else {
                    throw FormatException.a();
                }
            }
            collection.add(bArr);
            try {
                sb.append(new String(bArr, "ISO8859_1"));
            } catch (UnsupportedEncodingException e2) {
                throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e2)));
            }
        } else {
            throw FormatException.a();
        }
    }

    private static void e(com.google.zxing.t.c cVar, StringBuilder sb) throws FormatException {
        int d2;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (cVar.a() != 8 && (d2 = cVar.d(8)) != 254) {
            h(d2, cVar.d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = f12366b;
                            if (i3 < cArr.length) {
                                char c2 = cArr[i3];
                                if (z) {
                                    sb.append((char) (c2 + 128));
                                } else {
                                    sb.append(c2);
                                }
                            } else if (i3 == 27) {
                                sb.append(29);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw FormatException.a();
                            }
                            i = 0;
                        } else if (i != 3) {
                            throw FormatException.a();
                        } else if (z) {
                            sb.append((char) (i3 + 224));
                        } else {
                            sb.append((char) (i3 + 96));
                            i = 0;
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                    z = false;
                    i = 0;
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = f12365a;
                    if (i3 < cArr2.length) {
                        char c3 = cArr2[i3];
                        if (z) {
                            sb.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb.append(c3);
                        }
                    } else {
                        throw FormatException.a();
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void f(com.google.zxing.t.c cVar, StringBuilder sb) {
        while (cVar.a() > 16) {
            for (int i = 0; i < 4; i++) {
                int d2 = cVar.d(6);
                if (d2 == 31) {
                    int b2 = 8 - cVar.b();
                    if (b2 != 8) {
                        cVar.d(b2);
                        return;
                    }
                    return;
                }
                if ((d2 & 32) == 0) {
                    d2 |= 64;
                }
                sb.append((char) d2);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void g(com.google.zxing.t.c cVar, StringBuilder sb) throws FormatException {
        int d2;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (cVar.a() != 8 && (d2 = cVar.d(8)) != 254) {
            h(d2, cVar.d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = f12368d;
                            if (i3 < cArr.length) {
                                char c2 = cArr[i3];
                                if (z) {
                                    sb.append((char) (c2 + 128));
                                } else {
                                    sb.append(c2);
                                }
                            } else if (i3 == 27) {
                                sb.append(29);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw FormatException.a();
                            }
                            i = 0;
                        } else if (i == 3) {
                            char[] cArr2 = f12369e;
                            if (i3 < cArr2.length) {
                                char c3 = cArr2[i3];
                                if (z) {
                                    sb.append((char) (c3 + 128));
                                } else {
                                    sb.append(c3);
                                    i = 0;
                                }
                            } else {
                                throw FormatException.a();
                            }
                        } else {
                            throw FormatException.a();
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                    z = false;
                    i = 0;
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = f12367c;
                    if (i3 < cArr3.length) {
                        char c4 = cArr3[i3];
                        if (z) {
                            sb.append((char) (c4 + 128));
                            z = false;
                        } else {
                            sb.append(c4);
                        }
                    } else {
                        throw FormatException.a();
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    private static int i(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
