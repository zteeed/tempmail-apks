package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbzw implements zzela<zzbyg<zzbsl>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcau> f6912a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6913b;

    private zzbzw(zzbzk zzbzk, zzelj<zzcau> zzelj, zzelj<Executor> zzelj2) {
        this.f6912a = zzelj;
        this.f6913b = zzelj2;
    }

    public static zzbzw a(zzbzk zzbzk, zzelj<zzcau> zzelj, zzelj<Executor> zzelj2) {
        return new zzbzw(zzbzk, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6912a.get(), this.f6913b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
