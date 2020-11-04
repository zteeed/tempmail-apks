package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcmu implements zzela<zzbyg<zzbva>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<am> f7256a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7257b;

    private zzcmu(zzelj<am> zzelj, zzelj<Executor> zzelj2) {
        this.f7256a = zzelj;
        this.f7257b = zzelj2;
    }

    public static zzcmu a(zzelj<am> zzelj, zzelj<Executor> zzelj2) {
        return new zzcmu(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7256a.get(), this.f7257b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
