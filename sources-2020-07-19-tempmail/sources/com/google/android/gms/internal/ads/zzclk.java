package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzclk implements zzela<Set<zzbyg<zzbsl>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzclv> f7205a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7206b;

    private zzclk(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        this.f7205a = zzelj;
        this.f7206b = zzelj2;
    }

    public static zzclk a(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        return new zzclk(zzcll, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<zzbsl>> f2 = zzcll.f(this.f7205a.get(), this.f7206b.get());
        zzelg.b(f2, "Cannot return null from a non-@Nullable @Provides method");
        return f2;
    }
}
