package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzclp implements zzela<Set<zzbyg<zzbua>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzcll f7211a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzclv> f7212b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Executor> f7213c;

    private zzclp(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        this.f7211a = zzcll;
        this.f7212b = zzelj;
        this.f7213c = zzelj2;
    }

    public static Set<zzbyg<zzbua>> a(zzcll zzcll, zzclv zzclv, Executor executor) {
        Set<zzbyg<zzbua>> c2 = zzcll.c(zzclv, executor);
        zzelg.b(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    public static zzclp b(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        return new zzclp(zzcll, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return a(this.f7211a, this.f7212b.get(), this.f7213c.get());
    }
}
