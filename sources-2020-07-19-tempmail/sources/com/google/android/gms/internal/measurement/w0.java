package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class w0<T> extends zzdi<T> {

    /* renamed from: b  reason: collision with root package name */
    private final T f9514b;

    w0(T t) {
        this.f9514b = t;
    }

    public final boolean b() {
        return true;
    }

    public final T c() {
        return this.f9514b;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof w0) {
            return this.f9514b.equals(((w0) obj).f9514b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9514b.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9514b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
