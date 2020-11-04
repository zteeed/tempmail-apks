package com.google.zxing;

/* compiled from: PlanarYUVLuminanceSource */
public final class k extends h {

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f12232c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12233d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12234e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12235f;
    private final int g;

    public k(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f12232c = bArr;
        this.f12233d = i;
        this.f12234e = i2;
        this.f12235f = i3;
        this.g = i4;
        if (z) {
            h(i5, i6);
        }
    }

    private void h(int i, int i2) {
        byte[] bArr = this.f12232c;
        int i3 = (this.g * this.f12233d) + this.f12235f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b2 = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b2;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f12233d;
        }
    }

    public byte[] b() {
        int d2 = d();
        int a2 = a();
        if (d2 == this.f12233d && a2 == this.f12234e) {
            return this.f12232c;
        }
        int i = d2 * a2;
        byte[] bArr = new byte[i];
        int i2 = this.g;
        int i3 = this.f12233d;
        int i4 = (i2 * i3) + this.f12235f;
        if (d2 == i3) {
            System.arraycopy(this.f12232c, i4, bArr, 0, i);
            return bArr;
        }
        for (int i5 = 0; i5 < a2; i5++) {
            System.arraycopy(this.f12232c, i4, bArr, i5 * d2, d2);
            i4 += this.f12233d;
        }
        return bArr;
    }

    public byte[] c(int i, byte[] bArr) {
        if (i < 0 || i >= a()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int d2 = d();
        if (bArr == null || bArr.length < d2) {
            bArr = new byte[d2];
        }
        System.arraycopy(this.f12232c, ((i + this.g) * this.f12233d) + this.f12235f, bArr, 0, d2);
        return bArr;
    }
}
