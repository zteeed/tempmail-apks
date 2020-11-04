package com.google.zxing.w.c0.g;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.m;
import com.google.zxing.o;
import com.google.zxing.w.c0.a;
import com.google.zxing.w.c0.b;
import com.google.zxing.w.c0.c;
import com.google.zxing.w.c0.f;
import com.google.zxing.w.c0.g.e.j;
import com.google.zxing.w.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: RSSExpandedReader */
public final class d extends a {
    private static final int[] k = {7, 5, 4, 3, 1};
    private static final int[] l = {4, 20, 52, 104, 204};
    private static final int[] m = {0, 348, 1388, 2948, 3988};
    private static final int[][] n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[][] o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};
    private static final int[][] p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    private final List<b> g = new ArrayList(11);
    private final List<c> h = new ArrayList();
    private final int[] i = new int[2];
    private boolean j;

    private static int A(com.google.zxing.t.a aVar, int i2) {
        if (aVar.i(i2)) {
            return aVar.k(aVar.l(i2));
        }
        return aVar.l(aVar.k(i2));
    }

    private static boolean B(c cVar, boolean z, boolean z2) {
        return cVar.c() != 0 || !z || !z2;
    }

    private static boolean C(Iterable<b> iterable, Iterable<c> iterable2) {
        boolean z;
        boolean z2;
        Iterator<c> it = iterable2.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                c next = it.next();
                Iterator<b> it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        continue;
                        break;
                    }
                    b next2 = it2.next();
                    Iterator<b> it3 = next.a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z2 = true;
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    private static boolean D(List<b> list) {
        boolean z;
        for (int[] iArr : p) {
            if (list.size() <= iArr.length) {
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        z = true;
                        break;
                    } else if (list.get(i2).b().c() != iArr[i2]) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private c E(com.google.zxing.t.a aVar, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        if (z) {
            int i6 = this.i[0] - 1;
            while (i6 >= 0 && !aVar.i(i6)) {
                i6--;
            }
            int i7 = i6 + 1;
            int[] iArr = this.i;
            i5 = iArr[0] - i7;
            i3 = iArr[1];
            i4 = i7;
        } else {
            int[] iArr2 = this.i;
            int i8 = iArr2[0];
            int l2 = aVar.l(iArr2[1] + 1);
            i3 = l2;
            i4 = i8;
            i5 = l2 - this.i[1];
        }
        int[] k2 = k();
        System.arraycopy(k2, 0, k2, 1, k2.length - 1);
        k2[0] = i5;
        try {
            return new c(a.r(k2, n), new int[]{i4, i3}, i4, i3, i2);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private static void F(List<b> list, List<c> list2) {
        boolean z;
        Iterator<c> it = list2.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.a().size() != list.size()) {
                Iterator<b> it2 = next.a().iterator();
                while (true) {
                    z = false;
                    boolean z2 = true;
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                    b next2 = it2.next();
                    Iterator<b> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    private static void H(int[] iArr) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length / 2; i2++) {
            int i3 = iArr[i2];
            int i4 = (length - i2) - 1;
            iArr[i2] = iArr[i4];
            iArr[i4] = i3;
        }
    }

    private void I(int i2, boolean z) {
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        while (true) {
            if (i3 >= this.h.size()) {
                break;
            }
            c cVar = this.h.get(i3);
            if (cVar.b() > i2) {
                z2 = cVar.c(this.g);
                break;
            } else {
                z3 = cVar.c(this.g);
                i3++;
            }
        }
        if (!z2 && !z3 && !C(this.g, this.h)) {
            this.h.add(i3, new c(this.g, i2, z));
            F(this.g, this.h);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void s(int r11) throws com.google.zxing.NotFoundException {
        /*
            r10 = this;
            int[] r0 = r10.n()
            int r0 = com.google.zxing.t.m.a.d(r0)
            int[] r1 = r10.l()
            int r1 = com.google.zxing.t.m.a.d(r1)
            r2 = 4
            r3 = 13
            r4 = 0
            r5 = 1
            if (r0 <= r3) goto L_0x001a
            r6 = 0
            r7 = 1
            goto L_0x0020
        L_0x001a:
            if (r0 >= r2) goto L_0x001e
            r6 = 1
            goto L_0x001f
        L_0x001e:
            r6 = 0
        L_0x001f:
            r7 = 0
        L_0x0020:
            if (r1 <= r3) goto L_0x0025
            r2 = 0
            r3 = 1
            goto L_0x002b
        L_0x0025:
            if (r1 >= r2) goto L_0x0029
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            r3 = 0
        L_0x002b:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r5) goto L_0x0034
            r11 = 1
            goto L_0x0035
        L_0x0034:
            r11 = 0
        L_0x0035:
            r9 = r1 & 1
            if (r9 != 0) goto L_0x003a
            r4 = 1
        L_0x003a:
            if (r8 != r5) goto L_0x0052
            if (r11 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0043
            r5 = r6
        L_0x0041:
            r7 = 1
            goto L_0x007d
        L_0x0043:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.a()
            throw r11
        L_0x0048:
            if (r4 == 0) goto L_0x004d
            r5 = r6
        L_0x004b:
            r3 = 1
            goto L_0x007d
        L_0x004d:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.a()
            throw r11
        L_0x0052:
            r9 = -1
            if (r8 != r9) goto L_0x0069
            if (r11 == 0) goto L_0x005f
            if (r4 != 0) goto L_0x005a
            goto L_0x007d
        L_0x005a:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.a()
            throw r11
        L_0x005f:
            if (r4 == 0) goto L_0x0064
            r5 = r6
            r2 = 1
            goto L_0x007d
        L_0x0064:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.a()
            throw r11
        L_0x0069:
            if (r8 != 0) goto L_0x00c7
            if (r11 == 0) goto L_0x007a
            if (r4 == 0) goto L_0x0075
            if (r0 >= r1) goto L_0x0072
            goto L_0x004b
        L_0x0072:
            r5 = r6
            r2 = 1
            goto L_0x0041
        L_0x0075:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.a()
            throw r11
        L_0x007a:
            if (r4 != 0) goto L_0x00c2
            r5 = r6
        L_0x007d:
            if (r5 == 0) goto L_0x0092
            if (r7 != 0) goto L_0x008d
            int[] r11 = r10.n()
            float[] r0 = r10.o()
            com.google.zxing.w.c0.a.p(r11, r0)
            goto L_0x0092
        L_0x008d:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.a()
            throw r11
        L_0x0092:
            if (r7 == 0) goto L_0x009f
            int[] r11 = r10.n()
            float[] r0 = r10.o()
            com.google.zxing.w.c0.a.i(r11, r0)
        L_0x009f:
            if (r2 == 0) goto L_0x00b4
            if (r3 != 0) goto L_0x00af
            int[] r11 = r10.l()
            float[] r0 = r10.o()
            com.google.zxing.w.c0.a.p(r11, r0)
            goto L_0x00b4
        L_0x00af:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.a()
            throw r11
        L_0x00b4:
            if (r3 == 0) goto L_0x00c1
            int[] r11 = r10.l()
            float[] r0 = r10.m()
            com.google.zxing.w.c0.a.i(r11, r0)
        L_0x00c1:
            return
        L_0x00c2:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.a()
            throw r11
        L_0x00c7:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.w.c0.g.d.s(int):void");
    }

    private boolean t() {
        b bVar = this.g.get(0);
        b c2 = bVar.c();
        b d2 = bVar.d();
        if (d2 == null) {
            return false;
        }
        int a2 = d2.a();
        int i2 = 2;
        for (int i3 = 1; i3 < this.g.size(); i3++) {
            b bVar2 = this.g.get(i3);
            a2 += bVar2.c().a();
            i2++;
            b d3 = bVar2.d();
            if (d3 != null) {
                a2 += d3.a();
                i2++;
            }
        }
        if (((i2 - 4) * 211) + (a2 % 211) == c2.b()) {
            return true;
        }
        return false;
    }

    private List<b> u(List<c> list, int i2) throws NotFoundException {
        while (i2 < this.h.size()) {
            c cVar = this.h.get(i2);
            this.g.clear();
            for (c a2 : list) {
                this.g.addAll(a2.a());
            }
            this.g.addAll(cVar.a());
            if (!D(this.g)) {
                i2++;
            } else if (t()) {
                return this.g;
            } else {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return u(arrayList, i2 + 1);
                } catch (NotFoundException unused) {
                }
            }
        }
        throw NotFoundException.a();
    }

    private List<b> v(boolean z) {
        List<b> list = null;
        if (this.h.size() > 25) {
            this.h.clear();
            return null;
        }
        this.g.clear();
        if (z) {
            Collections.reverse(this.h);
        }
        try {
            list = u(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.h);
        }
        return list;
    }

    static m w(List<b> list) throws NotFoundException, FormatException {
        String d2 = j.a(a.a(list)).d();
        o[] a2 = list.get(0).b().a();
        o[] a3 = list.get(list.size() - 1).b().a();
        return new m(d2, (byte[]) null, new o[]{a2[0], a2[1], a3[0], a3[1]}, com.google.zxing.a.RSS_EXPANDED);
    }

    private void z(com.google.zxing.t.a aVar, List<b> list, int i2) throws NotFoundException {
        int[] k2 = k();
        k2[0] = 0;
        k2[1] = 0;
        k2[2] = 0;
        k2[3] = 0;
        int n2 = aVar.n();
        if (i2 < 0) {
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                i2 = list.get(list.size() - 1).b().b()[1];
            }
        }
        boolean z = list.size() % 2 != 0;
        if (this.j) {
            z = !z;
        }
        boolean z2 = false;
        while (i2 < n2) {
            z2 = !aVar.i(i2);
            if (!z2) {
                break;
            }
            i2++;
        }
        boolean z3 = z2;
        int i3 = 0;
        int i4 = i2;
        while (i2 < n2) {
            if (aVar.i(i2) != z3) {
                k2[i3] = k2[i3] + 1;
            } else {
                if (i3 == 3) {
                    if (z) {
                        H(k2);
                    }
                    if (a.q(k2)) {
                        int[] iArr = this.i;
                        iArr[0] = i4;
                        iArr[1] = i2;
                        return;
                    }
                    if (z) {
                        H(k2);
                    }
                    i4 += k2[0] + k2[1];
                    k2[0] = k2[2];
                    k2[1] = k2[3];
                    k2[2] = 0;
                    k2[3] = 0;
                    i3--;
                } else {
                    i3++;
                }
                k2[i3] = 1;
                z3 = !z3;
            }
            i2++;
        }
        throw NotFoundException.a();
    }

    /* access modifiers changed from: package-private */
    public b G(com.google.zxing.t.a aVar, List<b> list, int i2) throws NotFoundException {
        c E;
        b bVar;
        boolean z = list.size() % 2 == 0;
        if (this.j) {
            z = !z;
        }
        int i3 = -1;
        boolean z2 = true;
        do {
            z(aVar, list, i3);
            E = E(aVar, i2, z);
            if (E == null) {
                i3 = A(aVar, this.i[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        b x = x(aVar, E, z, true);
        if (list.isEmpty() || !list.get(list.size() - 1).f()) {
            try {
                bVar = x(aVar, E, z, false);
            } catch (NotFoundException unused) {
                bVar = null;
            }
            return new b(x, bVar, E, true);
        }
        throw NotFoundException.a();
    }

    public void a() {
        this.g.clear();
        this.h.clear();
    }

    public m d(int i2, com.google.zxing.t.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, FormatException {
        this.g.clear();
        this.j = false;
        try {
            return w(y(i2, aVar));
        } catch (NotFoundException unused) {
            this.g.clear();
            this.j = true;
            return w(y(i2, aVar));
        }
    }

    /* access modifiers changed from: package-private */
    public b x(com.google.zxing.t.a aVar, c cVar, boolean z, boolean z2) throws NotFoundException {
        com.google.zxing.t.a aVar2 = aVar;
        int[] j2 = j();
        for (int i2 = 0; i2 < j2.length; i2++) {
            j2[i2] = 0;
        }
        if (z2) {
            r.h(aVar, cVar.b()[0], j2);
        } else {
            r.g(aVar, cVar.b()[1], j2);
            int i3 = 0;
            for (int length = j2.length - 1; i3 < length; length--) {
                int i4 = j2[i3];
                j2[i3] = j2[length];
                j2[length] = i4;
                i3++;
            }
        }
        float d2 = ((float) com.google.zxing.t.m.a.d(j2)) / 17.0f;
        float f2 = ((float) (cVar.b()[1] - cVar.b()[0])) / 15.0f;
        if (Math.abs(d2 - f2) / f2 <= 0.3f) {
            int[] n2 = n();
            int[] l2 = l();
            float[] o2 = o();
            float[] m2 = m();
            for (int i5 = 0; i5 < j2.length; i5++) {
                float f3 = (((float) j2[i5]) * 1.0f) / d2;
                int i6 = (int) (0.5f + f3);
                if (i6 <= 0) {
                    if (f3 >= 0.3f) {
                        i6 = 1;
                    } else {
                        throw NotFoundException.a();
                    }
                } else if (i6 > 8) {
                    if (f3 <= 8.7f) {
                        i6 = 8;
                    } else {
                        throw NotFoundException.a();
                    }
                }
                int i7 = i5 / 2;
                if ((i5 & 1) == 0) {
                    n2[i7] = i6;
                    o2[i7] = f3 - ((float) i6);
                } else {
                    l2[i7] = i6;
                    m2[i7] = f3 - ((float) i6);
                }
            }
            s(17);
            int c2 = (((cVar.c() * 4) + (z ? 0 : 2)) + (z2 ^ true ? 1 : 0)) - 1;
            int i8 = 0;
            int i9 = 0;
            for (int length2 = n2.length - 1; length2 >= 0; length2--) {
                if (B(cVar, z, z2)) {
                    i8 += n2[length2] * o[c2][length2 * 2];
                }
                i9 += n2[length2];
            }
            int i10 = 0;
            for (int length3 = l2.length - 1; length3 >= 0; length3--) {
                if (B(cVar, z, z2)) {
                    i10 += l2[length3] * o[c2][(length3 * 2) + 1];
                }
            }
            int i11 = i8 + i10;
            if ((i9 & 1) != 0 || i9 > 13 || i9 < 4) {
                throw NotFoundException.a();
            }
            int i12 = (13 - i9) / 2;
            int i13 = k[i12];
            return new b((f.b(n2, i13, true) * l[i12]) + f.b(l2, 9 - i13, false) + m[i12], i11);
        }
        throw NotFoundException.a();
    }

    /* access modifiers changed from: package-private */
    public List<b> y(int i2, com.google.zxing.t.a aVar) throws NotFoundException {
        boolean z = false;
        while (!z) {
            try {
                this.g.add(G(aVar, this.g, i2));
            } catch (NotFoundException e2) {
                if (!this.g.isEmpty()) {
                    z = true;
                } else {
                    throw e2;
                }
            }
        }
        if (t()) {
            return this.g;
        }
        boolean z2 = !this.h.isEmpty();
        I(i2, false);
        if (z2) {
            List<b> v = v(false);
            if (v != null) {
                return v;
            }
            List<b> v2 = v(true);
            if (v2 != null) {
                return v2;
            }
        }
        throw NotFoundException.a();
    }
}
