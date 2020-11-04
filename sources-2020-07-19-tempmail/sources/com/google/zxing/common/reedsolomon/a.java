package com.google.zxing.common.reedsolomon;

import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;

/* compiled from: GenericGF */
public final class a {
    public static final a h = new a(4201, CodedOutputStream.DEFAULT_BUFFER_SIZE, 1);
    public static final a i = new a(1033, 1024, 1);
    public static final a j = new a(67, 64, 1);
    public static final a k = new a(19, 16, 1);
    public static final a l = new a(285, 256, 0);
    public static final a m;
    public static final a n;
    public static final a o = j;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f11654a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f11655b;

    /* renamed from: c  reason: collision with root package name */
    private final b f11656c;

    /* renamed from: d  reason: collision with root package name */
    private final b f11657d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11658e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11659f;
    private final int g;

    static {
        a aVar = new a(301, 256, 1);
        m = aVar;
        n = aVar;
    }

    public a(int i2, int i3, int i4) {
        this.f11659f = i2;
        this.f11658e = i3;
        this.g = i4;
        this.f11654a = new int[i3];
        this.f11655b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.f11654a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.f11655b[this.f11654a[i7]] = i7;
        }
        this.f11656c = new b(this, new int[]{0});
        this.f11657d = new b(this, new int[]{1});
    }

    static int a(int i2, int i3) {
        return i2 ^ i3;
    }

    /* access modifiers changed from: package-private */
    public b b(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        } else if (i3 == 0) {
            return this.f11656c;
        } else {
            int[] iArr = new int[(i2 + 1)];
            iArr[0] = i3;
            return new b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i2) {
        return this.f11654a[i2];
    }

    public int d() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public b e() {
        return this.f11657d;
    }

    public int f() {
        return this.f11658e;
    }

    /* access modifiers changed from: package-private */
    public b g() {
        return this.f11656c;
    }

    /* access modifiers changed from: package-private */
    public int h(int i2) {
        if (i2 != 0) {
            return this.f11654a[(this.f11658e - this.f11655b[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    public int i(int i2) {
        if (i2 != 0) {
            return this.f11655b[i2];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public int j(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.f11654a;
        int[] iArr2 = this.f11655b;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.f11658e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f11659f) + ',' + this.f11658e + ')';
    }
}
