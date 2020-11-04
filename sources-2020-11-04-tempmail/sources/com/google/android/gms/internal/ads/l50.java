package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class l50 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f4446a = c("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f4447b = (c("org.robolectric.Robolectric") != null);

    static boolean a() {
        return f4446a != null && !f4447b;
    }

    static Class<?> b() {
        return f4446a;
    }

    private static <T> Class<T> c(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
