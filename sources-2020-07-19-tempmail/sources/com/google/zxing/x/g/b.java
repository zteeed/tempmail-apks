package com.google.zxing.x.g;

/* compiled from: BarcodeRow */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f12030a;

    /* renamed from: b  reason: collision with root package name */
    private int f12031b = 0;

    b(int i) {
        this.f12030a = new byte[i];
    }

    private void c(int i, boolean z) {
        this.f12030a[i] = z ? (byte) 1 : 0;
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f12031b;
            this.f12031b = i3 + 1;
            c(i3, z);
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] b(int i) {
        int length = this.f12030a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f12030a[i2 / i];
        }
        return bArr;
    }
}
