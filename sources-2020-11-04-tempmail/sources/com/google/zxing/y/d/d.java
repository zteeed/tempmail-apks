package com.google.zxing.y.d;

import com.google.zxing.o;

/* compiled from: FinderPattern */
public final class d extends o {

    /* renamed from: c  reason: collision with root package name */
    private final float f12652c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12653d;

    d(float f2, float f3, float f4) {
        this(f2, f3, f4, 1);
    }

    /* access modifiers changed from: package-private */
    public boolean f(float f2, float f3, float f4) {
        if (Math.abs(f3 - d()) > f2 || Math.abs(f4 - c()) > f2) {
            return false;
        }
        float abs = Math.abs(f2 - this.f12652c);
        if (abs <= 1.0f || abs <= this.f12652c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public d g(float f2, float f3, float f4) {
        int i = this.f12653d;
        int i2 = i + 1;
        float c2 = (((float) i) * c()) + f3;
        float f5 = (float) i2;
        return new d(c2 / f5, ((((float) this.f12653d) * d()) + f2) / f5, ((((float) this.f12653d) * this.f12652c) + f4) / f5, i2);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f12653d;
    }

    public float i() {
        return this.f12652c;
    }

    private d(float f2, float f3, float f4, int i) {
        super(f2, f3);
        this.f12652c = f4;
        this.f12653d = i;
    }
}
