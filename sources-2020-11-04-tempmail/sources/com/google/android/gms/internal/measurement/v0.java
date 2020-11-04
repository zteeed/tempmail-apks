package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class v0<T> extends zzdi<T> {

    /* renamed from: b  reason: collision with root package name */
    static final v0<Object> f9690b = new v0<>();

    private v0() {
    }

    public final boolean b() {
        return false;
    }

    public final T c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
