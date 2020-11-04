package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcjr implements zzela<Set<zzbyg<zzdpa>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Executor> f7133a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzckh> f7134b;

    private zzcjr(zzelj<Executor> zzelj, zzelj<zzckh> zzelj2) {
        this.f7133a = zzelj;
        this.f7134b = zzelj2;
    }

    public static zzcjr a(zzelj<Executor> zzelj, zzelj<zzckh> zzelj2) {
        return new zzcjr(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        Set set;
        Executor executor = this.f7133a.get();
        zzckh zzckh = this.f7134b.get();
        if (((Boolean) zzwg.e().c(zzaav.i2)).booleanValue()) {
            set = Collections.singleton(new zzbyg(zzckh, executor));
        } else {
            set = Collections.emptySet();
        }
        zzelg.b(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
