package com.google.android.gms.common.images;

import com.tempmail.utils.x;

public final class Size {

    /* renamed from: a  reason: collision with root package name */
    private final int f3137a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3138b;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return this.f3137a == size.f3137a && this.f3138b == size.f3138b;
        }
    }

    public final int hashCode() {
        int i = this.f3138b;
        int i2 = this.f3137a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        int i = this.f3137a;
        int i2 = this.f3138b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append(x.f13134a);
        sb.append(i2);
        return sb.toString();
    }
}
