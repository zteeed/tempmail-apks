package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdab implements zzela<zzdaa> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Executor> f7766a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzaxh> f7767b;

    private zzdab(zzelj<Executor> zzelj, zzelj<zzaxh> zzelj2) {
        this.f7766a = zzelj;
        this.f7767b = zzelj2;
    }

    public static zzdaa a(Executor executor, zzaxh zzaxh) {
        return new zzdaa(executor, zzaxh);
    }

    public static zzdab b(zzelj<Executor> zzelj, zzelj<zzaxh> zzelj2) {
        return new zzdab(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return a(this.f7766a.get(), this.f7767b.get());
    }
}
