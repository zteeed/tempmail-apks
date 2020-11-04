package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeee {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f8713a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    private int f8714b;

    /* renamed from: c  reason: collision with root package name */
    private int f8715c;

    public zzeee(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f8713a[i] = (byte) i;
        }
        byte b2 = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            byte[] bArr2 = this.f8713a;
            b2 = (b2 + bArr2[i2] + bArr[i2 % bArr.length]) & 255;
            byte b3 = bArr2[i2];
            bArr2[i2] = bArr2[b2];
            bArr2[b2] = b3;
        }
        this.f8714b = 0;
        this.f8715c = 0;
    }

    public final void a(byte[] bArr) {
        int i = this.f8714b;
        int i2 = this.f8715c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            byte[] bArr2 = this.f8713a;
            i2 = (i2 + bArr2[i]) & 255;
            byte b2 = bArr2[i];
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b2;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + bArr2[i2]) & 255] ^ bArr[i3]);
        }
        this.f8714b = i;
        this.f8715c = i2;
    }
}
