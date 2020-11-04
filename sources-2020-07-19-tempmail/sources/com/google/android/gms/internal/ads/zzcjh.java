package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcjh implements zzela<zzbyg<zzuu>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcjq> f7121a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7122b;

    private zzcjh(zzelj<zzcjq> zzelj, zzelj<Executor> zzelj2) {
        this.f7121a = zzelj;
        this.f7122b = zzelj2;
    }

    public static zzcjh a(zzelj<zzcjq> zzelj, zzelj<Executor> zzelj2) {
        return new zzcjh(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7121a.get(), this.f7122b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
