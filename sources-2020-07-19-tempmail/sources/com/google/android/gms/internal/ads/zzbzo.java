package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbzo implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6717a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbbd> f6718b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdkk> f6719c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzdla> f6720d;

    private zzbzo(zzbzk zzbzk, zzelj<Context> zzelj, zzelj<zzbbd> zzelj2, zzelj<zzdkk> zzelj3, zzelj<zzdla> zzelj4) {
        this.f6717a = zzelj;
        this.f6718b = zzelj2;
        this.f6719c = zzelj3;
        this.f6720d = zzelj4;
    }

    public static zzbzo a(zzbzk zzbzk, zzelj<Context> zzelj, zzelj<zzbbd> zzelj2, zzelj<zzdkk> zzelj3, zzelj<zzdla> zzelj4) {
        return new zzbzo(zzbzk, zzelj, zzelj2, zzelj3, zzelj4);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(new mg(this.f6717a.get(), this.f6718b.get(), this.f6719c.get(), this.f6720d.get()), zzbbf.f6142f);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
