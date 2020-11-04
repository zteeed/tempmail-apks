package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class h3 {

    /* renamed from: a  reason: collision with root package name */
    private static final g3 f9416a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final g3 f9417b = new i3();

    static g3 a() {
        return f9416a;
    }

    static g3 b() {
        return f9417b;
    }

    private static g3 c() {
        try {
            return (g3) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
