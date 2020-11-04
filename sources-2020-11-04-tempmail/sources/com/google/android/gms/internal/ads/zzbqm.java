package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqm implements zzela<zzbyg<zzbyp>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbyo> f6713a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6714b;

    private zzbqm(zzelj<zzbyo> zzelj, zzelj<Executor> zzelj2) {
        this.f6713a = zzelj;
        this.f6714b = zzelj2;
    }

    public static zzbqm a(zzelj<zzbyo> zzelj, zzelj<Executor> zzelj2) {
        return new zzbqm(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6713a.get(), this.f6714b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
