package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzckq implements zzela<zzbyg<zzdpa>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzclb> f7349a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7350b;

    private zzckq(zzelj<zzclb> zzelj, zzelj<Executor> zzelj2) {
        this.f7349a = zzelj;
        this.f7350b = zzelj2;
    }

    public static zzckq a(zzelj<zzclb> zzelj, zzelj<Executor> zzelj2) {
        return new zzckq(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7349a.get(), this.f7350b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
