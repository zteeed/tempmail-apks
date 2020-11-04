package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzekw<K, V, V2> {

    /* renamed from: a  reason: collision with root package name */
    final LinkedHashMap<K, zzelj<V>> f8833a;

    zzekw(int i) {
        this.f8833a = zzekv.c(i);
    }

    /* access modifiers changed from: package-private */
    public zzekw<K, V, V2> a(K k, zzelj<V> zzelj) {
        LinkedHashMap<K, zzelj<V>> linkedHashMap = this.f8833a;
        zzelg.b(k, "key");
        zzelg.b(zzelj, "provider");
        linkedHashMap.put(k, zzelj);
        return this;
    }
}
