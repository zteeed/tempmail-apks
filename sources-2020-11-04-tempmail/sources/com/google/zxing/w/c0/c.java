package com.google.zxing.w.c0;

import com.google.zxing.o;

/* compiled from: FinderPattern */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f12441a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f12442b;

    /* renamed from: c  reason: collision with root package name */
    private final o[] f12443c;

    public c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f12441a = i;
        this.f12442b = iArr;
        float f2 = (float) i4;
        this.f12443c = new o[]{new o((float) i2, f2), new o((float) i3, f2)};
    }

    public o[] a() {
        return this.f12443c;
    }

    public int[] b() {
        return this.f12442b;
    }

    public int c() {
        return this.f12441a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof c) && this.f12441a == ((c) obj).f12441a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f12441a;
    }
}
