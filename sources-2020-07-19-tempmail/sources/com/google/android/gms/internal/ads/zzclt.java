package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzclt implements zzela<Set<zzbyg<zzbtd>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzclv> f7220a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7221b;

    private zzclt(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        this.f7220a = zzelj;
        this.f7221b = zzelj2;
    }

    public static zzclt a(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        return new zzclt(zzcll, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<zzbtd>> g = zzcll.g(this.f7220a.get(), this.f7221b.get());
        zzelg.b(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }
}
