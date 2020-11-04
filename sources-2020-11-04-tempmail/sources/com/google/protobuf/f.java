package com.google.protobuf;

/* compiled from: ExtensionRegistryFactory */
final class f {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f12119a = c();

    public static g a() {
        if (f12119a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return g.f12120a;
    }

    private static final g b(String str) throws Exception {
        return (g) f12119a.getMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
