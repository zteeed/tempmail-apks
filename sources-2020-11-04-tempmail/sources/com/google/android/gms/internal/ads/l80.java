package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
class l80 extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ e80 f4460b;

    private l80(e80 e80) {
        this.f4460b = e80;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f4460b.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f4460b.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f4460b.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new m80(this.f4460b, (d80) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f4460b.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f4460b.size();
    }

    /* synthetic */ l80(e80 e80, d80 d80) {
        this(e80);
    }
}
