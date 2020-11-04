package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbzu implements zzela<zzavv> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6909a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdla> f6910b;

    private zzbzu(zzbzk zzbzk, zzelj<Context> zzelj, zzelj<zzdla> zzelj2) {
        this.f6909a = zzelj;
        this.f6910b = zzelj2;
    }

    public static zzbzu a(zzbzk zzbzk, zzelj<Context> zzelj, zzelj<zzdla> zzelj2) {
        return new zzbzu(zzbzk, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzavv zzavv = new zzavv(this.f6909a.get(), this.f6910b.get().f8351f);
        zzelg.b(zzavv, "Cannot return null from a non-@Nullable @Provides method");
        return zzavv;
    }
}
