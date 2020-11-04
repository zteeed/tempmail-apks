package com.google.zxing.x.e;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.o;
import com.google.zxing.t.b;
import com.google.zxing.t.e;
import com.google.zxing.x.e.k.a;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: PDF417ScanningDecoder */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final a f12559a = new a();

    private static c a(h hVar) throws NotFoundException {
        int[] j;
        if (hVar == null || (j = hVar.j()) == null) {
            return null;
        }
        int p = p(j);
        int i = 0;
        int i2 = 0;
        for (int i3 : j) {
            i2 += p - i3;
            if (i3 > 0) {
                break;
            }
        }
        d[] d2 = hVar.d();
        int i4 = 0;
        while (i2 > 0 && d2[i4] == null) {
            i2--;
            i4++;
        }
        for (int length = j.length - 1; length >= 0; length--) {
            i += p - j[length];
            if (j[length] > 0) {
                break;
            }
        }
        int length2 = d2.length - 1;
        while (i > 0 && d2[length2] == null) {
            i--;
            length2--;
        }
        return hVar.a().a(i2, i, hVar.k());
    }

    private static void b(f fVar, b[][] bVarArr) throws NotFoundException {
        b bVar = bVarArr[0][1];
        int[] a2 = bVar.a();
        int j = (fVar.j() * fVar.l()) - r(fVar.k());
        if (a2.length == 0) {
            if (j <= 0 || j > 928) {
                throw NotFoundException.a();
            }
            bVar.b(j);
        } else if (a2[0] != j) {
            bVar.b(j);
        }
    }

    private static int c(b bVar, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        continue;
                        break;
                    }
                } else if (i6 < i) {
                    continue;
                    break;
                }
                if (z != bVar.f(i6, i4)) {
                    continue;
                    break;
                } else if (Math.abs(i3 - i6) > 2) {
                    return i3;
                } else {
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    private static boolean d(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    private static int e(int[] iArr, int[] iArr2, int i) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f12559a.a(iArr, i, iArr2);
        }
        throw ChecksumException.a();
    }

    private static b[][] f(f fVar) {
        int c2;
        int l = fVar.l();
        int[] iArr = new int[2];
        iArr[1] = fVar.j() + 2;
        iArr[0] = l;
        b[][] bVarArr = (b[][]) Array.newInstance(b.class, iArr);
        for (int i = 0; i < bVarArr.length; i++) {
            for (int i2 = 0; i2 < bVarArr[i].length; i2++) {
                bVarArr[i][i2] = new b();
            }
        }
        int i3 = 0;
        for (g gVar : fVar.o()) {
            if (gVar != null) {
                for (d dVar : gVar.d()) {
                    if (dVar != null && (c2 = dVar.c()) >= 0 && c2 < bVarArr.length) {
                        bVarArr[c2][i3].b(dVar.e());
                    }
                }
            }
            i3++;
        }
        return bVarArr;
    }

    private static e g(f fVar) throws FormatException, ChecksumException, NotFoundException {
        b[][] f2 = f(fVar);
        b(fVar, f2);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(fVar.l() * fVar.j())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < fVar.l(); i++) {
            int i2 = 0;
            while (i2 < fVar.j()) {
                int i3 = i2 + 1;
                int[] a2 = f2[i][i3].a();
                int j = (fVar.j() * i) + i2;
                if (a2.length == 0) {
                    arrayList.add(Integer.valueOf(j));
                } else if (a2.length == 1) {
                    iArr[j] = a2[0];
                } else {
                    arrayList3.add(Integer.valueOf(j));
                    arrayList2.add(a2);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return h(fVar.k(), iArr, com.google.zxing.x.a.b(arrayList), com.google.zxing.x.a.b(arrayList3), iArr2);
    }

    private static e h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws FormatException, ChecksumException {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return j(iArr, i, iArr2);
                } catch (ChecksumException unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            } else if (iArr5[i5] < iArr4[i5].length - 1) {
                                iArr5[i5] = iArr5[i5] + 1;
                                break;
                            } else {
                                iArr5[i5] = 0;
                                if (i5 != length - 1) {
                                    i5++;
                                } else {
                                    throw ChecksumException.a();
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        throw ChecksumException.a();
                    }
                }
            } else {
                throw ChecksumException.a();
            }
        }
    }

    public static e i(b bVar, o oVar, o oVar2, o oVar3, o oVar4, int i, int i2) throws NotFoundException, FormatException, ChecksumException {
        g gVar;
        int i3;
        int i4;
        int i5;
        h hVar = null;
        h hVar2 = null;
        f fVar = null;
        c cVar = new c(bVar, oVar, oVar2, oVar3, oVar4);
        int i6 = 0;
        while (true) {
            if (i6 >= 2) {
                break;
            }
            if (oVar != null) {
                hVar = s(bVar, cVar, oVar, true, i, i2);
            }
            if (oVar3 != null) {
                hVar2 = s(bVar, cVar, oVar3, false, i, i2);
            }
            fVar = v(hVar, hVar2);
            if (fVar == null) {
                throw NotFoundException.a();
            } else if (i6 != 0 || fVar.m() == null || (fVar.m().g() >= cVar.g() && fVar.m().e() <= cVar.e())) {
                fVar.p(cVar);
            } else {
                cVar = fVar.m();
                i6++;
            }
        }
        fVar.p(cVar);
        int j = fVar.j() + 1;
        fVar.q(0, hVar);
        fVar.q(j, hVar2);
        boolean z = hVar != null;
        int i7 = i;
        int i8 = i2;
        for (int i9 = 1; i9 <= j; i9++) {
            int i10 = z ? i9 : j - i9;
            if (fVar.n(i10) == null) {
                if (i10 == 0 || i10 == j) {
                    gVar = new h(cVar, i10 == 0);
                } else {
                    gVar = new g(cVar);
                }
                fVar.q(i10, gVar);
                int i11 = -1;
                int g = cVar.g();
                int i12 = -1;
                while (g <= cVar.e()) {
                    int t = t(fVar, i10, g, z);
                    if (t >= 0 && t <= cVar.d()) {
                        i5 = t;
                    } else if (i12 != i11) {
                        i5 = i12;
                    } else {
                        i4 = i12;
                        i3 = g;
                        i12 = i4;
                        g = i3 + 1;
                        i11 = -1;
                    }
                    i4 = i12;
                    int i13 = g;
                    d k = k(bVar, cVar.f(), cVar.d(), z, i5, i13, i7, i8);
                    i3 = i13;
                    if (k != null) {
                        gVar.f(i3, k);
                        i7 = Math.min(i7, k.f());
                        i8 = Math.max(i8, k.f());
                        i12 = i5;
                        g = i3 + 1;
                        i11 = -1;
                    }
                    i12 = i4;
                    g = i3 + 1;
                    i11 = -1;
                }
            }
        }
        return g(fVar);
    }

    private static e j(int[] iArr, int i, int[] iArr2) throws FormatException, ChecksumException {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int e2 = e(iArr, iArr2, i2);
            w(iArr, i2);
            e b2 = e.b(iArr, String.valueOf(i));
            b2.k(Integer.valueOf(e2));
            b2.j(Integer.valueOf(iArr2.length));
            return b2;
        }
        throw FormatException.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = com.google.zxing.x.e.i.d(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.zxing.x.e.d k(com.google.zxing.t.b r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
        /*
            int r11 = c(r7, r8, r9, r10, r11, r12)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int[] r7 = q(r0, r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0012
            return r8
        L_0x0012:
            int r9 = com.google.zxing.t.m.a.d(r7)
            if (r10 == 0) goto L_0x001b
            int r10 = r11 + r9
            goto L_0x0039
        L_0x001b:
            r10 = 0
        L_0x001c:
            int r12 = r7.length
            int r12 = r12 / 2
            if (r10 >= r12) goto L_0x0034
            r12 = r7[r10]
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r0 = r7[r0]
            r7[r10] = r0
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r7[r0] = r12
            int r10 = r10 + 1
            goto L_0x001c
        L_0x0034:
            int r10 = r11 - r9
            r6 = r11
            r11 = r10
            r10 = r6
        L_0x0039:
            boolean r9 = d(r9, r13, r14)
            if (r9 != 0) goto L_0x0040
            return r8
        L_0x0040:
            int r7 = com.google.zxing.x.e.i.d(r7)
            int r9 = com.google.zxing.x.a.a(r7)
            r12 = -1
            if (r9 != r12) goto L_0x004c
            return r8
        L_0x004c:
            com.google.zxing.x.e.d r8 = new com.google.zxing.x.e.d
            int r7 = n(r7)
            r8.<init>(r11, r10, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.x.e.j.k(com.google.zxing.t.b, int, int, boolean, int, int, int, int):com.google.zxing.x.e.d");
    }

    private static a l(h hVar, h hVar2) {
        a i;
        a i2;
        if (hVar == null || (i = hVar.i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.i();
        } else if (hVar2 == null || (i2 = hVar2.i()) == null || i.a() == i2.a() || i.b() == i2.b() || i.c() == i2.c()) {
            return i;
        } else {
            return null;
        }
    }

    private static int[] m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    private static int n(int i) {
        return o(m(i));
    }

    private static int o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    private static int p(int[] iArr) {
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    private static int[] q(b bVar, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
            } else if (i3 >= i2) {
                break;
            }
            if (i6 >= 8) {
                break;
            } else if (bVar.f(i3, i4) == z2) {
                iArr[i6] = iArr[i6] + 1;
                i3 += i5;
            } else {
                i6++;
                z2 = !z2;
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (!(i3 == i && i6 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    private static int r(int i) {
        return 2 << i;
    }

    private static h s(b bVar, c cVar, o oVar, boolean z, int i, int i2) {
        int i3;
        boolean z2 = z;
        h hVar = new h(cVar, z2);
        int i4 = 0;
        while (i4 < 2) {
            int i5 = i4 == 0 ? 1 : -1;
            int c2 = (int) oVar.c();
            int d2 = (int) oVar.d();
            while (d2 <= cVar.e() && d2 >= cVar.g()) {
                d k = k(bVar, 0, bVar.n(), z, c2, d2, i, i2);
                if (k != null) {
                    hVar.f(d2, k);
                    if (z2) {
                        i3 = k.d();
                    } else {
                        i3 = k.b();
                    }
                    c2 = i3;
                }
                d2 += i5;
            }
            i4++;
        }
        return hVar;
    }

    private static int t(f fVar, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        d dVar = null;
        int i4 = i - i3;
        if (u(fVar, i4)) {
            dVar = fVar.n(i4).b(i2);
        }
        if (dVar != null) {
            return z ? dVar.b() : dVar.d();
        }
        d c2 = fVar.n(i).c(i2);
        if (c2 != null) {
            return z ? c2.d() : c2.b();
        }
        if (u(fVar, i4)) {
            c2 = fVar.n(i4).c(i2);
        }
        if (c2 != null) {
            return z ? c2.b() : c2.d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (u(fVar, i)) {
                for (d dVar2 : fVar.n(i).d()) {
                    if (dVar2 != null) {
                        return (z ? dVar2.b() : dVar2.d()) + (i3 * i5 * (dVar2.b() - dVar2.d()));
                    }
                }
                i5++;
            } else {
                c m = fVar.m();
                return z ? m.f() : m.d();
            }
        }
    }

    private static boolean u(f fVar, int i) {
        return i >= 0 && i <= fVar.j() + 1;
    }

    private static f v(h hVar, h hVar2) throws NotFoundException {
        a l;
        if ((hVar == null && hVar2 == null) || (l = l(hVar, hVar2)) == null) {
            return null;
        }
        return new f(l, c.j(a(hVar), a(hVar2)));
    }

    private static void w(int[] iArr, int i) throws FormatException {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw FormatException.a();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw FormatException.a();
            }
        } else {
            throw FormatException.a();
        }
    }
}
