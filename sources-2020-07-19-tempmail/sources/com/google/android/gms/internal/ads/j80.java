package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class j80 implements Comparable<j80>, Map.Entry<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private final K f4112b;

    /* renamed from: c  reason: collision with root package name */
    private V f4113c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ e80 f4114d;

    j80(e80 e80, Map.Entry<K, V> entry) {
        this(e80, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((j80) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return f(this.f4112b, entry.getKey()) && f(this.f4113c, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f4112b;
    }

    public final V getValue() {
        return this.f4113c;
    }

    public final int hashCode() {
        K k = this.f4112b;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f4113c;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f4114d.k();
        V v2 = this.f4113c;
        this.f4113c = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4112b);
        String valueOf2 = String.valueOf(this.f4113c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    j80(e80 e80, K k, V v) {
        this.f4114d = e80;
        this.f4112b = k;
        this.f4113c = v;
    }
}
