package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpl {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f9170a;

    /* renamed from: b  reason: collision with root package name */
    private int f9171b;

    /* renamed from: c  reason: collision with root package name */
    private int f9172c;

    /* renamed from: d  reason: collision with root package name */
    private int f9173d = 0;

    public zzpl(byte[] bArr, int i, int i2) {
        this.f9170a = bArr;
        this.f9172c = i;
        this.f9171b = i2;
        h();
    }

    private final boolean c(int i) {
        if (2 > i || i >= this.f9171b) {
            return false;
        }
        byte[] bArr = this.f9170a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
    }

    private final int g() {
        int i = 0;
        int i2 = 0;
        while (!d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = a(i2);
        }
        return i3 + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r3.f9173d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r2 = r3.f9171b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h() {
        /*
            r3 = this;
            int r0 = r3.f9172c
            if (r0 < 0) goto L_0x0016
            int r1 = r3.f9173d
            if (r1 < 0) goto L_0x0016
            r2 = 8
            if (r1 >= r2) goto L_0x0016
            int r2 = r3.f9171b
            if (r0 < r2) goto L_0x0014
            if (r0 != r2) goto L_0x0016
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            com.google.android.gms.internal.ads.zzpb.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpl.h():void");
    }

    public final int a(int i) {
        byte b2;
        byte b3;
        if (i == 0) {
            return 0;
        }
        int i2 = i / 8;
        byte b4 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = c(this.f9172c + 1) ? this.f9172c + 2 : this.f9172c + 1;
            int i5 = this.f9173d;
            if (i5 != 0) {
                byte[] bArr = this.f9170a;
                b3 = ((bArr[i4] & 255) >>> (8 - i5)) | ((bArr[this.f9172c] & 255) << i5);
            } else {
                b3 = this.f9170a[this.f9172c];
            }
            i -= 8;
            b4 |= (255 & b3) << i;
            this.f9172c = i4;
        }
        if (i > 0) {
            int i6 = this.f9173d + i;
            byte b5 = (byte) (255 >> (8 - i));
            int i7 = c(this.f9172c + 1) ? this.f9172c + 2 : this.f9172c + 1;
            if (i6 > 8) {
                byte[] bArr2 = this.f9170a;
                b2 = (b5 & (((255 & bArr2[i7]) >> (16 - i6)) | ((bArr2[this.f9172c] & 255) << (i6 - 8)))) | b4;
                this.f9172c = i7;
            } else {
                b2 = (b5 & ((255 & this.f9170a[this.f9172c]) >> (8 - i6))) | b4;
                if (i6 == 8) {
                    this.f9172c = i7;
                }
            }
            b4 = b2;
            this.f9173d = i6 % 8;
        }
        h();
        return b4;
    }

    public final void b(int i) {
        int i2 = this.f9172c;
        int i3 = (i / 8) + i2;
        this.f9172c = i3;
        int i4 = this.f9173d + (i % 8);
        this.f9173d = i4;
        if (i4 > 7) {
            this.f9172c = i3 + 1;
            this.f9173d = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f9172c) {
                h();
                return;
            } else if (c(i2)) {
                this.f9172c++;
                i2 += 2;
            }
        }
    }

    public final boolean d() {
        return a(1) == 1;
    }

    public final int e() {
        return g();
    }

    public final int f() {
        int g = g();
        return (g % 2 == 0 ? -1 : 1) * ((g + 1) / 2);
    }
}
