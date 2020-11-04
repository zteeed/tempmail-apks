package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField */
public class k extends l {

    /* renamed from: d  reason: collision with root package name */
    private final m f11597d;

    /* compiled from: LazyField */
    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: b  reason: collision with root package name */
        private Map.Entry<K, k> f11598b;

        public K getKey() {
            return this.f11598b.getKey();
        }

        public Object getValue() {
            k value = this.f11598b.getValue();
            if (value == null) {
                return null;
            }
            return value.d();
        }

        public Object setValue(Object obj) {
            if (obj instanceof m) {
                return this.f11598b.getValue().c((m) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, k> entry) {
            this.f11598b = entry;
        }
    }

    /* compiled from: LazyField */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: b  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f11599b;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f11599b = it;
        }

        /* renamed from: b */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f11599b.next();
            return next.getValue() instanceof k ? new b(next) : next;
        }

        public boolean hasNext() {
            return this.f11599b.hasNext();
        }

        public void remove() {
            this.f11599b.remove();
        }
    }

    public m d() {
        return b(this.f11597d);
    }

    public boolean equals(Object obj) {
        return d().equals(obj);
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return d().toString();
    }
}
