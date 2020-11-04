package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbns implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbnj f6433a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzboq> f6434b;

    public zzbns(zzbnj zzbnj, zzelj<zzboq> zzelj) {
        this.f6433a = zzbnj;
        this.f6434b = zzelj;
    }

    public static zzbyg<zzbua> a(zzbnj zzbnj, zzboq zzboq) {
        zzbyg<zzbua> zzbyg = new zzbyg<>(zzboq, zzbbf.f6141e);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }

    public final /* synthetic */ Object get() {
        return a(this.f6433a, this.f6434b.get());
    }
}
