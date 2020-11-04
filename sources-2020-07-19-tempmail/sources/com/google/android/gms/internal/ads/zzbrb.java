package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbrb implements zzela<zzbyg<zzbtd>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbuz> f6560a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6561b;

    private zzbrb(zzelj<zzbuz> zzelj, zzelj<Executor> zzelj2) {
        this.f6560a = zzelj;
        this.f6561b = zzelj2;
    }

    public static zzbrb a(zzelj<zzbuz> zzelj, zzelj<Executor> zzelj2) {
        return new zzbrb(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6560a.get(), this.f6561b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
