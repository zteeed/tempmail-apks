package com.google.zxing.r.f;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: HighLevelEncoder */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    static final String[] f12275b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c  reason: collision with root package name */
    static final int[][] f12276c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d  reason: collision with root package name */
    private static final int[][] f12277d;

    /* renamed from: e  reason: collision with root package name */
    static final int[][] f12278e;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f12279a;

    /* compiled from: HighLevelEncoder */
    class a implements Comparator<f> {
        a(d dVar) {
        }

        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.d() - fVar2.d();
        }
    }

    static {
        Class<int> cls = int.class;
        int[][] iArr = (int[][]) Array.newInstance(cls, new int[]{5, 256});
        f12277d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f12277d[0][i] = (i - 65) + 2;
        }
        f12277d[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f12277d[1][i2] = (i2 - 97) + 2;
        }
        f12277d[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f12277d[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = f12277d;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f12277d[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                f12277d[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(cls, new int[]{6, 6});
        f12278e = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = f12278e;
        iArr6[0][4] = 0;
        iArr6[1][4] = 0;
        iArr6[1][0] = 28;
        iArr6[3][4] = 0;
        iArr6[2][4] = 0;
        iArr6[2][0] = 15;
    }

    public d(byte[] bArr) {
        this.f12279a = bArr;
    }

    private static Collection<f> b(Iterable<f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (f next : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f fVar = (f) it.next();
                if (fVar.f(next)) {
                    z = false;
                    break;
                } else if (next.f(fVar)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(next);
            }
        }
        return linkedList;
    }

    private void c(f fVar, int i, Collection<f> collection) {
        char c2 = (char) (this.f12279a[i] & 255);
        boolean z = f12277d[fVar.e()][c2] > 0;
        f fVar2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f12277d[i2][c2];
            if (i3 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.b(i);
                }
                if (!z || i2 == fVar.e() || i2 == 2) {
                    collection.add(fVar2.g(i2, i3));
                }
                if (!z && f12278e[fVar.e()][i2] >= 0) {
                    collection.add(fVar2.h(i2, i3));
                }
            }
        }
        if (fVar.c() > 0 || f12277d[fVar.e()][c2] == 0) {
            collection.add(fVar.a(i));
        }
    }

    private static void d(f fVar, int i, int i2, Collection<f> collection) {
        f b2 = fVar.b(i);
        collection.add(b2.g(4, i2));
        if (fVar.e() != 4) {
            collection.add(b2.h(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(b2.g(2, 16 - i2).g(2, 1));
        }
        if (fVar.c() > 0) {
            collection.add(fVar.a(i).a(i + 1));
        }
    }

    private Collection<f> e(Iterable<f> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        for (f c2 : iterable) {
            c(c2, i, linkedList);
        }
        return b(linkedList);
    }

    private static Collection<f> f(Iterable<f> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (f d2 : iterable) {
            d(d2, i, i2, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.t.a a() {
        /*
            r8 = this;
            com.google.zxing.r.f.f r0 = com.google.zxing.r.f.f.f12282e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = 0
        L_0x0008:
            byte[] r3 = r8.f12279a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x004e
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0015
            byte r3 = r3[r4]
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            byte[] r5 = r8.f12279a
            byte r5 = r5[r2]
            r6 = 13
            if (r5 == r6) goto L_0x003a
            r6 = 44
            r7 = 32
            if (r5 == r6) goto L_0x0036
            r6 = 46
            if (r5 == r6) goto L_0x0032
            r6 = 58
            if (r5 == r6) goto L_0x002e
        L_0x002c:
            r3 = 0
            goto L_0x003f
        L_0x002e:
            if (r3 != r7) goto L_0x002c
            r3 = 5
            goto L_0x003f
        L_0x0032:
            if (r3 != r7) goto L_0x002c
            r3 = 3
            goto L_0x003f
        L_0x0036:
            if (r3 != r7) goto L_0x002c
            r3 = 4
            goto L_0x003f
        L_0x003a:
            r5 = 10
            if (r3 != r5) goto L_0x002c
            r3 = 2
        L_0x003f:
            if (r3 <= 0) goto L_0x0047
            java.util.Collection r0 = f(r0, r2, r3)
            r2 = r4
            goto L_0x004b
        L_0x0047:
            java.util.Collection r0 = r8.e(r0, r2)
        L_0x004b:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x004e:
            com.google.zxing.r.f.d$a r1 = new com.google.zxing.r.f.d$a
            r1.<init>(r8)
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            com.google.zxing.r.f.f r0 = (com.google.zxing.r.f.f) r0
            byte[] r1 = r8.f12279a
            com.google.zxing.t.a r0 = r0.i(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.r.f.d.a():com.google.zxing.t.a");
    }
}
