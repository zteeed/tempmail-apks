package com.google.protobuf;

import com.google.protobuf.h;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap */
class r<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private final int f11605b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public List<r<K, V>.c> f11606c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Map<K, V> f11607d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11608e;

    /* renamed from: f  reason: collision with root package name */
    private volatile r<K, V>.e f11609f;

    /* compiled from: SmallSortedMap */
    static class a extends r<FieldDescriptorType, Object> {
        a(int i) {
            super(i, (a) null);
        }

        public void n() {
            if (!m()) {
                for (int i = 0; i < i(); i++) {
                    Map.Entry h = h(i);
                    if (((h.b) h.getKey()).l()) {
                        h.setValue(Collections.unmodifiableList((List) h.getValue()));
                    }
                }
                for (Map.Entry entry : k()) {
                    if (((h.b) entry.getKey()).l()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            r.super.n();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return r.super.put((h.b) obj, obj2);
        }
    }

    /* compiled from: SmallSortedMap */
    private static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator<Object> f11610a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f11611b = new C0110b();

        /* compiled from: SmallSortedMap */
        static class a implements Iterator<Object> {
            a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.google.protobuf.r$b$b  reason: collision with other inner class name */
        /* compiled from: SmallSortedMap */
        static class C0110b implements Iterable<Object> {
            C0110b() {
            }

            public Iterator<Object> iterator() {
                return b.f11610a;
            }
        }

        static <T> Iterable<T> b() {
            return f11611b;
        }
    }

    /* compiled from: SmallSortedMap */
    private class c implements Map.Entry<K, V>, Comparable<r<K, V>.c> {

        /* renamed from: b  reason: collision with root package name */
        private final K f11612b;

        /* renamed from: c  reason: collision with root package name */
        private V f11613c;

        c(r rVar, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean g(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!g(this.f11612b, entry.getKey()) || !g(this.f11613c, entry.getValue())) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public int compareTo(r<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        public V getValue() {
            return this.f11613c;
        }

        /* renamed from: h */
        public K getKey() {
            return this.f11612b;
        }

        public int hashCode() {
            K k = this.f11612b;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f11613c;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            r.this.f();
            V v2 = this.f11613c;
            this.f11613c = v;
            return v2;
        }

        public String toString() {
            return this.f11612b + "=" + this.f11613c;
        }

        c(K k, V v) {
            this.f11612b = k;
            this.f11613c = v;
        }
    }

    /* compiled from: SmallSortedMap */
    private class e extends AbstractSet<Map.Entry<K, V>> {
        private e() {
        }

        /* renamed from: c */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            r.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            r.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = r.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(r.this, (a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            r.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return r.this.size();
        }

        /* synthetic */ e(r rVar, a aVar) {
            this();
        }
    }

    /* synthetic */ r(int i, a aVar) {
        this(i);
    }

    private int e(K k) {
        int size = this.f11606c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f11606c.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f11606c.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* access modifiers changed from: private */
    public void f() {
        if (this.f11608e) {
            throw new UnsupportedOperationException();
        }
    }

    private void g() {
        f();
        if (this.f11606c.isEmpty() && !(this.f11606c instanceof ArrayList)) {
            this.f11606c = new ArrayList(this.f11605b);
        }
    }

    private SortedMap<K, V> l() {
        f();
        if (this.f11607d.isEmpty() && !(this.f11607d instanceof TreeMap)) {
            this.f11607d = new TreeMap();
        }
        return (SortedMap) this.f11607d;
    }

    static <FieldDescriptorType extends h.b<FieldDescriptorType>> r<FieldDescriptorType, Object> o(int i) {
        return new a(i);
    }

    /* access modifiers changed from: private */
    public V q(int i) {
        f();
        V value = this.f11606c.remove(i).getValue();
        if (!this.f11607d.isEmpty()) {
            Iterator it = l().entrySet().iterator();
            this.f11606c.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        f();
        if (!this.f11606c.isEmpty()) {
            this.f11606c.clear();
        }
        if (!this.f11607d.isEmpty()) {
            this.f11607d.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f11607d.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f11609f == null) {
            this.f11609f = new e(this, (a) null);
        }
        return this.f11609f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return super.equals(obj);
        }
        r rVar = (r) obj;
        int size = size();
        if (size != rVar.size()) {
            return false;
        }
        int i = i();
        if (i != rVar.i()) {
            return entrySet().equals(rVar.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!h(i2).equals(rVar.h(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.f11607d.equals(rVar.f11607d);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e2 = e(comparable);
        if (e2 >= 0) {
            return this.f11606c.get(e2).getValue();
        }
        return this.f11607d.get(comparable);
    }

    public Map.Entry<K, V> h(int i) {
        return this.f11606c.get(i);
    }

    public int hashCode() {
        int i = i();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.f11606c.get(i3).hashCode();
        }
        return j() > 0 ? i2 + this.f11607d.hashCode() : i2;
    }

    public int i() {
        return this.f11606c.size();
    }

    public int j() {
        return this.f11607d.size();
    }

    public Iterable<Map.Entry<K, V>> k() {
        if (this.f11607d.isEmpty()) {
            return b.b();
        }
        return this.f11607d.entrySet();
    }

    public boolean m() {
        return this.f11608e;
    }

    public void n() {
        Map<K, V> map;
        if (!this.f11608e) {
            if (this.f11607d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f11607d);
            }
            this.f11607d = map;
            this.f11608e = true;
        }
    }

    /* renamed from: p */
    public V put(K k, V v) {
        f();
        int e2 = e(k);
        if (e2 >= 0) {
            return this.f11606c.get(e2).setValue(v);
        }
        g();
        int i = -(e2 + 1);
        if (i >= this.f11605b) {
            return l().put(k, v);
        }
        int size = this.f11606c.size();
        int i2 = this.f11605b;
        if (size == i2) {
            c remove = this.f11606c.remove(i2 - 1);
            l().put(remove.getKey(), remove.getValue());
        }
        this.f11606c.add(i, new c(k, v));
        return null;
    }

    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int e2 = e(comparable);
        if (e2 >= 0) {
            return q(e2);
        }
        if (this.f11607d.isEmpty()) {
            return null;
        }
        return this.f11607d.remove(comparable);
    }

    public int size() {
        return this.f11606c.size() + this.f11607d.size();
    }

    /* compiled from: SmallSortedMap */
    private class d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b  reason: collision with root package name */
        private int f11615b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f11616c;

        /* renamed from: d  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f11617d;

        private d() {
            this.f11615b = -1;
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f11617d == null) {
                this.f11617d = r.this.f11607d.entrySet().iterator();
            }
            return this.f11617d;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f11616c = true;
            int i = this.f11615b + 1;
            this.f11615b = i;
            if (i < r.this.f11606c.size()) {
                return (Map.Entry) r.this.f11606c.get(this.f11615b);
            }
            return (Map.Entry) b().next();
        }

        public boolean hasNext() {
            if (this.f11615b + 1 < r.this.f11606c.size() || b().hasNext()) {
                return true;
            }
            return false;
        }

        public void remove() {
            if (this.f11616c) {
                this.f11616c = false;
                r.this.f();
                if (this.f11615b < r.this.f11606c.size()) {
                    r rVar = r.this;
                    int i = this.f11615b;
                    this.f11615b = i - 1;
                    Object unused = rVar.q(i);
                    return;
                }
                b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ d(r rVar, a aVar) {
            this();
        }
    }

    private r(int i) {
        this.f11605b = i;
        this.f11606c = Collections.emptyList();
        this.f11607d = Collections.emptyMap();
    }
}
