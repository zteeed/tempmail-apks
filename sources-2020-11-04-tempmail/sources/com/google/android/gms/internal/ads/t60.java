package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class t60<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f5137b;

    public t60(Iterator<Map.Entry<K, Object>> it) {
        this.f5137b = it;
    }

    public final boolean hasNext() {
        return this.f5137b.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f5137b.next();
        return next.getValue() instanceof zzegq ? new u60(next) : next;
    }

    public final void remove() {
        this.f5137b.remove();
    }
}
