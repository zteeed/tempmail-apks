package com.google.zxing.u.c;

import com.google.zxing.u.c.e;

/* compiled from: DataBlock */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f12363a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f12364b;

    private b(int i, byte[] bArr) {
        this.f12363a = i;
        this.f12364b = bArr;
    }

    static b[] b(byte[] bArr, e eVar) {
        e.c d2 = eVar.d();
        e.b[] a2 = d2.a();
        int i = 0;
        for (e.b a3 : a2) {
            i += a3.a();
        }
        b[] bVarArr = new b[i];
        int i2 = 0;
        for (e.b bVar : a2) {
            int i3 = 0;
            while (i3 < bVar.a()) {
                int b2 = bVar.b();
                bVarArr[i2] = new b(b2, new byte[(d2.b() + b2)]);
                i3++;
                i2++;
            }
        }
        int length = bVarArr[0].f12364b.length - d2.b();
        int i4 = length - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                bVarArr[i7].f12364b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        boolean z = eVar.i() == 24;
        int i8 = z ? 8 : i2;
        int i9 = 0;
        while (i9 < i8) {
            bVarArr[i9].f12364b[i4] = bArr[i5];
            i9++;
            i5++;
        }
        int length2 = bVarArr[0].f12364b.length;
        while (length < length2) {
            int i10 = 0;
            while (i10 < i2) {
                int i11 = z ? (i10 + 8) % i2 : i10;
                bVarArr[i11].f12364b[(!z || i11 <= 7) ? length : length - 1] = bArr[i5];
                i10++;
                i5++;
            }
            length++;
        }
        if (i5 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public byte[] a() {
        return this.f12364b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f12363a;
    }
}
