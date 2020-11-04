package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqg implements zzela<zzbyg<zzbtd>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbqk> f6522a;

    private zzbqg(zzbqf zzbqf, zzelj<zzbqk> zzelj) {
        this.f6522a = zzelj;
    }

    public static zzbqg a(zzbqf zzbqf, zzelj<zzbqk> zzelj) {
        return new zzbqg(zzbqf, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6522a.get(), zzbbf.f6142f);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
