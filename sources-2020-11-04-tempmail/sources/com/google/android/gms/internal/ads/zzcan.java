package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcan implements zzela<zzcqt<zzbzj>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdou> f6924a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdvi> f6925b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcsr> f6926c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzcva> f6927d;

    public zzcan(zzelj<zzdou> zzelj, zzelj<zzdvi> zzelj2, zzelj<zzcsr> zzelj3, zzelj<zzcva> zzelj4) {
        this.f6924a = zzelj;
        this.f6925b = zzelj2;
        this.f6926c = zzelj3;
        this.f6927d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        zzcve zzcve = new zzcve(this.f6924a.get(), this.f6925b.get(), this.f6927d.get(), this.f6926c.get());
        zzelg.b(zzcve, "Cannot return null from a non-@Nullable @Provides method");
        return zzcve;
    }
}
