package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class i60 {

    /* renamed from: a  reason: collision with root package name */
    private static final h60<?> f4204a = new j60();

    /* renamed from: b  reason: collision with root package name */
    private static final h60<?> f4205b = a();

    private static h60<?> a() {
        try {
            return (h60) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static h60<?> b() {
        return f4204a;
    }

    static h60<?> c() {
        h60<?> h60 = f4205b;
        if (h60 != null) {
            return h60;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
