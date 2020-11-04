package a.b.a.b;

import a.b.a.b.b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FastSafeIterableMap */
public class a<K, V> extends b<K, V> {

    /* renamed from: f  reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f82f = new HashMap<>();

    public boolean contains(K k) {
        return this.f82f.containsKey(k);
    }

    /* access modifiers changed from: protected */
    public b.c<K, V> h(K k) {
        return this.f82f.get(k);
    }

    public V m(K k, V v) {
        b.c h = h(k);
        if (h != null) {
            return h.f88c;
        }
        this.f82f.put(k, l(k, v));
        return null;
    }

    public V q(K k) {
        V q = super.q(k);
        this.f82f.remove(k);
        return q;
    }

    public Map.Entry<K, V> s(K k) {
        if (contains(k)) {
            return this.f82f.get(k).f90e;
        }
        return null;
    }
}
