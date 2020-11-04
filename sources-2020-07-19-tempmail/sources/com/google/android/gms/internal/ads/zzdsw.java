package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public abstract class zzdsw<K, V> implements Serializable, Map<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private transient zzdsz<Map.Entry<K, V>> f8368b;

    /* renamed from: c  reason: collision with root package name */
    private transient zzdsz<K> f8369c;

    /* renamed from: d  reason: collision with root package name */
    private transient zzdsr<V> f8370d;

    zzdsw() {
    }

    public static <K, V> zzdsw<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        jz.a(k, v);
        jz.a(k2, v2);
        jz.a(k3, v3);
        jz.a(k4, v4);
        jz.a(k5, v5);
        return tz.g(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    public static <K, V> zzdsw<K, V> e(K k, V v) {
        jz.a(k, v);
        return tz.g(1, new Object[]{k, v});
    }

    /* access modifiers changed from: package-private */
    public abstract zzdsz<Map.Entry<K, V>> b();

    /* access modifiers changed from: package-private */
    public abstract zzdsz<K> c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return ((zzdsr) values()).contains(obj);
    }

    /* access modifiers changed from: package-private */
    public abstract zzdsr<V> d();

    public /* synthetic */ Set entrySet() {
        zzdsz<Map.Entry<K, V>> zzdsz = this.f8368b;
        if (zzdsz != null) {
            return zzdsz;
        }
        zzdsz<Map.Entry<K, V>> b2 = b();
        this.f8368b = b2;
        return b2;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract V get(@NullableDecl Object obj);

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return zzdtl.b((zzdsz) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public /* synthetic */ Set keySet() {
        zzdsz<K> zzdsz = this.f8369c;
        if (zzdsz != null) {
            return zzdsz;
        }
        zzdsz<K> c2 = c();
        this.f8369c = c2;
        return c2;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        jz.b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ Collection values() {
        zzdsr<V> zzdsr = this.f8370d;
        if (zzdsr != null) {
            return zzdsr;
        }
        zzdsr<V> d2 = d();
        this.f8370d = d2;
        return d2;
    }
}
