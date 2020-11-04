package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcmu implements zzela<zzbyg<zzbva>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<am> f7439a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7440b;

    private zzcmu(zzelj<am> zzelj, zzelj<Executor> zzelj2) {
        this.f7439a = zzelj;
        this.f7440b = zzelj2;
    }

    public static zzcmu a(zzelj<am> zzelj, zzelj<Executor> zzelj2) {
        return new zzcmu(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7439a.get(), this.f7440b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
