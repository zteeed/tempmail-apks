package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbzt implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcao> f6908a;

    private zzbzt(zzbzk zzbzk, zzelj<zzcao> zzelj) {
        this.f6908a = zzelj;
    }

    public static zzbzt a(zzbzk zzbzk, zzelj<zzcao> zzelj) {
        return new zzbzt(zzbzk, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6908a.get(), zzbbf.f6324e);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
