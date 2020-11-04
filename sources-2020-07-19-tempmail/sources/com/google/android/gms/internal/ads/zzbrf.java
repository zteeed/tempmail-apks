package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbrf implements zzela<zzbyg<zzbwk>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzckl> f6567a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6568b;

    private zzbrf(zzelj<zzckl> zzelj, zzelj<Executor> zzelj2) {
        this.f6567a = zzelj;
        this.f6568b = zzelj2;
    }

    public static zzbrf a(zzelj<zzckl> zzelj, zzelj<Executor> zzelj2) {
        return new zzbrf(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6567a.get(), this.f6568b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
