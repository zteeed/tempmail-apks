package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbrc implements zzela<zzbyg<zzbup>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbuz> f6562a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6563b;

    private zzbrc(zzelj<zzbuz> zzelj, zzelj<Executor> zzelj2) {
        this.f6562a = zzelj;
        this.f6563b = zzelj2;
    }

    public static zzbrc a(zzelj<zzbuz> zzelj, zzelj<Executor> zzelj2) {
        return new zzbrc(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6562a.get(), this.f6563b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
