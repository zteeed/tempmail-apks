package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdab implements zzela<zzdaa> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Executor> f7949a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzaxh> f7950b;

    private zzdab(zzelj<Executor> zzelj, zzelj<zzaxh> zzelj2) {
        this.f7949a = zzelj;
        this.f7950b = zzelj2;
    }

    public static zzdaa a(Executor executor, zzaxh zzaxh) {
        return new zzdaa(executor, zzaxh);
    }

    public static zzdab b(zzelj<Executor> zzelj, zzelj<zzaxh> zzelj2) {
        return new zzdab(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return a(this.f7949a.get(), this.f7950b.get());
    }
}
