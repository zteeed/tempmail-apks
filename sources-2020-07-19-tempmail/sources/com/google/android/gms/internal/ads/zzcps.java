package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcps implements zzela<zzbyg<zzbsq>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcqd> f7339a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7340b;

    private zzcps(zzelj<zzcqd> zzelj, zzelj<Executor> zzelj2) {
        this.f7339a = zzelj;
        this.f7340b = zzelj2;
    }

    public static zzcps a(zzelj<zzcqd> zzelj, zzelj<Executor> zzelj2) {
        return new zzcps(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7339a.get(), this.f7340b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
