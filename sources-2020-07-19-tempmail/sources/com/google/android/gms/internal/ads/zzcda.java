package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcda implements zzela<zzavv> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6862a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdla> f6863b;

    private zzcda(zzccw zzccw, zzelj<Context> zzelj, zzelj<zzdla> zzelj2) {
        this.f6862a = zzelj;
        this.f6863b = zzelj2;
    }

    public static zzcda a(zzccw zzccw, zzelj<Context> zzelj, zzelj<zzdla> zzelj2) {
        return new zzcda(zzccw, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzavv zzavv = new zzavv(this.f6862a.get(), this.f6863b.get().f8168f);
        zzelg.b(zzavv, "Cannot return null from a non-@Nullable @Provides method");
        return zzavv;
    }
}
