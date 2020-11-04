package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcji implements zzela<zzbyg<zzbww>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcjq> f7123a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7124b;

    private zzcji(zzelj<zzcjq> zzelj, zzelj<Executor> zzelj2) {
        this.f7123a = zzelj;
        this.f7124b = zzelj2;
    }

    public static zzcji a(zzelj<zzcjq> zzelj, zzelj<Executor> zzelj2) {
        return new zzcji(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7123a.get(), this.f7124b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
