package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzekz<T> implements zzeku<T>, zzela<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final zzekz<Object> f8838b = new zzekz<>((Object) null);

    /* renamed from: a  reason: collision with root package name */
    private final T f8839a;

    private zzekz(T t) {
        this.f8839a = t;
    }

    public static <T> zzela<T> a(T t) {
        zzelg.b(t, "instance cannot be null");
        return new zzekz(t);
    }

    public static <T> zzela<T> b(T t) {
        if (t == null) {
            return f8838b;
        }
        return new zzekz(t);
    }

    public final T get() {
        return this.f8839a;
    }
}
