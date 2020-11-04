package com.google.zxing;

/* compiled from: LuminanceSource */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f11678a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11679b;

    protected h(int i, int i2) {
        this.f11678a = i;
        this.f11679b = i2;
    }

    public final int a() {
        return this.f11679b;
    }

    public abstract byte[] b();

    public abstract byte[] c(int i, byte[] bArr);

    public final int d() {
        return this.f11678a;
    }

    public h e() {
        return new g(this);
    }

    public boolean f() {
        return false;
    }

    public h g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.f11678a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.f11679b * (i + 1));
        for (int i2 = 0; i2 < this.f11679b; i2++) {
            bArr = c(i2, bArr);
            for (int i3 = 0; i3 < this.f11678a; i3++) {
                byte b2 = bArr[i3] & 255;
                sb.append(b2 < 64 ? '#' : b2 < 128 ? '+' : b2 < 192 ? '.' : ' ');
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
