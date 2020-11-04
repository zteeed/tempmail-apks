package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbrk implements zzela<zzbyg<zzbva>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbrj> f6581a;

    private zzbrk(zzbrl zzbrl, zzelj<zzbrj> zzelj) {
        this.f6581a = zzelj;
    }

    public static zzbrk a(zzbrl zzbrl, zzelj<zzbrj> zzelj) {
        return new zzbrk(zzbrl, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6581a.get(), zzbbf.f6142f);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
