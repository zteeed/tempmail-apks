package com.google.android.play.core.internal;

public final class z<T> implements b0<T> {

    /* renamed from: a  reason: collision with root package name */
    private b0<T> f11507a;

    public static <T> void a(b0<T> b0Var, b0<T> b0Var2) {
        n.b(b0Var2);
        z zVar = (z) b0Var;
        if (zVar.f11507a == null) {
            zVar.f11507a = b0Var2;
            return;
        }
        throw new IllegalStateException();
    }

    public final T d() {
        b0<T> b0Var = this.f11507a;
        if (b0Var != null) {
            return b0Var.d();
        }
        throw new IllegalStateException();
    }
}
