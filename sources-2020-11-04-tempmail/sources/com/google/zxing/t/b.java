package com.google.zxing.t;

import java.util.Arrays;

/* compiled from: BitMatrix */
public final class b implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    private final int f12319b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12320c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12321d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f12322e;

    public b(int i) {
        this(i, i);
    }

    private String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f12320c * (this.f12319b + 1));
        for (int i = 0; i < this.f12320c; i++) {
            for (int i2 = 0; i2 < this.f12319b; i2++) {
                sb.append(f(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public void c() {
        int length = this.f12322e.length;
        for (int i = 0; i < length; i++) {
            this.f12322e[i] = 0;
        }
    }

    /* renamed from: d */
    public b clone() {
        return new b(this.f12319b, this.f12320c, this.f12321d, (int[]) this.f12322e.clone());
    }

    public void e(int i, int i2) {
        int i3 = (i2 * this.f12321d) + (i / 32);
        int[] iArr = this.f12322e;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f12319b == bVar.f12319b && this.f12320c == bVar.f12320c && this.f12321d == bVar.f12321d && Arrays.equals(this.f12322e, bVar.f12322e)) {
            return true;
        }
        return false;
    }

    public boolean f(int i, int i2) {
        return ((this.f12322e[(i2 * this.f12321d) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public int[] g() {
        int length = this.f12322e.length - 1;
        while (length >= 0 && this.f12322e[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f12321d;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f12322e[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    public int hashCode() {
        int i = this.f12319b;
        return (((((((i * 31) + i) * 31) + this.f12320c) * 31) + this.f12321d) * 31) + Arrays.hashCode(this.f12322e);
    }

    public int[] i() {
        int i = this.f12319b;
        int i2 = this.f12320c;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f12320c; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f12321d;
                if (i6 >= i7) {
                    break;
                }
                int i8 = this.f12322e[(i7 * i5) + i6];
                if (i8 != 0) {
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    if (i5 > i4) {
                        i4 = i5;
                    }
                    int i9 = i6 << 5;
                    if (i9 < i) {
                        int i10 = 0;
                        while ((i8 << (31 - i10)) == 0) {
                            i10++;
                        }
                        int i11 = i10 + i9;
                        if (i11 < i) {
                            i = i11;
                        }
                    }
                    if (i9 + 31 > i3) {
                        int i12 = 31;
                        while ((i8 >>> i12) == 0) {
                            i12--;
                        }
                        int i13 = i9 + i12;
                        if (i13 > i3) {
                            i3 = i13;
                        }
                    }
                }
                i6++;
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    public int j() {
        return this.f12320c;
    }

    public a k(int i, a aVar) {
        if (aVar == null || aVar.n() < this.f12319b) {
            aVar = new a(this.f12319b);
        } else {
            aVar.e();
        }
        int i2 = i * this.f12321d;
        for (int i3 = 0; i3 < this.f12321d; i3++) {
            aVar.w(i3 << 5, this.f12322e[i2 + i3]);
        }
        return aVar;
    }

    public int[] l() {
        int i = 0;
        while (true) {
            int[] iArr = this.f12322e;
            if (i >= iArr.length || iArr[i] != 0) {
                int[] iArr2 = this.f12322e;
            } else {
                i++;
            }
        }
        int[] iArr22 = this.f12322e;
        if (i == iArr22.length) {
            return null;
        }
        int i2 = this.f12321d;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr22[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    public int n() {
        return this.f12319b;
    }

    public void o() {
        int n = n();
        int j = j();
        a aVar = new a(n);
        a aVar2 = new a(n);
        for (int i = 0; i < (j + 1) / 2; i++) {
            aVar = k(i, aVar);
            int i2 = (j - 1) - i;
            aVar2 = k(i2, aVar2);
            aVar.s();
            aVar2.s();
            s(i, aVar2);
            s(i2, aVar);
        }
    }

    public void p(int i, int i2) {
        int i3 = (i2 * this.f12321d) + (i / 32);
        int[] iArr = this.f12322e;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public void r(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f12320c || i5 > this.f12319b) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f12321d * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f12322e;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public void s(int i, a aVar) {
        int[] j = aVar.j();
        int[] iArr = this.f12322e;
        int i2 = this.f12321d;
        System.arraycopy(j, 0, iArr, i * i2, i2);
    }

    public String t(String str, String str2) {
        return b(str, str2, "\n");
    }

    public String toString() {
        return t("X ", "  ");
    }

    public b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f12319b = i;
        this.f12320c = i2;
        int i3 = (i + 31) / 32;
        this.f12321d = i3;
        this.f12322e = new int[(i3 * i2)];
    }

    private b(int i, int i2, int i3, int[] iArr) {
        this.f12319b = i;
        this.f12320c = i2;
        this.f12321d = i3;
        this.f12322e = iArr;
    }
}
