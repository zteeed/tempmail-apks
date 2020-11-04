package com.google.zxing;

/* compiled from: LuminanceSource */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f12227a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12228b;

    protected h(int i, int i2) {
        this.f12227a = i;
        this.f12228b = i2;
    }

    public final int a() {
        return this.f12228b;
    }

    public abstract byte[] b();

    public abstract byte[] c(int i, byte[] bArr);

    public final int d() {
        return this.f12227a;
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
        int i = this.f12227a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.f12228b * (i + 1));
        for (int i2 = 0; i2 < this.f12228b; i2++) {
            bArr = c(i2, bArr);
            for (int i3 = 0; i3 < this.f12227a; i3++) {
                byte b2 = bArr[i3] & 255;
                sb.append(b2 < 64 ? '#' : b2 < 128 ? '+' : b2 < 192 ? '.' : ' ');
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
