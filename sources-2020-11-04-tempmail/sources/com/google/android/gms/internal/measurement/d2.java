package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class d2 {

    /* renamed from: a  reason: collision with root package name */
    private static final b2<?> f9566a = new a2();

    /* renamed from: b  reason: collision with root package name */
    private static final b2<?> f9567b = c();

    static b2<?> a() {
        return f9566a;
    }

    static b2<?> b() {
        b2<?> b2Var = f9567b;
        if (b2Var != null) {
            return b2Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static b2<?> c() {
        try {
            return (b2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
