package com.google.zxing.common.reedsolomon;

/* compiled from: ReedSolomonDecoder */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f11662a;

    public c(a aVar) {
        this.f11662a = aVar;
    }

    private int[] b(b bVar) throws ReedSolomonException {
        int f2 = bVar.f();
        int i = 0;
        if (f2 == 1) {
            return new int[]{bVar.d(1)};
        }
        int[] iArr = new int[f2];
        for (int i2 = 1; i2 < this.f11662a.f() && i < f2; i2++) {
            if (bVar.c(i2) == 0) {
                iArr[i] = this.f11662a.h(i2);
                i++;
            }
        }
        if (i == f2) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    private int[] c(b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int h = this.f11662a.h(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int j = this.f11662a.j(iArr[i3], h);
                    i2 = this.f11662a.j(i2, (j & 1) == 0 ? j | 1 : j & -2);
                }
            }
            iArr2[i] = this.f11662a.j(bVar.c(h), this.f11662a.h(i2));
            if (this.f11662a.d() != 0) {
                iArr2[i] = this.f11662a.j(iArr2[i], h);
            }
        }
        return iArr2;
    }

    private b[] d(b bVar, b bVar2, int i) throws ReedSolomonException {
        if (bVar.f() < bVar2.f()) {
            b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
        }
        b g = this.f11662a.g();
        b e2 = this.f11662a.e();
        do {
            b bVar4 = r11;
            r11 = bVar;
            bVar = bVar4;
            b bVar5 = e2;
            b bVar6 = g;
            g = bVar5;
            if (bVar.f() < i / 2) {
                int d2 = g.d(0);
                if (d2 != 0) {
                    int h = this.f11662a.h(d2);
                    return new b[]{g.h(h), bVar.h(h)};
                }
                throw new ReedSolomonException("sigmaTilde(0) was zero");
            } else if (!bVar.g()) {
                b g2 = this.f11662a.g();
                int h2 = this.f11662a.h(bVar.d(bVar.f()));
                while (r11.f() >= bVar.f() && !r11.g()) {
                    int f2 = r11.f() - bVar.f();
                    int j = this.f11662a.j(r11.d(r11.f()), h2);
                    g2 = g2.a(this.f11662a.b(f2, j));
                    r11 = r11.a(bVar.j(f2, j));
                }
                e2 = g2.i(g).a(bVar6);
            } else {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
        } while (r11.f() < bVar.f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    public void a(int[] iArr, int i) throws ReedSolomonException {
        b bVar = new b(this.f11662a, iArr);
        int[] iArr2 = new int[i];
        int i2 = 0;
        boolean z = true;
        for (int i3 = 0; i3 < i; i3++) {
            a aVar = this.f11662a;
            int c2 = bVar.c(aVar.c(aVar.d() + i3));
            iArr2[(i - 1) - i3] = c2;
            if (c2 != 0) {
                z = false;
            }
        }
        if (!z) {
            b[] d2 = d(this.f11662a.b(i, 1), new b(this.f11662a, iArr2), i);
            b bVar2 = d2[0];
            b bVar3 = d2[1];
            int[] b2 = b(bVar2);
            int[] c3 = c(bVar3, b2);
            while (i2 < b2.length) {
                int length = (iArr.length - 1) - this.f11662a.i(b2[i2]);
                if (length >= 0) {
                    iArr[length] = a.a(iArr[length], c3[i2]);
                    i2++;
                } else {
                    throw new ReedSolomonException("Bad error location");
                }
            }
        }
    }
}
