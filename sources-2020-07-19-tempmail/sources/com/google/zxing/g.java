package com.google.zxing;

/* compiled from: InvertedLuminanceSource */
public final class g extends h {

    /* renamed from: c  reason: collision with root package name */
    private final h f11677c;

    public g(h hVar) {
        super(hVar.d(), hVar.a());
        this.f11677c = hVar;
    }

    public byte[] b() {
        byte[] b2 = this.f11677c.b();
        int d2 = d() * a();
        byte[] bArr = new byte[d2];
        for (int i = 0; i < d2; i++) {
            bArr[i] = (byte) (255 - (b2[i] & 255));
        }
        return bArr;
    }

    public byte[] c(int i, byte[] bArr) {
        byte[] c2 = this.f11677c.c(i, bArr);
        int d2 = d();
        for (int i2 = 0; i2 < d2; i2++) {
            c2[i2] = (byte) (255 - (c2[i2] & 255));
        }
        return c2;
    }

    public h e() {
        return this.f11677c;
    }

    public boolean f() {
        return this.f11677c.f();
    }

    public h g() {
        return new g(this.f11677c.g());
    }
}
