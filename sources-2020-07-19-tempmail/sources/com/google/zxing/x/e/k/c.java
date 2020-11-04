package com.google.zxing.x.e.k;

/* compiled from: ModulusPoly */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f12018a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f12019b;

    c(b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f12018a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f12019b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f12019b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f12019b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public c a(c cVar) {
        if (!this.f12018a.equals(cVar.f12018a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (e()) {
            return cVar;
        } else {
            if (cVar.e()) {
                return this;
            }
            int[] iArr = this.f12019b;
            int[] iArr2 = cVar.f12019b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = this.f12018a.a(iArr2[i - length], iArr[i]);
            }
            return new c(this.f12018a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    public int b(int i) {
        if (i == 0) {
            return c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a2 : this.f12019b) {
                i2 = this.f12018a.a(i2, a2);
            }
            return i2;
        }
        int[] iArr = this.f12019b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            b bVar = this.f12018a;
            i3 = bVar.a(bVar.i(i, i3), this.f12019b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    public int c(int i) {
        int[] iArr = this.f12019b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f12019b.length - 1;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f12019b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    public c f(int i) {
        if (i == 0) {
            return this.f12018a.f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f12019b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f12018a.i(this.f12019b[i2], i);
        }
        return new c(this.f12018a, iArr);
    }

    /* access modifiers changed from: package-private */
    public c g(c cVar) {
        if (!this.f12018a.equals(cVar.f12018a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (e() || cVar.e()) {
            return this.f12018a.f();
        } else {
            int[] iArr = this.f12019b;
            int length = iArr.length;
            int[] iArr2 = cVar.f12019b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    b bVar = this.f12018a;
                    iArr3[i4] = bVar.a(iArr3[i4], bVar.i(i2, iArr2[i3]));
                }
            }
            return new c(this.f12018a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    public c h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f12018a.f();
        } else {
            int length = this.f12019b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f12018a.i(this.f12019b[i3], i2);
            }
            return new c(this.f12018a, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public c i() {
        int length = this.f12019b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f12018a.j(0, this.f12019b[i]);
        }
        return new c(this.f12018a, iArr);
    }

    /* access modifiers changed from: package-private */
    public c j(c cVar) {
        if (!this.f12018a.equals(cVar.f12018a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (cVar.e()) {
            return this;
        } else {
            return a(cVar.i());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(d() * 8);
        for (int d2 = d(); d2 >= 0; d2--) {
            int c2 = c(d2);
            if (c2 != 0) {
                if (c2 < 0) {
                    sb.append(" - ");
                    c2 = -c2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d2 == 0 || c2 != 1) {
                    sb.append(c2);
                }
                if (d2 != 0) {
                    if (d2 == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(d2);
                    }
                }
            }
        }
        return sb.toString();
    }
}
