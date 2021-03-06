package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class uz<K> extends zzdsz<K> {

    /* renamed from: d  reason: collision with root package name */
    private final transient zzdsw<K, ?> f5270d;

    /* renamed from: e  reason: collision with root package name */
    private final transient zzdss<K> f5271e;

    uz(zzdsw<K, ?> zzdsw, zzdss<K> zzdss) {
        this.f5270d = zzdsw;
        this.f5271e = zzdss;
    }

    /* access modifiers changed from: package-private */
    public final int c(Object[] objArr, int i) {
        return m().c(objArr, i);
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.f5270d.get(obj) != null;
    }

    /* renamed from: h */
    public final zzdtn<K> iterator() {
        return (zzdtn) m().iterator();
    }

    public final zzdss<K> m() {
        return this.f5271e;
    }

    /* access modifiers changed from: package-private */
    public final boolean q() {
        return true;
    }

    public final int size() {
        return this.f5270d.size();
    }
}
