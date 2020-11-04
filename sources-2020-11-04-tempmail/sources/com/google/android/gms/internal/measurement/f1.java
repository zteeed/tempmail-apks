package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class f1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f9578a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f9579b = (a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean b() {
        return f9578a != null && !f9579b;
    }

    static Class<?> c() {
        return f9578a;
    }
}
