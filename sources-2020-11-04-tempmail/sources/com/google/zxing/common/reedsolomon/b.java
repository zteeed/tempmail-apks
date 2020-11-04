package com.google.zxing.common.reedsolomon;

/* compiled from: GenericGFPoly */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f12209a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f12210b;

    b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f12209a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f12210b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f12210b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f12210b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public b a(b bVar) {
        if (!this.f12209a.equals(bVar.f12209a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (g()) {
            return bVar;
        } else {
            if (bVar.g()) {
                return this;
            }
            int[] iArr = this.f12210b;
            int[] iArr2 = bVar.f12210b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = a.a(iArr2[i - length], iArr[i]);
            }
            return new b(this.f12209a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    public b[] b(b bVar) {
        if (!this.f12209a.equals(bVar.f12209a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.g()) {
            b g = this.f12209a.g();
            int h = this.f12209a.h(bVar.d(bVar.f()));
            b bVar2 = this;
            while (bVar2.f() >= bVar.f() && !bVar2.g()) {
                int f2 = bVar2.f() - bVar.f();
                int j = this.f12209a.j(bVar2.d(bVar2.f()), h);
                b j2 = bVar.j(f2, j);
                g = g.a(this.f12209a.b(f2, j));
                bVar2 = bVar2.a(j2);
            }
            return new b[]{g, bVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i) {
        if (i == 0) {
            return d(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a2 : this.f12210b) {
                i2 = a.a(i2, a2);
            }
            return i2;
        }
        int[] iArr = this.f12210b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            i3 = a.a(this.f12209a.j(i, i3), this.f12210b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    public int d(int i) {
        int[] iArr = this.f12210b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    public int[] e() {
        return this.f12210b;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f12210b.length - 1;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.f12210b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    public b h(int i) {
        if (i == 0) {
            return this.f12209a.g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f12210b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f12209a.j(this.f12210b[i2], i);
        }
        return new b(this.f12209a, iArr);
    }

    /* access modifiers changed from: package-private */
    public b i(b bVar) {
        if (!this.f12209a.equals(bVar.f12209a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (g() || bVar.g()) {
            return this.f12209a.g();
        } else {
            int[] iArr = this.f12210b;
            int length = iArr.length;
            int[] iArr2 = bVar.f12210b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = a.a(iArr3[i4], this.f12209a.j(i2, iArr2[i3]));
                }
            }
            return new b(this.f12209a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    public b j(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f12209a.g();
        } else {
            int length = this.f12210b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f12209a.j(this.f12210b[i3], i2);
            }
            return new b(this.f12209a, iArr);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(f() * 8);
        for (int f2 = f(); f2 >= 0; f2--) {
            int d2 = d(f2);
            if (d2 != 0) {
                if (d2 < 0) {
                    sb.append(" - ");
                    d2 = -d2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (f2 == 0 || d2 != 1) {
                    int i = this.f12209a.i(d2);
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (f2 != 0) {
                    if (f2 == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(f2);
                    }
                }
            }
        }
        return sb.toString();
    }
}
