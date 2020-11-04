package a.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    c<K, V> f84b;

    /* renamed from: c  reason: collision with root package name */
    private c<K, V> f85c;

    /* renamed from: d  reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f86d = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private int f87e = 0;

    /* compiled from: SafeIterableMap */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f91e;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f90d;
        }
    }

    /* renamed from: a.b.a.b.b$b  reason: collision with other inner class name */
    /* compiled from: SafeIterableMap */
    private static class C0003b<K, V> extends e<K, V> {
        C0003b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f90d;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f91e;
        }
    }

    /* compiled from: SafeIterableMap */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        final K f88b;

        /* renamed from: c  reason: collision with root package name */
        final V f89c;

        /* renamed from: d  reason: collision with root package name */
        c<K, V> f90d;

        /* renamed from: e  reason: collision with root package name */
        c<K, V> f91e;

        c(K k, V v) {
            this.f88b = k;
            this.f89c = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f88b.equals(cVar.f88b) || !this.f89c.equals(cVar.f89c)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f88b;
        }

        public V getValue() {
            return this.f89c;
        }

        public int hashCode() {
            return this.f88b.hashCode() ^ this.f89c.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f88b + "=" + this.f89c;
        }
    }

    /* compiled from: SafeIterableMap */
    private class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        private c<K, V> f92b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f93c = true;

        d() {
        }

        public void b(c<K, V> cVar) {
            c<K, V> cVar2 = this.f92b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f91e;
                this.f92b = cVar3;
                this.f93c = cVar3 == null;
            }
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            if (this.f93c) {
                this.f93c = false;
                this.f92b = b.this.f84b;
            } else {
                c<K, V> cVar = this.f92b;
                this.f92b = cVar != null ? cVar.f90d : null;
            }
            return this.f92b;
        }

        public boolean hasNext() {
            if (!this.f93c) {
                c<K, V> cVar = this.f92b;
                if (cVar == null || cVar.f90d == null) {
                    return false;
                }
                return true;
            } else if (b.this.f84b != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* compiled from: SafeIterableMap */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        c<K, V> f95b;

        /* renamed from: c  reason: collision with root package name */
        c<K, V> f96c;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f95b = cVar2;
            this.f96c = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f96c;
            c<K, V> cVar2 = this.f95b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        public void b(c<K, V> cVar) {
            if (this.f95b == cVar && cVar == this.f96c) {
                this.f96c = null;
                this.f95b = null;
            }
            c<K, V> cVar2 = this.f95b;
            if (cVar2 == cVar) {
                this.f95b = c(cVar2);
            }
            if (this.f96c == cVar) {
                this.f96c = f();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> d(c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f96c;
            this.f96c = f();
            return cVar;
        }

        public boolean hasNext() {
            return this.f96c != null;
        }
    }

    /* compiled from: SafeIterableMap */
    interface f<K, V> {
        void b(c<K, V> cVar);
    }

    public Map.Entry<K, V> c() {
        return this.f84b;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0003b bVar = new C0003b(this.f85c, this.f84b);
        this.f86d.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public c<K, V> h(K k) {
        c<K, V> cVar = this.f84b;
        while (cVar != null && !cVar.f88b.equals(k)) {
            cVar = cVar.f90d;
        }
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public b<K, V>.d i() {
        b<K, V>.d dVar = new d();
        this.f86d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f84b, this.f85c);
        this.f86d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Map.Entry<K, V> j() {
        return this.f85c;
    }

    /* access modifiers changed from: protected */
    public c<K, V> l(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f87e++;
        c<K, V> cVar2 = this.f85c;
        if (cVar2 == null) {
            this.f84b = cVar;
            this.f85c = cVar;
            return cVar;
        }
        cVar2.f90d = cVar;
        cVar.f91e = cVar2;
        this.f85c = cVar;
        return cVar;
    }

    public V m(K k, V v) {
        c h = h(k);
        if (h != null) {
            return h.f89c;
        }
        l(k, v);
        return null;
    }

    public V q(K k) {
        c h = h(k);
        if (h == null) {
            return null;
        }
        this.f87e--;
        if (!this.f86d.isEmpty()) {
            for (f<K, V> b2 : this.f86d.keySet()) {
                b2.b(h);
            }
        }
        c<K, V> cVar = h.f91e;
        if (cVar != null) {
            cVar.f90d = h.f90d;
        } else {
            this.f84b = h.f90d;
        }
        c<K, V> cVar2 = h.f90d;
        if (cVar2 != null) {
            cVar2.f91e = h.f91e;
        } else {
            this.f85c = h.f91e;
        }
        h.f90d = null;
        h.f91e = null;
        return h.f89c;
    }

    public int size() {
        return this.f87e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
