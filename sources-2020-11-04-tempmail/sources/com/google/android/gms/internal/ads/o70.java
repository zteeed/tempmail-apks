package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class o70 {

    /* renamed from: a  reason: collision with root package name */
    private static final n70 f4713a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final n70 f4714b = new p70();

    static n70 a() {
        return f4713a;
    }

    static n70 b() {
        return f4714b;
    }

    private static n70 c() {
        try {
            return (n70) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
