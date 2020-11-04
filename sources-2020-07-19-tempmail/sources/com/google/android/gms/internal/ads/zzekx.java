package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzekx<T> implements zzeku<T>, zzelj<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f8651c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile zzelj<T> f8652a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f8653b = f8651c;

    private zzekx(zzelj<T> zzelj) {
        this.f8652a = zzelj;
    }

    public static <P extends zzelj<T>, T> zzelj<T> a(P p) {
        zzelg.a(p);
        if (p instanceof zzekx) {
            return p;
        }
        return new zzekx(p);
    }

    public static <P extends zzelj<T>, T> zzeku<T> b(P p) {
        if (p instanceof zzeku) {
            return (zzeku) p;
        }
        zzelg.a(p);
        return new zzekx((zzelj) p);
    }

    public final T get() {
        T t = this.f8653b;
        if (t == f8651c) {
            synchronized (this) {
                t = this.f8653b;
                if (t == f8651c) {
                    t = this.f8652a.get();
                    T t2 = this.f8653b;
                    if (t2 != f8651c && !(t2 instanceof zzeld)) {
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
                    this.f8653b = t;
                    this.f8652a = null;
                }
            }
        }
        return t;
    }
}
