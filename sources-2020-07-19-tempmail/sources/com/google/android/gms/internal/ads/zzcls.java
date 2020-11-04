package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcls implements zzela<Set<zzbyg<zzdpa>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzclv> f7218a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7219b;

    private zzcls(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        this.f7218a = zzelj;
        this.f7219b = zzelj2;
    }

    public static zzcls a(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        return new zzcls(zzcll, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<zzdpa>> i = zzcll.i(this.f7218a.get(), this.f7219b.get());
        zzelg.b(i, "Cannot return null from a non-@Nullable @Provides method");
        return i;
    }
}
