package com.google.android.gms.internal.ads;

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

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
class e80<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private final int f3689b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public List<j80> f3690c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Map<K, V> f3691d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3692e;

    /* renamed from: f  reason: collision with root package name */
    private volatile l80 f3693f;
    /* access modifiers changed from: private */
    public Map<K, V> g;
    private volatile f80 h;

    private e80(int i) {
        this.f3689b = i;
        this.f3690c = Collections.emptyList();
        this.f3691d = Collections.emptyMap();
        this.g = Collections.emptyMap();
    }

    private final int b(K k) {
        int size = this.f3690c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f3690c.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.f3690c.get(i2).getKey());
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
    public final void k() {
        if (this.f3692e) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> l() {
        k();
        if (this.f3691d.isEmpty() && !(this.f3691d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3691d = treeMap;
            this.g = treeMap.descendingMap();
        }
        return (SortedMap) this.f3691d;
    }

    static <FieldDescriptorType extends zzefw<FieldDescriptorType>> e80<FieldDescriptorType, Object> o(int i) {
        return new d80(i);
    }

    /* access modifiers changed from: private */
    public final V q(int i) {
        k();
        V value = this.f3690c.remove(i).getValue();
        if (!this.f3691d.isEmpty()) {
            Iterator it = l().entrySet().iterator();
            this.f3690c.add(new j80(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public final boolean a() {
        return this.f3692e;
    }

    public void clear() {
        k();
        if (!this.f3690c.isEmpty()) {
            this.f3690c.clear();
        }
        if (!this.f3691d.isEmpty()) {
            this.f3691d.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f3691d.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k, V v) {
        k();
        int b2 = b(k);
        if (b2 >= 0) {
            return this.f3690c.get(b2).setValue(v);
        }
        k();
        if (this.f3690c.isEmpty() && !(this.f3690c instanceof ArrayList)) {
            this.f3690c = new ArrayList(this.f3689b);
        }
        int i = -(b2 + 1);
        if (i >= this.f3689b) {
            return l().put(k, v);
        }
        int size = this.f3690c.size();
        int i2 = this.f3689b;
        if (size == i2) {
            j80 remove = this.f3690c.remove(i2 - 1);
            l().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f3690c.add(i, new j80(this, k, v));
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f3693f == null) {
            this.f3693f = new l80(this, (d80) null);
        }
        return this.f3693f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e80)) {
            return super.equals(obj);
        }
        e80 e80 = (e80) obj;
        int size = size();
        if (size != e80.size()) {
            return false;
        }
        int h2 = h();
        if (h2 != e80.h()) {
            return entrySet().equals(e80.entrySet());
        }
        for (int i = 0; i < h2; i++) {
            if (!p(i).equals(e80.p(i))) {
                return false;
            }
        }
        if (h2 != size) {
            return this.f3691d.equals(e80.f3691d);
        }
        return true;
    }

    public void g() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f3692e) {
            if (this.f3691d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f3691d);
            }
            this.f3691d = map;
            if (this.g.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.g);
            }
            this.g = map2;
            this.f3692e = true;
        }
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        if (b2 >= 0) {
            return this.f3690c.get(b2).getValue();
        }
        return this.f3691d.get(comparable);
    }

    public final int h() {
        return this.f3690c.size();
    }

    public int hashCode() {
        int h2 = h();
        int i = 0;
        for (int i2 = 0; i2 < h2; i2++) {
            i += this.f3690c.get(i2).hashCode();
        }
        return this.f3691d.size() > 0 ? i + this.f3691d.hashCode() : i;
    }

    public final Iterable<Map.Entry<K, V>> i() {
        if (this.f3691d.isEmpty()) {
            return i80.a();
        }
        return this.f3691d.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> j() {
        if (this.h == null) {
            this.h = new f80(this, (d80) null);
        }
        return this.h;
    }

    public final Map.Entry<K, V> p(int i) {
        return this.f3690c.get(i);
    }

    public V remove(Object obj) {
        k();
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        if (b2 >= 0) {
            return q(b2);
        }
        if (this.f3691d.isEmpty()) {
            return null;
        }
        return this.f3691d.remove(comparable);
    }

    public int size() {
        return this.f3690c.size() + this.f3691d.size();
    }

    /* synthetic */ e80(int i, d80 d80) {
        this(i);
    }
}
