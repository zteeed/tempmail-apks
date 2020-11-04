package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqy implements zzela<zzbyg<zzbsz>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbuz> f6737a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6738b;

    private zzbqy(zzelj<zzbuz> zzelj, zzelj<Executor> zzelj2) {
        this.f6737a = zzelj;
        this.f6738b = zzelj2;
    }

    public static zzbqy a(zzelj<zzbuz> zzelj, zzelj<Executor> zzelj2) {
        return new zzbqy(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6737a.get(), this.f6738b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
