package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbzo implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6900a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbbd> f6901b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdkk> f6902c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzdla> f6903d;

    private zzbzo(zzbzk zzbzk, zzelj<Context> zzelj, zzelj<zzbbd> zzelj2, zzelj<zzdkk> zzelj3, zzelj<zzdla> zzelj4) {
        this.f6900a = zzelj;
        this.f6901b = zzelj2;
        this.f6902c = zzelj3;
        this.f6903d = zzelj4;
    }

    public static zzbzo a(zzbzk zzbzk, zzelj<Context> zzelj, zzelj<zzbbd> zzelj2, zzelj<zzdkk> zzelj3, zzelj<zzdla> zzelj4) {
        return new zzbzo(zzbzk, zzelj, zzelj2, zzelj3, zzelj4);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(new mg(this.f6900a.get(), this.f6901b.get(), this.f6902c.get(), this.f6903d.get()), zzbbf.f6325f);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
