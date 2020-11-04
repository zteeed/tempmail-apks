package com.google.android.play.core.internal;

public final class a0<T> implements b0, y {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f11478c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile b0<T> f11479a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f11480b = f11478c;

    private a0(b0<T> b0Var) {
        this.f11479a = b0Var;
    }

    public static <P extends b0<T>, T> b0<T> a(P p) {
        n.b(p);
        return !(p instanceof a0) ? new a0(p) : p;
    }

    public static <P extends b0<T>, T> y<T> b(P p) {
        if (p instanceof y) {
            return (y) p;
        }
        n.b(p);
        return new a0(p);
    }

    public final T d() {
        T t = this.f11480b;
        if (t == f11478c) {
            synchronized (this) {
                t = this.f11480b;
                if (t == f11478c) {
                    t = this.f11479a.d();
                    T t2 = this.f11480b;
                    if (t2 != f11478c) {
                        if (t2 != t) {
                            String valueOf = String.valueOf(t2);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f11480b = t;
                    this.f11479a = null;
                }
            }
        }
        return t;
    }
}
