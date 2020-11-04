package com.google.zxing.w;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.d;
import com.google.zxing.m;
import com.google.zxing.o;
import com.google.zxing.t.a;
import java.util.Map;

/* compiled from: ITFReader */
public final class n extends r {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f11947b = {6, 8, 10, 12, 14};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f11948c = {1, 1, 1, 1};

    /* renamed from: d  reason: collision with root package name */
    private static final int[][] f11949d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e  reason: collision with root package name */
    private static final int[][] f11950e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a  reason: collision with root package name */
    private int f11951a = -1;

    private static int i(int[] iArr) throws NotFoundException {
        int length = f11950e.length;
        float f2 = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float f3 = r.f(iArr, f11950e[i2], 0.5f);
            if (f3 < f2) {
                i = i2;
                f2 = f3;
            } else if (f3 == f2) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw NotFoundException.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = m(r7, r0, f11949d[1]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] j(com.google.zxing.t.a r7) throws com.google.zxing.NotFoundException {
        /*
            r6 = this;
            r7.s()
            int r0 = n(r7)     // Catch:{ all -> 0x0035 }
            r1 = 1
            r2 = 0
            int[][] r3 = f11949d     // Catch:{ NotFoundException -> 0x0012 }
            r3 = r3[r2]     // Catch:{ NotFoundException -> 0x0012 }
            int[] r0 = m(r7, r0, r3)     // Catch:{ NotFoundException -> 0x0012 }
            goto L_0x001a
        L_0x0012:
            int[][] r3 = f11949d     // Catch:{ all -> 0x0035 }
            r3 = r3[r1]     // Catch:{ all -> 0x0035 }
            int[] r0 = m(r7, r0, r3)     // Catch:{ all -> 0x0035 }
        L_0x001a:
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            r6.o(r7, r3)     // Catch:{ all -> 0x0035 }
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            int r4 = r7.n()     // Catch:{ all -> 0x0035 }
            r5 = r0[r1]     // Catch:{ all -> 0x0035 }
            int r4 = r4 - r5
            r0[r2] = r4     // Catch:{ all -> 0x0035 }
            int r2 = r7.n()     // Catch:{ all -> 0x0035 }
            int r2 = r2 - r3
            r0[r1] = r2     // Catch:{ all -> 0x0035 }
            r7.s()
            return r0
        L_0x0035:
            r0 = move-exception
            r7.s()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.w.n.j(com.google.zxing.t.a):int[]");
    }

    private static void k(a aVar, int i, int i2, StringBuilder sb) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            r.g(aVar, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (i(iArr2) + 48));
            sb.append((char) (i(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    private int[] l(a aVar) throws NotFoundException {
        int[] m = m(aVar, n(aVar), f11948c);
        this.f11951a = (m[1] - m[0]) / 4;
        o(aVar, m[0]);
        return m;
    }

    private static int[] m(a aVar, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int n = aVar.n();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < n) {
            if (aVar.i(i) != z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (r.f(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i4 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.a();
    }

    private static int n(a aVar) throws NotFoundException {
        int n = aVar.n();
        int k = aVar.k(0);
        if (k != n) {
            return k;
        }
        throw NotFoundException.a();
    }

    private void o(a aVar, int i) throws NotFoundException {
        int i2 = this.f11951a * 10;
        if (i2 >= i) {
            i2 = i;
        }
        int i3 = i - 1;
        while (i2 > 0 && i3 >= 0 && !aVar.i(i3)) {
            i2--;
            i3--;
        }
        if (i2 != 0) {
            throw NotFoundException.a();
        }
    }

    public m d(int i, a aVar, Map<d, ?> map) throws FormatException, NotFoundException {
        boolean z;
        int[] l = l(aVar);
        int[] j = j(aVar);
        StringBuilder sb = new StringBuilder(20);
        k(aVar, l[1], j[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(d.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f11947b;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                z = false;
                break;
            }
            int i4 = iArr[i2];
            if (length == i4) {
                z = true;
                break;
            }
            if (i4 > i3) {
                i3 = i4;
            }
            i2++;
        }
        if (!z && length > i3) {
            z = true;
        }
        if (z) {
            float f2 = (float) i;
            return new m(sb2, (byte[]) null, new o[]{new o((float) l[1], f2), new o((float) j[0], f2)}, com.google.zxing.a.ITF);
        }
        throw FormatException.a();
    }
}
