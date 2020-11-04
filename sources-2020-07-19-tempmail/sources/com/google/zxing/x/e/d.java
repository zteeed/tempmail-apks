package com.google.zxing.x.e;

/* compiled from: Codeword */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f11988a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11989b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11990c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11991d;

    /* renamed from: e  reason: collision with root package name */
    private int f11992e = -1;

    d(int i, int i2, int i3, int i4) {
        this.f11988a = i;
        this.f11989b = i2;
        this.f11990c = i3;
        this.f11991d = i4;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f11990c;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f11989b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f11992e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f11988a;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f11991d;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f11989b - this.f11988a;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return h(this.f11992e);
    }

    /* access modifiers changed from: package-private */
    public boolean h(int i) {
        return i != -1 && this.f11990c == (i % 3) * 3;
    }

    /* access modifiers changed from: package-private */
    public void i(int i) {
        this.f11992e = i;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f11992e = ((this.f11991d / 30) * 3) + (this.f11990c / 3);
    }

    public String toString() {
        return this.f11992e + "|" + this.f11991d;
    }
}
