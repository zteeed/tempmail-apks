package a.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections */
abstract class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    f<K, V>.b f124a;

    /* renamed from: b  reason: collision with root package name */
    f<K, V>.c f125b;

    /* renamed from: c  reason: collision with root package name */
    f<K, V>.e f126c;

    /* compiled from: MapCollections */
    final class a<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        final int f127b;

        /* renamed from: c  reason: collision with root package name */
        int f128c;

        /* renamed from: d  reason: collision with root package name */
        int f129d;

        /* renamed from: e  reason: collision with root package name */
        boolean f130e = false;

        a(int i) {
            this.f127b = i;
            this.f128c = f.this.d();
        }

        public boolean hasNext() {
            return this.f129d < this.f128c;
        }

        public T next() {
            if (hasNext()) {
                T b2 = f.this.b(this.f129d, this.f127b);
                this.f129d++;
                this.f130e = true;
                return b2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f130e) {
                int i = this.f129d - 1;
                this.f129d = i;
                this.f128c--;
                this.f130e = false;
                f.this.h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: MapCollections */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            c((Map.Entry) obj);
            throw null;
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d2 = f.this.d();
            for (Map.Entry entry : collection) {
                f.this.g(entry.getKey(), entry.getValue());
            }
            return d2 != f.this.d();
        }

        public boolean c(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e2 = f.this.e(entry.getKey());
            if (e2 < 0) {
                return false;
            }
            return c.c(f.this.b(e2, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int d2 = f.this.d() - 1; d2 >= 0; d2--) {
                Object b2 = f.this.b(d2, 0);
                Object b3 = f.this.b(d2, 1);
                if (b2 == null) {
                    i = 0;
                } else {
                    i = b2.hashCode();
                }
                if (b3 == null) {
                    i2 = 0;
                } else {
                    i2 = b3.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections */
    final class c implements Set<K> {
        c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            return f.this.e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return f.j(f.this.c(), collection);
        }

        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int d2 = f.this.d() - 1; d2 >= 0; d2--) {
                Object b2 = f.this.b(d2, 0);
                if (b2 == null) {
                    i = 0;
                } else {
                    i = b2.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e2 = f.this.e(obj);
            if (e2 < 0) {
                return false;
            }
            f.this.h(e2);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return f.o(f.this.c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return f.p(f.this.c(), collection);
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return f.this.r(tArr, 0);
        }
    }

    /* compiled from: MapCollections */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        int f134b;

        /* renamed from: c  reason: collision with root package name */
        int f135c;

        /* renamed from: d  reason: collision with root package name */
        boolean f136d = false;

        d() {
            this.f134b = f.this.d() - 1;
            this.f135c = -1;
        }

        public Map.Entry<K, V> b() {
            if (hasNext()) {
                this.f135c++;
                this.f136d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f136d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!c.c(entry.getKey(), f.this.b(this.f135c, 0)) || !c.c(entry.getValue(), f.this.b(this.f135c, 1))) {
                    return false;
                }
                return true;
            }
        }

        public K getKey() {
            if (this.f136d) {
                return f.this.b(this.f135c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f136d) {
                return f.this.b(this.f135c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f135c < this.f134b;
        }

        public int hashCode() {
            int i;
            if (this.f136d) {
                int i2 = 0;
                Object b2 = f.this.b(this.f135c, 0);
                Object b3 = f.this.b(this.f135c, 1);
                if (b2 == null) {
                    i = 0;
                } else {
                    i = b2.hashCode();
                }
                if (b3 != null) {
                    i2 = b3.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public /* bridge */ /* synthetic */ Object next() {
            b();
            return this;
        }

        public void remove() {
            if (this.f136d) {
                f.this.h(this.f135c);
                this.f135c--;
                this.f134b--;
                this.f136d = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f136d) {
                return f.this.i(this.f135c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MapCollections */
    final class e implements Collection<V> {
        e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            return f.this.f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f2 = f.this.f(obj);
            if (f2 < 0) {
                return false;
            }
            f.this.h(f2);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d2 = f.this.d();
            int i = 0;
            boolean z = false;
            while (i < d2) {
                if (collection.contains(f.this.b(i, 1))) {
                    f.this.h(i);
                    i--;
                    d2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d2 = f.this.d();
            int i = 0;
            boolean z = false;
            while (i < d2) {
                if (!collection.contains(f.this.b(i, 1))) {
                    f.this.h(i);
                    i--;
                    d2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return f.this.r(tArr, 1);
        }
    }

    f() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract Object b(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> c();

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int e(Object obj);

    /* access modifiers changed from: protected */
    public abstract int f(Object obj);

    /* access modifiers changed from: protected */
    public abstract void g(K k, V v);

    /* access modifiers changed from: protected */
    public abstract void h(int i);

    /* access modifiers changed from: protected */
    public abstract V i(int i, V v);

    public Set<Map.Entry<K, V>> l() {
        if (this.f124a == null) {
            this.f124a = new b();
        }
        return this.f124a;
    }

    public Set<K> m() {
        if (this.f125b == null) {
            this.f125b = new c();
        }
        return this.f125b;
    }

    public Collection<V> n() {
        if (this.f126c == null) {
            this.f126c = new e();
        }
        return this.f126c;
    }

    public Object[] q(int i) {
        int d2 = d();
        Object[] objArr = new Object[d2];
        for (int i2 = 0; i2 < d2; i2++) {
            objArr[i2] = b(i2, i);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i) {
        int d2 = d();
        if (tArr.length < d2) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d2);
        }
        for (int i2 = 0; i2 < d2; i2++) {
            tArr[i2] = b(i2, i);
        }
        if (tArr.length > d2) {
            tArr[d2] = null;
        }
        return tArr;
    }
}
