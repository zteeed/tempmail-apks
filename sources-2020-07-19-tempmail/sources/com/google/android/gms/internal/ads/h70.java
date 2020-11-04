package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class h70 {

    /* renamed from: a  reason: collision with root package name */
    private static final f70 f3940a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final f70 f3941b = new e70();

    static f70 a() {
        return f3940a;
    }

    static f70 b() {
        return f3941b;
    }

    private static f70 c() {
        try {
            return (f70) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
