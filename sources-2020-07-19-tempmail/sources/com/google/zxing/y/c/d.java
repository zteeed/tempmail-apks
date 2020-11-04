package com.google.zxing.y.c;

import com.google.zxing.FormatException;
import com.google.zxing.t.c;
import com.google.zxing.t.e;
import com.google.zxing.t.l;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: DecodedBitStreamParser */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f12067a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* compiled from: DecodedBitStreamParser */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12068a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.y.c.h[] r0 = com.google.zxing.y.c.h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12068a = r0
                com.google.zxing.y.c.h r1 = com.google.zxing.y.c.h.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12068a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.y.c.h r1 = com.google.zxing.y.c.h.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12068a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.y.c.h r1 = com.google.zxing.y.c.h.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12068a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.y.c.h r1 = com.google.zxing.y.c.h.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12068a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.y.c.h r1 = com.google.zxing.y.c.h.TERMINATOR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f12068a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.zxing.y.c.h r1 = com.google.zxing.y.c.h.FNC1_FIRST_POSITION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f12068a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.zxing.y.c.h r1 = com.google.zxing.y.c.h.FNC1_SECOND_POSITION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f12068a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.zxing.y.c.h r1 = com.google.zxing.y.c.h.STRUCTURED_APPEND     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f12068a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.zxing.y.c.h r1 = com.google.zxing.y.c.h.ECI     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f12068a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.zxing.y.c.h r1 = com.google.zxing.y.c.h.HANZI     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.y.c.d.a.<clinit>():void");
        }
    }

    static e a(byte[] bArr, j jVar, f fVar, Map<com.google.zxing.d, ?> map) throws FormatException {
        h f2;
        h hVar;
        String str;
        j jVar2 = jVar;
        c cVar = new c(bArr);
        StringBuilder sb = new StringBuilder(50);
        int i = 1;
        ArrayList arrayList = new ArrayList(1);
        com.google.zxing.t.d dVar = null;
        boolean z = false;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            try {
                if (cVar.a() < 4) {
                    f2 = h.TERMINATOR;
                } else {
                    f2 = h.f(cVar.d(4));
                }
                h hVar2 = f2;
                switch (a.f12068a[hVar2.ordinal()]) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                        hVar = hVar2;
                        z = true;
                        break;
                    case 8:
                        if (cVar.a() >= 16) {
                            int d2 = cVar.d(8);
                            i3 = cVar.d(8);
                            i2 = d2;
                            break;
                        } else {
                            throw FormatException.a();
                        }
                    case 9:
                        dVar = com.google.zxing.t.d.g(g(cVar));
                        if (dVar == null) {
                            throw FormatException.a();
                        }
                        break;
                    case 10:
                        int d3 = cVar.d(4);
                        int d4 = cVar.d(hVar2.h(jVar2));
                        if (d3 == i) {
                            d(cVar, sb, d4);
                            break;
                        }
                        break;
                    default:
                        int d5 = cVar.d(hVar2.h(jVar2));
                        int i4 = a.f12068a[hVar2.ordinal()];
                        if (i4 != i) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    hVar = hVar2;
                                    c(cVar, sb, d5, dVar, arrayList, map);
                                    break;
                                } else if (i4 == 4) {
                                    e(cVar, sb, d5);
                                    break;
                                } else {
                                    throw FormatException.a();
                                }
                            } else {
                                hVar = hVar2;
                                b(cVar, sb, d5, z);
                                break;
                            }
                        } else {
                            hVar = hVar2;
                            f(cVar, sb, d5);
                            break;
                        }
                }
                hVar = hVar2;
                if (hVar == h.TERMINATOR) {
                    String sb2 = sb.toString();
                    ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                    if (fVar == null) {
                        str = null;
                    } else {
                        str = fVar.toString();
                    }
                    return new e(bArr, sb2, arrayList2, str, i2, i3);
                }
                i = 1;
            } catch (IllegalArgumentException unused) {
                throw FormatException.a();
            }
        }
    }

    private static void b(c cVar, StringBuilder sb, int i, boolean z) throws FormatException {
        while (i > 1) {
            if (cVar.a() >= 11) {
                int d2 = cVar.d(11);
                sb.append(h(d2 / 45));
                sb.append(h(d2 % 45));
                i -= 2;
            } else {
                throw FormatException.a();
            }
        }
        if (i == 1) {
            if (cVar.a() >= 6) {
                sb.append(h(cVar.d(6)));
            } else {
                throw FormatException.a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    private static void c(c cVar, StringBuilder sb, int i, com.google.zxing.t.d dVar, Collection<byte[]> collection, Map<com.google.zxing.d, ?> map) throws FormatException {
        String str;
        if ((i << 3) <= cVar.a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) cVar.d(8);
            }
            if (dVar == null) {
                str = l.a(bArr, map);
            } else {
                str = dVar.name();
            }
            try {
                sb.append(new String(bArr, str));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.a();
            }
        } else {
            throw FormatException.a();
        }
    }

    private static void d(c cVar, StringBuilder sb, int i) throws FormatException {
        if (i * 13 <= cVar.a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d2 = cVar.d(13);
                int i3 = (d2 % 96) | ((d2 / 96) << 8);
                int i4 = i3 + (i3 < 959 ? 41377 : 42657);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.a();
            }
        } else {
            throw FormatException.a();
        }
    }

    private static void e(c cVar, StringBuilder sb, int i) throws FormatException {
        if (i * 13 <= cVar.a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d2 = cVar.d(13);
                int i3 = (d2 % 192) | ((d2 / 192) << 8);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.a();
            }
        } else {
            throw FormatException.a();
        }
    }

    private static void f(c cVar, StringBuilder sb, int i) throws FormatException {
        while (i >= 3) {
            if (cVar.a() >= 10) {
                int d2 = cVar.d(10);
                if (d2 < 1000) {
                    sb.append(h(d2 / 100));
                    sb.append(h((d2 / 10) % 10));
                    sb.append(h(d2 % 10));
                    i -= 3;
                } else {
                    throw FormatException.a();
                }
            } else {
                throw FormatException.a();
            }
        }
        if (i == 2) {
            if (cVar.a() >= 7) {
                int d3 = cVar.d(7);
                if (d3 < 100) {
                    sb.append(h(d3 / 10));
                    sb.append(h(d3 % 10));
                    return;
                }
                throw FormatException.a();
            }
            throw FormatException.a();
        } else if (i != 1) {
        } else {
            if (cVar.a() >= 4) {
                int d4 = cVar.d(4);
                if (d4 < 10) {
                    sb.append(h(d4));
                    return;
                }
                throw FormatException.a();
            }
            throw FormatException.a();
        }
    }

    private static int g(c cVar) throws FormatException {
        int d2 = cVar.d(8);
        if ((d2 & 128) == 0) {
            return d2 & 127;
        }
        if ((d2 & 192) == 128) {
            return cVar.d(8) | ((d2 & 63) << 8);
        }
        if ((d2 & 224) == 192) {
            return cVar.d(16) | ((d2 & 31) << 16);
        }
        throw FormatException.a();
    }

    private static char h(int i) throws FormatException {
        char[] cArr = f12067a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.a();
    }
}
