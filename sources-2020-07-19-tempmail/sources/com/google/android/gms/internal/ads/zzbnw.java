package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbnw implements zzela<zzbyg<zzbwd>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbus> f6439a;

    public zzbnw(zzbnj zzbnj, zzelj<zzbus> zzelj) {
        this.f6439a = zzelj;
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(new jc(this.f6439a.get()), zzbbf.f6142f);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}