package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzelk<T> implements zzelj<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f8844c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile zzelj<T> f8845a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f8846b = f8844c;

    private zzelk(zzelj<T> zzelj) {
        this.f8845a = zzelj;
    }

    public static <P extends zzelj<T>, T> zzelj<T> a(P p) {
        if ((p instanceof zzelk) || (p instanceof zzekx)) {
            return p;
        }
        zzelg.a(p);
        return new zzelk((zzelj) p);
    }

    public final T get() {
        T t = this.f8846b;
        if (t != f8844c) {
            return t;
        }
        zzelj<T> zzelj = this.f8845a;
        if (zzelj == null) {
            return this.f8846b;
        }
        T t2 = zzelj.get();
        this.f8846b = t2;
        this.f8845a = null;
        return t2;
    }
}
