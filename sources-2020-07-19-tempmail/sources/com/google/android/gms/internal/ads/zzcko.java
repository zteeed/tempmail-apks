package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcko implements zzela<zzbyg<zzbsq>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzckn> f7162a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7163b;

    private zzcko(zzelj<zzckn> zzelj, zzelj<Executor> zzelj2) {
        this.f7162a = zzelj;
        this.f7163b = zzelj2;
    }

    public static zzcko a(zzelj<zzckn> zzelj, zzelj<Executor> zzelj2) {
        return new zzcko(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7162a.get(), this.f7163b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
