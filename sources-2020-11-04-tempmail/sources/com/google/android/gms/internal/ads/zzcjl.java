package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcjl implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcjq> f7312a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7313b;

    private zzcjl(zzelj<zzcjq> zzelj, zzelj<Executor> zzelj2) {
        this.f7312a = zzelj;
        this.f7313b = zzelj2;
    }

    public static zzcjl a(zzelj<zzcjq> zzelj, zzelj<Executor> zzelj2) {
        return new zzcjl(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7312a.get(), this.f7313b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
