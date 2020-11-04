package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzekv {
    public static <T> List<T> a(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    static <T> HashSet<T> b(int i) {
        return new HashSet<>(d(i));
    }

    public static <K, V> LinkedHashMap<K, V> c(int i) {
        return new LinkedHashMap<>(d(i));
    }

    private static int d(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
