package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzckr implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzckn> f7351a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7352b;

    private zzckr(zzelj<zzckn> zzelj, zzelj<Executor> zzelj2) {
        this.f7351a = zzelj;
        this.f7352b = zzelj2;
    }

    public static zzckr a(zzelj<zzckn> zzelj, zzelj<Executor> zzelj2) {
        return new zzckr(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7351a.get(), this.f7352b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
