package com.google.protobuf;

/* compiled from: ExtensionRegistryFactory */
final class f {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f11570a = c();

    public static g a() {
        if (f11570a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return g.f11571a;
    }

    private static final g b(String str) throws Exception {
        return (g) f11570a.getMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
