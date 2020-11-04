package com.google.android.material.bottomappbar;

import b.c.a.d.t.b;
import b.c.a.d.t.d;

/* compiled from: BottomAppBarTopEdgeTreatment */
public class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private float f10883a;

    /* renamed from: b  reason: collision with root package name */
    private float f10884b;

    /* renamed from: c  reason: collision with root package name */
    private float f10885c;

    /* renamed from: d  reason: collision with root package name */
    private float f10886d;

    /* renamed from: e  reason: collision with root package name */
    private float f10887e;

    public a(float f2, float f3, float f4) {
        this.f10884b = f2;
        this.f10883a = f3;
        this.f10886d = f4;
        if (f4 >= 0.0f) {
            this.f10887e = 0.0f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void a(float f2, float f3, d dVar) {
        float f4 = f2;
        d dVar2 = dVar;
        float f5 = this.f10885c;
        if (f5 == 0.0f) {
            dVar2.c(f4, 0.0f);
            return;
        }
        float f6 = ((this.f10884b * 2.0f) + f5) / 2.0f;
        float f7 = f3 * this.f10883a;
        float f8 = (f4 / 2.0f) + this.f10887e;
        float f9 = (this.f10886d * f3) + ((1.0f - f3) * f6);
        if (f9 / f6 >= 1.0f) {
            dVar2.c(f4, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) - (f11 * f11)));
        float f12 = f8 - sqrt;
        float f13 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f11)));
        float f14 = 90.0f - degrees;
        float f15 = f12 - f7;
        dVar2.c(f15, 0.0f);
        float f16 = f7 * 2.0f;
        float f17 = degrees;
        dVar.a(f15, 0.0f, f12 + f7, f16, 270.0f, degrees);
        dVar.a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        dVar.a(f13 - f7, 0.0f, f13 + f7, f16, 270.0f - f17, f17);
        dVar2.c(f4, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.f10886d;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f10884b;
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.f10883a;
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.f10885c;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.f10887e;
    }

    /* access modifiers changed from: package-private */
    public void g(float f2) {
        this.f10886d = f2;
    }

    /* access modifiers changed from: package-private */
    public void h(float f2) {
        this.f10884b = f2;
    }

    /* access modifiers changed from: package-private */
    public void i(float f2) {
        this.f10883a = f2;
    }

    /* access modifiers changed from: package-private */
    public void j(float f2) {
        this.f10885c = f2;
    }

    /* access modifiers changed from: package-private */
    public void k(float f2) {
        this.f10887e = f2;
    }
}
