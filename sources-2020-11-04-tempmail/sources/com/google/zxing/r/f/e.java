package com.google.zxing.r.f;

import com.google.zxing.t.a;

/* compiled from: SimpleToken */
final class e extends g {

    /* renamed from: c  reason: collision with root package name */
    private final short f12280c;

    /* renamed from: d  reason: collision with root package name */
    private final short f12281d;

    e(g gVar, int i, int i2) {
        super(gVar);
        this.f12280c = (short) i;
        this.f12281d = (short) i2;
    }

    /* access modifiers changed from: package-private */
    public void c(a aVar, byte[] bArr) {
        aVar.d(this.f12280c, this.f12281d);
    }

    public String toString() {
        short s = this.f12280c;
        short s2 = this.f12281d;
        short s3 = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(s3 | (1 << this.f12281d)).substring(1) + '>';
    }
}
