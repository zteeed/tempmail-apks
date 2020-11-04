package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqz implements zzela<zzbyg<zzbsp>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzckl> f6556a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6557b;

    private zzbqz(zzelj<zzckl> zzelj, zzelj<Executor> zzelj2) {
        this.f6556a = zzelj;
        this.f6557b = zzelj2;
    }

    public static zzbqz a(zzelj<zzckl> zzelj, zzelj<Executor> zzelj2) {
        return new zzbqz(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6556a.get(), this.f6557b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
