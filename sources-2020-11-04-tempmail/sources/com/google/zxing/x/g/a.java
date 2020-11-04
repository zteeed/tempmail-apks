package com.google.zxing.x.g;

import java.lang.reflect.Array;

/* compiled from: BarcodeMatrix */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b[] f12575a;

    /* renamed from: b  reason: collision with root package name */
    private int f12576b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12577c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12578d;

    a(int i, int i2) {
        b[] bVarArr = new b[i];
        this.f12575a = bVarArr;
        int length = bVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f12575a[i3] = new b(((i2 + 4) * 17) + 1);
        }
        this.f12578d = i2 * 17;
        this.f12577c = i;
        this.f12576b = -1;
    }

    /* access modifiers changed from: package-private */
    public b a() {
        return this.f12575a[this.f12576b];
    }

    public byte[][] b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = this.f12578d * i;
        iArr[0] = this.f12577c * i2;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        int i3 = this.f12577c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f12575a[i4 / i2].b(i);
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f12576b++;
    }
}
