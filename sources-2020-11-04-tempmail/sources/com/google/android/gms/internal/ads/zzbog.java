package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbog implements zzela<zzcqt<zzbnc>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdou> f6632a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdvi> f6633b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcrp> f6634c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzcva> f6635d;

    public zzbog(zzelj<zzdou> zzelj, zzelj<zzdvi> zzelj2, zzelj<zzcrp> zzelj3, zzelj<zzcva> zzelj4) {
        this.f6632a = zzelj;
        this.f6633b = zzelj2;
        this.f6634c = zzelj3;
        this.f6635d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        zzcve zzcve = new zzcve(this.f6632a.get(), this.f6633b.get(), this.f6635d.get(), this.f6634c.get());
        zzelg.b(zzcve, "Cannot return null from a non-@Nullable @Provides method");
        return zzcve;
    }
}
