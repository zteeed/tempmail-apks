package com.google.zxing.w.c0.g.e;

import com.google.zxing.FormatException;

/* compiled from: DecodedNumeric */
final class p extends q {

    /* renamed from: b  reason: collision with root package name */
    private final int f12468b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12469c;

    p(int i, int i2, int i3) throws FormatException {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.a();
        }
        this.f12468b = i2;
        this.f12469c = i3;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f12468b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f12469c;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f12468b == 10;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f12469c == 10;
    }
}
