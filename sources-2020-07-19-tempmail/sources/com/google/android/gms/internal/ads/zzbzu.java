package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbzu implements zzela<zzavv> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6726a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdla> f6727b;

    private zzbzu(zzbzk zzbzk, zzelj<Context> zzelj, zzelj<zzdla> zzelj2) {
        this.f6726a = zzelj;
        this.f6727b = zzelj2;
    }

    public static zzbzu a(zzbzk zzbzk, zzelj<Context> zzelj, zzelj<zzdla> zzelj2) {
        return new zzbzu(zzbzk, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzavv zzavv = new zzavv(this.f6726a.get(), this.f6727b.get().f8168f);
        zzelg.b(zzavv, "Cannot return null from a non-@Nullable @Provides method");
        return zzavv;
    }
}
