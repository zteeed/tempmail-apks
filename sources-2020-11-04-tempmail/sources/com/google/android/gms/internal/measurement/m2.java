package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class m2<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f9640b;

    public m2(Iterator<Map.Entry<K, Object>> it) {
        this.f9640b = it;
    }

    public final boolean hasNext() {
        return this.f9640b.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f9640b.next();
        return next.getValue() instanceof zzgb ? new n2(next) : next;
    }

    public final void remove() {
        this.f9640b.remove();
    }
}
