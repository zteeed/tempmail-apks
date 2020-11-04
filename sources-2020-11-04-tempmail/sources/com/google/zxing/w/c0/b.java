package com.google.zxing.w.c0;

/* compiled from: DataCharacter */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f12439a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12440b;

    public b(int i, int i2) {
        this.f12439a = i;
        this.f12440b = i2;
    }

    public final int a() {
        return this.f12440b;
    }

    public final int b() {
        return this.f12439a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f12439a == bVar.f12439a && this.f12440b == bVar.f12440b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12439a ^ this.f12440b;
    }

    public final String toString() {
        return this.f12439a + "(" + this.f12440b + ')';
    }
}
