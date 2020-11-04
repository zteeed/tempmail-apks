package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
class b4 extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ q3 f9364b;

    private b4(q3 q3Var) {
        this.f9364b = q3Var;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f9364b.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f9364b.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f9364b.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new y3(this.f9364b, (t3) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f9364b.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f9364b.size();
    }

    /* synthetic */ b4(q3 q3Var, t3 t3Var) {
        this(q3Var);
    }
}
