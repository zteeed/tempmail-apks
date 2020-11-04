package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcpu implements zzela<zzbyg<zzdpa>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcqg> f7345a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7346b;

    private zzcpu(zzelj<zzcqg> zzelj, zzelj<Executor> zzelj2) {
        this.f7345a = zzelj;
        this.f7346b = zzelj2;
    }

    public static zzcpu a(zzelj<zzcqg> zzelj, zzelj<Executor> zzelj2) {
        return new zzcpu(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7345a.get(), this.f7346b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
