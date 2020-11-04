package com.google.firebase.components;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f11618a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11619b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11620c;

    private n(Class<?> cls, int i, int i2) {
        r.c(cls, "Null dependency anInterface.");
        this.f11618a = cls;
        this.f11619b = i;
        this.f11620c = i2;
    }

    public static n e(Class<?> cls) {
        return new n(cls, 0, 0);
    }

    public static n f(Class<?> cls) {
        return new n(cls, 1, 0);
    }

    public static n g(Class<?> cls) {
        return new n(cls, 1, 1);
    }

    public static n h(Class<?> cls) {
        return new n(cls, 2, 0);
    }

    public Class<?> a() {
        return this.f11618a;
    }

    public boolean b() {
        return this.f11620c == 0;
    }

    public boolean c() {
        return this.f11619b == 1;
    }

    public boolean d() {
        return this.f11619b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f11618a == nVar.f11618a && this.f11619b == nVar.f11619b && this.f11620c == nVar.f11620c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f11618a.hashCode() ^ 1000003) * 1000003) ^ this.f11619b) * 1000003) ^ this.f11620c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f11618a);
        sb.append(", type=");
        int i = this.f11619b;
        boolean z = true;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", direct=");
        if (this.f11620c != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
