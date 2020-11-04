package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbpw implements zzela<zzbyg<zzbuf>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbuo> f6694a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6695b;

    private zzbpw(zzelj<zzbuo> zzelj, zzelj<Executor> zzelj2) {
        this.f6694a = zzelj;
        this.f6695b = zzelj2;
    }

    public static zzbpw a(zzelj<zzbuo> zzelj, zzelj<Executor> zzelj2) {
        return new zzbpw(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6694a.get(), this.f6695b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
