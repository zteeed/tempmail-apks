package com.google.zxing.x.g;

import java.lang.reflect.Array;

/* compiled from: BarcodeMatrix */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b[] f12026a;

    /* renamed from: b  reason: collision with root package name */
    private int f12027b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12028c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12029d;

    a(int i, int i2) {
        b[] bVarArr = new b[i];
        this.f12026a = bVarArr;
        int length = bVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f12026a[i3] = new b(((i2 + 4) * 17) + 1);
        }
        this.f12029d = i2 * 17;
        this.f12028c = i;
        this.f12027b = -1;
    }

    /* access modifiers changed from: package-private */
    public b a() {
        return this.f12026a[this.f12027b];
    }

    public byte[][] b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = this.f12029d * i;
        iArr[0] = this.f12028c * i2;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        int i3 = this.f12028c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f12026a[i4 / i2].b(i);
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f12027b++;
    }
}
