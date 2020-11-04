package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqj implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbqk> f6524a;

    private zzbqj(zzbqf zzbqf, zzelj<zzbqk> zzelj) {
        this.f6524a = zzelj;
    }

    public static zzbqj a(zzbqf zzbqf, zzelj<zzbqk> zzelj) {
        return new zzbqj(zzbqf, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6524a.get(), zzbbf.f6142f);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
