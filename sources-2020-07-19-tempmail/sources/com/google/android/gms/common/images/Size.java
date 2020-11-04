package com.google.android.gms.common.images;

public final class Size {

    /* renamed from: a  reason: collision with root package name */
    private final int f2949a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2950b;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return this.f2949a == size.f2949a && this.f2950b == size.f2950b;
        }
    }

    public final int hashCode() {
        int i = this.f2950b;
        int i2 = this.f2949a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        int i = this.f2949a;
        int i2 = this.f2950b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
