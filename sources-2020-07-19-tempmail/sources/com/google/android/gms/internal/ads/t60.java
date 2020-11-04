package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class t60<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f4954b;

    public t60(Iterator<Map.Entry<K, Object>> it) {
        this.f4954b = it;
    }

    public final boolean hasNext() {
        return this.f4954b.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f4954b.next();
        return next.getValue() instanceof zzegq ? new u60(next) : next;
    }

    public final void remove() {
        this.f4954b.remove();
    }
}
