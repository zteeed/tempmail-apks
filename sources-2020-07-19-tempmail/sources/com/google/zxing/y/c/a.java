package com.google.zxing.y.c;

import com.google.zxing.FormatException;
import com.google.zxing.t.b;

/* compiled from: BitMatrixParser */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f12056a;

    /* renamed from: b  reason: collision with root package name */
    private j f12057b;

    /* renamed from: c  reason: collision with root package name */
    private g f12058c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12059d;

    a(b bVar) throws FormatException {
        int j = bVar.j();
        if (j < 21 || (j & 3) != 1) {
            throw FormatException.a();
        }
        this.f12056a = bVar;
    }

    private int a(int i, int i2, int i3) {
        return this.f12059d ? this.f12056a.f(i2, i) : this.f12056a.f(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int i = 0;
        while (i < this.f12056a.n()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f12056a.j(); i3++) {
                if (this.f12056a.f(i, i3) != this.f12056a.f(i3, i)) {
                    this.f12056a.e(i3, i);
                    this.f12056a.e(i, i3);
                }
            }
            i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] c() throws FormatException {
        g d2 = d();
        j e2 = e();
        c cVar = c.values()[d2.c()];
        int j = this.f12056a.j();
        cVar.g(this.f12056a, j);
        b a2 = e2.a();
        byte[] bArr = new byte[e2.h()];
        int i = j - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < j; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!a2.f(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.f12056a.f(i9, i7)) {
                            i5 |= 1;
                        }
                        if (i4 == 8) {
                            bArr[i3] = (byte) i5;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == e2.h()) {
            return bArr;
        }
        throw FormatException.a();
    }

    /* access modifiers changed from: package-private */
    public g d() throws FormatException {
        g gVar = this.f12058c;
        if (gVar != null) {
            return gVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = a(i3, 8, i2);
        }
        int a2 = a(8, 7, a(8, 8, a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a2 = a(8, i4, a2);
        }
        int j = this.f12056a.j();
        int i5 = j - 7;
        for (int i6 = j - 1; i6 >= i5; i6--) {
            i = a(8, i6, i);
        }
        for (int i7 = j - 8; i7 < j; i7++) {
            i = a(i7, 8, i);
        }
        g a3 = g.a(a2, i);
        this.f12058c = a3;
        if (a3 != null) {
            return a3;
        }
        throw FormatException.a();
    }

    /* access modifiers changed from: package-private */
    public j e() throws FormatException {
        j jVar = this.f12057b;
        if (jVar != null) {
            return jVar;
        }
        int j = this.f12056a.j();
        int i = (j - 17) / 4;
        if (i <= 6) {
            return j.i(i);
        }
        int i2 = j - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = j - 9; i6 >= i2; i6--) {
                i4 = a(i6, i5, i4);
            }
        }
        j c2 = j.c(i4);
        if (c2 == null || c2.e() != j) {
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = j - 9; i8 >= i2; i8--) {
                    i3 = a(i7, i8, i3);
                }
            }
            j c3 = j.c(i3);
            if (c3 == null || c3.e() != j) {
                throw FormatException.a();
            }
            this.f12057b = c3;
            return c3;
        }
        this.f12057b = c2;
        return c2;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.f12058c != null) {
            c.values()[this.f12058c.c()].g(this.f12056a, this.f12056a.j());
        }
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z) {
        this.f12057b = null;
        this.f12058c = null;
        this.f12059d = z;
    }
}
