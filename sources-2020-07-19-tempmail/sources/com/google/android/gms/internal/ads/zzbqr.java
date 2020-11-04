package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqr implements zzela<zzbyg<zzbtd>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzblk> f6540a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6541b;

    private zzbqr(zzelj<zzblk> zzelj, zzelj<Executor> zzelj2) {
        this.f6540a = zzelj;
        this.f6541b = zzelj2;
    }

    public static zzbqr a(zzelj<zzblk> zzelj, zzelj<Executor> zzelj2) {
        return new zzbqr(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6540a.get(), this.f6541b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
