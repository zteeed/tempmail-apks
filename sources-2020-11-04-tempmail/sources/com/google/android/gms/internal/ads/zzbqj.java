package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqj implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbqk> f6707a;

    private zzbqj(zzbqf zzbqf, zzelj<zzbqk> zzelj) {
        this.f6707a = zzelj;
    }

    public static zzbqj a(zzbqf zzbqf, zzelj<zzbqk> zzelj) {
        return new zzbqj(zzbqf, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6707a.get(), zzbbf.f6325f);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
