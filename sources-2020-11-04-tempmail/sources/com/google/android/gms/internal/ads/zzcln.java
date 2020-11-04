package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcln implements zzela<Set<zzbyg<zzbsq>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzclv> f7392a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7393b;

    private zzcln(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        this.f7392a = zzelj;
        this.f7393b = zzelj2;
    }

    public static zzcln a(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        return new zzcln(zzcll, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<zzbsq>> e2 = zzcll.e(this.f7392a.get(), this.f7393b.get());
        zzelg.b(e2, "Cannot return null from a non-@Nullable @Provides method");
        return e2;
    }
}
