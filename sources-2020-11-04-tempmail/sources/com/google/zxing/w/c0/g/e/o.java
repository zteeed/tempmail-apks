package com.google.zxing.w.c0.g.e;

/* compiled from: DecodedInformation */
final class o extends q {

    /* renamed from: b  reason: collision with root package name */
    private final String f12465b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12466c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12467d;

    o(int i, String str) {
        super(i);
        this.f12465b = str;
        this.f12467d = false;
        this.f12466c = 0;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f12465b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f12466c;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f12467d;
    }

    o(int i, String str, int i2) {
        super(i);
        this.f12467d = true;
        this.f12466c = i2;
        this.f12465b = str;
    }
}
