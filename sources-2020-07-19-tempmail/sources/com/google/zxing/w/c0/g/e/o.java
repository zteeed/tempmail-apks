package com.google.zxing.w.c0.g.e;

/* compiled from: DecodedInformation */
final class o extends q {

    /* renamed from: b  reason: collision with root package name */
    private final String f11916b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11917c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11918d;

    o(int i, String str) {
        super(i);
        this.f11916b = str;
        this.f11918d = false;
        this.f11917c = 0;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f11916b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f11917c;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f11918d;
    }

    o(int i, String str, int i2) {
        super(i);
        this.f11918d = true;
        this.f11917c = i2;
        this.f11916b = str;
    }
}
