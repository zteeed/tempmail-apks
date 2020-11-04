package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcjg implements zzela<zzbyg<zzbsq>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcjq> f7119a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7120b;

    private zzcjg(zzelj<zzcjq> zzelj, zzelj<Executor> zzelj2) {
        this.f7119a = zzelj;
        this.f7120b = zzelj2;
    }

    public static zzcjg a(zzelj<zzcjq> zzelj, zzelj<Executor> zzelj2) {
        return new zzcjg(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7119a.get(), this.f7120b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
