package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzekx<T> implements zzeku<T>, zzelj<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f8834c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile zzelj<T> f8835a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f8836b = f8834c;

    private zzekx(zzelj<T> zzelj) {
        this.f8835a = zzelj;
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
        T t = this.f8836b;
        if (t == f8834c) {
            synchronized (this) {
                t = this.f8836b;
                if (t == f8834c) {
                    t = this.f8835a.get();
                    T t2 = this.f8836b;
                    if (t2 != f8834c && !(t2 instanceof zzeld)) {
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
                    this.f8836b = t;
                    this.f8835a = null;
                }
            }
        }
        return t;
    }
}
