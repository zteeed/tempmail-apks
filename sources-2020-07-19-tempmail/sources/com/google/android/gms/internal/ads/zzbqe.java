package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqe implements zzela<zzbyg<zzuu>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbqk> f6521a;

    private zzbqe(zzbqf zzbqf, zzelj<zzbqk> zzelj) {
        this.f6521a = zzelj;
    }

    public static zzbqe a(zzbqf zzbqf, zzelj<zzbqk> zzelj) {
        return new zzbqe(zzbqf, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6521a.get(), zzbbf.f6142f);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}