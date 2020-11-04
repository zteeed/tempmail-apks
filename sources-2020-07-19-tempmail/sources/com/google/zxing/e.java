package com.google.zxing;

/* compiled from: Dimension */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final int f11670a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11671b;

    public int a() {
        return this.f11671b;
    }

    public int b() {
        return this.f11670a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f11670a == eVar.f11670a && this.f11671b == eVar.f11671b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.f11670a * 32713) + this.f11671b;
    }

    public String toString() {
        return this.f11670a + "x" + this.f11671b;
    }
}
