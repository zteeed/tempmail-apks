package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class l50 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f4263a = c("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f4264b = (c("org.robolectric.Robolectric") != null);

    static boolean a() {
        return f4263a != null && !f4264b;
    }

    static Class<?> b() {
        return f4263a;
    }

    private static <T> Class<T> c(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
