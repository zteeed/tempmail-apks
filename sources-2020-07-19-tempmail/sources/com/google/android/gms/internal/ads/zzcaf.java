package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcaf implements zzela<zzcac> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbui> f6738a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbyc> f6739b;

    private zzcaf(zzelj<zzbui> zzelj, zzelj<zzbyc> zzelj2) {
        this.f6738a = zzelj;
        this.f6739b = zzelj2;
    }

    public static zzcaf a(zzelj<zzbui> zzelj, zzelj<zzbyc> zzelj2) {
        return new zzcaf(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzcac(this.f6738a.get(), this.f6739b.get());
    }
}
