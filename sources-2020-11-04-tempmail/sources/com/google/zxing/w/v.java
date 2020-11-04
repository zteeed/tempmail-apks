package com.google.zxing.w;

import com.google.zxing.NotFoundException;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import com.google.zxing.t.a;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: UPCEANExtension2Support */
final class v {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f12507a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f12508b = new StringBuilder();

    v() {
    }

    private int a(a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f12507a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int n = aVar.n();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < n; i3++) {
            int k = y.k(aVar, iArr2, i, y.h);
            sb.append((char) ((k % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (k >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = aVar.l(aVar.k(i));
            }
        }
        if (sb.length() != 2) {
            throw NotFoundException.a();
        } else if (Integer.parseInt(sb.toString()) % 4 == i2) {
            return i;
        } else {
            throw NotFoundException.a();
        }
    }

    private static Map<n, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(n.class);
        enumMap.put(n.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    public m b(int i, a aVar, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.f12508b;
        sb.setLength(0);
        int a2 = a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<n, Object> c2 = c(sb2);
        float f2 = (float) i;
        m mVar = new m(sb2, (byte[]) null, new o[]{new o(((float) (iArr[0] + iArr[1])) / 2.0f, f2), new o((float) a2, f2)}, com.google.zxing.a.UPC_EAN_EXTENSION);
        if (c2 != null) {
            mVar.g(c2);
        }
        return mVar;
    }
}
