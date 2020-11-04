package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqr implements zzela<zzbyg<zzbtd>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzblk> f6723a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6724b;

    private zzbqr(zzelj<zzblk> zzelj, zzelj<Executor> zzelj2) {
        this.f6723a = zzelj;
        this.f6724b = zzelj2;
    }

    public static zzbqr a(zzelj<zzblk> zzelj, zzelj<Executor> zzelj2) {
        return new zzbqr(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6723a.get(), this.f6724b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
