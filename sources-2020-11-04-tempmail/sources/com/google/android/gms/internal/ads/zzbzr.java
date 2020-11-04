package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbzr implements zzela<Set<zzbyg<zzbsl>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbzk f6905a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcaq> f6906b;

    private zzbzr(zzbzk zzbzk, zzelj<zzcaq> zzelj) {
        this.f6905a = zzbzk;
        this.f6906b = zzelj;
    }

    public static zzbzr a(zzbzk zzbzk, zzelj<zzcaq> zzelj) {
        return new zzbzr(zzbzk, zzelj);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<zzbsl>> a2 = this.f6905a.a(this.f6906b.get());
        zzelg.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
