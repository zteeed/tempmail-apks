package com.google.zxing.w.c0.g.e;

/* compiled from: CurrentParsingState */
final class m {

    /* renamed from: a  reason: collision with root package name */
    private int f11909a = 0;

    /* renamed from: b  reason: collision with root package name */
    private a f11910b = a.NUMERIC;

    /* compiled from: CurrentParsingState */
    private enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    m() {
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f11909a;
    }

    /* access modifiers changed from: package-private */
    public void b(int i) {
        this.f11909a += i;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f11910b == a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f11910b == a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f11910b = a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f11910b = a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f11910b = a.NUMERIC;
    }

    /* access modifiers changed from: package-private */
    public void h(int i) {
        this.f11909a = i;
    }
}
