package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcjj implements zzela<zzbyg<zzbtd>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcjq> f7308a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7309b;

    private zzcjj(zzelj<zzcjq> zzelj, zzelj<Executor> zzelj2) {
        this.f7308a = zzelj;
        this.f7309b = zzelj2;
    }

    public static zzcjj a(zzelj<zzcjq> zzelj, zzelj<Executor> zzelj2) {
        return new zzcjj(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7308a.get(), this.f7309b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
