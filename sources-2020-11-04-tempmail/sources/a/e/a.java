package a.e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayMap */
public class a<K, V> extends g<K, V> implements Map<K, V> {
    f<K, V> i;

    /* renamed from: a.e.a$a  reason: collision with other inner class name */
    /* compiled from: ArrayMap */
    class C0005a extends f<K, V> {
        C0005a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            a.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i, int i2) {
            return a.this.f143c[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        public Map<K, V> c() {
            return a.this;
        }

        /* access modifiers changed from: protected */
        public int d() {
            return a.this.f144d;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return a.this.f(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return a.this.h(obj);
        }

        /* access modifiers changed from: protected */
        public void g(K k, V v) {
            a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        public void h(int i) {
            a.this.k(i);
        }

        /* access modifiers changed from: protected */
        public V i(int i, V v) {
            return a.this.l(i, v);
        }
    }

    public a() {
    }

    private f<K, V> n() {
        if (this.i == null) {
            this.i = new C0005a();
        }
        return this.i;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return n().l();
    }

    public Set<K> keySet() {
        return n().m();
    }

    public boolean o(Collection<?> collection) {
        return f.p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f144d + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return n().n();
    }

    public a(int i2) {
        super(i2);
    }

    public a(g gVar) {
        super(gVar);
    }
}
