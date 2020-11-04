package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class a3 {

    /* renamed from: a  reason: collision with root package name */
    private static final y2 f9542a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final y2 f9543b = new x2();

    static y2 a() {
        return f9542a;
    }

    static y2 b() {
        return f9543b;
    }

    private static y2 c() {
        try {
            return (y2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
