package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbra implements zzela<zzbyg<zzbuf>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbuz> f6558a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6559b;

    private zzbra(zzelj<zzbuz> zzelj, zzelj<Executor> zzelj2) {
        this.f6558a = zzelj;
        this.f6559b = zzelj2;
    }

    public static zzbra a(zzelj<zzbuz> zzelj, zzelj<Executor> zzelj2) {
        return new zzbra(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6558a.get(), this.f6559b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
