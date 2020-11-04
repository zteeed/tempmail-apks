package com.google.zxing.w;

import com.google.zxing.NotFoundException;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import com.google.zxing.t.a;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: UPCEANExtension5Support */
final class w {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f11960c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a  reason: collision with root package name */
    private final int[] f11961a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f11962b = new StringBuilder();

    w() {
    }

    private int a(a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f11961a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int n = aVar.n();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < n; i3++) {
            int k = y.k(aVar, iArr2, i, y.h);
            sb.append((char) ((k % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (k >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = aVar.l(aVar.k(i));
            }
        }
        if (sb.length() == 5) {
            if (d(sb.toString()) == c(i2)) {
                return i;
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    private static int c(int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f11960c[i2]) {
                return i2;
            }
        }
        throw NotFoundException.a();
    }

    private static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.equals("90000") != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String e(java.lang.String r6) {
        /*
            r0 = 0
            char r1 = r6.charAt(r0)
            r2 = 48
            java.lang.String r3 = ""
            r4 = 1
            if (r1 == r2) goto L_0x004f
            r2 = 53
            if (r1 == r2) goto L_0x004c
            r2 = 57
            if (r1 == r2) goto L_0x0015
            goto L_0x0051
        L_0x0015:
            r1 = -1
            int r2 = r6.hashCode()
            r5 = 2
            switch(r2) {
                case 54118329: goto L_0x0033;
                case 54395376: goto L_0x0029;
                case 54395377: goto L_0x001f;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x003c
        L_0x001f:
            java.lang.String r0 = "99991"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x0029:
            java.lang.String r0 = "99990"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x003c
            r0 = 2
            goto L_0x003d
        L_0x0033:
            java.lang.String r2 = "90000"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r0 = -1
        L_0x003d:
            if (r0 == 0) goto L_0x004a
            if (r0 == r4) goto L_0x0047
            if (r0 == r5) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            java.lang.String r6 = "Used"
            return r6
        L_0x0047:
            java.lang.String r6 = "0.00"
            return r6
        L_0x004a:
            r6 = 0
            return r6
        L_0x004c:
            java.lang.String r3 = "$"
            goto L_0x0051
        L_0x004f:
            java.lang.String r3 = "£"
        L_0x0051:
            java.lang.String r6 = r6.substring(r4)
            int r6 = java.lang.Integer.parseInt(r6)
            int r0 = r6 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r6 % 100
            r1 = 10
            if (r6 >= r1) goto L_0x0070
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "0"
            java.lang.String r6 = r1.concat(r6)
            goto L_0x0074
        L_0x0070:
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L_0x0074:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.w.w.e(java.lang.String):java.lang.String");
    }

    private static Map<n, Object> f(String str) {
        String e2;
        if (str.length() != 5 || (e2 = e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(n.class);
        enumMap.put(n.SUGGESTED_PRICE, e2);
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    public m b(int i, a aVar, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.f11962b;
        sb.setLength(0);
        int a2 = a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<n, Object> f2 = f(sb2);
        float f3 = (float) i;
        m mVar = new m(sb2, (byte[]) null, new o[]{new o(((float) (iArr[0] + iArr[1])) / 2.0f, f3), new o((float) a2, f3)}, com.google.zxing.a.UPC_EAN_EXTENSION);
        if (f2 != null) {
            mVar.g(f2);
        }
        return mVar;
    }
}
