package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbrg implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<bd> f6569a;

    private zzbrg(zzbqu zzbqu, zzelj<bd> zzelj) {
        this.f6569a = zzelj;
    }

    public static zzbrg a(zzbqu zzbqu, zzelj<bd> zzelj) {
        return new zzbrg(zzbqu, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6569a.get(), zzbbf.f6142f);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
