package com.google.zxing.y.d;

import com.google.zxing.o;

/* compiled from: AlignmentPattern */
public final class a extends o {

    /* renamed from: c  reason: collision with root package name */
    private final float f12643c;

    a(float f2, float f3, float f4) {
        super(f2, f3);
        this.f12643c = f4;
    }

    /* access modifiers changed from: package-private */
    public boolean f(float f2, float f3, float f4) {
        if (Math.abs(f3 - d()) > f2 || Math.abs(f4 - c()) > f2) {
            return false;
        }
        float abs = Math.abs(f2 - this.f12643c);
        if (abs <= 1.0f || abs <= this.f12643c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public a g(float f2, float f3, float f4) {
        return new a((c() + f3) / 2.0f, (d() + f2) / 2.0f, (this.f12643c + f4) / 2.0f);
    }
}
