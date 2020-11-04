package com.google.zxing.t;

/* compiled from: BitSource */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f12323a;

    /* renamed from: b  reason: collision with root package name */
    private int f12324b;

    /* renamed from: c  reason: collision with root package name */
    private int f12325c;

    public c(byte[] bArr) {
        this.f12323a = bArr;
    }

    public int a() {
        return ((this.f12323a.length - this.f12324b) * 8) - this.f12325c;
    }

    public int b() {
        return this.f12325c;
    }

    public int c() {
        return this.f12324b;
    }

    public int d(int i) {
        if (i <= 0 || i > 32 || i > a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.f12325c;
        byte b2 = 0;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int i4 = i < i3 ? i : i3;
            int i5 = i3 - i4;
            byte[] bArr = this.f12323a;
            int i6 = this.f12324b;
            int i7 = (((255 >> (8 - i4)) << i5) & bArr[i6]) >> i5;
            i -= i4;
            int i8 = this.f12325c + i4;
            this.f12325c = i8;
            if (i8 == 8) {
                this.f12325c = 0;
                this.f12324b = i6 + 1;
            }
            b2 = i7;
        }
        if (i <= 0) {
            return b2;
        }
        while (i >= 8) {
            int i9 = b2 << 8;
            byte[] bArr2 = this.f12323a;
            int i10 = this.f12324b;
            b2 = (bArr2[i10] & 255) | i9;
            this.f12324b = i10 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b2;
        }
        int i11 = 8 - i;
        int i12 = (b2 << i) | ((((255 >> i11) << i11) & this.f12323a[this.f12324b]) >> i11);
        this.f12325c += i;
        return i12;
    }
}
