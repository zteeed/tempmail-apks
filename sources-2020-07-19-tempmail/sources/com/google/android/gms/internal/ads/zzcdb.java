package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcdb implements zzela<zzbyg<zzbup>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcww> f6864a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6865b;

    private zzcdb(zzelj<zzcww> zzelj, zzelj<Executor> zzelj2) {
        this.f6864a = zzelj;
        this.f6865b = zzelj2;
    }

    public static zzcdb a(zzelj<zzcww> zzelj, zzelj<Executor> zzelj2) {
        return new zzcdb(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6864a.get(), this.f6865b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
