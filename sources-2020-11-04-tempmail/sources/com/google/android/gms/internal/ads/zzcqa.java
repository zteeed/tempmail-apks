package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcqa implements zzela<zzcpz> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcpx> f7535a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdvi> f7536b;

    private zzcqa(zzelj<zzcpx> zzelj, zzelj<zzdvi> zzelj2) {
        this.f7535a = zzelj;
        this.f7536b = zzelj2;
    }

    public static zzcqa a(zzelj<zzcpx> zzelj, zzelj<zzdvi> zzelj2) {
        return new zzcqa(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzcpz(this.f7535a.get(), this.f7536b.get());
    }
}
