package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbis implements zzela<zzdll<zzcgr>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzchb> f6277a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdvi> f6278b;

    public zzbis(zzelj<zzchb> zzelj, zzelj<zzdvi> zzelj2) {
        this.f6277a = zzelj;
        this.f6278b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        zzdll zzdll = new zzdll(this.f6277a.get(), this.f6278b.get());
        zzelg.b(zzdll, "Cannot return null from a non-@Nullable @Provides method");
        return zzdll;
    }
}
