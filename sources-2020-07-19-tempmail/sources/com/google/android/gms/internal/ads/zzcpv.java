package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcpv implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcqd> f7347a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7348b;

    private zzcpv(zzelj<zzcqd> zzelj, zzelj<Executor> zzelj2) {
        this.f7347a = zzelj;
        this.f7348b = zzelj2;
    }

    public static zzcpv a(zzelj<zzcqd> zzelj, zzelj<Executor> zzelj2) {
        return new zzcpv(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7347a.get(), this.f7348b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
