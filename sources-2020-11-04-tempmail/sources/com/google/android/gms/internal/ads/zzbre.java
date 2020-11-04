package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbre implements zzela<zzbyg<zzbtd>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzckl> f6748a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6749b;

    private zzbre(zzelj<zzckl> zzelj, zzelj<Executor> zzelj2) {
        this.f6748a = zzelj;
        this.f6749b = zzelj2;
    }

    public static zzbre a(zzelj<zzckl> zzelj, zzelj<Executor> zzelj2) {
        return new zzbre(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6748a.get(), this.f6749b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
