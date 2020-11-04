package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqp implements zzela<zzbyg<zzuu>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzblk> f6536a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6537b;

    private zzbqp(zzelj<zzblk> zzelj, zzelj<Executor> zzelj2) {
        this.f6536a = zzelj;
        this.f6537b = zzelj2;
    }

    public static zzbqp a(zzelj<zzblk> zzelj, zzelj<Executor> zzelj2) {
        return new zzbqp(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6536a.get(), this.f6537b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
