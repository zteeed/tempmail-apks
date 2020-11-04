package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcps implements zzela<zzbyg<zzbsq>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcqd> f7522a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7523b;

    private zzcps(zzelj<zzcqd> zzelj, zzelj<Executor> zzelj2) {
        this.f7522a = zzelj;
        this.f7523b = zzelj2;
    }

    public static zzcps a(zzelj<zzcqd> zzelj, zzelj<Executor> zzelj2) {
        return new zzcps(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7522a.get(), this.f7523b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
