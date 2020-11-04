package com.google.zxing.y.d;

import com.google.zxing.NotFoundException;
import com.google.zxing.p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AlignmentPatternFinder */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.zxing.t.b f12095a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f12096b = new ArrayList(5);

    /* renamed from: c  reason: collision with root package name */
    private final int f12097c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12098d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12099e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12100f;
    private final float g;
    private final int[] h;
    private final p i;

    b(com.google.zxing.t.b bVar, int i2, int i3, int i4, int i5, float f2, p pVar) {
        this.f12095a = bVar;
        this.f12097c = i2;
        this.f12098d = i3;
        this.f12099e = i4;
        this.f12100f = i5;
        this.g = f2;
        this.h = new int[3];
        this.i = pVar;
    }

    private static float a(int[] iArr, int i2) {
        return ((float) (i2 - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    private float b(int i2, int i3, int i4, int i5) {
        com.google.zxing.t.b bVar = this.f12095a;
        int j = bVar.j();
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i6 = i2;
        while (i6 >= 0 && bVar.f(i3, i6) && iArr[1] <= i4) {
            iArr[1] = iArr[1] + 1;
            i6--;
        }
        if (i6 >= 0 && iArr[1] <= i4) {
            while (i6 >= 0 && !bVar.f(i3, i6) && iArr[0] <= i4) {
                iArr[0] = iArr[0] + 1;
                i6--;
            }
            if (iArr[0] > i4) {
                return Float.NaN;
            }
            int i7 = i2 + 1;
            while (i7 < j && bVar.f(i3, i7) && iArr[1] <= i4) {
                iArr[1] = iArr[1] + 1;
                i7++;
            }
            if (i7 != j && iArr[1] <= i4) {
                while (i7 < j && !bVar.f(i3, i7) && iArr[2] <= i4) {
                    iArr[2] = iArr[2] + 1;
                    i7++;
                }
                if (iArr[2] <= i4 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i5) * 5 < i5 * 2 && d(iArr)) {
                    return a(iArr, i7);
                }
            }
        }
        return Float.NaN;
    }

    private boolean d(int[] iArr) {
        float f2 = this.g;
        float f3 = f2 / 2.0f;
        for (int i2 = 0; i2 < 3; i2++) {
            if (Math.abs(f2 - ((float) iArr[i2])) >= f3) {
                return false;
            }
        }
        return true;
    }

    private a e(int[] iArr, int i2, int i3) {
        int i4 = iArr[0] + iArr[1] + iArr[2];
        float a2 = a(iArr, i3);
        float b2 = b(i2, (int) a2, iArr[1] * 2, i4);
        if (Float.isNaN(b2)) {
            return null;
        }
        float f2 = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (a next : this.f12096b) {
            if (next.f(f2, b2, a2)) {
                return next.g(b2, a2, f2);
            }
        }
        a aVar = new a(a2, b2, f2);
        this.f12096b.add(aVar);
        p pVar = this.i;
        if (pVar == null) {
            return null;
        }
        pVar.a(aVar);
        return null;
    }

    /* access modifiers changed from: package-private */
    public a c() throws NotFoundException {
        a e2;
        a e3;
        int i2 = this.f12097c;
        int i3 = this.f12100f;
        int i4 = this.f12099e + i2;
        int i5 = this.f12098d + (i3 / 2);
        int[] iArr = new int[3];
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = ((i6 & 1) == 0 ? (i6 + 1) / 2 : -((i6 + 1) / 2)) + i5;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i8 = i2;
            while (i8 < i4 && !this.f12095a.f(i8, i7)) {
                i8++;
            }
            int i9 = 0;
            while (i8 < i4) {
                if (!this.f12095a.f(i8, i7)) {
                    if (i9 == 1) {
                        i9++;
                    }
                    iArr[i9] = iArr[i9] + 1;
                } else if (i9 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i9 != 2) {
                    i9++;
                    iArr[i9] = iArr[i9] + 1;
                } else if (d(iArr) && (e3 = e(iArr, i7, i8)) != null) {
                    return e3;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i9 = 1;
                }
                i8++;
            }
            if (d(iArr) && (e2 = e(iArr, i7, i4)) != null) {
                return e2;
            }
        }
        if (!this.f12096b.isEmpty()) {
            return this.f12096b.get(0);
        }
        throw NotFoundException.a();
    }
}
