package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzelc<K, V> extends r90<K, V, V> {
    static {
        zzekz.a(Collections.emptyMap());
    }

    private zzelc(Map<K, zzelj<V>> map) {
        super(map);
    }

    public static <K, V> zzele<K, V> b(int i) {
        return new zzele<>(i);
    }

    public final /* synthetic */ Object get() {
        LinkedHashMap c2 = zzekv.c(a().size());
        for (Map.Entry entry : a().entrySet()) {
            c2.put(entry.getKey(), ((zzelj) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(c2);
    }
}
