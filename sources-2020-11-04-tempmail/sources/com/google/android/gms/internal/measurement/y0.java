package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class y0<T> implements zzdj<T>, Serializable {
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    private final T f9708b;

    y0(@NullableDecl T t) {
        this.f9708b = t;
    }

    public final T a() {
        return this.f9708b;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        T t = this.f9708b;
        T t2 = ((y0) obj).f9708b;
        if (t == t2) {
            return true;
        }
        if (t == null || !t.equals(t2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9708b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9708b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
