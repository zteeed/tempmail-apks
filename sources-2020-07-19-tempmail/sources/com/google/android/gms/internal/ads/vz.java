package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class vz extends zzdss<Map.Entry<K, V>> {

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ sz f5168d;

    vz(sz szVar) {
        this.f5168d = szVar;
    }

    public final /* synthetic */ Object get(int i) {
        zzdsh.g(i, this.f5168d.f4937f);
        int i2 = i * 2;
        return new AbstractMap.SimpleImmutableEntry(this.f5168d.f4936e[i2], this.f5168d.f4936e[i2 + 1]);
    }

    public final boolean q() {
        return true;
    }

    public final int size() {
        return this.f5168d.f4937f;
    }
}
