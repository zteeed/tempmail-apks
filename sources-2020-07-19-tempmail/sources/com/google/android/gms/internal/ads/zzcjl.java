package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcjl implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcjq> f7129a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7130b;

    private zzcjl(zzelj<zzcjq> zzelj, zzelj<Executor> zzelj2) {
        this.f7129a = zzelj;
        this.f7130b = zzelj2;
    }

    public static zzcjl a(zzelj<zzcjq> zzelj, zzelj<Executor> zzelj2) {
        return new zzcjl(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7129a.get(), this.f7130b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
