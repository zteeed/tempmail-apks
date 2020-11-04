package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzelk<T> implements zzelj<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f8661c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile zzelj<T> f8662a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f8663b = f8661c;

    private zzelk(zzelj<T> zzelj) {
        this.f8662a = zzelj;
    }

    public static <P extends zzelj<T>, T> zzelj<T> a(P p) {
        if ((p instanceof zzelk) || (p instanceof zzekx)) {
            return p;
        }
        zzelg.a(p);
        return new zzelk((zzelj) p);
    }

    public final T get() {
        T t = this.f8663b;
        if (t != f8661c) {
            return t;
        }
        zzelj<T> zzelj = this.f8662a;
        if (zzelj == null) {
            return this.f8663b;
        }
        T t2 = zzelj.get();
        this.f8663b = t2;
        this.f8662a = null;
        return t2;
    }
}
