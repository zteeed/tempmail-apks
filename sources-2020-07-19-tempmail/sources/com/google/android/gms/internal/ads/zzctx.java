package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzctx implements zzela<zzctu> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdli> f7533a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcis> f7534b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzckx> f7535c;

    private zzctx(zzelj<zzdli> zzelj, zzelj<zzcis> zzelj2, zzelj<zzckx> zzelj3) {
        this.f7533a = zzelj;
        this.f7534b = zzelj2;
        this.f7535c = zzelj3;
    }

    public static zzctx a(zzelj<zzdli> zzelj, zzelj<zzcis> zzelj2, zzelj<zzckx> zzelj3) {
        return new zzctx(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzctu(this.f7533a.get(), this.f7534b.get(), this.f7535c.get());
    }
}
