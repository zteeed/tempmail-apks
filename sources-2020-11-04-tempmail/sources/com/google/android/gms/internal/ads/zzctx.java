package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzctx implements zzela<zzctu> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdli> f7716a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcis> f7717b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzckx> f7718c;

    private zzctx(zzelj<zzdli> zzelj, zzelj<zzcis> zzelj2, zzelj<zzckx> zzelj3) {
        this.f7716a = zzelj;
        this.f7717b = zzelj2;
        this.f7718c = zzelj3;
    }

    public static zzctx a(zzelj<zzdli> zzelj, zzelj<zzcis> zzelj2, zzelj<zzckx> zzelj3) {
        return new zzctx(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzctu(this.f7716a.get(), this.f7717b.get(), this.f7718c.get());
    }
}
