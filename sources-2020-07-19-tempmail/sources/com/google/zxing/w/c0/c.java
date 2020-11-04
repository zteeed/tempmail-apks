package com.google.zxing.w.c0;

import com.google.zxing.o;

/* compiled from: FinderPattern */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f11892a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f11893b;

    /* renamed from: c  reason: collision with root package name */
    private final o[] f11894c;

    public c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f11892a = i;
        this.f11893b = iArr;
        float f2 = (float) i4;
        this.f11894c = new o[]{new o((float) i2, f2), new o((float) i3, f2)};
    }

    public o[] a() {
        return this.f11894c;
    }

    public int[] b() {
        return this.f11893b;
    }

    public int c() {
        return this.f11892a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof c) && this.f11892a == ((c) obj).f11892a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f11892a;
    }
}
