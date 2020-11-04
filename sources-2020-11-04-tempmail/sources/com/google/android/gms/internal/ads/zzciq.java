package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzciq implements zzela<zzbyg<zzbtg>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcip> f7286a;

    private zzciq(zzcir zzcir, zzelj<zzcip> zzelj) {
        this.f7286a = zzelj;
    }

    public static zzciq a(zzcir zzcir, zzelj<zzcip> zzelj) {
        return new zzciq(zzcir, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7286a.get(), zzbbf.f6324e);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
