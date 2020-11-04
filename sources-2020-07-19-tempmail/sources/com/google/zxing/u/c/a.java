package com.google.zxing.u.c;

import com.google.zxing.FormatException;
import com.google.zxing.t.b;

/* compiled from: BitMatrixParser */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f11811a;

    /* renamed from: b  reason: collision with root package name */
    private final b f11812b;

    /* renamed from: c  reason: collision with root package name */
    private final e f11813c;

    a(b bVar) throws FormatException {
        int j = bVar.j();
        if (j < 8 || j > 144 || (j & 1) != 0) {
            throw FormatException.a();
        }
        this.f11813c = j(bVar);
        b a2 = a(bVar);
        this.f11811a = a2;
        this.f11812b = new b(a2.n(), this.f11811a.j());
    }

    private b a(b bVar) {
        int f2 = this.f11813c.f();
        int e2 = this.f11813c.e();
        if (bVar.j() == f2) {
            int c2 = this.f11813c.c();
            int b2 = this.f11813c.b();
            int i = f2 / c2;
            int i2 = e2 / b2;
            b bVar2 = new b(i2 * b2, i * c2);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * c2;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * b2;
                    for (int i7 = 0; i7 < c2; i7++) {
                        int i8 = ((c2 + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < b2; i10++) {
                            if (bVar.f(((b2 + 2) * i5) + 1 + i10, i8)) {
                                bVar2.p(i6 + i10, i9);
                            }
                        }
                        b bVar3 = bVar;
                    }
                    b bVar4 = bVar;
                }
                b bVar5 = bVar;
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    }

    private int d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (h(i3, 0, i, i2) ? 1 : 0) << true;
        if (h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return h(3, i8, i, i2) ? i11 | 1 : i11;
    }

    private int e(int i, int i2) {
        int i3 = (h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return h(1, i9, i, i2) ? i10 | 1 : i10;
    }

    private int f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (h(i3, 0, i, i2) ? 1 : 0) << true;
        int i5 = i2 - 1;
        if (h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return h(1, i5, i, i2) ? i13 | 1 : i13;
    }

    private int g(int i, int i2) {
        int i3 = (h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return h(3, i7, i, i2) ? i10 | 1 : i10;
    }

    private boolean h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f11812b.p(i2, i);
        return this.f11811a.f(i2, i);
    }

    private int i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (h(i5, i6, i3, i4) ? 1 : 0) << true;
        int i8 = i2 - 1;
        if (h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return h(i, i2, i3, i4) ? i15 | 1 : i15;
    }

    private static e j(b bVar) throws FormatException {
        return e.h(bVar.j(), bVar.n());
    }

    /* access modifiers changed from: package-private */
    public e b() {
        return this.f11813c;
    }

    /* access modifiers changed from: package-private */
    public byte[] c() throws FormatException {
        byte[] bArr = new byte[this.f11813c.g()];
        int j = this.f11811a.j();
        int n = this.f11811a.n();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == j && i == 0 && !z) {
                bArr[i2] = (byte) d(j, n);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = j - 2;
                if (i3 == i4 && i == 0 && (n & 3) != 0 && !z2) {
                    bArr[i2] = (byte) e(j, n);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == j + 4 && i == 2 && (n & 7) == 0 && !z3) {
                    bArr[i2] = (byte) f(j, n);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (n & 7) == 4 && !z4) {
                    bArr[i2] = (byte) g(j, n);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < j && i >= 0 && !this.f11812b.f(i, i3)) {
                            bArr[i2] = (byte) i(i3, i, j, n);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < n);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < n && !this.f11812b.f(i6, i5)) {
                            bArr[i2] = (byte) i(i5, i6, j, n);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= j) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= j && i >= n) {
                break;
            }
        }
        if (i2 == this.f11813c.g()) {
            return bArr;
        }
        throw FormatException.a();
    }
}
