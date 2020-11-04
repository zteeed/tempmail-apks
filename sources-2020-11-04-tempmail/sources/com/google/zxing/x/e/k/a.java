package com.google.zxing.x.e.k;

import com.google.zxing.ChecksumException;

/* compiled from: ErrorCorrection */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f12560a = b.f12561f;

    private int[] b(c cVar) throws ChecksumException {
        int d2 = cVar.d();
        int[] iArr = new int[d2];
        int i = 0;
        for (int i2 = 1; i2 < this.f12560a.e() && i < d2; i2++) {
            if (cVar.b(i2) == 0) {
                iArr[i] = this.f12560a.g(i2);
                i++;
            }
        }
        if (i == d2) {
            return iArr;
        }
        throw ChecksumException.a();
    }

    private int[] c(c cVar, c cVar2, int[] iArr) {
        int d2 = cVar2.d();
        int[] iArr2 = new int[d2];
        for (int i = 1; i <= d2; i++) {
            iArr2[d2 - i] = this.f12560a.i(i, cVar2.c(i));
        }
        c cVar3 = new c(this.f12560a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int g = this.f12560a.g(iArr[i2]);
            iArr3[i2] = this.f12560a.i(this.f12560a.j(0, cVar.b(g)), this.f12560a.g(cVar3.b(g)));
        }
        return iArr3;
    }

    private c[] d(c cVar, c cVar2, int i) throws ChecksumException {
        if (cVar.d() < cVar2.d()) {
            c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        c f2 = this.f12560a.f();
        c d2 = this.f12560a.d();
        while (true) {
            c cVar4 = r11;
            r11 = cVar;
            cVar = cVar4;
            c cVar5 = d2;
            c cVar6 = f2;
            f2 = cVar5;
            if (cVar.d() < i / 2) {
                int c2 = f2.c(0);
                if (c2 != 0) {
                    int g = this.f12560a.g(c2);
                    return new c[]{f2.f(g), cVar.f(g)};
                }
                throw ChecksumException.a();
            } else if (!cVar.e()) {
                c f3 = this.f12560a.f();
                int g2 = this.f12560a.g(cVar.c(cVar.d()));
                while (r11.d() >= cVar.d() && !r11.e()) {
                    int d3 = r11.d() - cVar.d();
                    int i2 = this.f12560a.i(r11.c(r11.d()), g2);
                    f3 = f3.a(this.f12560a.b(d3, i2));
                    r11 = r11.j(cVar.h(d3, i2));
                }
                d2 = f3.g(f2).j(cVar6).i();
            } else {
                throw ChecksumException.a();
            }
        }
    }

    public int a(int[] iArr, int i, int[] iArr2) throws ChecksumException {
        c cVar = new c(this.f12560a, iArr);
        int[] iArr3 = new int[i];
        int i2 = 0;
        boolean z = false;
        for (int i3 = i; i3 > 0; i3--) {
            int b2 = cVar.b(this.f12560a.c(i3));
            iArr3[i - i3] = b2;
            if (b2 != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        c d2 = this.f12560a.d();
        if (iArr2 != null) {
            for (int length : iArr2) {
                int c2 = this.f12560a.c((iArr.length - 1) - length);
                b bVar = this.f12560a;
                d2 = d2.g(new c(bVar, new int[]{bVar.j(0, c2), 1}));
            }
        }
        c[] d3 = d(this.f12560a.b(i, 1), new c(this.f12560a, iArr3), i);
        c cVar2 = d3[0];
        c cVar3 = d3[1];
        int[] b3 = b(cVar2);
        int[] c3 = c(cVar3, cVar2, b3);
        while (i2 < b3.length) {
            int length2 = (iArr.length - 1) - this.f12560a.h(b3[i2]);
            if (length2 >= 0) {
                iArr[length2] = this.f12560a.j(iArr[length2], c3[i2]);
                i2++;
            } else {
                throw ChecksumException.a();
            }
        }
        return b3.length;
    }
}
