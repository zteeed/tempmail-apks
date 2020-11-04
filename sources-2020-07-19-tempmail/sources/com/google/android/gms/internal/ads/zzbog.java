package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbog implements zzela<zzcqt<zzbnc>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdou> f6449a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdvi> f6450b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcrp> f6451c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzcva> f6452d;

    public zzbog(zzelj<zzdou> zzelj, zzelj<zzdvi> zzelj2, zzelj<zzcrp> zzelj3, zzelj<zzcva> zzelj4) {
        this.f6449a = zzelj;
        this.f6450b = zzelj2;
        this.f6451c = zzelj3;
        this.f6452d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        zzcve zzcve = new zzcve(this.f6449a.get(), this.f6450b.get(), this.f6452d.get(), this.f6451c.get());
        zzelg.b(zzcve, "Cannot return null from a non-@Nullable @Provides method");
        return zzcve;
    }
}
