package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbzr implements zzela<Set<zzbyg<zzbsl>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbzk f6722a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcaq> f6723b;

    private zzbzr(zzbzk zzbzk, zzelj<zzcaq> zzelj) {
        this.f6722a = zzbzk;
        this.f6723b = zzelj;
    }

    public static zzbzr a(zzbzk zzbzk, zzelj<zzcaq> zzelj) {
        return new zzbzr(zzbzk, zzelj);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<zzbsl>> a2 = this.f6722a.a(this.f6723b.get());
        zzelg.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
