package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbis implements zzela<zzdll<zzcgr>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzchb> f6460a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdvi> f6461b;

    public zzbis(zzelj<zzchb> zzelj, zzelj<zzdvi> zzelj2) {
        this.f6460a = zzelj;
        this.f6461b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        zzdll zzdll = new zzdll(this.f6460a.get(), this.f6461b.get());
        zzelg.b(zzdll, "Cannot return null from a non-@Nullable @Provides method");
        return zzdll;
    }
}
