package com.google.zxing.x.e;

/* compiled from: Codeword */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f12537a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12538b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12539c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12540d;

    /* renamed from: e  reason: collision with root package name */
    private int f12541e = -1;

    d(int i, int i2, int i3, int i4) {
        this.f12537a = i;
        this.f12538b = i2;
        this.f12539c = i3;
        this.f12540d = i4;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f12539c;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f12538b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f12541e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f12537a;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f12540d;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f12538b - this.f12537a;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return h(this.f12541e);
    }

    /* access modifiers changed from: package-private */
    public boolean h(int i) {
        return i != -1 && this.f12539c == (i % 3) * 3;
    }

    /* access modifiers changed from: package-private */
    public void i(int i) {
        this.f12541e = i;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f12541e = ((this.f12540d / 30) * 3) + (this.f12539c / 3);
    }

    public String toString() {
        return this.f12541e + "|" + this.f12540d;
    }
}
