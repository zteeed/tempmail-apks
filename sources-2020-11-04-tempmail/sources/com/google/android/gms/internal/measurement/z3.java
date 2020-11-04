package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class z3 implements Comparable<z3>, Map.Entry<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private final K f9720b;

    /* renamed from: c  reason: collision with root package name */
    private V f9721c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ q3 f9722d;

    z3(q3 q3Var, Map.Entry<K, V> entry) {
        this(q3Var, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((z3) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return f(this.f9720b, entry.getKey()) && f(this.f9721c, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f9720b;
    }

    public final V getValue() {
        return this.f9721c;
    }

    public final int hashCode() {
        K k = this.f9720b;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f9721c;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f9722d.p();
        V v2 = this.f9721c;
        this.f9721c = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9720b);
        String valueOf2 = String.valueOf(this.f9721c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    z3(q3 q3Var, K k, V v) {
        this.f9722d = q3Var;
        this.f9720b = k;
        this.f9721c = v;
    }
}
