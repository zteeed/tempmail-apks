package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpi {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f9163a;

    /* renamed from: b  reason: collision with root package name */
    private int f9164b;

    /* renamed from: c  reason: collision with root package name */
    private int f9165c;

    public zzpi() {
    }

    public final int a() {
        byte[] bArr = this.f9163a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int b() {
        return this.f9164b;
    }

    public final int c() {
        return this.f9165c;
    }

    public final int d() {
        byte[] bArr = this.f9163a;
        int i = this.f9164b;
        int i2 = i + 1;
        this.f9164b = i2;
        int i3 = i2 + 1;
        this.f9164b = i3;
        byte b2 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        this.f9164b = i4;
        byte b3 = b2 | ((bArr[i3] & 255) << 8);
        this.f9164b = i4 + 1;
        return (bArr[i4] & 255) | b3;
    }

    public final long e() {
        byte[] bArr = this.f9163a;
        int i = this.f9164b;
        int i2 = i + 1;
        this.f9164b = i2;
        int i3 = i2 + 1;
        this.f9164b = i3;
        int i4 = i3 + 1;
        this.f9164b = i4;
        int i5 = i4 + 1;
        this.f9164b = i5;
        int i6 = i5 + 1;
        this.f9164b = i6;
        int i7 = i6 + 1;
        this.f9164b = i7;
        int i8 = i7 + 1;
        this.f9164b = i8;
        this.f9164b = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    public final short f() {
        byte[] bArr = this.f9163a;
        int i = this.f9164b;
        int i2 = i + 1;
        this.f9164b = i2;
        this.f9164b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public final int g() {
        byte[] bArr = this.f9163a;
        int i = this.f9164b;
        this.f9164b = i + 1;
        return bArr[i] & 255;
    }

    public final int h() {
        byte[] bArr = this.f9163a;
        int i = this.f9164b;
        int i2 = i + 1;
        this.f9164b = i2;
        this.f9164b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public final void i() {
        this.f9164b = 0;
        this.f9165c = 0;
    }

    public final void j(int i) {
        o(a() < i ? new byte[i] : this.f9163a, i);
    }

    public final void k(int i) {
        zzpb.a(i >= 0 && i <= this.f9163a.length);
        this.f9165c = i;
    }

    public final void l(int i) {
        zzpb.a(i >= 0 && i <= this.f9165c);
        this.f9164b = i;
    }

    public final void m(int i) {
        l(this.f9164b + i);
    }

    public final String n(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.f9164b + i) - 1;
        String str = new String(this.f9163a, this.f9164b, (i2 >= this.f9165c || this.f9163a[i2] != 0) ? i : i - 1);
        this.f9164b += i;
        return str;
    }

    public final void o(byte[] bArr, int i) {
        this.f9163a = bArr;
        this.f9165c = i;
        this.f9164b = 0;
    }

    public final void p(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f9163a, this.f9164b, bArr, i, i2);
        this.f9164b += i2;
    }

    public final int q() {
        return this.f9165c - this.f9164b;
    }

    public final int r() {
        byte[] bArr = this.f9163a;
        int i = this.f9164b;
        int i2 = i + 1;
        this.f9164b = i2;
        this.f9164b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public final long s() {
        byte[] bArr = this.f9163a;
        int i = this.f9164b;
        int i2 = i + 1;
        this.f9164b = i2;
        int i3 = i2 + 1;
        this.f9164b = i3;
        int i4 = i3 + 1;
        this.f9164b = i4;
        this.f9164b = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    public final long t() {
        byte[] bArr = this.f9163a;
        int i = this.f9164b;
        int i2 = i + 1;
        this.f9164b = i2;
        int i3 = i2 + 1;
        this.f9164b = i3;
        int i4 = i3 + 1;
        this.f9164b = i4;
        this.f9164b = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    public final int u() {
        byte[] bArr = this.f9163a;
        int i = this.f9164b;
        int i2 = i + 1;
        this.f9164b = i2;
        int i3 = i2 + 1;
        this.f9164b = i3;
        byte b2 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f9164b = i3 + 2;
        return b2;
    }

    public final int v() {
        int d2 = d();
        if (d2 >= 0) {
            return d2;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(d2);
        throw new IllegalStateException(sb.toString());
    }

    public final long w() {
        long e2 = e();
        if (e2 >= 0) {
            return e2;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(e2);
        throw new IllegalStateException(sb.toString());
    }

    public final String x() {
        if (q() == 0) {
            return null;
        }
        int i = this.f9164b;
        while (i < this.f9165c && this.f9163a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f9163a;
        int i2 = this.f9164b;
        String str = new String(bArr, i2, i - i2);
        this.f9164b = i;
        if (i < this.f9165c) {
            this.f9164b = i + 1;
        }
        return str;
    }

    public zzpi(int i) {
        this.f9163a = new byte[i];
        this.f9165c = i;
    }

    public zzpi(byte[] bArr) {
        this.f9163a = bArr;
        this.f9165c = bArr.length;
    }
}
