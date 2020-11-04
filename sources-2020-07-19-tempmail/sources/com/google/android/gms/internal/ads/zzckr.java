package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzckr implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzckn> f7168a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7169b;

    private zzckr(zzelj<zzckn> zzelj, zzelj<Executor> zzelj2) {
        this.f7168a = zzelj;
        this.f7169b = zzelj2;
    }

    public static zzckr a(zzelj<zzckn> zzelj, zzelj<Executor> zzelj2) {
        return new zzckr(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7168a.get(), this.f7169b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
