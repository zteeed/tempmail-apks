package com.google.zxing.y.e;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: ByteMatrix */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final byte[][] f12117a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12118b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12119c;

    public b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f12117a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.f12118b = i;
        this.f12119c = i2;
    }

    public void a(byte b2) {
        for (byte[] fill : this.f12117a) {
            Arrays.fill(fill, b2);
        }
    }

    public byte b(int i, int i2) {
        return this.f12117a[i2][i];
    }

    public byte[][] c() {
        return this.f12117a;
    }

    public int d() {
        return this.f12119c;
    }

    public int e() {
        return this.f12118b;
    }

    public void f(int i, int i2, int i3) {
        this.f12117a[i2][i] = (byte) i3;
    }

    public void g(int i, int i2, boolean z) {
        this.f12117a[i2][i] = z ? (byte) 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f12118b * 2 * this.f12119c) + 2);
        for (int i = 0; i < this.f12119c; i++) {
            byte[] bArr = this.f12117a[i];
            for (int i2 = 0; i2 < this.f12118b; i2++) {
                byte b2 = bArr[i2];
                if (b2 == 0) {
                    sb.append(" 0");
                } else if (b2 != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
