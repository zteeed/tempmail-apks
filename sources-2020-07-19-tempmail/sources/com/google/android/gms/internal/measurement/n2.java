package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class n2<K> implements Map.Entry<K, Object> {

    /* renamed from: b  reason: collision with root package name */
    private Map.Entry<K, zzgb> f9463b;

    private n2(Map.Entry<K, zzgb> entry) {
        this.f9463b = entry;
    }

    public final zzgb a() {
        return this.f9463b.getValue();
    }

    public final K getKey() {
        return this.f9463b.getKey();
    }

    public final Object getValue() {
        if (this.f9463b.getValue() == null) {
            return null;
        }
        zzgb.e();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzgw) {
            return this.f9463b.getValue().a((zzgw) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
