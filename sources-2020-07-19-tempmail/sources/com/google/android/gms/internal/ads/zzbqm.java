package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqm implements zzela<zzbyg<zzbyp>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbyo> f6530a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6531b;

    private zzbqm(zzelj<zzbyo> zzelj, zzelj<Executor> zzelj2) {
        this.f6530a = zzelj;
        this.f6531b = zzelj2;
    }

    public static zzbqm a(zzelj<zzbyo> zzelj, zzelj<Executor> zzelj2) {
        return new zzbqm(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6530a.get(), this.f6531b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
