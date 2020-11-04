package com.google.zxing.r.f;

import com.google.zxing.t.a;

/* compiled from: SimpleToken */
final class e extends g {

    /* renamed from: c  reason: collision with root package name */
    private final short f11731c;

    /* renamed from: d  reason: collision with root package name */
    private final short f11732d;

    e(g gVar, int i, int i2) {
        super(gVar);
        this.f11731c = (short) i;
        this.f11732d = (short) i2;
    }

    /* access modifiers changed from: package-private */
    public void c(a aVar, byte[] bArr) {
        aVar.d(this.f11731c, this.f11732d);
    }

    public String toString() {
        short s = this.f11731c;
        short s2 = this.f11732d;
        short s3 = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(s3 | (1 << this.f11732d)).substring(1) + '>';
    }
}
