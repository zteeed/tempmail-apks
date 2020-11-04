package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcjk implements zzela<zzbyg<zzbva>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcjq> f7127a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7128b;

    private zzcjk(zzelj<zzcjq> zzelj, zzelj<Executor> zzelj2) {
        this.f7127a = zzelj;
        this.f7128b = zzelj2;
    }

    public static zzcjk a(zzelj<zzcjq> zzelj, zzelj<Executor> zzelj2) {
        return new zzcjk(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7127a.get(), this.f7128b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
