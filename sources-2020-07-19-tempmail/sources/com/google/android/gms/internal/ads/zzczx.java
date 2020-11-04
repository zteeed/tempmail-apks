package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzczx implements zzela<zzczv> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvi> f7762a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdla> f7763b;

    private zzczx(zzelj<zzdvi> zzelj, zzelj<zzdla> zzelj2) {
        this.f7762a = zzelj;
        this.f7763b = zzelj2;
    }

    public static zzczx a(zzelj<zzdvi> zzelj, zzelj<zzdla> zzelj2) {
        return new zzczx(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzczv(this.f7762a.get(), this.f7763b.get());
    }
}
