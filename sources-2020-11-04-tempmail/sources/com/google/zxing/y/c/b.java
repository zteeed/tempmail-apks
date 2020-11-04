package com.google.zxing.y.c;

import com.google.zxing.y.c.j;

/* compiled from: DataBlock */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f12609a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f12610b;

    private b(int i, byte[] bArr) {
        this.f12609a = i;
        this.f12610b = bArr;
    }

    static b[] b(byte[] bArr, j jVar, f fVar) {
        if (bArr.length == jVar.h()) {
            j.b f2 = jVar.f(fVar);
            j.a[] a2 = f2.a();
            int i = 0;
            for (j.a a3 : a2) {
                i += a3.a();
            }
            b[] bVarArr = new b[i];
            int i2 = 0;
            for (j.a aVar : a2) {
                int i3 = 0;
                while (i3 < aVar.a()) {
                    int b2 = aVar.b();
                    bVarArr[i2] = new b(b2, new byte[(f2.b() + b2)]);
                    i3++;
                    i2++;
                }
            }
            int length = bVarArr[0].f12610b.length;
            int i4 = i - 1;
            while (i4 >= 0 && bVarArr[i4].f12610b.length != length) {
                i4--;
            }
            int i5 = i4 + 1;
            int b3 = length - f2.b();
            int i6 = 0;
            for (int i7 = 0; i7 < b3; i7++) {
                int i8 = 0;
                while (i8 < i2) {
                    bVarArr[i8].f12610b[i7] = bArr[i6];
                    i8++;
                    i6++;
                }
            }
            int i9 = i5;
            while (i9 < i2) {
                bVarArr[i9].f12610b[b3] = bArr[i6];
                i9++;
                i6++;
            }
            int length2 = bVarArr[0].f12610b.length;
            while (b3 < length2) {
                int i10 = 0;
                while (i10 < i2) {
                    bVarArr[i10].f12610b[i10 < i5 ? b3 : b3 + 1] = bArr[i6];
                    i10++;
                    i6++;
                }
                b3++;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public byte[] a() {
        return this.f12610b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f12609a;
    }
}
