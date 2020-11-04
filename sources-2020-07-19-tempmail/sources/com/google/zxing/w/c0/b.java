package com.google.zxing.w.c0;

/* compiled from: DataCharacter */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f11890a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11891b;

    public b(int i, int i2) {
        this.f11890a = i;
        this.f11891b = i2;
    }

    public final int a() {
        return this.f11891b;
    }

    public final int b() {
        return this.f11890a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f11890a == bVar.f11890a && this.f11891b == bVar.f11891b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11890a ^ this.f11891b;
    }

    public final String toString() {
        return this.f11890a + "(" + this.f11891b + ')';
    }
}
