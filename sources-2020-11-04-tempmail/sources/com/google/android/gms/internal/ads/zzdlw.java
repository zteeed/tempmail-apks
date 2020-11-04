package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdlw implements zzela<zzbyg<zzbsq>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdlv> f8372a;

    private zzdlw(zzdlt zzdlt, zzelj<zzdlv> zzelj) {
        this.f8372a = zzelj;
    }

    public static zzdlw a(zzdlt zzdlt, zzelj<zzdlv> zzelj) {
        return new zzdlw(zzdlt, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f8372a.get(), zzbbf.f6325f);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
