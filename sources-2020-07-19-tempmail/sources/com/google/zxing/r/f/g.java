package com.google.zxing.r.f;

import com.google.zxing.t.a;

/* compiled from: Token */
abstract class g {

    /* renamed from: b  reason: collision with root package name */
    static final g f11738b = new e((g) null, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final g f11739a;

    g(g gVar) {
        this.f11739a = gVar;
    }

    /* access modifiers changed from: package-private */
    public final g a(int i, int i2) {
        return new e(this, i, i2);
    }

    /* access modifiers changed from: package-private */
    public final g b(int i, int i2) {
        return new b(this, i, i2);
    }

    /* access modifiers changed from: package-private */
    public abstract void c(a aVar, byte[] bArr);

    /* access modifiers changed from: package-private */
    public final g d() {
        return this.f11739a;
    }
}
