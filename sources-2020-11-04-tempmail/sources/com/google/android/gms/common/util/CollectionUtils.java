package com.google.android.gms.common.util;

import a.e.a;
import a.e.b;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@KeepForSdk
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean a(Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> b() {
        return Collections.emptyList();
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> c(T t) {
        return Collections.singletonList(t);
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> d(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return b();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return c(tArr[0]);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> e(K k, V v, K k2, V v2, K k3, V v3) {
        Map j = j(3, false);
        j.put(k, v);
        j.put(k2, v2);
        j.put(k3, v3);
        return Collections.unmodifiableMap(j);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> f(K[] kArr, V[] vArr) {
        if (kArr.length == vArr.length) {
            int length = kArr.length;
            if (length == 0) {
                return Collections.emptyMap();
            }
            if (length == 1) {
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            Map j = j(kArr.length, false);
            for (int i = 0; i < kArr.length; i++) {
                j.put(kArr[i], vArr[i]);
            }
            return Collections.unmodifiableMap(j);
        }
        int length2 = kArr.length;
        int length3 = vArr.length;
        StringBuilder sb = new StringBuilder(66);
        sb.append("Key and values array lengths not equal: ");
        sb.append(length2);
        sb.append(" != ");
        sb.append(length3);
        throw new IllegalArgumentException(sb.toString());
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> g(T t, T t2, T t3) {
        Set i = i(3, false);
        i.add(t);
        i.add(t2);
        i.add(t3);
        return Collections.unmodifiableSet(i);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> h(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set i = i(2, false);
            i.add(t);
            i.add(t2);
            return Collections.unmodifiableSet(i);
        } else if (length == 3) {
            return g(tArr[0], tArr[1], tArr[2]);
        } else {
            if (length != 4) {
                Set i2 = i(tArr.length, false);
                Collections.addAll(i2, tArr);
                return Collections.unmodifiableSet(i2);
            }
            T t3 = tArr[0];
            T t4 = tArr[1];
            T t5 = tArr[2];
            T t6 = tArr[3];
            Set i3 = i(4, false);
            i3.add(t3);
            i3.add(t4);
            i3.add(t5);
            i3.add(t6);
            return Collections.unmodifiableSet(i3);
        }
    }

    private static <T> Set<T> i(int i, boolean z) {
        float f2 = z ? 0.75f : 1.0f;
        if (i <= (z ? 128 : 256)) {
            return new b(i);
        }
        return new HashSet(i, f2);
    }

    private static <K, V> Map<K, V> j(int i, boolean z) {
        if (i <= 256) {
            return new a(i);
        }
        return new HashMap(i, 1.0f);
    }
}
