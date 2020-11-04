package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqw implements zzela<zzbyg<zzbsl>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbuz> f6733a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6734b;

    private zzbqw(zzelj<zzbuz> zzelj, zzelj<Executor> zzelj2) {
        this.f6733a = zzelj;
        this.f6734b = zzelj2;
    }

    public static zzbqw a(zzelj<zzbuz> zzelj, zzelj<Executor> zzelj2) {
        return new zzbqw(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6733a.get(), this.f6734b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}