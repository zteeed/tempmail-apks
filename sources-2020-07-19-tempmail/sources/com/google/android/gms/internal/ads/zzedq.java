package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzedq {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f8523a;

    private zzedq(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f8523a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static zzedq b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new zzedq(bArr, 0, bArr.length);
    }

    public final byte[] a() {
        byte[] bArr = this.f8523a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
