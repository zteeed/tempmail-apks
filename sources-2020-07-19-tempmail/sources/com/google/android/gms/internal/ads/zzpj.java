package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpj {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f8983a;

    /* renamed from: b  reason: collision with root package name */
    private int f8984b;

    /* renamed from: c  reason: collision with root package name */
    private int f8985c;

    /* renamed from: d  reason: collision with root package name */
    private int f8986d;

    public zzpj() {
    }

    public final int a(int i) {
        int i2;
        int i3;
        byte b2;
        byte b3;
        boolean z = false;
        if (i == 0) {
            return 0;
        }
        int i4 = i / 8;
        byte b4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.f8985c;
            if (i6 != 0) {
                byte[] bArr = this.f8983a;
                int i7 = this.f8984b;
                b3 = ((bArr[i7 + 1] & 255) >>> (8 - i6)) | ((bArr[i7] & 255) << i6);
            } else {
                b3 = this.f8983a[this.f8984b];
            }
            i -= 8;
            b4 |= (255 & b3) << i;
            this.f8984b++;
        }
        if (i > 0) {
            int i8 = this.f8985c + i;
            byte b5 = (byte) (255 >> (8 - i));
            if (i8 > 8) {
                byte[] bArr2 = this.f8983a;
                int i9 = this.f8984b;
                b2 = (b5 & (((255 & bArr2[i9 + 1]) >> (16 - i8)) | ((bArr2[i9] & 255) << (i8 - 8)))) | b4;
                this.f8984b = i9 + 1;
            } else {
                byte[] bArr3 = this.f8983a;
                int i10 = this.f8984b;
                b2 = (b5 & ((255 & bArr3[i10]) >> (8 - i8))) | b4;
                if (i8 == 8) {
                    this.f8984b = i10 + 1;
                }
            }
            b4 = b2;
            this.f8985c = i8 % 8;
        }
        int i11 = this.f8984b;
        if (i11 >= 0 && (i2 = this.f8985c) >= 0 && i2 < 8 && (i11 < (i3 = this.f8986d) || (i11 == i3 && i2 == 0))) {
            z = true;
        }
        zzpb.e(z);
        return b4;
    }

    public zzpj(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private zzpj(byte[] bArr, int i) {
        this.f8983a = bArr;
        this.f8986d = i;
    }
}
