package a.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    c<K, V> f83b;

    /* renamed from: c  reason: collision with root package name */
    private c<K, V> f84c;

    /* renamed from: d  reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f85d = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private int f86e = 0;

    /* compiled from: SafeIterableMap */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f90e;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f89d;
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
            return cVar.f89d;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f90e;
        }
    }

    /* compiled from: SafeIterableMap */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        final K f87b;

        /* renamed from: c  reason: collision with root package name */
        final V f88c;

        /* renamed from: d  reason: collision with root package name */
        c<K, V> f89d;

        /* renamed from: e  reason: collision with root package name */
        c<K, V> f90e;

        c(K k, V v) {
            this.f87b = k;
            this.f88c = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f87b.equals(cVar.f87b) || !this.f88c.equals(cVar.f88c)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f87b;
        }

        public V getValue() {
            return this.f88c;
        }

        public int hashCode() {
            return this.f87b.hashCode() ^ this.f88c.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f87b + "=" + this.f88c;
        }
    }

    /* compiled from: SafeIterableMap */
    private class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        private c<K, V> f91b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f92c = true;

        d() {
        }

        public void b(c<K, V> cVar) {
            c<K, V> cVar2 = this.f91b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f90e;
                this.f91b = cVar3;
                this.f92c = cVar3 == null;
            }
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            if (this.f92c) {
                this.f92c = false;
                this.f91b = b.this.f83b;
            } else {
                c<K, V> cVar = this.f91b;
                this.f91b = cVar != null ? cVar.f89d : null;
            }
            return this.f91b;
        }

        public boolean hasNext() {
            if (!this.f92c) {
                c<K, V> cVar = this.f91b;
                if (cVar == null || cVar.f89d == null) {
                    return false;
                }
                return true;
            } else if (b.this.f83b != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* compiled from: SafeIterableMap */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        c<K, V> f94b;

        /* renamed from: c  reason: collision with root package name */
        c<K, V> f95c;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f94b = cVar2;
            this.f95c = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f95c;
            c<K, V> cVar2 = this.f94b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        public void b(c<K, V> cVar) {
            if (this.f94b == cVar && cVar == this.f95c) {
                this.f95c = null;
                this.f94b = null;
            }
            c<K, V> cVar2 = this.f94b;
            if (cVar2 == cVar) {
                this.f94b = c(cVar2);
            }
            if (this.f95c == cVar) {
                this.f95c = f();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> d(c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f95c;
            this.f95c = f();
            return cVar;
        }

        public boolean hasNext() {
            return this.f95c != null;
        }
    }

    /* compiled from: SafeIterableMap */
    interface f<K, V> {
        void b(c<K, V> cVar);
    }

    public Map.Entry<K, V> c() {
        return this.f83b;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0003b bVar = new C0003b(this.f84c, this.f83b);
        this.f85d.put(bVar, Boolean.FALSE);
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
        c<K, V> cVar = this.f83b;
        while (cVar != null && !cVar.f87b.equals(k)) {
            cVar = cVar.f89d;
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
        this.f85d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f83b, this.f84c);
        this.f85d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Map.Entry<K, V> j() {
        return this.f84c;
    }

    /* access modifiers changed from: protected */
    public c<K, V> l(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f86e++;
        c<K, V> cVar2 = this.f84c;
        if (cVar2 == null) {
            this.f83b = cVar;
            this.f84c = cVar;
            return cVar;
        }
        cVar2.f89d = cVar;
        cVar.f90e = cVar2;
        this.f84c = cVar;
        return cVar;
    }

    public V m(K k, V v) {
        c h = h(k);
        if (h != null) {
            return h.f88c;
        }
        l(k, v);
        return null;
    }

    public V q(K k) {
        c h = h(k);
        if (h == null) {
            return null;
        }
        this.f86e--;
        if (!this.f85d.isEmpty()) {
            for (f<K, V> b2 : this.f85d.keySet()) {
                b2.b(h);
            }
        }
        c<K, V> cVar = h.f90e;
        if (cVar != null) {
            cVar.f89d = h.f89d;
        } else {
            this.f83b = h.f89d;
        }
        c<K, V> cVar2 = h.f89d;
        if (cVar2 != null) {
            cVar2.f90e = h.f90e;
        } else {
            this.f84c = h.f90e;
        }
        h.f89d = null;
        h.f90e = null;
        return h.f88c;
    }

    public int size() {
        return this.f86e;
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
