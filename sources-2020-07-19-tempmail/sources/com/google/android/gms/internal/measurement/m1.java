package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class m1 extends s1 {

    /* renamed from: f  reason: collision with root package name */
    private final int f9456f;
    private final int g;

    m1(byte[] bArr, int i, int i2) {
        super(bArr);
        zzeg.w(i, i + i2, bArr.length);
        this.f9456f = i;
        this.g = i2;
    }

    /* access modifiers changed from: protected */
    public final int F() {
        return this.f9456f;
    }

    public final byte c(int i) {
        int h = h();
        if (((h - (i + 1)) | i) >= 0) {
            return this.f9491e[this.f9456f + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(h);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final int h() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public final byte v(int i) {
        return this.f9491e[this.f9456f + i];
    }
}
