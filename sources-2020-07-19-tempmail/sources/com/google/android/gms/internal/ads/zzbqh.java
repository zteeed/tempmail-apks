package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqh implements zzela<zzbyg<zzbsl>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbqk> f6523a;

    private zzbqh(zzbqf zzbqf, zzelj<zzbqk> zzelj) {
        this.f6523a = zzelj;
    }

    public static zzbqh a(zzbqf zzbqf, zzelj<zzbqk> zzelj) {
        return new zzbqh(zzbqf, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6523a.get(), zzbbf.f6142f);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
