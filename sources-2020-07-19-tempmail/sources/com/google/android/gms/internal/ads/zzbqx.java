package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqx implements zzela<zzbyg<zzuu>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbuz> f6552a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6553b;

    private zzbqx(zzelj<zzbuz> zzelj, zzelj<Executor> zzelj2) {
        this.f6552a = zzelj;
        this.f6553b = zzelj2;
    }

    public static zzbqx a(zzelj<zzbuz> zzelj, zzelj<Executor> zzelj2) {
        return new zzbqx(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6552a.get(), this.f6553b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
