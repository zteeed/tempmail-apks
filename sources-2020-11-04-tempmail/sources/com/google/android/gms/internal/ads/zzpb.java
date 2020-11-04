package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpb {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static String c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T d(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static void e(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void f(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static int g(int i, int i2, int i3) {
        if (i >= 0 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }
}
