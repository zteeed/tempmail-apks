package com.google.zxing.y.e;

import com.google.zxing.WriterException;
import com.google.zxing.t.d;
import com.google.zxing.y.c.f;
import com.google.zxing.y.c.h;
import com.google.zxing.y.c.j;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Encoder */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f12669a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* compiled from: Encoder */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12670a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.zxing.y.c.h[] r0 = com.google.zxing.y.c.h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12670a = r0
                com.google.zxing.y.c.h r1 = com.google.zxing.y.c.h.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12670a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.y.c.h r1 = com.google.zxing.y.c.h.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12670a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.y.c.h r1 = com.google.zxing.y.c.h.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12670a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.y.c.h r1 = com.google.zxing.y.c.h.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.y.e.c.a.<clinit>():void");
        }
    }

    static void a(String str, com.google.zxing.t.a aVar, String str2) throws WriterException {
        try {
            for (byte d2 : str.getBytes(str2)) {
                aVar.d(d2, 8);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new WriterException((Throwable) e2);
        }
    }

    static void b(CharSequence charSequence, com.google.zxing.t.a aVar) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int p = p(charSequence.charAt(i));
            if (p != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int p2 = p(charSequence.charAt(i2));
                    if (p2 != -1) {
                        aVar.d((p * 45) + p2, 11);
                        i += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    aVar.d(p, 6);
                    i = i2;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    static void c(String str, h hVar, com.google.zxing.t.a aVar, String str2) throws WriterException {
        int i = a.f12670a[hVar.ordinal()];
        if (i == 1) {
            h(str, aVar);
        } else if (i == 2) {
            b(str, aVar);
        } else if (i == 3) {
            a(str, aVar, str2);
        } else if (i == 4) {
            e(str, aVar);
        } else {
            throw new WriterException("Invalid mode: ".concat(String.valueOf(hVar)));
        }
    }

    private static void d(d dVar, com.google.zxing.t.a aVar) {
        aVar.d(h.ECI.g(), 4);
        aVar.d(dVar.h(), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void e(java.lang.String r6, com.google.zxing.t.a r7) throws com.google.zxing.WriterException {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            int r0 = r6.length
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x004c
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x0024
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x0024
        L_0x0022:
            int r2 = r2 - r3
            goto L_0x0033
        L_0x0024:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0032
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0032
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0022
        L_0x0032:
            r2 = -1
        L_0x0033:
            if (r2 == r4) goto L_0x0044
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.d(r3, r2)
            int r1 = r1 + 2
            goto L_0x0008
        L_0x0044:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>((java.lang.Throwable) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.y.e.c.e(java.lang.String, com.google.zxing.t.a):void");
    }

    static void f(int i, j jVar, h hVar, com.google.zxing.t.a aVar) throws WriterException {
        int h = hVar.h(jVar);
        int i2 = 1 << h;
        if (i < i2) {
            aVar.d(i, h);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    static void g(h hVar, com.google.zxing.t.a aVar) {
        aVar.d(hVar.g(), 4);
    }

    static void h(CharSequence charSequence, com.google.zxing.t.a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                aVar.d((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    aVar.d((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    aVar.d(charAt, 4);
                }
            }
        }
    }

    private static int i(h hVar, com.google.zxing.t.a aVar, com.google.zxing.t.a aVar2, j jVar) {
        return aVar.n() + hVar.h(jVar) + aVar2.n();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(com.google.zxing.t.a aVar, f fVar, j jVar, b bVar) throws WriterException {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            e.a(aVar, fVar, jVar, i3, bVar);
            int j = j(bVar);
            if (j < i) {
                i2 = i3;
                i = j;
            }
        }
        return i2;
    }

    private static h l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return h.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (p(charAt) == -1) {
                return h.BYTE;
            } else {
                z = true;
            }
        }
        if (z) {
            return h.ALPHANUMERIC;
        }
        if (z2) {
            return h.NUMERIC;
        }
        return h.BYTE;
    }

    private static j m(int i, f fVar) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            j i3 = j.i(i2);
            if (v(i, i3, fVar)) {
                return i3;
            }
        }
        throw new WriterException("Data too big");
    }

    public static f n(String str, f fVar, Map<com.google.zxing.f, ?> map) throws WriterException {
        j jVar;
        d f2;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(com.google.zxing.f.CHARACTER_SET);
        String obj = z2 ? map.get(com.google.zxing.f.CHARACTER_SET).toString() : "ISO-8859-1";
        h l = l(str, obj);
        com.google.zxing.t.a aVar = new com.google.zxing.t.a();
        if (l == h.BYTE && z2 && (f2 = d.f(obj)) != null) {
            d(f2, aVar);
        }
        if (map == null || !map.containsKey(com.google.zxing.f.GS1_FORMAT)) {
            z = false;
        }
        if (z && Boolean.valueOf(map.get(com.google.zxing.f.GS1_FORMAT).toString()).booleanValue()) {
            g(h.FNC1_FIRST_POSITION, aVar);
        }
        g(l, aVar);
        com.google.zxing.t.a aVar2 = new com.google.zxing.t.a();
        c(str, l, aVar2, obj);
        if (map == null || !map.containsKey(com.google.zxing.f.QR_VERSION)) {
            jVar = t(fVar, l, aVar, aVar2);
        } else {
            jVar = j.i(Integer.parseInt(map.get(com.google.zxing.f.QR_VERSION).toString()));
            if (!v(i(l, aVar, aVar2, jVar), jVar, fVar)) {
                throw new WriterException("Data too big for requested version");
            }
        }
        com.google.zxing.t.a aVar3 = new com.google.zxing.t.a();
        aVar3.c(aVar);
        f(l == h.BYTE ? aVar2.o() : str.length(), jVar, l, aVar3);
        aVar3.c(aVar2);
        j.b f3 = jVar.f(fVar);
        int h = jVar.h() - f3.d();
        u(h, aVar3);
        com.google.zxing.t.a r = r(aVar3, jVar.h(), h, f3.c());
        f fVar2 = new f();
        fVar2.c(fVar);
        fVar2.f(l);
        fVar2.g(jVar);
        int e2 = jVar.e();
        b bVar = new b(e2, e2);
        int k = k(r, fVar, jVar, bVar);
        fVar2.d(k);
        e.a(r, fVar, jVar, k, bVar);
        fVar2.e(bVar);
        return fVar2;
    }

    static byte[] o(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new com.google.zxing.common.reedsolomon.d(com.google.zxing.common.reedsolomon.a.l).b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    static int p(int i) {
        int[] iArr = f12669a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    static void q(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new WriterException("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new WriterException("RS blocks mismatch");
            } else if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new WriterException("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
            }
        } else {
            throw new WriterException("Block ID too large");
        }
    }

    static com.google.zxing.t.a r(com.google.zxing.t.a aVar, int i, int i2, int i3) throws WriterException {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (aVar.o() == i5) {
            ArrayList<a> arrayList = new ArrayList<>(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                q(i, i2, i3, i10, iArr, iArr2);
                int i11 = iArr[0];
                byte[] bArr = new byte[i11];
                aVar.x(i7 << 3, bArr, 0, i11);
                byte[] o = o(bArr, iArr2[0]);
                arrayList.add(new a(bArr, o));
                i8 = Math.max(i8, i11);
                i9 = Math.max(i9, o.length);
                i7 += iArr[0];
            }
            if (i5 == i7) {
                com.google.zxing.t.a aVar2 = new com.google.zxing.t.a();
                for (int i12 = 0; i12 < i8; i12++) {
                    for (a a2 : arrayList) {
                        byte[] a3 = a2.a();
                        if (i12 < a3.length) {
                            aVar2.d(a3[i12], 8);
                        }
                    }
                }
                for (int i13 = 0; i13 < i9; i13++) {
                    for (a b2 : arrayList) {
                        byte[] b3 = b2.b();
                        if (i13 < b3.length) {
                            aVar2.d(b3[i13], 8);
                        }
                    }
                }
                if (i4 == aVar2.o()) {
                    return aVar2;
                }
                throw new WriterException("Interleaving error: " + i4 + " and " + aVar2.o() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    private static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                byte b2 = bytes[i] & 255;
                if ((b2 < 129 || b2 > 159) && (b2 < 224 || b2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static j t(f fVar, h hVar, com.google.zxing.t.a aVar, com.google.zxing.t.a aVar2) throws WriterException {
        return m(i(hVar, aVar, aVar2, m(i(hVar, aVar, aVar2, j.i(1)), fVar)), fVar);
    }

    static void u(int i, com.google.zxing.t.a aVar) throws WriterException {
        int i2 = i << 3;
        if (aVar.n() <= i2) {
            for (int i3 = 0; i3 < 4 && aVar.n() < i2; i3++) {
                aVar.b(false);
            }
            int n = aVar.n() & 7;
            if (n > 0) {
                while (n < 8) {
                    aVar.b(false);
                    n++;
                }
            }
            int o = i - aVar.o();
            for (int i4 = 0; i4 < o; i4++) {
                aVar.d((i4 & 1) == 0 ? 236 : 17, 8);
            }
            if (aVar.n() != i2) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        throw new WriterException("data bits cannot fit in the QR Code" + aVar.n() + " > " + i2);
    }

    private static boolean v(int i, j jVar, f fVar) {
        return jVar.h() - jVar.f(fVar).d() >= (i + 7) / 8;
    }
}
