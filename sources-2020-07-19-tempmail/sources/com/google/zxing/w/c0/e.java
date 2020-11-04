package com.google.zxing.w.c0;

import com.google.zxing.NotFoundException;
import com.google.zxing.a;
import com.google.zxing.d;
import com.google.zxing.m;
import com.google.zxing.o;
import com.google.zxing.p;
import com.google.zxing.w.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: RSS14Reader */
public final class e extends a {
    private static final int[] i = {1, 10, 34, 70, 126};
    private static final int[] j = {4, 20, 48, 81};
    private static final int[] k = {0, 161, 961, 2015, 2715};
    private static final int[] l = {0, 336, 1036, 1516};
    private static final int[] m = {8, 6, 4, 3, 1};
    private static final int[] n = {2, 4, 6, 8};
    private static final int[][] o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    private final List<d> g = new ArrayList();
    private final List<d> h = new ArrayList();

    private static void s(Collection<d> collection, d dVar) {
        if (dVar != null) {
            boolean z = false;
            Iterator<d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d next = it.next();
                if (next.b() == dVar.b()) {
                    next.e();
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(dVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t(boolean r10, int r11) throws com.google.zxing.NotFoundException {
        /*
            r9 = this;
            int[] r0 = r9.n()
            int r0 = com.google.zxing.t.m.a.d(r0)
            int[] r1 = r9.l()
            int r1 = com.google.zxing.t.m.a.d(r1)
            r2 = 4
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x0028
            r5 = 12
            if (r0 <= r5) goto L_0x001c
            r6 = 0
            r7 = 1
            goto L_0x0022
        L_0x001c:
            if (r0 >= r2) goto L_0x0020
            r6 = 1
            goto L_0x0021
        L_0x0020:
            r6 = 0
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r1 <= r5) goto L_0x0025
            goto L_0x003a
        L_0x0025:
            if (r1 >= r2) goto L_0x0041
            goto L_0x003f
        L_0x0028:
            r5 = 11
            if (r0 <= r5) goto L_0x002f
            r6 = 0
            r7 = 1
            goto L_0x0036
        L_0x002f:
            r5 = 5
            if (r0 >= r5) goto L_0x0034
            r6 = 1
            goto L_0x0035
        L_0x0034:
            r6 = 0
        L_0x0035:
            r7 = 0
        L_0x0036:
            r5 = 10
            if (r1 <= r5) goto L_0x003d
        L_0x003a:
            r2 = 0
            r5 = 1
            goto L_0x0043
        L_0x003d:
            if (r1 >= r2) goto L_0x0041
        L_0x003f:
            r2 = 1
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            r5 = 0
        L_0x0043:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r10) goto L_0x004c
            r10 = 1
            goto L_0x004d
        L_0x004c:
            r10 = 0
        L_0x004d:
            r11 = r1 & 1
            if (r11 != r4) goto L_0x0052
            r3 = 1
        L_0x0052:
            if (r8 != r4) goto L_0x006a
            if (r10 == 0) goto L_0x0060
            if (r3 != 0) goto L_0x005b
            r4 = r6
        L_0x0059:
            r7 = 1
            goto L_0x0095
        L_0x005b:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.a()
            throw r10
        L_0x0060:
            if (r3 == 0) goto L_0x0065
            r4 = r6
        L_0x0063:
            r5 = 1
            goto L_0x0095
        L_0x0065:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.a()
            throw r10
        L_0x006a:
            r11 = -1
            if (r8 != r11) goto L_0x0081
            if (r10 == 0) goto L_0x0077
            if (r3 != 0) goto L_0x0072
            goto L_0x0095
        L_0x0072:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.a()
            throw r10
        L_0x0077:
            if (r3 == 0) goto L_0x007c
            r4 = r6
            r2 = 1
            goto L_0x0095
        L_0x007c:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.a()
            throw r10
        L_0x0081:
            if (r8 != 0) goto L_0x00df
            if (r10 == 0) goto L_0x0092
            if (r3 == 0) goto L_0x008d
            if (r0 >= r1) goto L_0x008a
            goto L_0x0063
        L_0x008a:
            r4 = r6
            r2 = 1
            goto L_0x0059
        L_0x008d:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.a()
            throw r10
        L_0x0092:
            if (r3 != 0) goto L_0x00da
            r4 = r6
        L_0x0095:
            if (r4 == 0) goto L_0x00aa
            if (r7 != 0) goto L_0x00a5
            int[] r10 = r9.n()
            float[] r11 = r9.o()
            com.google.zxing.w.c0.a.p(r10, r11)
            goto L_0x00aa
        L_0x00a5:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.a()
            throw r10
        L_0x00aa:
            if (r7 == 0) goto L_0x00b7
            int[] r10 = r9.n()
            float[] r11 = r9.o()
            com.google.zxing.w.c0.a.i(r10, r11)
        L_0x00b7:
            if (r2 == 0) goto L_0x00cc
            if (r5 != 0) goto L_0x00c7
            int[] r10 = r9.l()
            float[] r11 = r9.o()
            com.google.zxing.w.c0.a.p(r10, r11)
            goto L_0x00cc
        L_0x00c7:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.a()
            throw r10
        L_0x00cc:
            if (r5 == 0) goto L_0x00d9
            int[] r10 = r9.l()
            float[] r11 = r9.m()
            com.google.zxing.w.c0.a.i(r10, r11)
        L_0x00d9:
            return
        L_0x00da:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.a()
            throw r10
        L_0x00df:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.a()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.w.c0.e.t(boolean, int):void");
    }

    private static boolean u(d dVar, d dVar2) {
        int a2 = (dVar.a() + (dVar2.a() * 16)) % 79;
        int c2 = (dVar.d().c() * 9) + dVar2.d().c();
        if (c2 > 72) {
            c2--;
        }
        if (c2 > 8) {
            c2--;
        }
        return a2 == c2;
    }

    private static m v(d dVar, d dVar2) {
        String valueOf = String.valueOf((((long) dVar.b()) * 4537077) + ((long) dVar2.b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i2 = 0;
        for (int i3 = 0; i3 < 13; i3++) {
            int charAt = sb.charAt(i3) - '0';
            if ((i3 & 1) == 0) {
                charAt *= 3;
            }
            i2 += charAt;
        }
        int i4 = 10 - (i2 % 10);
        if (i4 == 10) {
            i4 = 0;
        }
        sb.append(i4);
        o[] a2 = dVar.d().a();
        o[] a3 = dVar2.d().a();
        return new m(sb.toString(), (byte[]) null, new o[]{a2[0], a2[1], a3[0], a3[1]}, a.RSS_14);
    }

    private b w(com.google.zxing.t.a aVar, c cVar, boolean z) throws NotFoundException {
        int[] j2 = j();
        for (int i2 = 0; i2 < j2.length; i2++) {
            j2[i2] = 0;
        }
        if (z) {
            r.h(aVar, cVar.b()[0], j2);
        } else {
            r.g(aVar, cVar.b()[1] + 1, j2);
            int i3 = 0;
            for (int length = j2.length - 1; i3 < length; length--) {
                int i4 = j2[i3];
                j2[i3] = j2[length];
                j2[length] = i4;
                i3++;
            }
        }
        int i5 = z ? 16 : 15;
        float d2 = ((float) com.google.zxing.t.m.a.d(j2)) / ((float) i5);
        int[] n2 = n();
        int[] l2 = l();
        float[] o2 = o();
        float[] m2 = m();
        for (int i6 = 0; i6 < j2.length; i6++) {
            float f2 = ((float) j2[i6]) / d2;
            int i7 = (int) (0.5f + f2);
            if (i7 <= 0) {
                i7 = 1;
            } else if (i7 > 8) {
                i7 = 8;
            }
            int i8 = i6 / 2;
            if ((i6 & 1) == 0) {
                n2[i8] = i7;
                o2[i8] = f2 - ((float) i7);
            } else {
                l2[i8] = i7;
                m2[i8] = f2 - ((float) i7);
            }
        }
        t(z, i5);
        int i9 = 0;
        int i10 = 0;
        for (int length2 = n2.length - 1; length2 >= 0; length2--) {
            i9 = (i9 * 9) + n2[length2];
            i10 += n2[length2];
        }
        int i11 = 0;
        int i12 = 0;
        for (int length3 = l2.length - 1; length3 >= 0; length3--) {
            i11 = (i11 * 9) + l2[length3];
            i12 += l2[length3];
        }
        int i13 = i9 + (i11 * 3);
        if (z) {
            if ((i10 & 1) != 0 || i10 > 12 || i10 < 4) {
                throw NotFoundException.a();
            }
            int i14 = (12 - i10) / 2;
            int i15 = m[i14];
            return new b((f.b(n2, i15, false) * i[i14]) + f.b(l2, 9 - i15, true) + k[i14], i13);
        } else if ((i12 & 1) != 0 || i12 > 10 || i12 < 4) {
            throw NotFoundException.a();
        } else {
            int i16 = (10 - i12) / 2;
            int i17 = n[i16];
            return new b((f.b(l2, 9 - i17, false) * j[i16]) + f.b(n2, i17, true) + l[i16], i13);
        }
    }

    private d x(com.google.zxing.t.a aVar, boolean z, int i2, Map<d, ?> map) {
        p pVar;
        try {
            int[] y = y(aVar, z);
            c z2 = z(aVar, i2, z, y);
            if (map == null) {
                pVar = null;
            } else {
                pVar = (p) map.get(d.NEED_RESULT_POINT_CALLBACK);
            }
            if (pVar != null) {
                float f2 = ((float) (y[0] + y[1])) / 2.0f;
                if (z) {
                    f2 = ((float) (aVar.n() - 1)) - f2;
                }
                pVar.a(new o(f2, (float) i2));
            }
            b w = w(aVar, z2, true);
            b w2 = w(aVar, z2, false);
            return new d((w.b() * 1597) + w2.b(), w.a() + (w2.a() * 4), z2);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private int[] y(com.google.zxing.t.a aVar, boolean z) throws NotFoundException {
        int[] k2 = k();
        k2[0] = 0;
        k2[1] = 0;
        k2[2] = 0;
        k2[3] = 0;
        int n2 = aVar.n();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < n2) {
            z2 = !aVar.i(i2);
            if (z == z2) {
                break;
            }
            i2++;
        }
        int i3 = i2;
        int i4 = 0;
        while (i2 < n2) {
            if (aVar.i(i2) != z2) {
                k2[i4] = k2[i4] + 1;
            } else {
                if (i4 != 3) {
                    i4++;
                } else if (a.q(k2)) {
                    return new int[]{i3, i2};
                } else {
                    i3 += k2[0] + k2[1];
                    k2[0] = k2[2];
                    k2[1] = k2[3];
                    k2[2] = 0;
                    k2[3] = 0;
                    i4--;
                }
                k2[i4] = 1;
                z2 = !z2;
            }
            i2++;
        }
        throw NotFoundException.a();
    }

    private c z(com.google.zxing.t.a aVar, int i2, boolean z, int[] iArr) throws NotFoundException {
        int i3;
        int i4;
        boolean i5 = aVar.i(iArr[0]);
        int i6 = iArr[0] - 1;
        while (i6 >= 0 && i5 != aVar.i(i6)) {
            i6--;
        }
        int i7 = i6 + 1;
        int[] k2 = k();
        System.arraycopy(k2, 0, k2, 1, k2.length - 1);
        k2[0] = iArr[0] - i7;
        int r = a.r(k2, o);
        int i8 = iArr[1];
        if (z) {
            i3 = (aVar.n() - 1) - i8;
            i4 = (aVar.n() - 1) - i7;
        } else {
            i3 = i8;
            i4 = i7;
        }
        return new c(r, new int[]{i7, iArr[1]}, i4, i3, i2);
    }

    public void a() {
        this.g.clear();
        this.h.clear();
    }

    public m d(int i2, com.google.zxing.t.a aVar, Map<d, ?> map) throws NotFoundException {
        s(this.g, x(aVar, false, i2, map));
        aVar.s();
        s(this.h, x(aVar, true, i2, map));
        aVar.s();
        for (d next : this.g) {
            if (next.c() > 1) {
                for (d next2 : this.h) {
                    if (next2.c() > 1 && u(next, next2)) {
                        return v(next, next2);
                    }
                }
                continue;
            }
        }
        throw NotFoundException.a();
    }
}
