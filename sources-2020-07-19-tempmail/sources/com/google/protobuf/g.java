package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: ExtensionRegistryLite */
public class g {

    /* renamed from: a  reason: collision with root package name */
    static final g f11571a = new g(true);

    static {
        b();
    }

    g() {
        new HashMap();
    }

    public static g a() {
        return f.a();
    }

    static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    g(boolean z) {
        Collections.emptyMap();
    }
}
