package com.google.zxing.x.e.k;

/* compiled from: ModulusGF */
public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static final b f12012f = new b(929, 3);

    /* renamed from: a  reason: collision with root package name */
    private final int[] f12013a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f12014b;

    /* renamed from: c  reason: collision with root package name */
    private final c f12015c;

    /* renamed from: d  reason: collision with root package name */
    private final c f12016d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12017e;

    private b(int i, int i2) {
        this.f12017e = i;
        this.f12013a = new int[i];
        this.f12014b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f12013a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f12014b[this.f12013a[i5]] = i5;
        }
        this.f12015c = new c(this, new int[]{0});
        this.f12016d = new c(this, new int[]{1});
    }

    /* access modifiers changed from: package-private */
    public int a(int i, int i2) {
        return (i + i2) % this.f12017e;
    }

    /* access modifiers changed from: package-private */
    public c b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f12015c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new c(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i) {
        return this.f12013a[i];
    }

    /* access modifiers changed from: package-private */
    public c d() {
        return this.f12016d;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f12017e;
    }

    /* access modifiers changed from: package-private */
    public c f() {
        return this.f12015c;
    }

    /* access modifiers changed from: package-private */
    public int g(int i) {
        if (i != 0) {
            return this.f12013a[(this.f12017e - this.f12014b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    public int h(int i) {
        if (i != 0) {
            return this.f12014b[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public int i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f12013a;
        int[] iArr2 = this.f12014b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f12017e - 1)];
    }

    /* access modifiers changed from: package-private */
    public int j(int i, int i2) {
        int i3 = this.f12017e;
        return ((i + i3) - i2) % i3;
    }
}
