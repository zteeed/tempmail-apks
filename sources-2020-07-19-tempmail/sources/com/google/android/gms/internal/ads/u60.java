package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class u60<K> implements Map.Entry<K, Object> {

    /* renamed from: b  reason: collision with root package name */
    private Map.Entry<K, zzegq> f5036b;

    private u60(Map.Entry<K, zzegq> entry) {
        this.f5036b = entry;
    }

    public final zzegq a() {
        return this.f5036b.getValue();
    }

    public final K getKey() {
        return this.f5036b.getKey();
    }

    public final Object getValue() {
        if (this.f5036b.getValue() == null) {
            return null;
        }
        zzegq.e();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzehl) {
            return this.f5036b.getValue().d((zzehl) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
