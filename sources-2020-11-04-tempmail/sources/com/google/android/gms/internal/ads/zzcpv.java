package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcpv implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcqd> f7530a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7531b;

    private zzcpv(zzelj<zzcqd> zzelj, zzelj<Executor> zzelj2) {
        this.f7530a = zzelj;
        this.f7531b = zzelj2;
    }

    public static zzcpv a(zzelj<zzcqd> zzelj, zzelj<Executor> zzelj2) {
        return new zzcpv(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7530a.get(), this.f7531b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
