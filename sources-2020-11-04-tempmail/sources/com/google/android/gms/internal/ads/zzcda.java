package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcda implements zzela<zzavv> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7045a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdla> f7046b;

    private zzcda(zzccw zzccw, zzelj<Context> zzelj, zzelj<zzdla> zzelj2) {
        this.f7045a = zzelj;
        this.f7046b = zzelj2;
    }

    public static zzcda a(zzccw zzccw, zzelj<Context> zzelj, zzelj<zzdla> zzelj2) {
        return new zzcda(zzccw, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzavv zzavv = new zzavv(this.f7045a.get(), this.f7046b.get().f8351f);
        zzelg.b(zzavv, "Cannot return null from a non-@Nullable @Provides method");
        return zzavv;
    }
}
