package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqx implements zzela<zzbyg<zzuu>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbuz> f6735a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6736b;

    private zzbqx(zzelj<zzbuz> zzelj, zzelj<Executor> zzelj2) {
        this.f6735a = zzelj;
        this.f6736b = zzelj2;
    }

    public static zzbqx a(zzelj<zzbuz> zzelj, zzelj<Executor> zzelj2) {
        return new zzbqx(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6735a.get(), this.f6736b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
