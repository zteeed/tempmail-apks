package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqz implements zzela<zzbyg<zzbsp>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzckl> f6739a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6740b;

    private zzbqz(zzelj<zzckl> zzelj, zzelj<Executor> zzelj2) {
        this.f6739a = zzelj;
        this.f6740b = zzelj2;
    }

    public static zzbqz a(zzelj<zzckl> zzelj, zzelj<Executor> zzelj2) {
        return new zzbqz(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6739a.get(), this.f6740b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
