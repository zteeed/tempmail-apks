package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbpx implements zzela<zzbyg<zzbtd>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbuo> f6696a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6697b;

    private zzbpx(zzelj<zzbuo> zzelj, zzelj<Executor> zzelj2) {
        this.f6696a = zzelj;
        this.f6697b = zzelj2;
    }

    public static zzbpx a(zzelj<zzbuo> zzelj, zzelj<Executor> zzelj2) {
        return new zzbpx(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6696a.get(), this.f6697b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
