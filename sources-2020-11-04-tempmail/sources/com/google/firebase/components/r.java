package com.google.firebase.components;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public final class r {
    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static <T> T c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
