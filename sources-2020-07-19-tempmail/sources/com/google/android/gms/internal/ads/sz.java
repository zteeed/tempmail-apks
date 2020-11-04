package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class sz<K, V> extends zzdsz<Map.Entry<K, V>> {

    /* renamed from: d  reason: collision with root package name */
    private final transient zzdsw<K, V> f4935d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final transient Object[] f4936e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final transient int f4937f;

    sz(zzdsw<K, V> zzdsw, Object[] objArr, int i, int i2) {
        this.f4935d = zzdsw;
        this.f4936e = objArr;
        this.f4937f = i2;
    }

    /* access modifiers changed from: package-private */
    public final int c(Object[] objArr, int i) {
        return m().c(objArr, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f4935d.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final zzdtn<Map.Entry<K, V>> iterator() {
        return (zzdtn) m().iterator();
    }

    /* access modifiers changed from: package-private */
    public final boolean q() {
        return true;
    }

    public final int size() {
        return this.f4937f;
    }

    /* access modifiers changed from: package-private */
    public final zzdss<Map.Entry<K, V>> y() {
        return new vz(this);
    }
}
