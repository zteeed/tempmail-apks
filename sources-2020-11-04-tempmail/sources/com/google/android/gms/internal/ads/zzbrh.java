package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbrh implements zzela<zzbyg<zzbtg>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<bd> f6753a;

    private zzbrh(zzbqu zzbqu, zzelj<bd> zzelj) {
        this.f6753a = zzelj;
    }

    public static zzbrh a(zzbqu zzbqu, zzelj<bd> zzelj) {
        return new zzbrh(zzbqu, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6753a.get(), zzbbf.f6325f);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
