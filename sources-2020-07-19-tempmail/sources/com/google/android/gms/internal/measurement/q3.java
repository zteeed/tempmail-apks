package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
class q3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private final int f9477b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public List<z3> f9478c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Map<K, V> f9479d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9480e;

    /* renamed from: f  reason: collision with root package name */
    private volatile b4 f9481f;
    /* access modifiers changed from: private */
    public Map<K, V> g;
    private volatile v3 h;

    private q3(int i) {
        this.f9477b = i;
        this.f9478c = Collections.emptyList();
        this.f9479d = Collections.emptyMap();
        this.g = Collections.emptyMap();
    }

    private final int a(K k) {
        int size = this.f9478c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f9478c.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.f9478c.get(i2).getKey());
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

    static <FieldDescriptorType extends zzfg<FieldDescriptorType>> q3<FieldDescriptorType, Object> b(int i) {
        return new t3(i);
    }

    /* access modifiers changed from: private */
    public final V k(int i) {
        p();
        V value = this.f9478c.remove(i).getValue();
        if (!this.f9479d.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f9478c.add(new z3(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    public final void p() {
        if (this.f9480e) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> q() {
        p();
        if (this.f9479d.isEmpty() && !(this.f9479d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9479d = treeMap;
            this.g = treeMap.descendingMap();
        }
        return (SortedMap) this.f9479d;
    }

    public void clear() {
        p();
        if (!this.f9478c.isEmpty()) {
            this.f9478c.clear();
        }
        if (!this.f9479d.isEmpty()) {
            this.f9479d.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f9479d.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k, V v) {
        p();
        int a2 = a(k);
        if (a2 >= 0) {
            return this.f9478c.get(a2).setValue(v);
        }
        p();
        if (this.f9478c.isEmpty() && !(this.f9478c instanceof ArrayList)) {
            this.f9478c = new ArrayList(this.f9477b);
        }
        int i = -(a2 + 1);
        if (i >= this.f9477b) {
            return q().put(k, v);
        }
        int size = this.f9478c.size();
        int i2 = this.f9477b;
        if (size == i2) {
            z3 remove = this.f9478c.remove(i2 - 1);
            q().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f9478c.add(i, new z3(this, k, v));
        return null;
    }

    public void e() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f9480e) {
            if (this.f9479d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f9479d);
            }
            this.f9479d = map;
            if (this.g.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.g);
            }
            this.g = map2;
            this.f9480e = true;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f9481f == null) {
            this.f9481f = new b4(this, (t3) null);
        }
        return this.f9481f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return super.equals(obj);
        }
        q3 q3Var = (q3) obj;
        int size = size();
        if (size != q3Var.size()) {
            return false;
        }
        int j = j();
        if (j != q3Var.j()) {
            return entrySet().equals(q3Var.entrySet());
        }
        for (int i = 0; i < j; i++) {
            if (!h(i).equals(q3Var.h(i))) {
                return false;
            }
        }
        if (j != size) {
            return this.f9479d.equals(q3Var.f9479d);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return this.f9478c.get(a2).getValue();
        }
        return this.f9479d.get(comparable);
    }

    public final Map.Entry<K, V> h(int i) {
        return this.f9478c.get(i);
    }

    public int hashCode() {
        int j = j();
        int i = 0;
        for (int i2 = 0; i2 < j; i2++) {
            i += this.f9478c.get(i2).hashCode();
        }
        return this.f9479d.size() > 0 ? i + this.f9479d.hashCode() : i;
    }

    public final boolean i() {
        return this.f9480e;
    }

    public final int j() {
        return this.f9478c.size();
    }

    public final Iterable<Map.Entry<K, V>> m() {
        if (this.f9479d.isEmpty()) {
            return u3.a();
        }
        return this.f9479d.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> o() {
        if (this.h == null) {
            this.h = new v3(this, (t3) null);
        }
        return this.h;
    }

    public V remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return k(a2);
        }
        if (this.f9479d.isEmpty()) {
            return null;
        }
        return this.f9479d.remove(comparable);
    }

    public int size() {
        return this.f9478c.size() + this.f9479d.size();
    }

    /* synthetic */ q3(int i, t3 t3Var) {
        this(i);
    }
}