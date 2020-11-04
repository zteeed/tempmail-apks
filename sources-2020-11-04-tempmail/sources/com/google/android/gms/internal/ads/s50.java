package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class s50 extends x50 {

    /* renamed from: f  reason: collision with root package name */
    private final int f5048f;
    private final int g;

    s50(byte[] bArr, int i, int i2) {
        super(bArr);
        zzeer.O(i, i + i2, bArr.length);
        this.f5048f = i;
        this.g = i2;
    }

    public final byte C(int i) {
        zzeer.m(i, size());
        return this.f5466e[this.f5048f + i];
    }

    /* access modifiers changed from: package-private */
    public final byte F(int i) {
        return this.f5466e[this.f5048f + i];
    }

    /* access modifiers changed from: protected */
    public final int Y() {
        return this.f5048f;
    }

    /* access modifiers changed from: protected */
    public final void q(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f5466e, Y() + i, bArr, i2, i3);
    }

    public final int size() {
        return this.g;
    }
}
