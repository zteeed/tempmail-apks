package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqo implements zzela<zzbyg<zzbsl>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzblk> f6534a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6535b;

    private zzbqo(zzelj<zzblk> zzelj, zzelj<Executor> zzelj2) {
        this.f6534a = zzelj;
        this.f6535b = zzelj2;
    }

    public static zzbqo a(zzelj<zzblk> zzelj, zzelj<Executor> zzelj2) {
        return new zzbqo(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6534a.get(), this.f6535b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
