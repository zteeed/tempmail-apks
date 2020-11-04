package a.b.a.b;

import a.b.a.b.b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FastSafeIterableMap */
public class a<K, V> extends b<K, V> {

    /* renamed from: f  reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f83f = new HashMap<>();

    public boolean contains(K k) {
        return this.f83f.containsKey(k);
    }

    /* access modifiers changed from: protected */
    public b.c<K, V> h(K k) {
        return this.f83f.get(k);
    }

    public V m(K k, V v) {
        b.c h = h(k);
        if (h != null) {
            return h.f89c;
        }
        this.f83f.put(k, l(k, v));
        return null;
    }

    public V q(K k) {
        V q = super.q(k);
        this.f83f.remove(k);
        return q;
    }

    public Map.Entry<K, V> s(K k) {
        if (contains(k)) {
            return this.f83f.get(k).f91e;
        }
        return null;
    }
}
