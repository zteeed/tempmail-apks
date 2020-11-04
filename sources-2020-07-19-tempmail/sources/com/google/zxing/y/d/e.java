package com.google.zxing.y.d;

import com.google.zxing.NotFoundException;
import com.google.zxing.d;
import com.google.zxing.o;
import com.google.zxing.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* compiled from: FinderPatternFinder */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.zxing.t.b f12105a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f12106b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f12107c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f12108d = new int[5];

    /* renamed from: e  reason: collision with root package name */
    private final p f12109e;

    /* compiled from: FinderPatternFinder */
    private static final class b implements Serializable, Comparator<d> {

        /* renamed from: b  reason: collision with root package name */
        private final float f12110b;

        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            int compare = Integer.compare(dVar2.h(), dVar.h());
            return compare == 0 ? Float.compare(Math.abs(dVar.i() - this.f12110b), Math.abs(dVar2.i() - this.f12110b)) : compare;
        }

        private b(float f2) {
            this.f12110b = f2;
        }
    }

    /* compiled from: FinderPatternFinder */
    private static final class c implements Serializable, Comparator<d> {

        /* renamed from: b  reason: collision with root package name */
        private final float f12111b;

        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return Float.compare(Math.abs(dVar2.i() - this.f12111b), Math.abs(dVar.i() - this.f12111b));
        }

        private c(float f2) {
            this.f12111b = f2;
        }
    }

    public e(com.google.zxing.t.b bVar, p pVar) {
        this.f12105a = bVar;
        this.f12109e = pVar;
    }

    private static float a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    private boolean c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] j = j();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f12105a.f(i2 - i6, i - i6)) {
            j[2] = j[2] + 1;
            i6++;
        }
        if (j[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f12105a.f(i2 - i6, i - i6)) {
            j[1] = j[1] + 1;
            i6++;
        }
        if (j[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f12105a.f(i2 - i6, i - i6)) {
            j[0] = j[0] + 1;
            i6++;
        }
        if (j[0] == 0) {
            return false;
        }
        int j2 = this.f12105a.j();
        int n = this.f12105a.n();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 < j2 && (i5 = i2 + i7) < n && this.f12105a.f(i5, i8)) {
                j[2] = j[2] + 1;
                i7++;
            }
        }
        while (true) {
            int i9 = i + i7;
            if (i9 < j2 && (i4 = i2 + i7) < n && !this.f12105a.f(i4, i9)) {
                j[3] = j[3] + 1;
                i7++;
            }
        }
        if (j[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 < j2 && (i3 = i2 + i7) < n && this.f12105a.f(i3, i10)) {
                j[4] = j[4] + 1;
                i7++;
            }
        }
        if (j[4] == 0) {
            return false;
        }
        return i(j);
    }

    private float d(int i, int i2, int i3, int i4) {
        com.google.zxing.t.b bVar = this.f12105a;
        int n = bVar.n();
        int[] j = j();
        int i5 = i;
        while (i5 >= 0 && bVar.f(i5, i2)) {
            j[2] = j[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.f(i5, i2) && j[1] <= i3) {
            j[1] = j[1] + 1;
            i5--;
        }
        if (i5 >= 0 && j[1] <= i3) {
            while (i5 >= 0 && bVar.f(i5, i2) && j[0] <= i3) {
                j[0] = j[0] + 1;
                i5--;
            }
            if (j[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < n && bVar.f(i6, i2)) {
                j[2] = j[2] + 1;
                i6++;
            }
            if (i6 == n) {
                return Float.NaN;
            }
            while (i6 < n && !bVar.f(i6, i2) && j[3] < i3) {
                j[3] = j[3] + 1;
                i6++;
            }
            if (i6 != n && j[3] < i3) {
                while (i6 < n && bVar.f(i6, i2) && j[4] < i3) {
                    j[4] = j[4] + 1;
                    i6++;
                }
                if (j[4] < i3 && Math.abs(((((j[0] + j[1]) + j[2]) + j[3]) + j[4]) - i4) * 5 < i4 && h(j)) {
                    return a(j, i6);
                }
            }
        }
        return Float.NaN;
    }

    private float e(int i, int i2, int i3, int i4) {
        com.google.zxing.t.b bVar = this.f12105a;
        int j = bVar.j();
        int[] j2 = j();
        int i5 = i;
        while (i5 >= 0 && bVar.f(i2, i5)) {
            j2[2] = j2[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.f(i2, i5) && j2[1] <= i3) {
            j2[1] = j2[1] + 1;
            i5--;
        }
        if (i5 >= 0 && j2[1] <= i3) {
            while (i5 >= 0 && bVar.f(i2, i5) && j2[0] <= i3) {
                j2[0] = j2[0] + 1;
                i5--;
            }
            if (j2[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < j && bVar.f(i2, i6)) {
                j2[2] = j2[2] + 1;
                i6++;
            }
            if (i6 == j) {
                return Float.NaN;
            }
            while (i6 < j && !bVar.f(i2, i6) && j2[3] < i3) {
                j2[3] = j2[3] + 1;
                i6++;
            }
            if (i6 != j && j2[3] < i3) {
                while (i6 < j && bVar.f(i2, i6) && j2[4] < i3) {
                    j2[4] = j2[4] + 1;
                    i6++;
                }
                if (j2[4] < i3 && Math.abs(((((j2[0] + j2[1]) + j2[2]) + j2[3]) + j2[4]) - i4) * 5 < i4 * 2 && h(j2)) {
                    return a(j2, i6);
                }
            }
        }
        return Float.NaN;
    }

    private int g() {
        if (this.f12106b.size() <= 1) {
            return 0;
        }
        d dVar = null;
        for (d next : this.f12106b) {
            if (next.h() >= 2) {
                if (dVar == null) {
                    dVar = next;
                } else {
                    this.f12107c = true;
                    return ((int) (Math.abs(dVar.c() - next.c()) - Math.abs(dVar.d() - next.d()))) / 2;
                }
            }
        }
        return 0;
    }

    protected static boolean h(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f2 = ((float) i) / 7.0f;
        float f3 = f2 / 2.0f;
        if (Math.abs(f2 - ((float) iArr[0])) >= f3 || Math.abs(f2 - ((float) iArr[1])) >= f3 || Math.abs((f2 * 3.0f) - ((float) iArr[2])) >= 3.0f * f3 || Math.abs(f2 - ((float) iArr[3])) >= f3 || Math.abs(f2 - ((float) iArr[4])) >= f3) {
            return false;
        }
        return true;
    }

    protected static boolean i(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f2 = ((float) i) / 7.0f;
        float f3 = f2 / 1.333f;
        if (Math.abs(f2 - ((float) iArr[0])) >= f3 || Math.abs(f2 - ((float) iArr[1])) >= f3 || Math.abs((f2 * 3.0f) - ((float) iArr[2])) >= 3.0f * f3 || Math.abs(f2 - ((float) iArr[3])) >= f3 || Math.abs(f2 - ((float) iArr[4])) >= f3) {
            return false;
        }
        return true;
    }

    private int[] j() {
        b(this.f12108d);
        return this.f12108d;
    }

    private boolean l() {
        int size = this.f12106b.size();
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        for (d next : this.f12106b) {
            if (next.h() >= 2) {
                i++;
                f3 += next.i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f4 = f3 / ((float) size);
        for (d i2 : this.f12106b) {
            f2 += Math.abs(i2.i() - f4);
        }
        if (f2 <= f3 * 0.05f) {
            return true;
        }
        return false;
    }

    private d[] m() throws NotFoundException {
        int size = this.f12106b.size();
        if (size >= 3) {
            float f2 = 0.0f;
            if (size > 3) {
                float f3 = 0.0f;
                float f4 = 0.0f;
                for (d i : this.f12106b) {
                    float i2 = i.i();
                    f3 += i2;
                    f4 += i2 * i2;
                }
                float f5 = (float) size;
                float f6 = f3 / f5;
                float sqrt = (float) Math.sqrt((double) ((f4 / f5) - (f6 * f6)));
                Collections.sort(this.f12106b, new c(f6));
                float max = Math.max(0.2f * f6, sqrt);
                int i3 = 0;
                while (i3 < this.f12106b.size() && this.f12106b.size() > 3) {
                    if (Math.abs(this.f12106b.get(i3).i() - f6) > max) {
                        this.f12106b.remove(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            if (this.f12106b.size() > 3) {
                for (d i4 : this.f12106b) {
                    f2 += i4.i();
                }
                Collections.sort(this.f12106b, new b(f2 / ((float) this.f12106b.size())));
                List<d> list = this.f12106b;
                list.subList(3, list.size()).clear();
            }
            return new d[]{this.f12106b.get(0), this.f12106b.get(1), this.f12106b.get(2)};
        }
        throw NotFoundException.a();
    }

    /* access modifiers changed from: protected */
    public final void b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final f f(Map<d, ?> map) throws NotFoundException {
        boolean z = map != null && map.containsKey(d.TRY_HARDER);
        int j = this.f12105a.j();
        int n = this.f12105a.n();
        int i = (j * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z2 = false;
        while (i2 < j && !z2) {
            b(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < n) {
                if (this.f12105a.f(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 == 4) {
                    if (!h(iArr)) {
                        n(iArr);
                    } else if (k(iArr, i2, i3)) {
                        if (this.f12107c) {
                            z2 = l();
                        } else {
                            int g = g();
                            if (g > iArr[2]) {
                                i2 += (g - iArr[2]) - 2;
                                i3 = n - 1;
                            }
                        }
                        b(iArr);
                        i = 2;
                        i4 = 0;
                    } else {
                        n(iArr);
                    }
                    i4 = 3;
                } else {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (h(iArr) && k(iArr, i2, n)) {
                i = iArr[0];
                if (this.f12107c) {
                    z2 = l();
                }
            }
            i2 += i;
        }
        d[] m = m();
        o.e(m);
        return new f(m);
    }

    /* access modifiers changed from: protected */
    public final boolean k(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a2 = (int) a(iArr, i2);
        float e2 = e(i, a2, iArr[2], i3);
        if (!Float.isNaN(e2)) {
            int i4 = (int) e2;
            float d2 = d(a2, i4, iArr[2], i3);
            if (!Float.isNaN(d2) && c(i4, (int) d2)) {
                float f2 = ((float) i3) / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f12106b.size()) {
                        break;
                    }
                    d dVar = this.f12106b.get(i5);
                    if (dVar.f(f2, e2, d2)) {
                        this.f12106b.set(i5, dVar.g(e2, d2, f2));
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (!z) {
                    d dVar2 = new d(d2, e2, f2);
                    this.f12106b.add(dVar2);
                    p pVar = this.f12109e;
                    if (pVar != null) {
                        pVar.a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void n(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
