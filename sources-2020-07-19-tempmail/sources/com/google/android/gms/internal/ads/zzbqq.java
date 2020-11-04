package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqq implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzblk> f6538a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6539b;

    private zzbqq(zzelj<zzblk> zzelj, zzelj<Executor> zzelj2) {
        this.f6538a = zzelj;
        this.f6539b = zzelj2;
    }

    public static zzbyg<zzbua> a(zzblk zzblk, Executor executor) {
        zzbyg<zzbua> zzbyg = new zzbyg<>(zzblk, executor);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }

    public static zzbqq b(zzelj<zzblk> zzelj, zzelj<Executor> zzelj2) {
        return new zzbqq(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return a(this.f6538a.get(), this.f6539b.get());
    }
}
