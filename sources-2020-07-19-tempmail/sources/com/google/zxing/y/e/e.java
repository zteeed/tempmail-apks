package com.google.zxing.y.e;

import com.google.zxing.WriterException;
import com.google.zxing.t.a;
import com.google.zxing.y.c.f;
import com.google.zxing.y.c.j;

/* compiled from: MatrixUtil */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final int[][] f12122a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b  reason: collision with root package name */
    private static final int[][] f12123b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c  reason: collision with root package name */
    private static final int[][] f12124c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d  reason: collision with root package name */
    private static final int[][] f12125d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static void a(a aVar, f fVar, j jVar, int i, b bVar) throws WriterException {
        c(bVar);
        d(jVar, bVar);
        l(fVar, i, bVar);
        s(jVar, bVar);
        f(aVar, i, bVar);
    }

    static int b(int i, int i2) {
        if (i2 != 0) {
            int n = n(i2);
            int i3 = i << (n - 1);
            while (n(i3) >= n) {
                i3 ^= i2 << (n(i3) - n);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    static void c(b bVar) {
        bVar.a((byte) -1);
    }

    static void d(j jVar, b bVar) throws WriterException {
        j(bVar);
        e(bVar);
        r(jVar, bVar);
        k(bVar);
    }

    private static void e(b bVar) throws WriterException {
        if (bVar.b(8, bVar.d() - 8) != 0) {
            bVar.f(8, bVar.d() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    static void f(a aVar, int i, b bVar) throws WriterException {
        boolean z;
        int e2 = bVar.e() - 1;
        int d2 = bVar.d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (e2 > 0) {
            if (e2 == 6) {
                e2--;
            }
            while (d2 >= 0 && d2 < bVar.d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = e2 - i4;
                    if (o(bVar.b(i5, d2))) {
                        if (i2 < aVar.n()) {
                            z = aVar.i(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && d.f(i, i5, d2)) {
                            z = !z;
                        }
                        bVar.g(i5, d2, z);
                    }
                }
                d2 += i3;
            }
            i3 = -i3;
            d2 += i3;
            e2 -= 2;
        }
        if (i2 != aVar.n()) {
            throw new WriterException("Not all bits consumed: " + i2 + '/' + aVar.n());
        }
    }

    private static void g(int i, int i2, b bVar) throws WriterException {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (o(bVar.b(i4, i2))) {
                bVar.f(i4, i2, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    private static void h(int i, int i2, b bVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = f12123b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                bVar.f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void i(int i, int i2, b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f12122a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void j(b bVar) throws WriterException {
        int length = f12122a[0].length;
        i(0, 0, bVar);
        i(bVar.e() - length, 0, bVar);
        i(0, bVar.e() - length, bVar);
        g(0, 7, bVar);
        g(bVar.e() - 8, 7, bVar);
        g(0, bVar.e() - 8, bVar);
        m(7, 0, bVar);
        m((bVar.d() - 7) - 1, 0, bVar);
        m(7, bVar.d() - 7, bVar);
    }

    private static void k(b bVar) {
        int i = 8;
        while (i < bVar.e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (o(bVar.b(i, 6))) {
                bVar.f(i, 6, i3);
            }
            if (o(bVar.b(6, i))) {
                bVar.f(6, i, i3);
            }
            i = i2;
        }
    }

    static void l(f fVar, int i, b bVar) throws WriterException {
        a aVar = new a();
        p(fVar, i, aVar);
        for (int i2 = 0; i2 < aVar.n(); i2++) {
            boolean i3 = aVar.i((aVar.n() - 1) - i2);
            int[] iArr = f12125d[i2];
            bVar.g(iArr[0], iArr[1], i3);
            if (i2 < 8) {
                bVar.g((bVar.e() - i2) - 1, 8, i3);
            } else {
                bVar.g(8, (bVar.d() - 7) + (i2 - 8), i3);
            }
        }
    }

    private static void m(int i, int i2, b bVar) throws WriterException {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (o(bVar.b(i, i4))) {
                bVar.f(i, i4, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    static int n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    private static boolean o(int i) {
        return i == -1;
    }

    static void p(f fVar, int i, a aVar) throws WriterException {
        if (f.b(i)) {
            int g = (fVar.g() << 3) | i;
            aVar.d(g, 5);
            aVar.d(b(g, 1335), 10);
            a aVar2 = new a();
            aVar2.d(21522, 15);
            aVar.y(aVar2);
            if (aVar.n() != 15) {
                throw new WriterException("should not happen but we got: " + aVar.n());
            }
            return;
        }
        throw new WriterException("Invalid mask pattern");
    }

    static void q(j jVar, a aVar) throws WriterException {
        aVar.d(jVar.j(), 6);
        aVar.d(b(jVar.j(), 7973), 12);
        if (aVar.n() != 18) {
            throw new WriterException("should not happen but we got: " + aVar.n());
        }
    }

    private static void r(j jVar, b bVar) {
        if (jVar.j() >= 2) {
            int[] iArr = f12124c[jVar.j() - 1];
            for (int i : iArr) {
                if (i >= 0) {
                    for (int i2 : iArr) {
                        if (i2 >= 0 && o(bVar.b(i2, i))) {
                            h(i2 - 2, i - 2, bVar);
                        }
                    }
                }
            }
        }
    }

    static void s(j jVar, b bVar) throws WriterException {
        if (jVar.j() >= 7) {
            a aVar = new a();
            q(jVar, aVar);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean i4 = aVar.i(i);
                    i--;
                    bVar.g(i2, (bVar.d() - 11) + i3, i4);
                    bVar.g((bVar.d() - 11) + i3, i2, i4);
                }
            }
        }
    }
}
