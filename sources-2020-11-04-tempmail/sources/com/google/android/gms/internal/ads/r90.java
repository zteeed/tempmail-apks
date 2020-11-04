package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
abstract class r90<K, V, V2> implements zzela<Map<K, V2>> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<K, zzelj<V>> f4986a;

    r90(Map<K, zzelj<V>> map) {
        this.f4986a = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    public final Map<K, zzelj<V>> a() {
        return this.f4986a;
    }
}
